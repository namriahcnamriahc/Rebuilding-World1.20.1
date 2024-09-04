package com.namriahc.Rebuilding_World.datagen.loot;

import com.namriahc.Rebuilding_World.registry.Rebuilding_World_Blocks;
import com.namriahc.Rebuilding_World.registry.Rebuilding_World_Items;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class Rebuilding_World_BlockLootTables extends BlockLootSubProvider {
    protected Rebuilding_World_BlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {

        this.dropSelf(Rebuilding_World_Blocks.Blocks.SHELL_ROCK.get());
        this.dropSelf(Rebuilding_World_Blocks.Blocks.SHELL_STONE_SLAB.get());
        this.dropSelf(Rebuilding_World_Blocks.Blocks.SHELL_STONE_STAIRS.get());
        this.dropSelf(Rebuilding_World_Blocks.Blocks.SHELL_STONE_WALL.get());

        this.dropSelf(Rebuilding_World_Blocks.Blocks.FIRST_SOIL.get());
        this.dropSelf(Rebuilding_World_Blocks.Blocks.SPONGE_SAND.get());
        this.dropSelf(Rebuilding_World_Blocks.Blocks.WET_SPONGE_SAND.get());

        this.add(Rebuilding_World_Blocks.Blocks.STEELY_TREE_SEED_FOSSIL_IN_A_SHELL_ROCK.get(),
                block -> createOreDrops(Rebuilding_World_Blocks.Blocks.STEELY_TREE_SEED_FOSSIL_IN_A_SHELL_ROCK.get()
                        , Rebuilding_World_Items.STEELY_TREE_SEED_FOSSIL.get()));

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return Rebuilding_World_Blocks.Blocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }

    protected LootTable.Builder createOreDrops(Block p_251306_, Item item) {
        return createSilkTouchDispatchTable(p_251306_,
                this.applyExplosionDecay(p_251306_,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(0.0F, 1.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }
}























