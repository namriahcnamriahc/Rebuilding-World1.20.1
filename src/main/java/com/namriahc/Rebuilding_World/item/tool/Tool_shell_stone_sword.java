package com.namriahc.Rebuilding_World.item.tool;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class Tool_shell_stone_sword extends SwordItem {
    public Tool_shell_stone_sword() {
        super(Rebuilding_World_Tiers.SHELL_STONE, 3, -2.4F, new Properties()
                .rarity(Rarity.COMMON)
        );
    }
}
