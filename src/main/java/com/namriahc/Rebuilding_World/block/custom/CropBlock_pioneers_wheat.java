package com.namriahc.Rebuilding_World.block.custom;

import com.namriahc.Rebuilding_World.registry.Rebuilding_World_Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class CropBlock_pioneers_wheat extends CropBlock {
    public static final int MAX_AGE = 7;
    public static final IntegerProperty AGE = BlockStateProperties.AGE_7;


    public CropBlock_pioneers_wheat() {
        super(Properties.of());
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return Rebuilding_World_Items.PIONEERS_WHEAT_SEEDS.get();
    }

    @Override
    public IntegerProperty getAgeProperty() {
        return AGE;
    }

    @Override
    public int getMaxAge() {
        return super.getMaxAge();
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_52286_) {
        p_52286_.add(AGE);
    }
}
