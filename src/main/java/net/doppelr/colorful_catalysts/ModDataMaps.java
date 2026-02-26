package net.doppelr.colorful_catalysts;

import com.tterrag.registrate.providers.RegistrateDataMapProvider;
import com.tterrag.registrate.util.nullness.NonNullConsumer;
import net.neoforged.neoforge.common.conditions.ModLoadedCondition;
import plus.dragons.createdragonsplus.common.fluids.dye.DyeColors;
import plus.dragons.createdragonsplus.common.registry.CDPDataMaps;

public class ModDataMaps implements NonNullConsumer<RegistrateDataMapProvider> {
    @Override
    public void accept(RegistrateDataMapProvider provider) {
        var fanColoringCatalystFluids = provider.builder(CDPDataMaps.BLOCK_FAN_COLORING_CATALYSTS);
        var dragonsPlusLoaded = new ModLoadedCondition("create_dragons_plus");
        for (var color : DyeColors.ALL) {
            fanColoringCatalystFluids.add(CreateColorfulCatalysts.rl("fan_dyeing_" + color.getSerializedName() + "_catalyst"), color, false, dragonsPlusLoaded);
        }
    }
}
