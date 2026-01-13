package com.nyfaria.fancyframes;

import com.nyfaria.fancyframes.client.*;
import com.nyfaria.fancyframes.client.model.*;
import net.fabricmc.api.*;
import net.fabricmc.fabric.api.attachment.v1.*;
import net.fabricmc.fabric.api.client.rendering.v1.*;
import net.minecraft.resources.*;

public class FancyFramesModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        EntityModelLayerRegistry.registerModelLayer(CopperFrame.LAYER_LOCATION, CopperFrame::createBodyLayer);
        EntityModelLayerRegistry.registerModelLayer(CopperFrameThin.LAYER_LOCATION, CopperFrameThin::createBodyLayer);
        EntityModelLayerRegistry.registerModelLayer(DiamondFrame.LAYER_LOCATION, DiamondFrame::createBodyLayer);
        EntityModelLayerRegistry.registerModelLayer(DiamondFrameThin.LAYER_LOCATION, DiamondFrameThin::createBodyLayer);
        EntityModelLayerRegistry.registerModelLayer(EmeraldFrame.LAYER_LOCATION, EmeraldFrame::createBodyLayer);
        EntityModelLayerRegistry.registerModelLayer(EmeraldFrameThin.LAYER_LOCATION, EmeraldFrameThin::createBodyLayer);
        EntityModelLayerRegistry.registerModelLayer(GoldFrame.LAYER_LOCATION, GoldFrame::createBodyLayer);
        EntityModelLayerRegistry.registerModelLayer(GoldFrameThin.LAYER_LOCATION, GoldFrameThin::createBodyLayer);
        EntityModelLayerRegistry.registerModelLayer(IronFrame.LAYER_LOCATION, IronFrame::createBodyLayer);
        EntityModelLayerRegistry.registerModelLayer(IronFrameThin.LAYER_LOCATION, IronFrameThin::createBodyLayer);
        EntityModelLayerRegistry.registerModelLayer(NetheriteFrame.LAYER_LOCATION, NetheriteFrame::createBodyLayer);
        EntityModelLayerRegistry.registerModelLayer(NetheriteFrameThin.LAYER_LOCATION, NetheriteFrameThin::createBodyLayer);
        EntityModelLayerRegistry.registerModelLayer(StoneFrame.LAYER_LOCATION, StoneFrame::createBodyLayer);
        EntityModelLayerRegistry.registerModelLayer(StoneFrameThin.LAYER_LOCATION, StoneFrameThin::createBodyLayer);
        EntityModelLayerRegistry.registerModelLayer(WoodenFrame.LAYER_LOCATION, WoodenFrame::createBodyLayer);
        EntityModelLayerRegistry.registerModelLayer(WoodenFrameThin.LAYER_LOCATION, WoodenFrameThin::createBodyLayer);
        LivingEntityFeatureRendererRegistrationCallback.EVENT.register(
                (a,b,c,context)->{
                    ClientUtil.addModels(context);
                }
        );
    }
}
