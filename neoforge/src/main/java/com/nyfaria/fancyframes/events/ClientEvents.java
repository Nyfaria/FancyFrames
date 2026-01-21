package com.nyfaria.fancyframes.events;

import com.nyfaria.fancyframes.client.*;
import com.nyfaria.fancyframes.client.model.*;
import net.minecraftforge.api.distmarker.*;
import net.minecraftforge.client.event.*;
import net.minecraftforge.eventbus.api.*;
import net.minecraftforge.fml.common.*;

@Mod.EventBusSubscriber(value = Dist.CLIENT, bus =  Mod.EventBusSubscriber.Bus.MOD )
public class ClientEvents {

    @SubscribeEvent
    public static void onRegisterLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(CopperFrame.LAYER_LOCATION, CopperFrame::createBodyLayer);
        event.registerLayerDefinition(CopperFrameThin.LAYER_LOCATION, CopperFrameThin::createBodyLayer);
        event.registerLayerDefinition(DiamondFrame.LAYER_LOCATION, DiamondFrame::createBodyLayer);
        event.registerLayerDefinition(DiamondFrameThin.LAYER_LOCATION, DiamondFrameThin::createBodyLayer);
        event.registerLayerDefinition(EmeraldFrame.LAYER_LOCATION, EmeraldFrame::createBodyLayer);
        event.registerLayerDefinition(EmeraldFrameThin.LAYER_LOCATION, EmeraldFrameThin::createBodyLayer);
        event.registerLayerDefinition(GoldFrame.LAYER_LOCATION, GoldFrame::createBodyLayer);
        event.registerLayerDefinition(GoldFrameThin.LAYER_LOCATION, GoldFrameThin::createBodyLayer);
        event.registerLayerDefinition(IronFrame.LAYER_LOCATION, IronFrame::createBodyLayer);
        event.registerLayerDefinition(IronFrameThin.LAYER_LOCATION, IronFrameThin::createBodyLayer);
        event.registerLayerDefinition(NetheriteFrame.LAYER_LOCATION, NetheriteFrame::createBodyLayer);
        event.registerLayerDefinition(NetheriteFrameThin.LAYER_LOCATION, NetheriteFrameThin::createBodyLayer);
        event.registerLayerDefinition(StoneFrame.LAYER_LOCATION, StoneFrame::createBodyLayer);
        event.registerLayerDefinition(StoneFrameThin.LAYER_LOCATION, StoneFrameThin::createBodyLayer);
        event.registerLayerDefinition(WoodenFrame.LAYER_LOCATION, WoodenFrame::createBodyLayer);
        event.registerLayerDefinition(WoodenFrameThin.LAYER_LOCATION, WoodenFrameThin::createBodyLayer);
    }
    @SubscribeEvent
    public static void onRegisterModels(EntityRenderersEvent.AddLayers event) {
        ClientUtil.addModels(event.getContext());
    }
}
