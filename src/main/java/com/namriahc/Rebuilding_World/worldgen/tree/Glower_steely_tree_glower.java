package com.namriahc.Rebuilding_World.worldgen.tree;

import com.namriahc.Rebuilding_World.worldgen.features.Rebuilding_World_features;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

public class Glower_steely_tree_glower extends AbstractTreeGrower {
    @Override
    protected @Nullable ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource randomSource, boolean b) {
        return Rebuilding_World_features.STEELY_TREE_KEY;
    }
}
