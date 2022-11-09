package com.H4T_K1D.modthatisnotamodfortweakingpurposes.items;

import com.H4T_K1D.modthatisnotamodfortweakingpurposes.fluids.FluidsMod;

import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class buckets {
        public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
                        "modthatisnotamodfortweakingpurposes");

        public static final RegistryObject<Item> MOLTEN_ANDESITE_BUCKET = ITEMS.register("molten_andesite_bucket",
                        () -> new BucketItem(FluidsMod.ANDESITE_FLUID, new Item.Properties().stacksTo(1)));
        public static final RegistryObject<Item> MOLTEN_ANDESITE_ALLOY_BUCKET = ITEMS.register(
                        "molten_andesite_alloy_bucket",
                        () -> new BucketItem(FluidsMod.ANDESITE_ALLOY_FLUID, new Item.Properties().stacksTo(1)));

        public static void register(IEventBus eventBus) {
                ITEMS.register(eventBus);
        }
}
