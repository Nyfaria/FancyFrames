package com.nyfaria.fancyframes.client;

import com.nyfaria.fancyframes.client.model.*;
import com.nyfaria.fancyframes.util.*;
import net.minecraft.client.model.geom.*;
import net.minecraft.client.renderer.entity.*;

public class ClientUtil {
    public static void addModels(EntityRendererProvider.Context context){
        ModelStorage.MODELS.put(CopperFrame.LAYER_LOCATION.getModel(), new CopperFrame(context.bakeLayer(CopperFrame.LAYER_LOCATION)));
        ModelStorage.MODELS.put(CopperFrameThin.LAYER_LOCATION.getModel(), new CopperFrameThin(context.bakeLayer(CopperFrameThin.LAYER_LOCATION)));
        ModelStorage.MODELS.put(DiamondFrame.LAYER_LOCATION.getModel(), new DiamondFrame(context.bakeLayer(DiamondFrame.LAYER_LOCATION)));
        ModelStorage.MODELS.put(DiamondFrameThin.LAYER_LOCATION.getModel(), new DiamondFrameThin(context.bakeLayer(DiamondFrameThin.LAYER_LOCATION)));
        ModelStorage.MODELS.put(EmeraldFrame.LAYER_LOCATION.getModel(), new EmeraldFrame(context.bakeLayer(EmeraldFrame.LAYER_LOCATION)));
        ModelStorage.MODELS.put(EmeraldFrameThin.LAYER_LOCATION.getModel(), new EmeraldFrameThin(context.bakeLayer(EmeraldFrameThin.LAYER_LOCATION)));
        ModelStorage.MODELS.put(GoldFrame.LAYER_LOCATION.getModel(), new GoldFrame(context.bakeLayer(GoldFrame.LAYER_LOCATION)));
        ModelStorage.MODELS.put(GoldFrameThin.LAYER_LOCATION.getModel(), new GoldFrameThin(context.bakeLayer(GoldFrameThin.LAYER_LOCATION)));
        ModelStorage.MODELS.put(IronFrame.LAYER_LOCATION.getModel(), new IronFrame(context.bakeLayer(IronFrame.LAYER_LOCATION)));
        ModelStorage.MODELS.put(IronFrameThin.LAYER_LOCATION.getModel(), new IronFrameThin(context.bakeLayer(IronFrameThin.LAYER_LOCATION)));
        ModelStorage.MODELS.put(NetheriteFrame.LAYER_LOCATION.getModel(), new NetheriteFrame(context.bakeLayer(NetheriteFrame.LAYER_LOCATION)));
        ModelStorage.MODELS.put(NetheriteFrameThin.LAYER_LOCATION.getModel(), new NetheriteFrameThin(context.bakeLayer(NetheriteFrameThin.LAYER_LOCATION)));
        ModelStorage.MODELS.put(StoneFrame.LAYER_LOCATION.getModel(), new StoneFrame(context.bakeLayer(StoneFrame.LAYER_LOCATION)));
        ModelStorage.MODELS.put(StoneFrameThin.LAYER_LOCATION.getModel(), new StoneFrameThin(context.bakeLayer(StoneFrameThin.LAYER_LOCATION)));
        ModelStorage.MODELS.put(WoodenFrame.LAYER_LOCATION.getModel(), new WoodenFrame(context.bakeLayer(WoodenFrame.LAYER_LOCATION)));
        ModelStorage.MODELS.put(WoodenFrameThin.LAYER_LOCATION.getModel(), new WoodenFrameThin(context.bakeLayer(WoodenFrameThin.LAYER_LOCATION)));
    }
}
