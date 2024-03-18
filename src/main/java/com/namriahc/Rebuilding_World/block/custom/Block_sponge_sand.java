package com.namriahc.Rebuilding_World.block.custom;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BucketPickup;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;

public class Block_sponge_sand extends Block {

    public static final int MAX_DEPTH; static {MAX_DEPTH = 6;}

    public static final int MAX_COUNT; static {MAX_COUNT = 64;}

    private static final Direction[] ALL_DIRECTIONS; static {ALL_DIRECTIONS = Direction.values();}

    public Block_sponge_sand() {
        super(Properties.of());}

    public void onPlace(BlockState pState1, Level pLevel, BlockPos pPos, BlockState pState2, boolean p_boolean) {
        if (!pState2.is(pState1.getBlock())) {
            this.tryAbsorbWater(pLevel, pPos);
        }
    }

    public void neighborChanged(BlockState pState, Level pLevel, BlockPos pPos1, Block pBlock, BlockPos pPos2, boolean p_boolean) {
        this.tryAbsorbWater(pLevel, pPos1);
        super.neighborChanged(pState, pLevel, pPos1, pBlock, pPos2, p_boolean);
    }

    protected void tryAbsorbWater(Level pLevel, BlockPos pPos) {
        if (this.removeWaterBreadthFirstSearch(pLevel, pPos)) {
            pLevel.setBlock(pPos, Blocks.WET_SPONGE.defaultBlockState(), 2);
            pLevel.levelEvent(2001, pPos, Block.getId(Blocks.WATER.defaultBlockState()));
        }

    }

    private boolean removeWaterBreadthFirstSearch(Level p_56808_, BlockPos p_56809_) {
        BlockState spongeState = p_56808_.getBlockState(p_56809_);
        return BlockPos.breadthFirstTraversal(p_56809_, 6, 65, (p_277519_, p_277492_) -> {
            for(Direction direction : ALL_DIRECTIONS) {
                p_277492_.accept(p_277519_.relative(direction));
            }

        }, (p_279054_) -> {
            if (p_279054_.equals(p_56809_)) {
                return true;
            } else {
                BlockState blockstate = p_56808_.getBlockState(p_279054_);
                FluidState fluidstate = p_56808_.getFluidState(p_279054_);
                if (!spongeState.canBeHydrated(p_56808_, p_56809_, fluidstate, p_279054_)) {
                    return false;
                } else {
                    Block block = blockstate.getBlock();
                    if (block instanceof BucketPickup) {
                        BucketPickup bucketpickup = (BucketPickup)block;
                        if (!bucketpickup.pickupBlock(p_56808_, p_279054_, blockstate).isEmpty()) {
                            return true;
                        }
                    }

                    if (blockstate.getBlock() instanceof LiquidBlock) {
                        p_56808_.setBlock(p_279054_, Blocks.AIR.defaultBlockState(), 3);
                    } else {
                        if (!blockstate.is(Blocks.KELP) && !blockstate.is(Blocks.KELP_PLANT) && !blockstate.is(Blocks.SEAGRASS) && !blockstate.is(Blocks.TALL_SEAGRASS)) {
                            return false;
                        }

                        BlockEntity blockentity = blockstate.hasBlockEntity() ? p_56808_.getBlockEntity(p_279054_) : null;
                        dropResources(blockstate, p_56808_, p_279054_, blockentity);
                        p_56808_.setBlock(p_279054_, Blocks.AIR.defaultBlockState(), 3);
                    }

                    return true;
                }
            }
        }) > 1;
    }

}
