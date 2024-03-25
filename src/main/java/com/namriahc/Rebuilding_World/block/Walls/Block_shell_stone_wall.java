package com.namriahc.Rebuilding_World.block.Walls;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.WallBlock;

public class Block_shell_stone_wall extends WallBlock {
    public Block_shell_stone_wall() {
        super(Properties.of()
                .strength(15F)
                .sound(SoundType.STONE)
        );
    }
}
