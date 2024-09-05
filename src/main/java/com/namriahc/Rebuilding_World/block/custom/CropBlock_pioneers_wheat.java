package com.namriahc.Rebuilding_World.block.custom;

import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class CropBlock_pioneers_wheat extends CropBlock {

    public static final int MAX_AGE = 7;
    public static final IntegerProperty AGE = BlockStateProperties.AGE_7;

    public CropBlock_pioneers_wheat(Properties p_52247_) {
        super(p_52247_);
    }
}
