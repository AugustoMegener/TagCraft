package com.kitowashere.tagcraft.items;

import com.kitowashere.tagcraft.TagCraft;
import com.kitowashere.tagcraft.blocks.ModBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.kitowashere.tagcraft.TagCraft.MainTab;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TagCraft.MOD_ID);

    public static final RegistryObject<Item> BLANK_TAG = ITEMS.register(
            "blank_tag",
            () -> new blank_tag()
    );

    public static final RegistryObject<Item> SCTABLE_ITEM = ITEMS.register(
            "schematic_crafting_table",
            () -> new BlockItem(ModBlocks.SCTABLE.get(), new Item.Properties().tab(MainTab))
    );
}


