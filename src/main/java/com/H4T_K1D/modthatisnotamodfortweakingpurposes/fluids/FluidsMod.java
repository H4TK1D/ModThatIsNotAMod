package com.H4T_K1D.modthatisnotamodfortweakingpurposes.fluids;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import com.H4T_K1D.modthatisnotamodfortweakingpurposes.blocks.blockMod;
import com.H4T_K1D.modthatisnotamodfortweakingpurposes.items.buckets;

public class FluidsMod {
    public static final ResourceLocation ANDESITE_STILL = new ResourceLocation("block/fluids/molten_andesite_still");
    public static final ResourceLocation ANDESITE_FLOWING = new ResourceLocation("block/fluids/molten_andesite_flow");
    public static final ResourceLocation ANDESITE_ALLOY_STILL = new ResourceLocation(
            "block/fluids/molten_andesite_alloy still");
    public static final ResourceLocation ANDESITE_ALLOY_FLOWING = new ResourceLocation(
            "block/fluids/molten_andesite_alloy_flow");

    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS,
            "modthatisnotamodfortweakingpurposes");

    public static final RegistryObject<FlowingFluid> ANDESITE_FLUID = FLUIDS.register("molten_andesite",
            () -> new ForgeFlowingFluid.Source(FluidsMod.AndesiteProperties));

    public static final RegistryObject<FlowingFluid> ANDESITE_FLUID_FLOWING = FLUIDS.register("molten_andesite_flowing",
            () -> new ForgeFlowingFluid.Source(FluidsMod.AndesiteProperties));

    public static final RegistryObject<LiquidBlock> MOLTEN_ANDESITE_BLOCK = blockMod.BLOCKS.register(
            "molten_andesite",
            () -> new LiquidBlock(() -> FluidsMod.ANDESITE_FLUID.get(),
                    BlockBehaviour.Properties.of(Material.LAVA).noCollission().strength(100f).noDrops()));

    public static final ForgeFlowingFluid.Properties AndesiteProperties = new ForgeFlowingFluid.Properties(
            ANDESITE_FLUID,
            ANDESITE_FLUID_FLOWING,
            FluidAttributes.builder(ANDESITE_STILL, ANDESITE_FLOWING).density(15).luminosity(2).viscosity(5)
                    .sound(SoundEvents.BUCKET_EMPTY_LAVA))
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(() -> FluidsMod.MOLTEN_ANDESITE_BLOCK.get())
            .bucket(() -> buckets.MOLTEN_ANDESITE_BUCKET.get());

    public static final RegistryObject<FlowingFluid> ANDESITE_ALLOY_FLUID = FLUIDS.register("molten_andesite_alloy",
            () -> new ForgeFlowingFluid.Source(FluidsMod.AndesiteAlloyProperties));

    public static final RegistryObject<FlowingFluid> ANDESITE_ALLOY_FLUID_FLOWING = FLUIDS.register(
            "molten_andesite_alloy_flowing",
            () -> new ForgeFlowingFluid.Source(FluidsMod.AndesiteAlloyProperties));

    public static final RegistryObject<LiquidBlock> MOLTEN_ANDESITE_ALLOY_BLOCK = blockMod.BLOCKS.register(
            "molten_andesite_alloy",
            () -> new LiquidBlock(() -> FluidsMod.ANDESITE_FLUID.get(),
                    BlockBehaviour.Properties.of(Material.LAVA).noCollission().strength(100f).noDrops()));

    public static final ForgeFlowingFluid.Properties AndesiteAlloyProperties = new ForgeFlowingFluid.Properties(
            ANDESITE_ALLOY_FLUID,
            ANDESITE_ALLOY_FLUID_FLOWING,
            FluidAttributes.builder(ANDESITE_ALLOY_STILL, ANDESITE_ALLOY_FLOWING).density(15).luminosity(2).viscosity(5)
                    .sound(SoundEvents.BUCKET_EMPTY_LAVA))
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(() -> FluidsMod.MOLTEN_ANDESITE_ALLOY_BLOCK.get())
            .bucket(() -> buckets.MOLTEN_ANDESITE_ALLOY_BUCKET.get());
                
    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}