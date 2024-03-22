package com.namriahc.Rebuilding_World.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

public class Block_first_soil extends Block {
    public Block_first_soil() {
        super(Properties.of()
                .sound(SoundType.GRASS)
                .strength(0.5F)
        );
    }
}

