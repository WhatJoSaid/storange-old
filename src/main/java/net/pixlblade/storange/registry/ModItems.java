package net.pixlblade.storange.registry;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.lwjgl.system.CallbackI;
import net.pixlblade.storange.storange;

public class ModItems {
    // Items
    public static final Item ORANGE = new Item(new Item.Settings().group(storange.STORANGE_GROUP));
    // Block Items
    public static final BlockItem MACHINE_BLOCK = new BlockItem(ModBlocks.MACHINE_BLOCK, new Item.Settings().group(storange.STORANGE_GROUP));
    // Registry
    public static void registerItems(){
        Registry.register(Registry.ITEM, new Identifier(storange.MOD_ID, "orange"), ORANGE);
        Registry.register(Registry.ITEM, new Identifier(storange.MOD_ID, "machine_block"), MACHINE_BLOCK);
    }
}
