package net.doppelr.colorful_catalysts;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CreateColorfulCatalysts.MODID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}