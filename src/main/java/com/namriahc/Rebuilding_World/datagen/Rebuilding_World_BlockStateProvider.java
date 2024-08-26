package com.namriahc.Rebuilding_World.datagen;

import com.namriahc.Rebuilding_World.main.Rebuilding_World;
import com.namriahc.Rebuilding_World.registry.Rebuilding_World_Blocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class Rebuilding_World_BlockStateProvider extends BlockStateProvider {
    public Rebuilding_World_BlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Rebuilding_World.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlockWithItem(Rebuilding_World_Blocks.Blocks.FIRST_SOIL);
        simpleBlockWithItem(Rebuilding_World_Blocks.Blocks.SHELL_ROCK);
        simpleBlockWithItem(Rebuilding_World_Blocks.Blocks.SPONGE_SAND);
        simpleBlockWithItem(Rebuilding_World_Blocks.Blocks.WET_SPONGE_SAND);
        simpleBlockWithItem(Rebuilding_World_Blocks.Blocks.STEELY_TREE_SEED_FOSSIL_IN_A_SHELL_ROCK);

    }

    private void simpleBlockWithItem(RegistryObject<Block> block) {
        simpleBlockWithItem(block.get(), cubeAll(block.get()));
    }
}






















