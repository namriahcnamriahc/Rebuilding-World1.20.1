package com.namriahc.Rebuilding_World.block.custom;


public class LogBlock_steely_tree_log extends Strippable_Log_Block {
    public LogBlock_steely_tree_log() {
        super(Properties.of()
                .strength(30F)
                .explosionResistance(200F),
                StrippedLogBlock_stripped_steely_tree_log::new
        );
    }
}
