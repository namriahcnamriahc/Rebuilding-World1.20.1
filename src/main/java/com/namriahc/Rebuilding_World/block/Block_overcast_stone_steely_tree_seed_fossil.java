package com.namriahc.Rebuilding_World.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

public class Block_overcast_stone_steely_tree_seed_fossil extends Block {
    public Block_overcast_stone_steely_tree_seed_fossil() {
        super(Properties.of()
                .requiresCorrectToolForDrops()
                .strength(20)
                .explosionResistance(15)
                .sound(SoundType.STONE)
        );
    }
}
