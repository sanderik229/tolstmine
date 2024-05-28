package net.sander.modxz.item;


import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sander.modxz.ModXz;

import javax.naming.Name;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ModXz.MOD_ID);


    public static RegistryObject<Item> AMBER = ITEMS.register("amber",
        () -> new Item(new Item.Properties().tab(ModCreativeItemTab.XZ_TAB)));

    public static RegistryObject<Item> COPPER_STICK = ITEMS.register("copper_stick",
        () -> new Item(new Item.Properties().tab(ModCreativeItemTab.XZ_TAB)));

    public static final RegistryObject<Item> AMBER_PICKAXE = ITEMS.register("amber_pickaxe",
            () -> new PickaxeItem(ModTiers.AMBER, 2,3.5f, new Item.Properties().tab(ModCreativeItemTab.XZ_TAB)));

    public static final RegistryObject<Item> AMETHYST_SWORD = ITEMS.register("amethyst_sword",
            () -> new SwordItem(ModTiers.AMBER, 10, 8f, new Item.Properties().tab(ModCreativeItemTab.XZ_TAB)));

    public static final RegistryObject<Item> AMETHYST_PICKAXE = ITEMS.register("amethyst_pickaxe",
            () -> new PickaxeItem(ModTiers.AMBER, 9,7.5f, new Item.Properties().tab(ModCreativeItemTab.XZ_TAB)));

    public static final RegistryObject<Item> AMETHYST_AXE = ITEMS.register("amethyst_axe",
            () -> new AxeItem(ModTiers.AMBER, 8,7f, new Item.Properties().tab(ModCreativeItemTab.XZ_TAB)));

    public static final RegistryObject<Item> AMETHYST_SHOVEL = ITEMS.register("amethyst_shovel",
            () -> new ShovelItem(ModTiers.AMBER, 7,6.5f, new Item.Properties().tab(ModCreativeItemTab.XZ_TAB)));

    public static final RegistryObject<Item> AMETHYST_HOE = ITEMS.register("amethyst_hoe",
            () -> new HoeItem(ModTiers.AMBER, 4,5f, new Item.Properties().tab(ModCreativeItemTab.XZ_TAB)));



    


    public static RegistryObject<Item> AMBER_RAW = ITEMS.register("amber_raw",
            () -> new Item(new Item.Properties().tab(ModCreativeItemTab.XZ_TAB)));



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }


    }





