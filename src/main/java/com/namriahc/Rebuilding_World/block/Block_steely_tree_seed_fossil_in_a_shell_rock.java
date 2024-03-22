package com.namriahc.Rebuilding_World.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

public class Block_steely_tree_seed_fossil_in_a_shell_rock extends Block {
    public Block_steely_tree_seed_fossil_in_a_shell_rock() {
        super(Properties.of()
                .requiresCorrectToolForDrops()
                .strength(20)
                .explosionResistance(15)
                .sound(SoundType.STONE)
        );
    }
}
