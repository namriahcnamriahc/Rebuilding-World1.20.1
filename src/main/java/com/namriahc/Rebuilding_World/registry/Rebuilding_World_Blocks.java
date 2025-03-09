package com.namriahc.Rebuilding_World.registry;

import com.namriahc.Rebuilding_World.block.*;

import com.namriahc.Rebuilding_World.block.Slabs.Block_overcast_stone_slab;
import com.namriahc.Rebuilding_World.block.Stairs.Block_overcast_stone_stairs;
import com.namriahc.Rebuilding_World.block.Walls.Block_overcast_stone_wall;
import com.namriahc.Rebuilding_World.block.custom.*;
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
        public static final RegistryObject<Block> FIRST_SOIL = BLOCKS.register("first_soil", Block_first_soil::new);
        public static final RegistryObject<Block> OVERCAST_ROCK = BLOCKS.register("overcast_rock", Block_overcast_rock::new);
        public static final RegistryObject<Block> SPONGE_SAND = BLOCKS.register("sponge_sand", Block_sponge_sand::new);
        public static final RegistryObject<Block> WET_SPONGE_SAND = BLOCKS.register("wet_sponge_sand", Block_wet_sponge_sand::new);
        public static final RegistryObject<CropBlock> CROP_BROCK_PIONEERS_WHEAT = BLOCKS.register("crop_block_pioneers_wheat", CropBlock_pioneers_wheat::new);

        public static final RegistryObject<StairBlock> OVERCAST_STONE_STAIRS = BLOCKS.register("overcast_stone_stairs", Block_overcast_stone_stairs::new);
        public static final RegistryObject<WallBlock> OVERCAST_STONE_WALL = BLOCKS.register("overcast_stone_wall", Block_overcast_stone_wall::new);
        public static final RegistryObject<SlabBlock> OVERCAST_STONE_SLAB = BLOCKS.register("overcast_stone_slab", Block_overcast_stone_slab::new);

        public static final RegistryObject<Block> OVERCAST_STONE_STEELY_TREE_SEED_FOSSIL = BLOCKS.register("overcast_stone_steely_tree_seed_fossil", Block_overcast_stone_steely_tree_seed_fossil::new);
        public static final RegistryObject<CropBlock> CROP_BLOCK_STEELY_TREE_SAPLING = BLOCKS.register("crop_block_steely_tree_sapling", CropBlock_steely_tree_sapling::new);
        public static final RegistryObject<SaplingBlock> COMPLETE_STEELY_TREE_SAPLING = BLOCKS.register("complete_steely_tree_sapling", SaplingBlock_complete_steely_tree_sapling::new);
        public static final RegistryObject<Block> STEELY_TREE_LOG = BLOCKS.register("steely_tree_log", LogBlock_steely_tree_log::new);
        public static final RegistryObject<Block> STRIPPED_STEELY_TREE_LOG = BLOCKS.register("stripped_steely_tree_log", StrippedLogBlock_stripped_steely_tree_log::new);

    }
    public static class BlockItems {
        public static final DeferredRegister<Item> BLOCK_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Rebuilding_World.MOD_ID);

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




        public static final RegistryObject<Item> OVERCAST_ROCK = BLOCK_ITEMS.register("overcast_rock"
                , () -> new BlockItem(Blocks.OVERCAST_ROCK.get(), new Item.Properties()
                        .stacksTo(64)
                ));

        public static final RegistryObject<Item> OVERCAST_STONE_STAIRS = BLOCK_ITEMS.register("overcast_stone_stairs"
                , () -> new BlockItem(Blocks.OVERCAST_STONE_STAIRS.get(), new Item.Properties()
                        .stacksTo(64)
                ));
        public static final RegistryObject<Item> OVERCAST_STONE_SLAB = BLOCK_ITEMS.register("overcast_slab"
                , () -> new BlockItem(Blocks.OVERCAST_STONE_SLAB.get(), new Item.Properties()
                        .stacksTo(64)
                ));
        public static final RegistryObject<Item> OVERCAST_STONE_WALL = BLOCK_ITEMS.register("overcast_stone_wall"
                , () -> new BlockItem(Blocks.OVERCAST_STONE_WALL.get(), new Item.Properties()
                ));

        public static final RegistryObject<Item> OVERCAST_STONE_STEELY_TREE_SEED_FOSSIL = BLOCK_ITEMS.register("overcast_stone_steely_tree_seed_fossil"
                , () -> new BlockItem(Blocks.OVERCAST_STONE_STEELY_TREE_SEED_FOSSIL.get(), new Item.Properties()
                        .stacksTo(64)
                ));

        public static final RegistryObject<Item> COMPLETE_STEELY_TREE_SAPLING = BLOCK_ITEMS.register("complete_steely_tree_sapling"
                , () -> new BlockItem(Blocks.COMPLETE_STEELY_TREE_SAPLING.get(), new Item.Properties()
                        .stacksTo(64)
                ));

        public static final RegistryObject<Item> STEELY_TREE_LOG = BLOCK_ITEMS.register("steely_tree_log"
                , () -> new BlockItem(Blocks.STEELY_TREE_LOG.get(), new Item.Properties()
                        .stacksTo(64)
                ));

        public static final RegistryObject<Item> STRIPPED_STEELY_TREE_LOG = BLOCK_ITEMS.register("stripped_steely_tree_log"
                , () -> new BlockItem(Blocks.STRIPPED_STEELY_TREE_LOG.get(), new Item.Properties()
                        .stacksTo(64)
                ));
    }
}

