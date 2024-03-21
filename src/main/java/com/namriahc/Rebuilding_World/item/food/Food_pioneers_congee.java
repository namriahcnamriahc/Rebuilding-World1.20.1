package com.namriahc.Rebuilding_World.item.food;

import net.minecraft.world.item.BowlFoodItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

public class Food_pioneers_congee extends BowlFoodItem {
    public Food_pioneers_congee() {
        super(new Properties()
                .food(Rebuilding_World_foods.PIONEERS_CONGEE)
                .stacksTo(64)
                .craftRemainder(Items.BOWL)
        );
    }
}
