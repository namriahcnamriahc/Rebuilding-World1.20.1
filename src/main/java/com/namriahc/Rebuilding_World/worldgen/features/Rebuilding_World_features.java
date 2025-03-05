package com.namriahc.Rebuilding_World.worldgen.features;

import com.namriahc.Rebuilding_World.main.Rebuilding_World;
import com.namriahc.Rebuilding_World.registry.Rebuilding_World_Blocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;

public class Rebuilding_World_features {

    public static final ResourceKey<ConfiguredFeature<?,?>> STEELY_TREE_KEY =
            createKey("steely_tree_key");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?,?>> context){
        FeatureUtils.register(context, STEELY_TREE_KEY, Feature.TREE,new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(Rebuilding_World_Blocks.Blocks.STEELY_TREE_LOG.get()),
                new StraightTrunkPlacer(5,3,4),
                BlockStateProvider.simple(Rebuilding_World_Blocks.Blocks.OVERCAST_ROCK.get()),
                new BlobFoliagePlacer(ConstantInt.of(3),ConstantInt.of(5),3),
                new TwoLayersFeatureSize(1,0,2)).build()
        );
    }

    public static ResourceKey<ConfiguredFeature<?,?>>createKey(String name) {


        return ResourceKey.create(Registries.CONFIGURED_FEATURE
                ,new ResourceLocation(Rebuilding_World.MOD_ID,name));
    }
}
