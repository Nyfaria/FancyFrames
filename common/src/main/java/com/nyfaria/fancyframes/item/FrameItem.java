package com.nyfaria.fancyframes.item;

import net.minecraft.resources.*;
import net.minecraft.world.item.*;

public class FrameItem extends Item {

    ResourceLocation model;
    public FrameItem(Properties properties, ResourceLocation frameType) {
        super(properties);
        model = frameType;
    }
    public ResourceLocation getModel() {
        return model;
    }
}
