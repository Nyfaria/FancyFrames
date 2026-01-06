package com.nyfaria.fancyframes.mixin;

import com.nyfaria.fancyframes.item.*;
import com.nyfaria.fancyframes.platform.*;
import net.minecraft.world.*;
import net.minecraft.world.entity.decoration.*;
import net.minecraft.world.entity.player.*;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;

@Mixin(ItemFrame.class)
public class ItemFrameMixin {

    @Inject(method = "interact", at = @At("HEAD"), cancellable = true)
    private void fancyframes$preventInteraction(Player player, InteractionHand hand, CallbackInfoReturnable<InteractionResult> cir){
        if(player.isCrouching()){
            if(player.getMainHandItem().getItem() instanceof FrameItem frameItem){
                Services.PLATFORM.setFrameLoc(frameItem.getModel(), (ItemFrame)(Object)this);
                cir.setReturnValue(InteractionResult.SUCCESS);
            }
        }
    }
}
