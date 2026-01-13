package com.nyfaria.fancyframes.mixin;

import com.nyfaria.fancyframes.item.*;
import com.nyfaria.fancyframes.platform.*;
import com.nyfaria.fancyframes.util.*;
import net.minecraft.world.*;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.decoration.*;
import net.minecraft.world.entity.player.*;
import net.minecraft.world.item.*;
import net.minecraft.world.level.*;
import net.minecraft.world.level.block.*;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;

@Mixin(ItemFrame.class)
public abstract class ItemFrameMixin extends HangingEntity {


    protected ItemFrameMixin(EntityType<? extends HangingEntity> entityType, Level level) {
        super(entityType, level);
    }

    @Inject(method = "interact", at = @At("HEAD"), cancellable = true)
    private void fancyframes$preventInteraction(Player player, InteractionHand hand, CallbackInfoReturnable<InteractionResult> cir) {
        if (!level().isClientSide && hand == InteractionHand.MAIN_HAND) {
            if (player.isCrouching()) {
                if (player.getMainHandItem().getItem() instanceof FrameItem frameItem && frameItem.isItemFrame()) {
                    var currentFrameLoc = Services.PLATFORM.getFrameLoc(this);
                    if (currentFrameLoc != null) {
                        Block.popResource(level(), blockPosition(), new ItemStack(FrameHandler.getFrame(currentFrameLoc).get()));
                    }
                    player.getMainHandItem().shrink(1);
                    Services.PLATFORM.setFrameLoc(frameItem.getModel(), this);
                    cir.setReturnValue(InteractionResult.SUCCESS);
                }
            }
        }
    }

    @Inject(method = "dropItem(Lnet/minecraft/world/entity/Entity;Z)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/decoration/ItemFrame;spawnAtLocation(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/entity/item/ItemEntity;", ordinal = 0))
    private void fancyframes$dropFrameItem(Entity entity, boolean bl, CallbackInfo ci) {
        var frameLoc = Services.PLATFORM.getFrameLoc(this);
        if (frameLoc != null) {
            Block.popResource(level(), blockPosition(), new ItemStack(FrameHandler.getFrame(frameLoc).get()));
        }
    }
}
