package com.namriahc.Rebuilding_World.block.custom;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class Block_sponge_sand extends FallingBlock {
    public Block_sponge_sand() {
        super(Properties.of()
                .sound(SoundType.SAND)
        );
    }

    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
        pLevel.setBlock(pPos, Blocks.WET_SPONGE.defaultBlockState(),2);
        return super.use(pState, pLevel, pPos, pPlayer, pHand, pHit);
    }

}
