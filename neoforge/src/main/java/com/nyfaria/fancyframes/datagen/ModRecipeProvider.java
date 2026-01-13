package com.nyfaria.fancyframes.datagen;

import com.nyfaria.fancyframes.*;
import com.nyfaria.fancyframes.init.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.*;
import net.minecraft.tags.*;
import net.minecraft.world.item.*;
import net.neoforged.neoforge.common.*;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(PackOutput p_248933_, CompletableFuture<HolderLookup.Provider> p_323846_) {
        super(p_248933_, p_323846_);
    }

    @Override
    protected void buildRecipes(RecipeOutput p_301172_) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ItemInit.WOODEN_FRAME.get(), 1)
                .pattern(" L ")
                .pattern("LFL")
                .pattern(" L ")
                .define('L', ItemTags.LOGS)
                .define('F', Items.ITEM_FRAME)
                .unlockedBy("has_frame", has(Items.ITEM_FRAME))
                .save(p_301172_);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ItemInit.STONE_FRAME.get(), 1)
                .pattern(" S ")
                .pattern("SFS")
                .pattern(" S ")
                .define('S', ItemTags.STONE_CRAFTING_MATERIALS)
                .define('F', Items.ITEM_FRAME)
                .unlockedBy("has_frame", has(Items.ITEM_FRAME))
                .save(p_301172_);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ItemInit.COPPER_FRAME.get(), 1)
                .pattern(" C ")
                .pattern("CFC")
                .pattern(" C ")
                .define('C', Tags.Items.INGOTS_COPPER)
                .define('F', Items.ITEM_FRAME)
                .unlockedBy("has_frame", has(Items.ITEM_FRAME))
                .save(p_301172_);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ItemInit.IRON_FRAME.get(), 1)
                .pattern(" I ")
                .pattern("IFI")
                .pattern(" I ")
                .define('I', Tags.Items.INGOTS_IRON)
                .define('F', Items.ITEM_FRAME)
                .unlockedBy("has_frame", has(Items.ITEM_FRAME))
                .save(p_301172_);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ItemInit.GOLD_FRAME.get(), 1)
                .pattern(" G ")
                .pattern("GFG")
                .pattern(" G ")
                .define('G', Tags.Items.INGOTS_GOLD)
                .define('F', Items.ITEM_FRAME)
                .unlockedBy("has_frame", has(Items.ITEM_FRAME))
                .save(p_301172_);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ItemInit.DIAMOND_FRAME.get(), 1)
                .pattern(" D ")
                .pattern("DFD")
                .pattern(" D ")
                .define('D', Tags.Items.GEMS_DIAMOND)
                .define('F', Items.ITEM_FRAME)
                .unlockedBy("has_frame", has(Items.ITEM_FRAME))
                .save(p_301172_);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ItemInit.EMERALD_FRAME.get(), 1)
                .pattern(" E ")
                .pattern("EFE")
                .pattern(" E ")
                .define('E', Tags.Items.GEMS_EMERALD)
                .define('F', Items.ITEM_FRAME)
                .unlockedBy("has_frame", has(Items.ITEM_FRAME))
                .save(p_301172_);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ItemInit.NETHERITE_FRAME.get(), 1)
                .requires(Tags.Items.ORES_NETHERITE_SCRAP)
                .requires(Items.ITEM_FRAME)
                .unlockedBy("has_frame", has(Items.ITEM_FRAME))
                .save(p_301172_);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ItemInit.WOODEN_FRAME.get(), 1)
                .requires(ItemInit.WOODEN_FRAME_THIN.get())
                .unlockedBy("has_wooden_frame", has(ItemInit.WOODEN_FRAME.get()))
                .save(p_301172_, ResourceLocation.fromNamespaceAndPath(Constants.MODID, "wooden_frame_conversion"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ItemInit.WOODEN_FRAME_THIN.get(), 1)
                .requires(ItemInit.WOODEN_FRAME.get())
                .unlockedBy("has_wooden_frame", has(ItemInit.WOODEN_FRAME.get()))
                .save(p_301172_, ResourceLocation.fromNamespaceAndPath(Constants.MODID, "thin_wooden_frame_conversion"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ItemInit.STONE_FRAME.get(), 1)
                .requires(ItemInit.STONE_FRAME_THIN.get())
                .unlockedBy("has_stone_frame", has(ItemInit.STONE_FRAME.get()))
                .save(p_301172_, ResourceLocation.fromNamespaceAndPath(Constants.MODID, "stone_frame_conversion"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ItemInit.STONE_FRAME_THIN.get(), 1)
                .requires(ItemInit.STONE_FRAME.get())
                .unlockedBy("has_stone_frame", has(ItemInit.STONE_FRAME.get()))
                .save(p_301172_, ResourceLocation.fromNamespaceAndPath(Constants.MODID, "thin_stone_frame_conversion"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ItemInit.COPPER_FRAME.get(), 1)
                .requires(ItemInit.COPPER_FRAME_THIN.get())
                .unlockedBy("has_copper_frame", has(ItemInit.COPPER_FRAME.get()))
                .save(p_301172_, ResourceLocation.fromNamespaceAndPath(Constants.MODID, "copper_frame_conversion"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ItemInit.COPPER_FRAME_THIN.get(), 1)
                .requires(ItemInit.COPPER_FRAME.get())
                .unlockedBy("has_copper_frame", has(ItemInit.COPPER_FRAME.get()))
                .save(p_301172_, ResourceLocation.fromNamespaceAndPath(Constants.MODID, "thin_copper_frame_conversion"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ItemInit.IRON_FRAME.get(), 1)
                .requires(ItemInit.IRON_FRAME_THIN.get())
                .unlockedBy("has_iron_frame", has(ItemInit.IRON_FRAME.get()))
                .save(p_301172_, ResourceLocation.fromNamespaceAndPath(Constants.MODID, "iron_frame_conversion"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ItemInit.IRON_FRAME_THIN.get(), 1)
                .requires(ItemInit.IRON_FRAME.get())
                .unlockedBy("has_iron_frame", has(ItemInit.IRON_FRAME.get()))
                .save(p_301172_, ResourceLocation.fromNamespaceAndPath(Constants.MODID, "thin_iron_frame_conversion"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ItemInit.GOLD_FRAME.get(), 1)
                .requires(ItemInit.GOLD_FRAME_THIN.get())
                .unlockedBy("has_gold_frame", has(ItemInit.GOLD_FRAME.get()))
                .save(p_301172_, ResourceLocation.fromNamespaceAndPath(Constants.MODID, "gold_frame_conversion"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ItemInit.GOLD_FRAME_THIN.get(), 1)
                .requires(ItemInit.GOLD_FRAME.get())
                .unlockedBy("has_gold_frame", has(ItemInit.GOLD_FRAME.get()))
                .save(p_301172_, ResourceLocation.fromNamespaceAndPath(Constants.MODID, "thin_gold_frame_conversion"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ItemInit.DIAMOND_FRAME.get(), 1)
                .requires(ItemInit.DIAMOND_FRAME_THIN.get())
                .unlockedBy("has_diamond_frame", has(ItemInit.DIAMOND_FRAME.get()))
                .save(p_301172_, ResourceLocation.fromNamespaceAndPath(Constants.MODID, "diamond_frame_conversion"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ItemInit.DIAMOND_FRAME_THIN.get(), 1)
                .requires(ItemInit.DIAMOND_FRAME.get())
                .unlockedBy("has_diamond_frame", has(ItemInit.DIAMOND_FRAME.get()))
                .save(p_301172_, ResourceLocation.fromNamespaceAndPath(Constants.MODID, "thin_diamond_frame_conversion"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ItemInit.EMERALD_FRAME.get(), 1)
                .requires(ItemInit.EMERALD_FRAME_THIN.get())
                .unlockedBy("has_emerald_frame", has(ItemInit.EMERALD_FRAME.get()))
                .save(p_301172_, ResourceLocation.fromNamespaceAndPath(Constants.MODID, "emerald_frame_conversion"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ItemInit.EMERALD_FRAME_THIN.get(), 1)
                .requires(ItemInit.EMERALD_FRAME.get())
                .unlockedBy("has_emerald_frame", has(ItemInit.EMERALD_FRAME.get()))
                .save(p_301172_, ResourceLocation.fromNamespaceAndPath(Constants.MODID, "thin_emerald_frame_conversion"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ItemInit.NETHERITE_FRAME.get(), 1)
                .requires(ItemInit.NETHERITE_FRAME_THIN.get())
                .unlockedBy("has_netherite_frame", has(ItemInit.NETHERITE_FRAME.get()))
                .save(p_301172_, ResourceLocation.fromNamespaceAndPath(Constants.MODID, "netherite_frame_conversion"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ItemInit.NETHERITE_FRAME_THIN.get(), 1)
                .requires(ItemInit.NETHERITE_FRAME.get())
                .unlockedBy("has_netherite_frame", has(ItemInit.NETHERITE_FRAME.get()))
                .save(p_301172_, ResourceLocation.fromNamespaceAndPath(Constants.MODID, "thin_netherite_frame_conversion"));
    }
}
