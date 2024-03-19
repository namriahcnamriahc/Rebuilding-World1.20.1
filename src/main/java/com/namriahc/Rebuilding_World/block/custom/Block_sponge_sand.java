package com.namriahc.Rebuilding_World.block.custom;

import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.SoundType;

public class Block_sponge_sand extends FallingBlock {
    public Block_sponge_sand() {
        super(Properties.of()
                .sound(SoundType.SAND)
        );
    }
}
