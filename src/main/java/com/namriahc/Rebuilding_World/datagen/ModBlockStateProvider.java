package com.namriahc.Rebuilding_World.datagen;

import com.namriahc.Rebuilding_World.main.Rebuilding_World;
import com.namriahc.Rebuilding_World.registry.Rebuilding_World_Blocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.StairBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {


    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Rebuilding_World.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(Rebuilding_World_Blocks.Blocks.FIRST_SOIL);
        blockWithItem(Rebuilding_World_Blocks.Blocks.SPONGE_SAND);
        blockWithItem(Rebuilding_World_Blocks.Blocks.WET_SPONGE_SAND);
        blockWithItem(Rebuilding_World_Blocks.Blocks.SHELL_ROCK);
        blockWithItem(Rebuilding_World_Blocks.Blocks.STEELY_TREE_SEED_FOSSIL_IN_A_SHELL_ROCK);

        stairsBlock(((StairBlock) Rebuilding_World_Blocks.Blocks.SHELL_STONE_STAIR.get()), blockTexture(Rebuilding_World_Blocks.Blocks.SHELL_ROCK.get()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
