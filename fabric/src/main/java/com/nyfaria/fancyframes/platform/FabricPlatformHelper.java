package com.nyfaria.fancyframes.platform;

import com.nyfaria.fancyframes.*;
import com.nyfaria.fancyframes.platform.services.IPlatformHelper;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.resources.*;
import net.minecraft.world.entity.*;

public class FabricPlatformHelper implements IPlatformHelper {

    @Override
    public String getPlatformName() {
        return "Fabric";
    }

    @Override
    public boolean isModLoaded(String modId) {

        return FabricLoader.getInstance().isModLoaded(modId);
    }

    @Override
    public boolean isDevelopmentEnvironment() {

        return FabricLoader.getInstance().isDevelopmentEnvironment();
    }

    @Override
    public ResourceLocation getFrameLoc(Entity entity) {
        return entity.getAttachedOrElse(FancyFramesMod.FRAME, null);
    }

    @Override
    public void setFrameLoc(ResourceLocation frame, Entity entity) {
        entity.setAttached(FancyFramesMod.FRAME, frame);
    }
}
