package com.namriahc.Rebuilding_World.datagen;

import com.namriahc.Rebuilding_World.main.Rebuilding_World;
import com.namriahc.Rebuilding_World.registry.Rebuilding_World_Items;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class Rebuilding_World_ItemModelProvider extends net.minecraftforge.client.model.generators.ItemModelProvider {
    public Rebuilding_World_ItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Rebuilding_World.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(Rebuilding_World_Items.STEELY_BARK.get());
        basicItem(Rebuilding_World_Items.STEELY_TREE_SEED_FOSSIL.get());

        basicItem(Rebuilding_World_Items.STEELY_BARK_HELMET.get());
        basicItem(Rebuilding_World_Items.STEELY_BARK_CHESTPLATE.get());
        basicItem(Rebuilding_World_Items.STEELY_BARK_LEGGINGS.get());
        basicItem(Rebuilding_World_Items.STEELY_BARK_BOOTS.get());



        handheldsworditem(Rebuilding_World_Items.SHELL_STONE_SWORD);
        handheldpickaxeitem(Rebuilding_World_Items.SHELL_STONE_PICKAXE);
        handheldshovelitem(Rebuilding_World_Items.SHELL_STONE_SHOVEL);

        basicItem(Rebuilding_World_Items.PIONEERS_CONGEE.get());
        basicItem(Rebuilding_World_Items.PIONEERS_WHEAT.get());
        basicItem(Rebuilding_World_Items.PIONEERS_WHEAT_SEEDS.get());


    }

    private ItemModelBuilder handheldsworditem(RegistryObject<SwordItem> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(Rebuilding_World.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldpickaxeitem(RegistryObject<PickaxeItem> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(Rebuilding_World.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldshovelitem(RegistryObject<ShovelItem> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(Rebuilding_World.MOD_ID,"item/" + item.getId().getPath()));
    }
}
































