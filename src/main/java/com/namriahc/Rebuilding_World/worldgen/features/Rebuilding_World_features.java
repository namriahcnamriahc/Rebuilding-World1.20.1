package com.namriahc.Rebuilding_World.worldgen.features;

import com.namriahc.Rebuilding_World.main.Rebuilding_World;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

public class Rebuilding_World_features {

    public static final ResourceKey<ConfiguredFeature<?,?>> AAA =
            createKey("aaa");

    public static ResourceKey<ConfiguredFeature<?,?>>createKey(String name) {


        return ResourceKey.create(Registries.CONFIGURED_FEATURE
                ,new ResourceLocation(Rebuilding_World.MOD_ID,name));
    }
}
