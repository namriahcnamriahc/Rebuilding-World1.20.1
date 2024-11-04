package com.namriahc.Rebuilding_World.registry;

import com.namriahc.Rebuilding_World.item.Item_pioneers_wheat;
import com.namriahc.Rebuilding_World.item.Item_pioneers_wheat_seeds;
import com.namriahc.Rebuilding_World.item.Item_steely_bark;
import com.namriahc.Rebuilding_World.item.Item_steely_tree_seed_fossil;
import com.namriahc.Rebuilding_World.item.armor.Armor_steely_bark_boots;
import com.namriahc.Rebuilding_World.item.armor.Armor_steely_bark_chestplate;
import com.namriahc.Rebuilding_World.item.armor.Armor_steely_bark_helmet;
import com.namriahc.Rebuilding_World.item.armor.Armor_steely_bark_leggings;
import com.namriahc.Rebuilding_World.item.food.Food_pioneers_congee;
import com.namriahc.Rebuilding_World.item.tool.Tool_shell_stone_pickaxe;
import com.namriahc.Rebuilding_World.item.tool.Tool_shell_stone_shovel;
import com.namriahc.Rebuilding_World.item.tool.Tool_shell_stone_sword;
import com.namriahc.Rebuilding_World.main.Rebuilding_World;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Rebuilding_World_Items {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Rebuilding_World.MOD_ID);

    public static final RegistryObject<Item> STEELY_BARK = ITEMS.register("steely_bark", Item_steely_bark::new);

    public static final RegistryObject<ArmorItem> STEELY_BARK_HELMET = ITEMS.register("steely_bark_helmet", Armor_steely_bark_helmet::new);
    public static final RegistryObject<ArmorItem> STEELY_BARK_CHESTPLATE = ITEMS.register("steely_bark_chestplate", Armor_steely_bark_chestplate::new);
    public static final RegistryObject<ArmorItem> STEELY_BARK_LEGGINGS = ITEMS.register("steely_bark_leggings", Armor_steely_bark_leggings::new);
    public static final RegistryObject<ArmorItem> STEELY_BARK_BOOTS = ITEMS.register("steely_bark_boots", Armor_steely_bark_boots::new);

    public static final RegistryObject<SwordItem> SHELL_STONE_SWORD = ITEMS.register("shell_stone_sword", Tool_shell_stone_sword::new);
    public static final RegistryObject<PickaxeItem> SHELL_STONE_PICKAXE = ITEMS.register("shell_stone_pickaxe", Tool_shell_stone_pickaxe::new);
    public static final RegistryObject<ShovelItem> SHELL_STONE_SHOVEL = ITEMS.register("shell_stone_shovel", Tool_shell_stone_shovel::new);

    public static final RegistryObject<BowlFoodItem> PIONEERS_CONGEE = ITEMS.register("pioneers_congee", Food_pioneers_congee::new);
    public static final RegistryObject<Item> PIONEERS_WHEAT = ITEMS.register("pioneers_wheat", Item_pioneers_wheat::new);
    public static final RegistryObject<ItemNameBlockItem> PIONEERS_WHEAT_SEEDS = ITEMS.register("pioneers_wheat", Item_pioneers_wheat_seeds::new);

    public static final RegistryObject<Item> STEELY_TREE_SEED_FOSSIL = ITEMS.register("steely_tree_seed_fossil", Item_steely_tree_seed_fossil::new);


}
