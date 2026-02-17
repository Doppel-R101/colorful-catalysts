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
    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public CreateColorfulCatalysts(IEventBus eventBus, ModContainer modContainer) {
        modEventBus = eventBus;
        REGISTRATE.setCreativeTab(AllCreativeModeTabs.MAIN);
        ModBlocks.register();

    }

    public static CreateRegistrate getRegistrate() {
        return REGISTRATE;
    }

    public static ResourceLocation asResource(String path) {
        return ResourceLocation.fromNamespaceAndPath(MODID, path);
    }
}
