package com.namriahc.Rebuilding_World.block.Stairs;

import com.namriahc.Rebuilding_World.registry.Rebuilding_World_Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;

import java.util.function.Supplier;

public class Block_shell_stone_stair extends StairBlock {
    public Block_shell_stone_stair() {
        super(Rebuilding_World_Blocks.Blocks.SHELL_ROCK.get().defaultBlockState(),
                Properties.of()
                        .strength(15)
                        .explosionResistance(15)
                        .requiresCorrectToolForDrops()
                        .sound(SoundType.STONE)
        );
    }
}
