package com.nyfaria.fancyframes.platform;

import com.nyfaria.fancyframes.*;
import com.nyfaria.fancyframes.platform.services.IPlatformHelper;
import net.minecraft.resources.*;
import net.minecraft.world.entity.*;
import net.neoforged.fml.ModList;
import net.neoforged.fml.loading.FMLLoader;

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
        return entity.getExistingDataOrNull(FancyFramesMod.FRAME);
    }

    @Override
    public void setFrameLoc(ResourceLocation frame, Entity entity) {
        entity.setData(FancyFramesMod.FRAME,frame);
    }
}