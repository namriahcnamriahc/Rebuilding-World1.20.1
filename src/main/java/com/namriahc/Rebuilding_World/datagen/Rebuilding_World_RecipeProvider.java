package com.namriahc.Rebuilding_World.datagen;

import com.namriahc.Rebuilding_World.main.Rebuilding_World;
import com.namriahc.Rebuilding_World.registry.Rebuilding_World_Blocks;
import com.namriahc.Rebuilding_World.registry.Rebuilding_World_Items;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Rebuilding_World_RecipeProvider extends RecipeProvider implements IConditionBuilder {
    public Rebuilding_World_RecipeProvider(PackOutput p_248933_) {
        super(p_248933_);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, Rebuilding_World_Items.OVERCAST_STONE_SWORD.get())
                .pattern("O")
                .pattern("O")
                .pattern("S")
                .define('O', Rebuilding_World_Blocks.BlockItems.OVERCAST_ROCK.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(Rebuilding_World_Blocks.BlockItems.OVERCAST_ROCK.get()),
                        has(Rebuilding_World_Blocks.BlockItems.OVERCAST_ROCK.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, Rebuilding_World_Items.OVERCAST_STONE_PICKAXE.get())
                .pattern("OOO")
                .pattern(" S ")
                .pattern(" S ")
                .define('O', Rebuilding_World_Blocks.BlockItems.OVERCAST_ROCK.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(Rebuilding_World_Blocks.BlockItems.OVERCAST_ROCK.get()),
                        has(Rebuilding_World_Blocks.BlockItems.OVERCAST_ROCK.get()))
                .save(consumer);

    }
    protected static void oreSmelting(Consumer<FinishedRecipe> p_250654_, List<ItemLike> p_250172_, RecipeCategory p_250588_, ItemLike p_251868_, float p_250789_, int p_252144_, String p_251687_) {
        oreCooking(p_250654_, RecipeSerializer.SMELTING_RECIPE, p_250172_, p_250588_, p_251868_, p_250789_, p_252144_, p_251687_, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> p_248775_, List<ItemLike> p_251504_, RecipeCategory p_248846_, ItemLike p_249735_, float p_248783_, int p_250303_, String p_251984_) {
        oreCooking(p_248775_, RecipeSerializer.BLASTING_RECIPE, p_251504_, p_248846_, p_249735_, p_248783_, p_250303_, p_251984_, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> p_250791_, RecipeSerializer<? extends AbstractCookingRecipe> p_251817_, List<ItemLike> p_249619_, RecipeCategory p_251154_, ItemLike p_250066_, float p_251871_, int p_251316_, String p_251450_, String p_249236_) {
        Iterator var9 = p_249619_.iterator();

        while(var9.hasNext()) {
            ItemLike itemlike = (ItemLike)var9.next();
            SimpleCookingRecipeBuilder.generic(Ingredient.of(new ItemLike[]{itemlike}), p_251154_, p_250066_,
                            p_251871_, p_251316_, p_251817_)
                    .group(p_251450_).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(p_250791_, Rebuilding_World.MOD_ID + ":" + getItemName(p_250066_) + p_249236_ + "_" + getItemName(itemlike));
        }

    }
}
































