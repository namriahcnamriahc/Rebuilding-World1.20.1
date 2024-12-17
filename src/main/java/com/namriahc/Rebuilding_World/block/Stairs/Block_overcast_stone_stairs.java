package com.namriahc.Rebuilding_World.block.Stairs;

import com.namriahc.Rebuilding_World.registry.Rebuilding_World_Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;

public class Block_overcast_stone_stairs extends StairBlock {
    public Block_overcast_stone_stairs() {
        super(Rebuilding_World_Blocks.Blocks.OVERCAST_ROCK.get().defaultBlockState(),
                Properties.of()
                        .strength(15)
                        .explosionResistance(15)
                        .requiresCorrectToolForDrops()
                        .sound(SoundType.STONE)
        );
    }
}
