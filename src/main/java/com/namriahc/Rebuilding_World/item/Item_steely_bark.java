package com.namriahc.Rebuilding_World.item;

import com.namriahc.Rebuilding_World.registry.Rebuilding_World_Tags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.Level;

public class Item_steely_bark extends Item {
    public Item_steely_bark() {
        super(new Properties()
                .stacksTo(64)
                .rarity(Rarity.COMMON)
                .fireResistant()
        );
    }
}