package com.namriahc.Rebuilding_World.datagen;

import com.namriahc.Rebuilding_World.block.custom.CropBlock_pioneers_wheat;
import com.namriahc.Rebuilding_World.block.custom.CropBlock_steely_tree_sapling;
import com.namriahc.Rebuilding_World.main.Rebuilding_World;
import com.namriahc.Rebuilding_World.registry.Rebuilding_World_Blocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;

public class Rebuilding_World_BlockStateProvider extends BlockStateProvider {
    public Rebuilding_World_BlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Rebuilding_World.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlockWithItem(Rebuilding_World_Blocks.Blocks.FIRST_SOIL);

        simpleBlockWithItem(Rebuilding_World_Blocks.Blocks.OVERCAST_ROCK);

        simpleBlockWithItem(Rebuilding_World_Blocks.Blocks.SPONGE_SAND);
        simpleBlockWithItem(Rebuilding_World_Blocks.Blocks.WET_SPONGE_SAND);
        simpleBlockWithItem(Rebuilding_World_Blocks.Blocks.OVERCAST_STONE_STEELY_TREE_SEED_FOSSIL);

        stairsBlock((StairBlock) Rebuilding_World_Blocks.Blocks.OVERCAST_STONE_STAIRS.get(),
                blockTexture(Rebuilding_World_Blocks.Blocks.OVERCAST_ROCK.get()));

        wallBlock((WallBlock) Rebuilding_World_Blocks.Blocks.OVERCAST_STONE_WALL.get(),
                blockTexture(Rebuilding_World_Blocks.Blocks.OVERCAST_ROCK.get()));

        slabBlock((SlabBlock) Rebuilding_World_Blocks.Blocks.OVERCAST_STONE_SLAB.get(),
                blockTexture(Rebuilding_World_Blocks.Blocks.OVERCAST_ROCK.get()),
                blockTexture(Rebuilding_World_Blocks.Blocks.OVERCAST_ROCK.get()));

        make_pioneers_wheat_crop(Rebuilding_World_Blocks.Blocks.CROP_BROCK_PIONEERS_WHEAT.get(), "pioneers_wheat_stage", "pioneers_wheat_stage");
        make_steely_tree_sapling(Rebuilding_World_Blocks.Blocks.CROP_BLOCK_STEELY_TREE_SAPLING.get(), "steely_tree_sapling_stage","steely_tree_sapling_stage");

    }

    public void make_pioneers_wheat_crop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> pioneers_wheat_states(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] pioneers_wheat_states(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((CropBlock_pioneers_wheat)block).getAgeProperty()),
                new ResourceLocation(Rebuilding_World.MOD_ID, "block/" + textureName + state.getValue(((CropBlock_pioneers_wheat) block).getAgeProperty()))).renderType("cutout"));

        return models;
    }



    public void make_steely_tree_sapling(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> steely_tree_sapling_states(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] steely_tree_sapling_states(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((CropBlock_steely_tree_sapling)block).getAgeProperty()),
                new ResourceLocation(Rebuilding_World.MOD_ID, "block/" + textureName + state.getValue(((CropBlock_steely_tree_sapling) block).getAgeProperty()))).renderType("cutout"));

        return models;
    }



    private void simpleBlockWithItem(RegistryObject<Block> block) {
        simpleBlockWithItem(block.get(), cubeAll(block.get()));
    }
}






















