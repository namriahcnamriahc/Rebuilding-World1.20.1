package com.namriahc.Rebuilding_World.block.custom;

import com.namriahc.Rebuilding_World.worldgen.tree.Glower_steely_tree_glower;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;

public class SaplingBlock_complete_steely_tree_sapling extends SaplingBlock {
    public SaplingBlock_complete_steely_tree_sapling() {
        super(new Glower_steely_tree_glower()
                , Properties.of().strength(30F));
    }
}
