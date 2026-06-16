package net.doppelr.colorful_catalysts;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class AllCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateColorfulCatalysts.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MAIN = CREATIVE_MODE_TABS.register("main", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.create_colorful_catalysts.main"))
            .withTabsBefore(com.simibubi.create.AllCreativeModeTabs.BASE_CREATIVE_TAB.getKey())
            .icon(ModBlocks.FAN_DYEING_RAINBOW_CATALYST::asStack)
            .displayItems(((itemDisplayParameters, output) -> {
                output.accept(ModBlocks.FAN_DYEING_WHITE_CATALYST);
                output.accept(ModBlocks.FAN_DYEING_LIGHT_GRAY_CATALYST);
                output.accept(ModBlocks.FAN_DYEING_GRAY_CATALYST);
                output.accept(ModBlocks.FAN_DYEING_BLACK_CATALYST);
                output.accept(ModBlocks.FAN_DYEING_BROWN_CATALYST);
                output.accept(ModBlocks.FAN_DYEING_MAROON_CATALYST);
                output.accept(ModBlocks.FAN_DYEING_ROSE_CATALYST);
                output.accept(ModBlocks.FAN_DYEING_RED_CATALYST);
                output.accept(ModBlocks.FAN_DYEING_CORAL_CATALYST);
                output.accept(ModBlocks.FAN_DYEING_GINGER_CATALYST);
                output.accept(ModBlocks.FAN_DYEING_ORANGE_CATALYST);
                output.accept(ModBlocks.FAN_DYEING_TAN_CATALYST);
                output.accept(ModBlocks.FAN_DYEING_BEIGE_CATALYST);
                output.accept(ModBlocks.FAN_DYEING_YELLOW_CATALYST);
                output.accept(ModBlocks.FAN_DYEING_OLIVE_CATALYST);
                output.accept(ModBlocks.FAN_DYEING_AMBER_CATALYST);
                output.accept(ModBlocks.FAN_DYEING_LIME_CATALYST);
                output.accept(ModBlocks.FAN_DYEING_FOREST_CATALYST);
                output.accept(ModBlocks.FAN_DYEING_GREEN_CATALYST);
                output.accept(ModBlocks.FAN_DYEING_VERDANT_CATALYST);
                output.accept(ModBlocks.FAN_DYEING_TEAL_CATALYST);
                output.accept(ModBlocks.FAN_DYEING_CYAN_CATALYST);
                output.accept(ModBlocks.FAN_DYEING_AQUA_CATALYST);
                output.accept(ModBlocks.FAN_DYEING_MINT_CATALYST);
                output.accept(ModBlocks.FAN_DYEING_LIGHT_BLUE_CATALYST);
                output.accept(ModBlocks.FAN_DYEING_BLUE_CATALYST);
                output.accept(ModBlocks.FAN_DYEING_NAVY_CATALYST);
                output.accept(ModBlocks.FAN_DYEING_SLATE_CATALYST);
                output.accept(ModBlocks.FAN_DYEING_INDIGO_CATALYST);
                output.accept(ModBlocks.FAN_DYEING_PURPLE_CATALYST);
                output.accept(ModBlocks.FAN_DYEING_MAGENTA_CATALYST);
                output.accept(ModBlocks.FAN_DYEING_PINK_CATALYST);
                output.accept(ModBlocks.CONCRETE_POWDER);
            }))
            .build());

    public static void register(IEventBus modEventBus) {
        CREATIVE_MODE_TABS.register(modEventBus);
    }

}
