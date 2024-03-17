package com.namriahc.Rebuilding_World.registry;

import com.namriahc.Rebuilding_World.main.Rebuilding_World;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class Rebuilding_World_Tags {

    public static class Blocks{

        public static final TagKey<Block> NEEDS_SHELL_STONE_TOOL;

        static {
            NEEDS_SHELL_STONE_TOOL = tag("needs_shell_stone_tool");
        }

        private static TagKey<Block> tag (String name){
            return BlockTags.create(new ResourceLocation(Rebuilding_World.MOD_ID,name));
        }
    }

    public static class Items{
        public static final TagKey<Item> REBUILDING_WORLD_SERIES;

        static {
            REBUILDING_WORLD_SERIES = tag("rebuilding_world_series");
        }

        private static TagKey<Item> tag(String name){
            return ItemTags.create(new ResourceLocation(Rebuilding_World.MOD_ID,name));
        }
    }
}
