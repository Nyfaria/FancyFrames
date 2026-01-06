package com.nyfaria.fancyframes.mixin;

import com.nyfaria.fancyframes.item.*;
import com.nyfaria.fancyframes.platform.*;
import net.minecraft.world.*;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.decoration.*;
import net.minecraft.world.entity.player.*;
import net.minecraft.world.level.*;
import org.spongepowered.asm.mixin.*;

@Mixin(Painting.class)
public abstract class PaintingMixin extends HangingEntity {

    protected PaintingMixin(EntityType<? extends HangingEntity> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    public InteractionResult interact(Player player, InteractionHand hand) {
        if(player.isCrouching()){
            if(player.getMainHandItem().getItem() instanceof FrameItem frameItem){
                Services.PLATFORM.setFrameLoc(frameItem.getModel(), (Painting)(Object)this);
                return InteractionResult.SUCCESS;
            }
        }
        return super.interact(player, hand);
    }
}
