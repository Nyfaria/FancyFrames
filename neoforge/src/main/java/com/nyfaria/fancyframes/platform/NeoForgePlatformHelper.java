package com.nyfaria.fancyframes.platform;

import com.nyfaria.fancyframes.*;
import com.nyfaria.fancyframes.cap.*;
import com.nyfaria.fancyframes.platform.services.IPlatformHelper;
import net.minecraft.resources.*;
import net.minecraft.world.entity.*;
import net.minecraftforge.fml.*;
import net.minecraftforge.fml.loading.*;

public class NeoForgePlatformHelper implements IPlatformHelper {

    @Override
    public String getPlatformName() {

        return "NeoForge";
    }

    @Override
    public boolean isModLoaded(String modId) {

        return ModList.get().isLoaded(modId);
    }

    @Override
    public boolean isDevelopmentEnvironment() {

        return !FMLLoader.isProduction();
    }

    @Override
    public ResourceLocation getFrameLoc(Entity entity) {
        if(!FrameHolderAttacher.getHolder(entity).isPresent()) {
            return null;
        }
        return FrameHolderAttacher.getHolderUnwrap(entity).getLocation();
    }

    @Override
    public void setFrameLoc(ResourceLocation frame, Entity entity) {
        FrameHolderAttacher.getHolderUnwrap(entity).setLocation(frame);
    }
}