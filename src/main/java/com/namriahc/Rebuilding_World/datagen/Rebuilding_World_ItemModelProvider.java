package com.namriahc.Rebuilding_World.datagen;

import com.namriahc.Rebuilding_World.main.Rebuilding_World;
import com.namriahc.Rebuilding_World.registry.Rebuilding_World_Items;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;

public class Rebuilding_World_ItemModelProvider extends net.minecraftforge.client.model.generators.ItemModelProvider {
    public Rebuilding_World_ItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Rebuilding_World.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(Rebuilding_World_Items.STEELY_BARK.get());
        basicItem(Rebuilding_World_Items.STEELY_TREE_SEED_FOSSIL.get());

        basicItem(Rebuilding_World_Items.SHELL_STONE_SWORD.get());
        basicItem(Rebuilding_World_Items.SHELL_STONE_PICKAXE.get());
        basicItem(Rebuilding_World_Items.SHELL_STONE_SHOVEL.get());

        basicItem(Rebuilding_World_Items.PIONEERS_CONGEE.get());
    }
}
