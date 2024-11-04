package com.namriahc.Rebuilding_World.registry;

import com.namriahc.Rebuilding_World.block.Block_first_soil;
import com.namriahc.Rebuilding_World.block.Block_shell_rock;

import com.namriahc.Rebuilding_World.block.Block_steely_tree_seed_fossil_in_a_shell_rock;
import com.namriahc.Rebuilding_World.block.Slabs.Block_shell_stone_slab;
import com.namriahc.Rebuilding_World.block.Stairs.Block_shell_stone_stairs;
import com.namriahc.Rebuilding_World.block.Walls.Block_shell_stone_wall;
import com.namriahc.Rebuilding_World.block.custom.Block_sponge_sand;
import com.namriahc.Rebuilding_World.block.custom.Block_wet_sponge_sand;
import com.namriahc.Rebuilding_World.block.custom.CropBlock_pioneers_wheat;
import com.namriahc.Rebuilding_World.main.Rebuilding_World;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Rebuilding_World_Blocks {

    public static class Blocks {

        public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Rebuilding_World.MOD_ID);
        public static final RegistryObject<Block> SHELL_ROCK = BLOCKS.register("shell_rock", Block_shell_rock::new);
        public static final RegistryObject<Block> FIRST_SOIL = BLOCKS.register("first_soil", Block_first_soil::new);
        public static final RegistryObject<Block> SPONGE_SAND = BLOCKS.register("sponge_sand", Block_sponge_sand::new);
        public static final RegistryObject<Block> WET_SPONGE_SAND = BLOCKS.register("wet_sponge_sand", Block_wet_sponge_sand::new);
        public static final RegistryObject<Block> STEELY_TREE_SEED_FOSSIL_IN_A_SHELL_ROCK = BLOCKS.register("steely_tree_seed_fossil_in_a_shell_rock", Block_steely_tree_seed_fossil_in_a_shell_rock::new);
        public static final RegistryObject<StairBlock> SHELL_STONE_STAIRS = BLOCKS.register("shell_stone_stairs", Block_shell_stone_stairs::new);
        public static final RegistryObject<WallBlock> SHELL_STONE_WALL = BLOCKS.register("shell_stone_wall", Block_shell_stone_wall::new);
        public static final RegistryObject<SlabBlock> SHELL_STONE_SLAB = BLOCKS.register("shell_stone_slab", Block_shell_stone_slab::new);
        public static final RegistryObject<Block> CROP_BROCK_PIONEERS_WHEAT = BLOCKS.register("pioneers_wheat", CropBlock_pioneers_wheat::new);
    }
    public static class BlockItems {
        public static final DeferredRegister<Item> BLOCK_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Rebuilding_World.MOD_ID);
        public static final RegistryObject<Item> SHELL_ROCK = BLOCK_ITEMS.register("shell_rock"
                , () -> new BlockItem(Blocks.SHELL_ROCK.get(), new Item.Properties()
                        .stacksTo(64)
                ));

        public static final RegistryObject<Item> FIRST_SOIL = BLOCK_ITEMS.register("first_soil"
                , () -> new BlockItem(Blocks.FIRST_SOIL.get(), new Item.Properties()
                        .stacksTo(64)
                ));

        public static final RegistryObject<Item> SPONGE_SAND = BLOCK_ITEMS.register("sponge_sand"
                , () -> new BlockItem(Blocks.SPONGE_SAND.get(), new Item.Properties()
                        .stacksTo(64)
                ));

        public static final RegistryObject<Item> WET_SPONGE_SAND = BLOCK_ITEMS.register("wet_sponge_sand"
                , () -> new BlockItem(Blocks.WET_SPONGE_SAND.get(), new Item.Properties()
                        .stacksTo(64)
                ));

        public static final RegistryObject<Item> STEELY_TREE_SEED_FOSSIL_IN_A_SHELL_ROCK = BLOCK_ITEMS.register("steely_tree_seed_fossil_in_a_shell_rock"
                , () -> new BlockItem(Blocks.STEELY_TREE_SEED_FOSSIL_IN_A_SHELL_ROCK.get(), new Item.Properties()
                        .stacksTo(64)
                ));
        public static final RegistryObject<Item> SHELL_STONE_STAIRS = BLOCK_ITEMS.register("shell_stone_stairs"
                , () -> new BlockItem(Blocks.SHELL_STONE_STAIRS.get(), new Item.Properties()
                        .stacksTo(64)
                ));
        public static final RegistryObject<Item> SHELL_STONE_WALL = BLOCK_ITEMS.register("shell_stone_wall"
                , () -> new BlockItem(Blocks.SHELL_STONE_WALL.get(), new Item.Properties()
                ));
        public static final RegistryObject<Item> SHELL_STONE_SLAB = BLOCK_ITEMS.register("shell_stone_slab"
                , () -> new BlockItem(Blocks.SHELL_STONE_SLAB.get(), new Item.Properties()
                ));
    }
}

