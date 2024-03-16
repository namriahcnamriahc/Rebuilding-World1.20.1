package com.namriahc.Rebuilding_World.registry;

import com.namriahc.Rebuilding_World.block.Block_shell_rock;
import com.namriahc.Rebuilding_World.main.Rebuilding_World;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Rebuilding_World_Blocks {
    public static class Blocks{

        public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Rebuilding_World.MOD_ID);
        public static final RegistryObject<Block> SHELL_ROCK = BLOCKS.register("shell_rock", Block_shell_rock::new);

    }

    public static class BlockItems{
        public static final DeferredRegister<Item> BLOCK_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Rebuilding_World.MOD_ID);
        public static final RegistryObject<Item> SHELL_ROCK = BLOCK_ITEMS.register("shell_rock"
                , () -> new BlockItem(Blocks.SHELL_ROCK.get(), new Item.Properties()
                        .stacksTo(64)
                ));
    }
}

