package com.namriahc.Rebuilding_World.datagen;

import com.namriahc.Rebuilding_World.main.Rebuilding_World;
import com.namriahc.Rebuilding_World.registry.Rebuilding_World_Blocks;
import com.namriahc.Rebuilding_World.registry.Rebuilding_World_Items;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

import java.util.Locale;

public class Rebuilding_World_JAJPLanguageProvider extends LanguageProvider {
    public Rebuilding_World_JAJPLanguageProvider(PackOutput output) {
        super(output, Rebuilding_World.MOD_ID, Locale.JAPAN.toString().toLowerCase());
    }

    @Override
    protected void addTranslations() {
        add("itemGroup.rebuilding_world_items_tabs", "回周世界のアイテム");
        add("itemGroup.rebuilding_world_nature_blocks_tabs", "回周世界の天然ブロック");

        addItem(Rebuilding_World_Items.STEELY_BARK, "鎧樹皮");
        addItem(Rebuilding_World_Items.STEELY_TREE_SEED_FOSSIL, "鎧樹の種の化石");

        addItem(Rebuilding_World_Items.STEELY_BARK_HELMET, "鎧樹皮のヘルメット");
        addItem(Rebuilding_World_Items.STEELY_BARK_CHESTPLATE, "鎧樹皮のチェストプレート");
        addItem(Rebuilding_World_Items.STEELY_BARK_LEGGINGS, "鎧樹皮のレギンス");
        addItem(Rebuilding_World_Items.STEELY_BARK_BOOTS, "鎧樹皮のブーツ");

        addItem(Rebuilding_World_Items.SHELL_STONE_SWORD, "殻石の剣");
        addItem(Rebuilding_World_Items.SHELL_STONE_PICKAXE, "殻石のつるはし");
        addItem(Rebuilding_World_Items.SHELL_STONE_SHOVEL, "殻石のショヴェル");

        addItem(Rebuilding_World_Items.PIONEERS_CONGEE, "先駆者の粥");
        addItem(Rebuilding_World_Items.PIONEERS_WHEAT, "先駆麦");

        addBlock(Rebuilding_World_Blocks.Blocks.FIRST_SOIL, "最初の土壌");
        addBlock(Rebuilding_World_Blocks.Blocks.SHELL_ROCK, "殻石");
        addBlock(Rebuilding_World_Blocks.Blocks.SPONGE_SAND, "スポンジ沙");
        addBlock(Rebuilding_World_Blocks.Blocks.WET_SPONGE_SAND, "水を吸ったスポンジ沙");
        addBlock(Rebuilding_World_Blocks.Blocks.STEELY_TREE_SEED_FOSSIL_IN_A_SHELL_ROCK, "殻石に埋まっている鎧樹の種の化石");

        addBlock(Rebuilding_World_Blocks.Blocks.SHELL_STONE_STAIRS, "殻石の階段");
        addBlock(Rebuilding_World_Blocks.Blocks.SHELL_STONE_SLAB,"殻石のハーフブロック");
        addBlock(Rebuilding_World_Blocks.Blocks.SHELL_STONE_WALL,"殻石の壁");

    }
}


































