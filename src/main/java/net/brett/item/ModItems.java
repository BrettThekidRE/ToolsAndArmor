package net.brett.item;


import net.brett.ToolsAndArmor;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item DARK_PEARL = registerItem("dark_pearl", new Item(new Item.Settings()));
    public static final Item ZIRCON = registerItem("zircon", new Item(new Item.Settings()));


     private static Item registerItem(String name, Item item){
         return Registry.register(Registries.ITEM, Identifier.of(ToolsAndArmor.MOD_ID, name), item);
     }


    public static void registerModItems() {
        ToolsAndArmor.LOGGER.info("registering Mod Items for" + ToolsAndArmor.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register (FabricItemGroupEntries -> {
            FabricItemGroupEntries.add(DARK_PEARL);
            FabricItemGroupEntries.add(ZIRCON);
        });
     }
}
