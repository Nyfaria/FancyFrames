package com.nyfaria.fancyframes.init;

import com.nyfaria.fancyframes.Constants;
import com.nyfaria.fancyframes.item.*;
import com.nyfaria.fancyframes.registration.RegistrationProvider;
import com.nyfaria.fancyframes.registration.RegistryObject;
import com.nyfaria.fancyframes.util.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.*;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;

import java.util.function.*;

public class ItemInit {
    public static final RegistrationProvider<Item> ITEMS = RegistrationProvider.get(Registries.ITEM, Constants.MODID);

    public static final RegistrationProvider<CreativeModeTab> CREATIVE_MODE_TABS = RegistrationProvider.get(Registries.CREATIVE_MODE_TAB, Constants.MODID);
    public static final RegistryObject<CreativeModeTab, CreativeModeTab> TAB = CREATIVE_MODE_TABS.register(Constants.MODID, () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
            .icon(() -> new ItemStack(ItemInit.WOODEN_FRAME.get()))
            .displayItems(
                    (itemDisplayParameters, output) -> {
                        output.accept(ItemInit.WOODEN_FRAME.get());
                        output.accept(ItemInit.STONE_FRAME.get());
                        output.accept(ItemInit.COPPER_FRAME.get());
                        output.accept(ItemInit.IRON_FRAME.get());
                        output.accept(ItemInit.GOLD_FRAME.get());
                        output.accept(ItemInit.DIAMOND_FRAME.get());
                        output.accept(ItemInit.EMERALD_FRAME.get());
                        output.accept(ItemInit.NETHERITE_FRAME.get());

                        output.accept(ItemInit.WOODEN_FRAME_THIN.get());
                        output.accept(ItemInit.STONE_FRAME_THIN.get());
                        output.accept(ItemInit.COPPER_FRAME_THIN.get());
                        output.accept(ItemInit.IRON_FRAME_THIN.get());
                        output.accept(ItemInit.GOLD_FRAME_THIN.get());
                        output.accept(ItemInit.DIAMOND_FRAME_THIN.get());
                        output.accept(ItemInit.EMERALD_FRAME_THIN.get());
                        output.accept(ItemInit.NETHERITE_FRAME_THIN.get());

                    }).title(Component.translatable("itemGroup." + Constants.MODID + ".tab"))
            .build());


    public static final RegistryObject<Item, FrameItem> WOODEN_FRAME = frame("wooden_frame");
    public static final RegistryObject<Item, FrameItem> STONE_FRAME = frame("stone_frame");
    public static final RegistryObject<Item, FrameItem> COPPER_FRAME = frame("copper_frame");
    public static final RegistryObject<Item, FrameItem> IRON_FRAME = frame("iron_frame");
    public static final RegistryObject<Item, FrameItem> GOLD_FRAME = frame("gold_frame");
    public static final RegistryObject<Item, FrameItem> DIAMOND_FRAME = frame("diamond_frame");
    public static final RegistryObject<Item, FrameItem> EMERALD_FRAME = frame("emerald_frame");
    public static final RegistryObject<Item, FrameItem> NETHERITE_FRAME = frame("netherite_frame");


    public static final RegistryObject<Item, FrameItem> WOODEN_FRAME_THIN = thinFrame("wooden_frame_thin");
    public static final RegistryObject<Item, FrameItem> STONE_FRAME_THIN = thinFrame("stone_frame_thin");
    public static final RegistryObject<Item, FrameItem> COPPER_FRAME_THIN = thinFrame("copper_frame_thin");
    public static final RegistryObject<Item, FrameItem> IRON_FRAME_THIN = thinFrame("iron_frame_thin");
    public static final RegistryObject<Item, FrameItem> GOLD_FRAME_THIN = thinFrame("gold_frame_thin");
    public static final RegistryObject<Item, FrameItem> EMERALD_FRAME_THIN = thinFrame("emerald_frame_thin");
    public static final RegistryObject<Item, FrameItem> DIAMOND_FRAME_THIN = thinFrame("diamond_frame_thin");
    public static final RegistryObject<Item, FrameItem> NETHERITE_FRAME_THIN = thinFrame("netherite_frame_thin");



    private static RegistryObject<Item, FrameItem> thinFrame(String string) {
        ResourceLocation loc = ResourceLocation.fromNamespaceAndPath(Constants.MODID, string);
        RegistryObject<Item, FrameItem> frame = ITEMS.register(string, () -> new FrameItem(getItemProperties(), loc, false));
        FrameHandler.addFrame(loc, frame);
        return frame;
    }
    private static RegistryObject<Item, FrameItem> frame(String string) {
        ResourceLocation loc = ResourceLocation.fromNamespaceAndPath(Constants.MODID, string);
        RegistryObject<Item, FrameItem> frame = ITEMS.register(string, () -> new FrameItem(getItemProperties(), loc, true));
        FrameHandler.addFrame(loc, frame);
        return frame;
    }

    public static Item.Properties getItemProperties() {
        return new Item.Properties();
    }

    public static void loadClass() {
    }

}
