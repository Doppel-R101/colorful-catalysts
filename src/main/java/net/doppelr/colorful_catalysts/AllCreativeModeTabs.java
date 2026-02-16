package net.doppelr.colorful_catalysts;

import com.tterrag.registrate.util.entry.ItemProviderEntry;
import net.doppelr.colorful_catalysts.blocks.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class AllCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateColorfulCatalysts.MODID);

    public static final List<ItemProviderEntry<?, ?>> ITEMS = List.of(
            ModBlocks.WHITE_DYING_FAN_CATALYST
    );

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MAIN = CREATIVE_MODE_TABS.register("main", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.create_connected.main"))
            .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
            .icon(ModBlocks.WHITE_DYING_FAN_CATALYST::asStack)
            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
