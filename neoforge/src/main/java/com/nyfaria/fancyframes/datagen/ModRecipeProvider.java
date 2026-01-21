package com.nyfaria.fancyframes.datagen;

import com.nyfaria.fancyframes.init.*;
import net.minecraft.data.*;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.*;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.*;
import net.minecraftforge.common.*;

import java.util.function.*;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(PackOutput generator) {
        super(generator);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> recipeSaver) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ItemInit.WOODEN_FRAME.get(), 1)
                .pattern(" L ")
                .pattern("LFL")
                .pattern(" L ")
                .define('L', ItemTags.LOGS)
                .define('F', Items.ITEM_FRAME)
                .unlockedBy("has_frame", has(Items.ITEM_FRAME))
                .save(recipeSaver);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ItemInit.STONE_FRAME.get(), 1)
                .pattern(" S ")
                .pattern("SFS")
                .pattern(" S ")
                .define('S', Blocks.STONE)
                .define('F', Items.ITEM_FRAME)
                .unlockedBy("has_frame", has(Items.ITEM_FRAME))
                .save(recipeSaver);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ItemInit.COPPER_FRAME.get(), 1)
                .pattern(" C ")
                .pattern("CFC")
                .pattern(" C ")
                .define('C', Items.COPPER_INGOT)
                .define('F', Items.ITEM_FRAME)
                .unlockedBy("has_frame", has(Items.ITEM_FRAME))
                .save(recipeSaver);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ItemInit.IRON_FRAME.get(), 1)
                .pattern(" I ")
                .pattern("IFI")
                .pattern(" I ")
                .define('I', Items.IRON_INGOT)
                .define('F', Items.ITEM_FRAME)
                .unlockedBy("has_frame", has(Items.ITEM_FRAME))
                .save(recipeSaver);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ItemInit.GOLD_FRAME.get(), 1)
                .pattern(" G ")
                .pattern("GFG")
                .pattern(" G ")
                .define('G', Items.GOLD_INGOT)
                .define('F', Items.ITEM_FRAME)
                .unlockedBy("has_frame", has(Items.ITEM_FRAME))
                .save(recipeSaver);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ItemInit.DIAMOND_FRAME.get(), 1)
                .pattern(" D ")
                .pattern("DFD")
                .pattern(" D ")
                .define('D', Items.DIAMOND)
                .define('F', Items.ITEM_FRAME)
                .unlockedBy("has_frame", has(Items.ITEM_FRAME))
                .save(recipeSaver);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ItemInit.EMERALD_FRAME.get(), 1)
                .pattern(" E ")
                .pattern("EFE")
                .pattern(" E ")
                .define('E', Items.EMERALD)
                .define('F', Items.ITEM_FRAME)
                .unlockedBy("has_frame", has(Items.ITEM_FRAME))
                .save(recipeSaver);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ItemInit.NETHERITE_FRAME.get(), 1)
                .requires(Items.NETHERITE_SCRAP)
                .requires(Items.ITEM_FRAME)
                .unlockedBy("has_frame", has(Items.ITEM_FRAME))
                .save(recipeSaver);
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ItemInit.WOODEN_FRAME.get(), 1)
//                .requires(ItemInit.WOODEN_FRAME_THIN.get())
//                .unlockedBy("has_wooden_frame", has(ItemInit.WOODEN_FRAME.get()))
//                .save(recipeSaver, ResourceLocation.fromNamespaceAndPath(Constants.MODID, "wooden_frame_conversion"));
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ItemInit.WOODEN_FRAME_THIN.get(), 1)
//                .requires(ItemInit.WOODEN_FRAME.get())
//                .unlockedBy("has_wooden_frame", has(ItemInit.WOODEN_FRAME.get()))
//                .save(recipeSaver, ResourceLocation.fromNamespaceAndPath(Constants.MODID, "thin_wooden_frame_conversion"));
//
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ItemInit.STONE_FRAME.get(), 1)
//                .requires(ItemInit.STONE_FRAME_THIN.get())
//                .unlockedBy("has_stone_frame", has(ItemInit.STONE_FRAME.get()))
//                .save(recipeSaver, ResourceLocation.fromNamespaceAndPath(Constants.MODID, "stone_frame_conversion"));
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ItemInit.STONE_FRAME_THIN.get(), 1)
//                .requires(ItemInit.STONE_FRAME.get())
//                .unlockedBy("has_stone_frame", has(ItemInit.STONE_FRAME.get()))
//                .save(recipeSaver, ResourceLocation.fromNamespaceAndPath(Constants.MODID, "thin_stone_frame_conversion"));
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ItemInit.COPPER_FRAME.get(), 1)
//                .requires(ItemInit.COPPER_FRAME_THIN.get())
//                .unlockedBy("has_copper_frame", has(ItemInit.COPPER_FRAME.get()))
//                .save(recipeSaver, ResourceLocation.fromNamespaceAndPath(Constants.MODID, "copper_frame_conversion"));
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ItemInit.COPPER_FRAME_THIN.get(), 1)
//                .requires(ItemInit.COPPER_FRAME.get())
//                .unlockedBy("has_copper_frame", has(ItemInit.COPPER_FRAME.get()))
//                .save(recipeSaver, ResourceLocation.fromNamespaceAndPath(Constants.MODID, "thin_copper_frame_conversion"));
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ItemInit.IRON_FRAME.get(), 1)
//                .requires(ItemInit.IRON_FRAME_THIN.get())
//                .unlockedBy("has_iron_frame", has(ItemInit.IRON_FRAME.get()))
//                .save(recipeSaver, ResourceLocation.fromNamespaceAndPath(Constants.MODID, "iron_frame_conversion"));
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ItemInit.IRON_FRAME_THIN.get(), 1)
//                .requires(ItemInit.IRON_FRAME.get())
//                .unlockedBy("has_iron_frame", has(ItemInit.IRON_FRAME.get()))
//                .save(recipeSaver, ResourceLocation.fromNamespaceAndPath(Constants.MODID, "thin_iron_frame_conversion"));
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ItemInit.GOLD_FRAME.get(), 1)
//                .requires(ItemInit.GOLD_FRAME_THIN.get())
//                .unlockedBy("has_gold_frame", has(ItemInit.GOLD_FRAME.get()))
//                .save(recipeSaver, ResourceLocation.fromNamespaceAndPath(Constants.MODID, "gold_frame_conversion"));
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ItemInit.GOLD_FRAME_THIN.get(), 1)
//                .requires(ItemInit.GOLD_FRAME.get())
//                .unlockedBy("has_gold_frame", has(ItemInit.GOLD_FRAME.get()))
//                .save(recipeSaver, ResourceLocation.fromNamespaceAndPath(Constants.MODID, "thin_gold_frame_conversion"));
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ItemInit.DIAMOND_FRAME.get(), 1)
//                .requires(ItemInit.DIAMOND_FRAME_THIN.get())
//                .unlockedBy("has_diamond_frame", has(ItemInit.DIAMOND_FRAME.get()))
//                .save(recipeSaver, ResourceLocation.fromNamespaceAndPath(Constants.MODID, "diamond_frame_conversion"));
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ItemInit.DIAMOND_FRAME_THIN.get(), 1)
//                .requires(ItemInit.DIAMOND_FRAME.get())
//                .unlockedBy("has_diamond_frame", has(ItemInit.DIAMOND_FRAME.get()))
//                .save(recipeSaver, ResourceLocation.fromNamespaceAndPath(Constants.MODID, "thin_diamond_frame_conversion"));
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ItemInit.EMERALD_FRAME.get(), 1)
//                .requires(ItemInit.EMERALD_FRAME_THIN.get())
//                .unlockedBy("has_emerald_frame", has(ItemInit.EMERALD_FRAME.get()))
//                .save(recipeSaver, ResourceLocation.fromNamespaceAndPath(Constants.MODID, "emerald_frame_conversion"));
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ItemInit.EMERALD_FRAME_THIN.get(), 1)
//                .requires(ItemInit.EMERALD_FRAME.get())
//                .unlockedBy("has_emerald_frame", has(ItemInit.EMERALD_FRAME.get()))
//                .save(recipeSaver, ResourceLocation.fromNamespaceAndPath(Constants.MODID, "thin_emerald_frame_conversion"));
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ItemInit.NETHERITE_FRAME.get(), 1)
//                .requires(ItemInit.NETHERITE_FRAME_THIN.get())
//                .unlockedBy("has_netherite_frame", has(ItemInit.NETHERITE_FRAME.get()))
//                .save(recipeSaver, ResourceLocation.fromNamespaceAndPath(Constants.MODID, "netherite_frame_conversion"));
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ItemInit.NETHERITE_FRAME_THIN.get(), 1)
//                .requires(ItemInit.NETHERITE_FRAME.get())
//                .unlockedBy("has_netherite_frame", has(ItemInit.NETHERITE_FRAME.get()))
//                .save(recipeSaver, ResourceLocation.fromNamespaceAndPath(Constants.MODID, "thin_netherite_frame_conversion"));
    }
}
