package com.nyfaria.fancyframes.mixin;

import com.mojang.blaze3d.vertex.*;
import com.mojang.math.*;
import com.nyfaria.fancyframes.client.*;
import com.nyfaria.fancyframes.client.model.*;
import com.nyfaria.fancyframes.platform.*;
import com.nyfaria.fancyframes.util.*;
import net.minecraft.client.model.geom.*;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.client.renderer.texture.*;
import net.minecraft.core.*;
import net.minecraft.world.entity.decoration.*;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;

@Mixin(ItemFrameRenderer.class)
public class ItemFrameRendererMixin<T extends ItemFrame>  {

    @Unique
    private FrameModel copperFrameModel;

    @Inject(method = "<init>", at = @At("TAIL"))
    private void onConstruct(EntityRendererProvider.Context context, CallbackInfo ci) {
//        copperFrameModel = new CopperFrame(context.bakeLayer(CopperFrame.LAYER_LOCATION));
    }

    @Inject(method = "render(Lnet/minecraft/world/entity/decoration/ItemFrame;FFLcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/MultiBufferSource;I)V", at = @At(value = "INVOKE", target = "Lcom/mojang/blaze3d/vertex/PoseStack;popPose()V", ordinal = 0))
    private void onRender(T entity, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource buffer, int packedLight, CallbackInfo ci) {
        if(Services.PLATFORM.getFrameLoc(entity) != null) {
            ClientRenderHelper.renderFrame(entity, poseStack, buffer, packedLight, ModelStorage.MODELS.get(Services.PLATFORM.getFrameLoc(entity)));
        }
    }


}
