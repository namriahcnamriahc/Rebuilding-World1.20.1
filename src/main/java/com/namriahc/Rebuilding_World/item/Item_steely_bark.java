package com.namriahc.Rebuilding_World.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class Item_steely_bark extends Item {
    public Item_steely_bark() {
        super(new Properties()
                .stacksTo(64)
                .rarity(Rarity.COMMON)
                .fireResistant()
        );
    }
}