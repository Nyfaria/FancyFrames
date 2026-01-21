package com.nyfaria.fancyframes;


import com.nyfaria.fancyframes.cap.*;
import com.nyfaria.fancyframes.network.*;
import net.minecraftforge.fml.common.*;

@Mod(Constants.MODID)
public class FancyFramesMod {


    public FancyFramesMod() {
        CommonClass.init();
        NetworkHandler.register();
        FrameHolderAttacher.register();
    }
}