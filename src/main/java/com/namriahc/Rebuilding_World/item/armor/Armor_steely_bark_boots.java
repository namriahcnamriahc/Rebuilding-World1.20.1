package com.namriahc.Rebuilding_World.item.armor;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Rarity;

public class Armor_steely_bark_boots extends ArmorItem {
    public Armor_steely_bark_boots() {
        super(Rebuilding_World_Armor_Materials.STEELY_BARK, Type.BOOTS,
                new Properties()
                        .rarity(Rarity.COMMON)
        );
    }
}
