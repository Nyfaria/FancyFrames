package com.nyfaria.fancyframes.cap;

import com.nyfaria.fancyframes.*;
import dev._100media.capabilitysyncer.core.CapabilityAttacher;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.decoration.*;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Constants.MODID)
public class FrameHolderAttacher extends CapabilityAttacher {
    public static final Capability<FrameHolder> CAPABILITY = getCapability(new CapabilityToken<>() {});
    public static final ResourceLocation RESOURCE_LOCATION = new ResourceLocation(Constants.MODID, "villager_genetics");
    private static final Class<FrameHolder> CAPABILITY_CLASS = FrameHolder.class;

    @SuppressWarnings("ConstantConditions")
    public static FrameHolder getHolderUnwrap(Entity player) {
        return getHolder(player).orElse(null);
    }

    public static LazyOptional<FrameHolder> getHolder(Entity player) {
        return player.getCapability(CAPABILITY);
    }

    private static void attach(AttachCapabilitiesEvent<Entity> event, Entity entity) {
        genericAttachCapability(event, new FrameHolder(entity), CAPABILITY, RESOURCE_LOCATION);
    }

    public static void register() {
        CapabilityAttacher.registerCapability(CAPABILITY_CLASS);
        CapabilityAttacher.registerEntityAttacher(Painting.class, FrameHolderAttacher::attach, FrameHolderAttacher::getHolder);
        CapabilityAttacher.registerEntityAttacher(ItemFrame.class, FrameHolderAttacher::attach, FrameHolderAttacher::getHolder);
    }
}
