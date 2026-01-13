package com.nyfaria.fancyframes.item;

import net.minecraft.resources.*;
import net.minecraft.world.item.*;

public class FrameItem extends Item {

    ResourceLocation model;
    boolean itemFrame;

    public FrameItem(Properties properties, ResourceLocation frameType, boolean itemFrame) {
        super(properties);
        model = frameType;
        this.itemFrame = itemFrame;
    }

    public ResourceLocation getModel() {
        return model;
    }

    public boolean isItemFrame() {
        return itemFrame;
    }
}
