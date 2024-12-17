package com.namriahc.Rebuilding_World.item.tool;

import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Rarity;

public class Tool_overcast_stone_pickaxe extends PickaxeItem {
    public Tool_overcast_stone_pickaxe() {
        super(Rebuilding_World_Tiers.OVERCAST_STONE, 1, -2.8F, new Properties()
                .rarity(Rarity.COMMON)
        );
    }
}
