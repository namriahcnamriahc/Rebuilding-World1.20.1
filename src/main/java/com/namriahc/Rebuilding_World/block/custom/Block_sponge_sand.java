package com.namriahc.Rebuilding_World.block.custom;
import com.namriahc.Rebuilding_World.registry.Rebuilding_World_Blocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;

public class Block_sponge_sand extends FallingBlock {
    public Block_sponge_sand() {
        super(Properties.of()
                .sound(SoundType.SAND)
        );
    }

    private static final Direction[] ALL_DIRECTIONS = Direction.values();

    private boolean removeWaterBreadthFirstSearch(Level pLevel, BlockPos pPos) {
        BlockState sponge_sand_state = pLevel.getBlockState(pPos);
        return BlockPos.breadthFirstTraversal(pPos,6,65, (p_277519_, p_277492_) -> {
            for (Direction direction : ALL_DIRECTIONS) {
                p_277492_.accept(p_277519_.relative(direction));
            }
        }, (p_279054_) -> {
            if (p_279054_.equals(pPos)) {
                return true;
            } else {
                BlockState blockState = pLevel.getBlockState(p_279054_);
                FluidState fluidState = pLevel.getFluidState(p_279054_);
                if (!sponge_sand_state.canBeHydrated(pLevel, pPos, fluidState, p_279054_)) {
                    return false;
                } else {
                    Block block = blockState.getBlock();
                    if (block instanceof BucketPickup){
                        BucketPickup bucketPickup = (BucketPickup) block;
                        if (!bucketPickup.pickupBlock(pLevel, p_279054_, blockState).isEmpty()) {
                            return true;
                        }
                    }

                    if (blockState.getBlock() instanceof LiquidBlock) {
                        pLevel.setBlock(p_279054_, Blocks.AIR.defaultBlockState(), 3);
                    }else {
                        if (!blockState.is(Blocks.KELP) && !blockState.is(Blocks.KELP_PLANT) && !blockState.is(Blocks.SEAGRASS) && !blockState.is(Blocks.TALL_SEAGRASS)) {
                            return false;
                        }
                        BlockEntity blockEntity = blockState.hasBlockEntity() ? pLevel.getBlockEntity(p_279054_) : null;
                        dropResources(blockState, pLevel, p_279054_,blockEntity);
                        pLevel.setBlock(p_279054_,Blocks.AIR.defaultBlockState(),3);
                    }

                    return true;
                }
            }

                })>1;
    }

    protected void tryAbsorbWater(Level pLevel, BlockPos pPos) {
        if (this.removeWaterBreadthFirstSearch(pLevel,pPos)) {
            pLevel.setBlock(pPos, Rebuilding_World_Blocks.Blocks.WET_SPONGE_SAND.get().defaultBlockState(),3);
            pLevel.levelEvent(2001, pPos, Block.getId(Blocks.WATER.defaultBlockState()));
        }
    }

    public void neighborChanged(BlockState p_56801_, Level p_56802_, BlockPos p_56803_, Block p_56804_, BlockPos p_56805_, boolean p_56806_) {
        this.tryAbsorbWater(p_56802_, p_56803_);
        super.neighborChanged(p_56801_, p_56802_, p_56803_, p_56804_, p_56805_, p_56806_);
    }

    public void onPlace(BlockState p_56811_, Level p_56812_, BlockPos p_56813_, BlockState p_56814_, boolean p_56815_) {
        if (!p_56814_.is(p_56811_.getBlock())) {
            this.tryAbsorbWater(p_56812_, p_56813_);
        }
    }

}
