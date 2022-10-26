package com.H4T_K1D.modthatisnotamodfortweakingpurposes;

import com.H4T_K1D.modthatisnotamodfortweakingpurposes.blocks.blockMod;
import com.H4T_K1D.modthatisnotamodfortweakingpurposes.fluids.FluidsMod;
import com.H4T_K1D.modthatisnotamodfortweakingpurposes.items.buckets;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("modthatisnotamodfortweakingpurposes")
public class ModThatIsNotAMod {
    public ModThatIsNotAMod() {
        IEventBus eventbus = FMLJavaModLoadingContext.get().getModEventBus();
        MinecraftForge.EVENT_BUS.register(this);
        FluidsMod.register(eventbus);
        buckets.register(eventbus);
        blockMod.register(eventbus);
    }
}