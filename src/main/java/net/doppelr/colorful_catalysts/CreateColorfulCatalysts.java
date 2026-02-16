package net.doppelr.colorful_catalysts;

import com.simibubi.create.foundation.data.CreateRegistrate;
import net.doppelr.colorful_catalysts.blocks.ModBlocks;
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
    public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(MODID);

    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public CreateColorfulCatalysts(IEventBus modEventBus, ModContainer modContainer) {

        REGISTRATE.setCreativeTab(AllCreativeModeTabs.MAIN);
        ModBlocks.register();

    }

}
