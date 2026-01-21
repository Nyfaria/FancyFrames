package com.nyfaria.fancyframes;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.attachment.v1.*;
import net.fabricmc.fabric.impl.attachment.*;
import net.minecraft.resources.*;

public class FancyFramesMod implements ModInitializer {


    @Override
    public void onInitialize() {

        CommonClass.init();
    }
}
