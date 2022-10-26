package com.H4T_K1D.modthatisnotamodfortweakingpurposes.blocks;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraft.world.level.block.Block;

public class blockMod {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            "modthatisnotamodfortweakingpurposes");
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}