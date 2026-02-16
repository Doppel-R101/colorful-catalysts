package net.doppelr.colorful_catalysts.blocks;

import com.hlysine.create_connected.CCBlocks;
import com.hlysine.create_connected.CreateConnected;
import com.hlysine.create_connected.config.FeatureToggle;
import com.simibubi.create.AllTags;
import com.simibubi.create.api.registry.CreateRegistries;
import com.simibubi.create.foundation.data.AssetLookup;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.providers.DataGenContext;
import com.tterrag.registrate.providers.RegistrateBlockstateProvider;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.doppelr.colorful_catalysts.CreateColorfulCatalysts;
import net.doppelr.colorful_catalysts.WrenchableBlock;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.client.model.generators.ModelFile;

import java.util.function.Function;

import static com.simibubi.create.foundation.data.AssetLookup.partialBaseModel;
import static com.simibubi.create.foundation.data.ModelGen.customItemModel;
import static com.simibubi.create.foundation.data.TagGen.pickaxeOnly;
import static net.doppelr.colorful_catalysts.CreateColorfulCatalysts.REGISTRATE;

public class ModBlocks {
    private static final CreateRegistrate REGISTRATE = CreateColorfulCatalysts.REGISTRATE;
    // required: 16 blocks
    // Order: white, light gray, gray, black, brown, red, orange, yellow, lime, green, cyan, light blue, blue, purple, magenta, pink

    public static final BlockEntry<WrenchableBlock> WHITE_DYING_FAN_CATALYST = REGISTRATE.block("white_dying_fan_catalyst", WrenchableBlock::new)
            .initialProperties(() -> Blocks.IRON_BLOCK)
            .properties(p -> p
                    .mapColor(MapColor.TERRACOTTA_YELLOW)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
                    .lightLevel(s -> 10)
                    .isRedstoneConductor((state, level, pos) -> false)
            )
            .addLayer(() -> RenderType::cutoutMipped)
            .transform(pickaxeOnly())
            .transform(FeatureToggle.registerDependent(CCBlocks.EMPTY_FAN_CATALYST))
            .blockstate((c, p) -> p.simpleBlock(c.getEntry(), partialBaseModel(c, p)))
            .tag(AllTags.AllBlockTags.FAN_TRANSPARENT.tag)
            //.tag(AllTags.AllBlockTags.FAN_PROCESSING_CATALYSTS_BLASTING.tag)
            .item()
            .transform(customItemModel())
            .register();
    public static void register() {
    }


}
