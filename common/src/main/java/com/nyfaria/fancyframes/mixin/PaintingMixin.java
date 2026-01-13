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

@Mixin(Painting.class)
public abstract class PaintingMixin extends HangingEntity {

    protected PaintingMixin(EntityType<? extends HangingEntity> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    public InteractionResult interact(Player player, InteractionHand hand) {
        if (!level().isClientSide && hand == InteractionHand.MAIN_HAND) {
            if (player.isCrouching()) {
                if (player.getMainHandItem().getItem() instanceof FrameItem frameItem) {
                    var currentFrameLoc = Services.PLATFORM.getFrameLoc(this);
                    if (currentFrameLoc != null) {
                        Block.popResource(level(), blockPosition(), new ItemStack(FrameHandler.getFrame(currentFrameLoc).get()));
                    }
                    player.getMainHandItem().shrink(1);
                    Services.PLATFORM.setFrameLoc(frameItem.getModel(), this);
                    return InteractionResult.SUCCESS;
                }
            }
        }
        return super.interact(player, hand);
    }

    @Inject(method = "dropItem", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/decoration/Painting;spawnAtLocation(Lnet/minecraft/world/level/ItemLike;)Lnet/minecraft/world/entity/item/ItemEntity;"))
    private void fancyframes$dropFrameItem(Entity brokenEntity, CallbackInfo ci) {
        var frameLoc = Services.PLATFORM.getFrameLoc(this);
        if (frameLoc != null) {
            Block.popResource(level(), blockPosition(), new ItemStack(FrameHandler.getFrame(frameLoc).get()));
        }
    }
}
