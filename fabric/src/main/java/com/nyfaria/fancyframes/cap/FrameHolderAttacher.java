package com.nyfaria.fancyframes.cap;

import com.nyfaria.fancyframes.*;
import dev.onyxstudios.cca.api.v3.component.*;
import dev.onyxstudios.cca.api.v3.entity.*;
import net.minecraft.resources.*;
import net.minecraft.world.entity.decoration.*;
import net.minecraft.world.entity.npc.*;

public class FrameHolderAttacher implements EntityComponentInitializer {
    public static final ComponentKey<FrameHolder> FRAME = ComponentRegistryV3.INSTANCE.getOrCreate(new ResourceLocation(Constants.MODID, "frame"), FrameHolder.class);


    @Override
    public void registerEntityComponentFactories(EntityComponentFactoryRegistry registry) {
        registry.registerFor(Painting.class, FRAME, FrameHolder::new);
        registry.registerFor(ItemFrame.class, FRAME, FrameHolder::new);
    }
}
