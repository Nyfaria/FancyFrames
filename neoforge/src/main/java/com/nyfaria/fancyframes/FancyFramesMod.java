package com.nyfaria.fancyframes;


import net.minecraft.client.model.geom.*;
import net.minecraft.resources.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.attachment.*;
import net.neoforged.neoforge.registries.*;

@Mod(Constants.MODID)
public class FancyFramesMod {
    private static final DeferredRegister<AttachmentType<?>> ATTACHMENTS = DeferredRegister.create(NeoForgeRegistries.ATTACHMENT_TYPES, Constants.MODID);
    public static DeferredHolder<AttachmentType<?>,AttachmentType<ResourceLocation>> FRAME = ATTACHMENTS.register("frame", () -> AttachmentType.<ResourceLocation>builder(()->null)
            .serialize(ResourceLocation.CODEC)
            .sync(ResourceLocation.STREAM_CODEC)
            .build());

    public FancyFramesMod(IEventBus eventBus) {
        CommonClass.init();
        ATTACHMENTS.register(eventBus);
    }
}