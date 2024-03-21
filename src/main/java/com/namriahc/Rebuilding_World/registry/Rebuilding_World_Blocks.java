package com.namriahc.Rebuilding_World.registry;

import com.namriahc.Rebuilding_World.block.Block_first_soil;
import com.namriahc.Rebuilding_World.block.Block_shell_rock;

import com.namriahc.Rebuilding_World.block.Block_steely_tree_seed_fossil_in_a_shell_rock;
import com.namriahc.Rebuilding_World.block.custom.Block_sponge_sand;
import com.namriahc.Rebuilding_World.block.custom.Block_wet_sponge_sand;
import com.namriahc.Rebuilding_World.main.Rebuilding_World;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
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
    }
}

