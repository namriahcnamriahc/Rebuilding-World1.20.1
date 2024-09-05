package com.namriahc.Rebuilding_World.item;

import com.namriahc.Rebuilding_World.registry.Rebuilding_World_Blocks;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.level.block.Block;

public class Item_pioneers_wheat_seeds extends ItemNameBlockItem {
    public Item_pioneers_wheat_seeds() {
        super(Rebuilding_World_Blocks.Blocks.PIONEERS_WHEAT_CROP.get(),
                new Properties());
    }
}
