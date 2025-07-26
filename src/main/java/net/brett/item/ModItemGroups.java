package net.brett.item;

import net.brett.ToolsAndArmor;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ZIRCON_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ToolsAndArmor.MOD_ID, "tools_and_armor_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.DARK_PEARL))



                    .build());



    public static void registerItemGroups() {
        ToolsAndArmor.LOGGER.info("Registering Item Groups for " + ToolsAndArmor.MOD_ID);
    }
}
