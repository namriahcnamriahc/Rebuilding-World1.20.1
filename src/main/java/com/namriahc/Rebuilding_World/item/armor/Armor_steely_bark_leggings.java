package com.namriahc.Rebuilding_World.item.armor;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Rarity;

public class Armor_steely_bark_leggings extends ArmorItem {
    public Armor_steely_bark_leggings() {
        super(Rebuilding_World_Armor_Materials.STEELY_BARK, Type.LEGGINGS,
                new Properties()
                        .rarity(Rarity.COMMON)
        );
    }
}
