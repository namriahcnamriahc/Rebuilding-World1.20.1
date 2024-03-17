package com.namriahc.Rebuilding_World.item.tool;

import com.namriahc.Rebuilding_World.main.Rebuilding_World;
import com.namriahc.Rebuilding_World.registry.Rebuilding_World_Blocks;
import com.namriahc.Rebuilding_World.registry.Rebuilding_World_Items;
import com.namriahc.Rebuilding_World.registry.Rebuilding_World_Tags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class Rebuilding_World_Tiers {

    public static final ForgeTier SHELL_STONE = new ForgeTier(1,131,4.0F,1.0F,15, Rebuilding_World_Tags.Blocks.NEEDS_SHELL_STONE_TOOL,()-> Ingredient.of(Rebuilding_World_Blocks.BlockItems.SHELL_ROCK.get()));

    static {
        TierSortingRegistry.registerTier(SHELL_STONE,new ResourceLocation(Rebuilding_World.MOD_ID,"shell_stone"), List.of(Tiers.WOOD),List.of(Tiers.STONE));
    }
}
