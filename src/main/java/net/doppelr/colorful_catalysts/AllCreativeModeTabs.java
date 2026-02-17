package net.doppelr.colorful_catalysts;

import com.hlysine.create_connected.config.FeatureToggle;
import com.tterrag.registrate.util.entry.ItemProviderEntry;
import net.doppelr.colorful_catalysts.blocks.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;

import java.util.List;

import static net.doppelr.colorful_catalysts.CreateColorfulCatalysts.modEventBus;

//import static com.hlysine.create_connected.CreateConnected.modEventBus;

public class AllCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateColorfulCatalysts.MODID);

    public static final List<ItemProviderEntry<?, ?>> ITEMS = List.of(
            ModBlocks.FAN_DYING_WHITE_CATALYST
    );

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MAIN = CREATIVE_MODE_TABS.register("main", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.create_colorful_catalysts.main"))
            .withTabsBefore(com.simibubi.create.AllCreativeModeTabs.BASE_CREATIVE_TAB.getKey())
            //.icon(ModBlocks.FAN_DYING_WHITE_CATALYST::asStack)
            .build());

    public static void register(IEventBus modEventBus) {
        CREATIVE_MODE_TABS.register(modEventBus);
    }


    private record DisplayItemsGenerator(
            List<ItemProviderEntry<?, ?>> items) implements CreativeModeTab.DisplayItemsGenerator {
        @Override
        public void accept(@NotNull CreativeModeTab.ItemDisplayParameters params, @NotNull CreativeModeTab.Output output) {
            for (ItemProviderEntry<?, ?> item : items) {
                if (FeatureToggle.isEnabled(item.getId())) {
                    output.accept(item);
                }
            }
        }
    }
}
