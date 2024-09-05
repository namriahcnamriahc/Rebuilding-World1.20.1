package com.namriahc.Rebuilding_World.item;

import com.namriahc.Rebuilding_World.registry.Rebuilding_World_Blocks;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.level.block.Block;

public class Item_steely_tree_seed_fossil extends ItemNameBlockItem {
    public Item_steely_tree_seed_fossil() {
        super(Rebuilding_World_Blocks.Blocks.STEELY_TREE_SAPLING.get()
                , new Item.Properties()
                        .stacksTo(64)
                        .fireResistant());
    }
}
