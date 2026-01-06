package com.nyfaria.fancyframes.events;

import com.nyfaria.fancyframes.annotations.*;
import com.nyfaria.fancyframes.client.model.*;
import com.nyfaria.fancyframes.util.*;
import net.minecraft.client.*;
import net.minecraft.client.model.geom.*;
import net.minecraft.client.model.geom.builders.*;
import net.neoforged.api.distmarker.*;
import net.neoforged.bus.api.*;
import net.neoforged.fml.common.*;
import net.neoforged.neoforge.client.event.*;
import org.reflections.*;
import org.reflections.util.*;

import java.lang.reflect.*;
import java.util.*;

@EventBusSubscriber(Dist.CLIENT)
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
        ModelStorage.MODELS.put(CopperFrame.LAYER_LOCATION.getModel(), new CopperFrame(event.getContext().bakeLayer(CopperFrame.LAYER_LOCATION)));
        ModelStorage.MODELS.put(CopperFrameThin.LAYER_LOCATION.getModel(), new CopperFrameThin(event.getContext().bakeLayer(CopperFrameThin.LAYER_LOCATION)));
        ModelStorage.MODELS.put(DiamondFrame.LAYER_LOCATION.getModel(), new DiamondFrame(event.getContext().bakeLayer(DiamondFrame.LAYER_LOCATION)));
        ModelStorage.MODELS.put(DiamondFrameThin.LAYER_LOCATION.getModel(), new DiamondFrameThin(event.getContext().bakeLayer(DiamondFrameThin.LAYER_LOCATION)));
        ModelStorage.MODELS.put(EmeraldFrame.LAYER_LOCATION.getModel(), new EmeraldFrame(event.getContext().bakeLayer(EmeraldFrame.LAYER_LOCATION)));
        ModelStorage.MODELS.put(EmeraldFrameThin.LAYER_LOCATION.getModel(), new EmeraldFrameThin(event.getContext().bakeLayer(EmeraldFrameThin.LAYER_LOCATION)));
        ModelStorage.MODELS.put(GoldFrame.LAYER_LOCATION.getModel(), new GoldFrame(event.getContext().bakeLayer(GoldFrame.LAYER_LOCATION)));
        ModelStorage.MODELS.put(GoldFrameThin.LAYER_LOCATION.getModel(), new GoldFrameThin(event.getContext().bakeLayer(GoldFrameThin.LAYER_LOCATION)));
        ModelStorage.MODELS.put(IronFrame.LAYER_LOCATION.getModel(), new IronFrame(event.getContext().bakeLayer(IronFrame.LAYER_LOCATION)));
        ModelStorage.MODELS.put(IronFrameThin.LAYER_LOCATION.getModel(), new IronFrameThin(event.getContext().bakeLayer(IronFrameThin.LAYER_LOCATION)));
        ModelStorage.MODELS.put(NetheriteFrame.LAYER_LOCATION.getModel(), new NetheriteFrame(event.getContext().bakeLayer(NetheriteFrame.LAYER_LOCATION)));
        ModelStorage.MODELS.put(NetheriteFrameThin.LAYER_LOCATION.getModel(), new NetheriteFrameThin(event.getContext().bakeLayer(NetheriteFrameThin.LAYER_LOCATION)));
        ModelStorage.MODELS.put(StoneFrame.LAYER_LOCATION.getModel(), new StoneFrame(event.getContext().bakeLayer(StoneFrame.LAYER_LOCATION)));
        ModelStorage.MODELS.put(StoneFrameThin.LAYER_LOCATION.getModel(), new StoneFrameThin(event.getContext().bakeLayer(StoneFrameThin.LAYER_LOCATION)));
        ModelStorage.MODELS.put(WoodenFrame.LAYER_LOCATION.getModel(), new WoodenFrame(event.getContext().bakeLayer(WoodenFrame.LAYER_LOCATION)));
        ModelStorage.MODELS.put(WoodenFrameThin.LAYER_LOCATION.getModel(), new WoodenFrameThin(event.getContext().bakeLayer(WoodenFrameThin.LAYER_LOCATION)));
    }
}
