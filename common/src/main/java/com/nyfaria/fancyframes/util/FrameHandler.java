package com.nyfaria.fancyframes.util;

import com.nyfaria.fancyframes.item.*;
import net.minecraft.resources.*;
import net.minecraft.world.item.*;

import java.util.*;
import java.util.function.*;

public class FrameHandler {
    private static Map<ResourceLocation, Supplier<FrameItem>> FRAME_ITEMS = new HashMap<>();

    public static void addFrame(ResourceLocation id, Supplier<FrameItem> item) {
        FRAME_ITEMS.put(id, item);
    }
    public static Supplier<FrameItem> getFrame(ResourceLocation id) {
        return FRAME_ITEMS.get(id);
    }
}
