package net.brett.item;

import net.brett.ToolsAndArmor;
import net.brett.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ZIRCON_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ToolsAndArmor.MOD_ID, "zircon_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.ZIRCON))
                    .displayName(Text.translatable("itemgroup.toolsandarmor.zircon_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.RAW_ZIRCON);
                        entries.add(ModItems.ZIRCON);
                        entries.add(ModItems.DARK_PEARL);

                    }).build());

    public static final ItemGroup DARK_PEARL_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ToolsAndArmor.MOD_ID, "dark_pearl_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.DARK_PEARL_BLOCK))
                    .displayName(Text.translatable("itemgroup.toolsandarmor.dark_pearl_blocks"))
                    .entries((displayContext, entries) -> {
                      entries.add(ModBlocks.ZIRCON_ORE);
                        entries.add(ModBlocks.DEEPSLATE_ZIRCON_ORE);
                        entries.add(ModBlocks.ZIRCRON_BLOCK);
                        entries.add(ModBlocks.DARK_PEARL_BLOCK);
                    }).build());




    public static void registerItemGroups() {
        ToolsAndArmor.LOGGER.info("Registering Item Groups for " + ToolsAndArmor.MOD_ID);
    }
}
