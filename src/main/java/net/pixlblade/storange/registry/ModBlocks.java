package net.pixlblade.storange.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.pixlblade.storange.storange;

public class ModBlocks {
    public static final Block MACHINE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().strength(4f, 25f).sounds(BlockSoundGroup.METAL));
    public static void registerBlocks(){
        Registry.register(Registry.BLOCK, new Identifier(storange.MOD_ID, "machine_block"), MACHINE_BLOCK);
    }

}
