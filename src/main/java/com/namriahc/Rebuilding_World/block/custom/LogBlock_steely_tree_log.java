package com.namriahc.Rebuilding_World.block.custom;


import com.namriahc.Rebuilding_World.registry.Rebuilding_World_Blocks;

public class LogBlock_steely_tree_log extends Strippable_Log_Block {
    public LogBlock_steely_tree_log() {
        super(Properties.of()
                .strength(30F)
                .explosionResistance(200F),
                Rebuilding_World_Blocks.Blocks.STRIPPED_STEELY_TREE_LOG
        );
    }
}
