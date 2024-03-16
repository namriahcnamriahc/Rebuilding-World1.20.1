package com.namriahc.Rebuilding_World.main;

import com.namriahc.Rebuilding_World.registry.Rebuilding_World_Blocks;
import com.namriahc.Rebuilding_World.registry.Rebuilding_World_Items;
import com.namriahc.Rebuilding_World.registry.tab.Rebuilding_World_Tabs;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("rebuilding_world")
public class Rebuilding_World {

    public static final String MOD_ID = "rebuilding_world";

    public Rebuilding_World(){

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        Rebuilding_World_Tabs.MOD_TABS.register(bus);
        Rebuilding_World_Items.ITEMS.register(bus);
        Rebuilding_World_Blocks.BlockItems.BLOCK_ITEMS.register(bus);
        Rebuilding_World_Blocks.Blocks.BLOCKS.register(bus);


    }
}
