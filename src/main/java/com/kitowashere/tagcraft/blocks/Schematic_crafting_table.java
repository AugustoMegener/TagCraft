package com.kitowashere.tagcraft.blocks;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

import static com.kitowashere.tagcraft.TagCraft.MainTab;

public class Schematic_crafting_table extends Block {

    public Schematic_crafting_table() {
        super(BlockBehaviour.Properties.of(Material.WOOD).strength(2).sound(SoundType.WOOD));
    }
}
