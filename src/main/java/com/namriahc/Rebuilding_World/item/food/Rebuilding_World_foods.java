package com.namriahc.Rebuilding_World.item.food;

import net.minecraft.world.food.FoodProperties;

public class Rebuilding_World_foods{
    public static final FoodProperties PIONEERS_CONGEE = stew(2).build();

    private static FoodProperties.Builder stew(int p_150384_) {
        return (new FoodProperties.Builder()).nutrition(p_150384_).saturationMod(0.6F);
    }


}

