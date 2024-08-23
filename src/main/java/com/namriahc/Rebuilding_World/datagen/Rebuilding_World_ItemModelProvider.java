package com.namriahc.Rebuilding_World.datagen;

import com.namriahc.Rebuilding_World.main.Rebuilding_World;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;

public class Rebuilding_World_ItemModelProvider extends net.minecraftforge.client.model.generators.ItemModelProvider {
    public Rebuilding_World_ItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Rebuilding_World.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
    }
}
