package net.doppelr.colorful_catalysts;

import com.tterrag.registrate.providers.RegistrateDataMapProvider;
import com.tterrag.registrate.util.nullness.NonNullConsumer;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.conditions.ModLoadedCondition;
import net.neoforged.neoforge.registries.datamaps.DataMapType;
import net.neoforged.neoforge.registries.datamaps.RegisterDataMapTypesEvent;
import plus.dragons.createdragonsplus.common.CDPCommon;
import plus.dragons.createdragonsplus.common.fluids.dye.DyeColors;
import plus.dragons.createdragonsplus.common.registry.CDPDataMaps;

public class ModDataMaps {
    public static final DataMapType<Fluid, ResourceLocation> FLUID_FAN_COLORING_CATALYSTS = DataMapType
            .builder(CDPCommon.asResource("fan_processing_catalysts/coloring"), Registries.FLUID, ResourceLocation.CODEC)
            .synced(ResourceLocation.CODEC, true)
            .build();
    public static final DataMapType<Block, ResourceLocation> BLOCK_FAN_COLORING_CATALYSTS = DataMapType
            .builder(CDPCommon.asResource("fan_processing_catalysts/coloring"), Registries.BLOCK, ResourceLocation.CODEC)
            .synced(ResourceLocation.CODEC, true)
            .build();

    public static void register(IEventBus modBus) {
        modBus.addListener(RegisterDataMapTypesEvent.class, CDPDataMaps::register);
    }

    public static void register(final RegisterDataMapTypesEvent event) {
        event.register(FLUID_FAN_COLORING_CATALYSTS);
        event.register(BLOCK_FAN_COLORING_CATALYSTS);
    }
}
