package com.namriahc.Rebuilding_World.block.custom;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
import net.minecraftforge.common.ToolActions;
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

public class Strippable_Log_Block extends RotatedPillarBlock {

    private final Supplier<Block> stripped_log;

    public Strippable_Log_Block(Properties p_55926_, Supplier<Block> strippedLog) {
        super(p_55926_);

        stripped_log = strippedLog;
    }

    @Override
    public @Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate) {

        if(toolAction == ToolActions.AXE_STRIP){
            return stripped_log.get().defaultBlockState().setValue(AXIS,state.getValue(AXIS));

        }
        return super.getToolModifiedState(state, context, toolAction, simulate);
    }
}
