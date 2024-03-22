package com.namriahc.Rebuilding_World.block.custom;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

public class Block_wet_sponge_sand extends Block {
    public Block_wet_sponge_sand() {
        super(Properties.of()
                .sound(SoundType.GRASS)
                .strength(0.8F)
        );
    }
}
