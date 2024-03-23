package com.namriahc.Rebuilding_World.registry.tab;

import com.namriahc.Rebuilding_World.main.Rebuilding_World;
import com.namriahc.Rebuilding_World.registry.Rebuilding_World_Blocks;
import com.namriahc.Rebuilding_World.registry.Rebuilding_World_Items;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class Rebuilding_World_Tabs {

    public static final DeferredRegister<CreativeModeTab> MOD_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Rebuilding_World.MOD_ID);

    public static final RegistryObject<CreativeModeTab> REBUILDING_WORLD_ITEMS_TAB = MOD_TABS.register("rebuilding_world_items_tab",
            ()-> {return CreativeModeTab.builder()
                    .icon(()->new ItemStack(Rebuilding_World_Items.STEELY_BARK.get()))
                    .title(Component.translatable("itemGroup.rebuilding_world_items_tabs"))
                    .displayItems((param,output)->{
                        for (Item item:Tab_Rebuilding_World_Items.items){
                            output.accept(item);
                        }
                    })
                    .build();
    });

    public static final RegistryObject<CreativeModeTab> REBUILDING_WORLD_NATURE_BLOCKS_TAB = MOD_TABS.register("rebuilding_world_nature_blocks_tab",
            ()-> {return CreativeModeTab.builder()
                    .icon(()->new ItemStack(Rebuilding_World_Blocks.BlockItems.FIRST_SOIL.get()))
                    .title(Component.translatable("itemGroup.rebuilding_world_nature_blocks_tabs"))
                    .displayItems((param,output)->{
                        for (Item item:Tab_Rebuilding_World_Nature_Blocks.items){
                            output.accept(item);
                        }
                    })
                    .build();
            });
}
