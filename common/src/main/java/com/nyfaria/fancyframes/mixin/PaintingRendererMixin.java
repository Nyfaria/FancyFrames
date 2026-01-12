package com.nyfaria.fancyframes.mixin;

import com.mojang.blaze3d.vertex.*;
import com.nyfaria.fancyframes.client.*;
import com.nyfaria.fancyframes.client.model.*;
import com.nyfaria.fancyframes.platform.*;
import com.nyfaria.fancyframes.util.*;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.world.entity.decoration.*;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;

@Mixin(PaintingRenderer.class)
public class PaintingRendererMixin {

    @Unique
    private FrameModel fancyFrames$copperFrameModel;

    @Inject(method = "<init>" , at = @At("TAIL"))
    private void onInit(EntityRendererProvider.Context context, CallbackInfo ci) {
//        this.fancyFrames$copperFrameModel = new CopperFrame(context.bakeLayer(CopperFrame.LAYER_LOCATION));
    }

    @Inject(method = "render(Lnet/minecraft/world/entity/decoration/Painting;FFLcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/MultiBufferSource;I)V", at = @At(value = "INVOKE", target = "Lcom/mojang/blaze3d/vertex/PoseStack;popPose()V"))
    private void onRender(Painting entity, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource buffer, int packedLight, CallbackInfo ci) {
        if(Services.PLATFORM.getFrameLoc(entity) != null) {
            ClientRenderHelper.renderPaintingFrame(entity, poseStack, buffer, packedLight, ModelStorage.MODELS.get(Services.PLATFORM.getFrameLoc(entity)));
        }
    }
}
