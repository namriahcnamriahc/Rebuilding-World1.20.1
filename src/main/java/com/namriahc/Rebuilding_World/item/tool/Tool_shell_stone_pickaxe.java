package com.namriahc.Rebuilding_World.item.tool;

import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Rarity;

public class Tool_shell_stone_pickaxe extends PickaxeItem {
    public Tool_shell_stone_pickaxe() {
        super(Rebuilding_World_Tiers.SHELL_STONE, 3, -2.6F, new Properties()
                .rarity(Rarity.COMMON)
        );
    }
}
