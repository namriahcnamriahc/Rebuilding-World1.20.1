package com.namriahc.Rebuilding_World.block.custom;

import com.mojang.math.Axis;
import com.namriahc.Rebuilding_World.registry.Rebuilding_World_Blocks;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
import org.jetbrains.annotations.Nullable;

import static net.minecraft.world.level.block.RotatedPillarBlock.AXIS;

public class StrippableBlocks extends Block {
    public StrippableBlocks(Properties p_49795_) {
        super(p_49795_);
    }

    @Override
    public @Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate) {
        if (context.getItemInHand().getItem() instanceof AxeItem) {
            if (state.is(Rebuilding_World_Blocks.Blocks.STEELY_TREE_LOG.get())) {
                return Rebuilding_World_Blocks.Blocks.OVERCAST_ROCK.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }
        return super.getToolModifiedState(state, context, toolAction, simulate);
    }
}
