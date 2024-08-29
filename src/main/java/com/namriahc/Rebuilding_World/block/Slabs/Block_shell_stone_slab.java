package com.namriahc.Rebuilding_World.block.Slabs;

import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;

public class Block_shell_stone_slab extends SlabBlock {
    public Block_shell_stone_slab() {
        super(Properties.of()
                .strength(7F)
                .explosionResistance(7)
                .sound(SoundType.STONE)
        );
    }
}
