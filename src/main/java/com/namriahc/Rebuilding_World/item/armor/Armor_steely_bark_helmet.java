package com.namriahc.Rebuilding_World.item.armor;

import com.namriahc.Rebuilding_World.item.armor.Rebuilding_World_Armor_Materials;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Rarity;

public class Armor_steely_bark_helmet extends ArmorItem {
    public Armor_steely_bark_helmet() {
        super(Rebuilding_World_Armor_Materials.STEELY_BARK, Type.HELMET,
                new Properties()
                        .rarity(Rarity.COMMON)
        );
    }
}
