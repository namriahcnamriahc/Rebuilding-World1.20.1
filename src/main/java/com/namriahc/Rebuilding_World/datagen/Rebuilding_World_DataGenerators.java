package com.namriahc.Rebuilding_World.datagen;

import com.namriahc.Rebuilding_World.main.Rebuilding_World;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Rebuilding_World.MOD_ID ,bus = Mod.EventBusSubscriber.Bus.MOD)

public class Rebuilding_World_DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        generator.addProvider(event.includeClient(), new Rebuilding_World_ItemModelProvider(packOutput
                , existingFileHelper));

        generator.addProvider(event.includeClient(), new Rebuilding_World_BlockStateProvider(packOutput
                , existingFileHelper));

    }
}





















