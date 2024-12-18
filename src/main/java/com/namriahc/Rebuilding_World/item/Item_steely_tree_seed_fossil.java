package com.namriahc.Rebuilding_World.item;

import com.namriahc.Rebuilding_World.registry.Rebuilding_World_Blocks;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.Rarity;

public class Item_steely_tree_seed_fossil extends ItemNameBlockItem {
    public Item_steely_tree_seed_fossil() {
        super(Rebuilding_World_Blocks.Blocks.CROP_BLOCK_STEELY_TREE_SAPLING.get(),
                new Properties()
                        .fireResistant()
                        .stacksTo(64)
                        .rarity(Rarity.RARE));
    }
}
