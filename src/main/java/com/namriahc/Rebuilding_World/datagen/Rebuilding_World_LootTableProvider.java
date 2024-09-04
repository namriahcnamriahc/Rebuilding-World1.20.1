package com.namriahc.Rebuilding_World.datagen;

import com.namriahc.Rebuilding_World.datagen.loot.Rebuilding_World_BlockLootTables;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;
import java.util.Set;

public class Rebuilding_World_LootTableProvider {
    public static LootTableProvider create(PackOutput output) {
        return new LootTableProvider(output, Set.of(), List.of(
                new LootTableProvider.SubProviderEntry(Rebuilding_World_BlockLootTables::new, LootContextParamSets.BLOCK)
        ));
    }
}
