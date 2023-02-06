package com.kitowashere.tagcraft.blocks;

import com.kitowashere.tagcraft.TagCraft;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TagCraft.MOD_ID);

    public static final RegistryObject<Block> SCTABLE = BLOCKS.register("schematic_crafting_table", () -> new Schematic_crafting_table());
}
