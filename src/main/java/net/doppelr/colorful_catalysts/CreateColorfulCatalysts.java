package net.doppelr.colorful_catalysts;

import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.foundation.item.ItemDescription;
import com.simibubi.create.foundation.item.KineticStats;
import com.simibubi.create.foundation.item.TooltipModifier;
import net.createmod.catnip.lang.FontHelper;
import net.doppelr.colorful_catalysts.blocks.ModBlocks;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.fml.ModList;
import net.neoforged.fml.event.lifecycle.FMLConstructModEvent;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;


// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(CreateColorfulCatalysts.MODID)

public class CreateColorfulCatalysts {
    public static final String MODID = "colorful_catalysts";
    public static final Logger LOGGER = LogUtils.getLogger();

    public static IEventBus modEventBus;
    public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(MODID);

    static {
        REGISTRATE
                .defaultCreativeTab((ResourceKey<CreativeModeTab>) null)
                .setTooltipModifierFactory(item -> new ItemDescription.Modifier(item, FontHelper.Palette.STANDARD_CREATE)
                        .andThen(TooltipModifier.mapNull(KineticStats.create(item))));
    }
    public CreateColorfulCatalysts(IEventBus eventBus, ModContainer modContainer) {
        modEventBus = eventBus;
        modEventBus.addListener(this::checkDependencies);
        REGISTRATE.registerEventListeners(modEventBus);


        REGISTRATE.setCreativeTab(AllCreativeModeTabs.MAIN);
        ModBlocks.register();
        AllCreativeModeTabs.register(modEventBus);

    }

    private void checkDependencies(final FMLConstructModEvent event) {
        boolean hasDragonsPlus = ModList.get().isLoaded("create_dragons_plus");
        boolean hasGarnished = ModList.get().isLoaded("garnished");

        if (!hasDragonsPlus && !hasGarnished) {
            throw new MissingDependencyException();
        }

    }

    private static class MissingDependencyException extends RuntimeException {
        public MissingDependencyException() {
            super(String.join("\n",
                    "",
                    "=========================================",
                    "Missing required dependencies!",
                    "=========================================",
                    CreateColorfulCatalysts.MODID + " requires at least one of the following mods:",
                    "- Create: Dragons Plus (create_dragons_plus)",
                    "- Create: Garnished (garnished)",
                    "",
                    "Please install either one or both of these mods and restart the game.",
                    "========================================="
            ));
        }
    }

    public static CreateRegistrate getRegistrate() {
        return REGISTRATE;
    }

    public static ResourceLocation asResource(String path) {
        return ResourceLocation.fromNamespaceAndPath(MODID, path);
    }
}
