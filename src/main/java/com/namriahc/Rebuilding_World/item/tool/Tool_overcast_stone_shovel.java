package com.namriahc.Rebuilding_World.item.tool;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ShovelItem;

public class Tool_overcast_stone_shovel extends ShovelItem {
    public Tool_overcast_stone_shovel() {
        super(Rebuilding_World_Tiers.OVERCAST_STONE, 1.5F, -3.0F, new Properties()
                .rarity(Rarity.COMMON)
        );
    }
}
