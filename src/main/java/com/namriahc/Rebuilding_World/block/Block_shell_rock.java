package com.namriahc.Rebuilding_World.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

public class Block_shell_rock extends Block {
    public Block_shell_rock() {
        super(Properties.of()
                .strength(15)
                .explosionResistance(15)
                .requiresCorrectToolForDrops()
                .sound(SoundType.STONE)
        );
    }
}