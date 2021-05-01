package net.pixlblade.storange;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.pixlblade.storange.registry.ModBlocks;
import net.pixlblade.storange.registry.ModItems;

public class storange implements ModInitializer {
    // Defining the mod ID
    public static final String MOD_ID = "storange";
    // Defining the creative menu
    public static final ItemGroup STORANGE_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "all"), () -> new ItemStack(ModItems.ORANGE));
    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
    }
}
