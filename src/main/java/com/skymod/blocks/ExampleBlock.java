package com.skymod.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;


public class ExampleBlock extends Block {
    public ExampleBlock() {
        super(BlockBehaviour.Properties.of()
                .strength(1.5f, 1.5f));
    }
}