package net.ascens.caelestium.item;

import net.ascens.caelestium.Caelestium;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CaeItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Caelestium.MOD_ID);

    public static final DeferredItem<Item> MANGANESE_INGOT = ITEMS.register("manganese_ingot", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
