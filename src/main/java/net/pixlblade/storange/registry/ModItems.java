package net.pixlblade.storange.registry;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.pixlblade.storange.storange;

public class ModItems {
    // Items
    public static final Item ORANGE = new Item(new Item.Settings().group(storange.STORANGE_GROUP));
    public static final Item TRANSISTOR = new Item(new Item.Settings().group(storange.STORANGE_GROUP));
    public static final Item IRON_PLATE = new Item(new Item.Settings().group(storange.STORANGE_GROUP));
    public static final Item HAMMER = new Item(new Item.Settings().group(storange.STORANGE_GROUP));
    public static final Item PROCESSOR_CHIP = new Item(new Item.Settings().group(storange.STORANGE_GROUP));
    // Block Items
    public static final BlockItem MACHINE_BLOCK = new BlockItem(ModBlocks.MACHINE_BLOCK, new Item.Settings().group(storange.STORANGE_GROUP));
    // Registry
    public static void registerItems(){
        Registry.register(Registry.ITEM, new Identifier(storange.MOD_ID, "orange"), ORANGE);
        Registry.register(Registry.ITEM, new Identifier(storange.MOD_ID, "machine_block"), MACHINE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(storange.MOD_ID, "transistor"), TRANSISTOR);
        Registry.register(Registry.ITEM, new Identifier(storange.MOD_ID, "iron_plate"), IRON_PLATE);
        Registry.register(Registry.ITEM, new Identifier(storange.MOD_ID, "hammer"), HAMMER);
        Registry.register(Registry.ITEM, new Identifier(storange.MOD_ID, "processor_chip"), PROCESSOR_CHIP);
    }
}
