package com.nyfaria.fancyframes.platform;

import com.nyfaria.fancyframes.*;
import com.nyfaria.fancyframes.cap.*;
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
        return FrameHolderAttacher.FRAME.get(entity).getLocation();
    }

    @Override
    public void setFrameLoc(ResourceLocation frame, Entity entity) {
        FrameHolderAttacher.FRAME.get(entity).setLocation(frame);
    }
}
