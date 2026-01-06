package com.nyfaria.fancyframes;

import com.nyfaria.fancyframes.init.BlockInit;
import com.nyfaria.fancyframes.init.EntityInit;
import com.nyfaria.fancyframes.init.ItemInit;
import com.nyfaria.fancyframes.init.TagInit;

public class CommonClass {

    public static void init() {
        ItemInit.loadClass();
        BlockInit.loadClass();
        EntityInit.loadClass();
        TagInit.loadClass();
    }
}