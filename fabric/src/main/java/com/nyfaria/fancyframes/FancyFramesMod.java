package com.nyfaria.fancyframes;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.attachment.v1.*;
import net.fabricmc.fabric.impl.attachment.*;
import net.minecraft.resources.*;

public class FancyFramesMod implements ModInitializer {

    public static final AttachmentType<ResourceLocation> FRAME = AttachmentRegistry.create(ResourceLocation.fromNamespaceAndPath(Constants.MODID, "frame"),
            builder -> builder
                    .syncWith(ResourceLocation.STREAM_CODEC, (target,player) -> true)
                    .persistent(ResourceLocation.CODEC)
    );

    @Override
    public void onInitialize() {

        CommonClass.init();
    }
}
