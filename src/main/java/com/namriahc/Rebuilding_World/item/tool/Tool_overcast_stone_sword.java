package com.namriahc.Rebuilding_World.item.tool;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SwordItem;

public class Tool_overcast_stone_sword extends SwordItem {
    public Tool_overcast_stone_sword() {
        super(Rebuilding_World_Tiers.OVERCAST_STONE, 3, -2.4F, new Properties()
                .rarity(Rarity.COMMON)
        );
    }
}
