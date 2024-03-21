package com.namriahc.Rebuilding_World.registry;

import com.namriahc.Rebuilding_World.item.Item_steely_bark;
import com.namriahc.Rebuilding_World.item.food.Food_pioneers_congee;
import com.namriahc.Rebuilding_World.item.food.Rebuilding_World_foods;
import com.namriahc.Rebuilding_World.item.tool.Tool_shell_stone_sword;
import com.namriahc.Rebuilding_World.main.Rebuilding_World;
import net.minecraft.world.item.BowlFoodItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Rebuilding_World_Items {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Rebuilding_World.MOD_ID);

    public static final RegistryObject<Item> STEELY_BARK = ITEMS.register("steely_bark", Item_steely_bark::new);

    public static final RegistryObject<SwordItem> SHELL_STONE_SWORD = ITEMS.register("shell_stone_sword", Tool_shell_stone_sword::new);
    public static final RegistryObject<BowlFoodItem> PIONEERS_CONGEE = ITEMS.register("pioneers_congee", Food_pioneers_congee::new);


}
