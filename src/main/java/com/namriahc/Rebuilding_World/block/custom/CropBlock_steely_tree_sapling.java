package com.namriahc.Rebuilding_World.block.custom;

import com.namriahc.Rebuilding_World.registry.Rebuilding_World_Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

import java.util.Properties;

public class CropBlock_steely_tree_sapling extends CropBlock {
    public static final int MAX_AGE = 5;
    public static final IntegerProperty AGE = BlockStateProperties.AGE_5;


    public CropBlock_steely_tree_sapling() {
        super(Properties.copy(Blocks.WHEAT));
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return Rebuilding_World_Items.STEELY_TREE_SEED_FOSSIL.get();
    }

    @Override
    public IntegerProperty getAgeProperty() {
        return AGE;
    }

    @Override
    public int getMaxAge() {
        return MAX_AGE;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_52286_) {
        p_52286_.add(AGE);
    }
}
