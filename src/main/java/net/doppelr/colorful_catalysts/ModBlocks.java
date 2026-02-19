package net.doppelr.colorful_catalysts;

import com.hlysine.create_connected.CCBlocks;
import com.hlysine.create_connected.config.FeatureToggle;
import com.simibubi.create.AllTags;
import com.simibubi.create.foundation.data.AssetLookup;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.material.MapColor;

import static com.simibubi.create.foundation.data.ModelGen.customItemModel;
import static com.simibubi.create.foundation.data.TagGen.pickaxeOnly;

public class ModBlocks {
    private static final CreateRegistrate REGISTRATE = CreateColorfulCatalysts.REGISTRATE;
    // required: 16 blocks
    // Order: white, light gray, gray, black, brown, red, orange, yellow, lime, green, cyan, light blue, blue, purple, magenta, pink

    public static final BlockEntry<WrenchableBlock> FAN_DYEING_WHITE_CATALYST = REGISTRATE.block("fan_dyeing_white_catalyst", WrenchableBlock::new)
            .initialProperties(() -> Blocks.IRON_BLOCK)
            .properties(p -> p
                    .mapColor(MapColor.TERRACOTTA_YELLOW)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
                    .isRedstoneConductor((state, level, pos) -> false)
                    .destroyTime(1.0f)
            )
            .addLayer(() -> RenderType::cutoutMipped)
            .transform(pickaxeOnly())
            .transform(FeatureToggle.registerDependent(CCBlocks.EMPTY_FAN_CATALYST))
            .blockstate((c, p) -> p.simpleBlock(c.getEntry(), AssetLookup.partialBaseModel(c, p)))
            .tag(AllTags.AllBlockTags.FAN_TRANSPARENT.tag)
            .item()
            .transform(customItemModel())
            .register();

    public static final BlockEntry<WrenchableBlock> FAN_DYEING_LIGHT_GRAY_CATALYST = REGISTRATE.block("fan_dyeing_light_gray_catalyst", WrenchableBlock::new)
            .initialProperties(() -> Blocks.IRON_BLOCK)
            .properties(p -> p
                    .mapColor(MapColor.TERRACOTTA_YELLOW)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
                    .isRedstoneConductor((state, level, pos) -> false)
            )
            .addLayer(() -> RenderType::cutoutMipped)
            .transform(pickaxeOnly())
            .transform(FeatureToggle.registerDependent(CCBlocks.EMPTY_FAN_CATALYST))
            .blockstate((c, p) -> p.simpleBlock(c.getEntry(), AssetLookup.partialBaseModel(c, p)))
            .tag(AllTags.AllBlockTags.FAN_TRANSPARENT.tag)
            .item()
            .transform(customItemModel())
            .register();

    public static final BlockEntry<WrenchableBlock> FAN_DYEING_GRAY_CATALYST = REGISTRATE.block("fan_dyeing_gray_catalyst", WrenchableBlock::new)
            .initialProperties(() -> Blocks.IRON_BLOCK)
            .properties(p -> p
                    .mapColor(MapColor.TERRACOTTA_YELLOW)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
                    .isRedstoneConductor((state, level, pos) -> false)
            )
            .addLayer(() -> RenderType::cutoutMipped)
            .transform(pickaxeOnly())
            .transform(FeatureToggle.registerDependent(CCBlocks.EMPTY_FAN_CATALYST))
            .blockstate((c, p) -> p.simpleBlock(c.getEntry(), AssetLookup.partialBaseModel(c, p)))
            .tag(AllTags.AllBlockTags.FAN_TRANSPARENT.tag)
            .item()
            .transform(customItemModel())
            .register();

    public static final BlockEntry<WrenchableBlock> FAN_DYEING_BLACK_CATALYST = REGISTRATE.block("fan_dyeing_black_catalyst", WrenchableBlock::new)
            .initialProperties(() -> Blocks.IRON_BLOCK)
            .properties(p -> p
                    .mapColor(MapColor.TERRACOTTA_YELLOW)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
                    .isRedstoneConductor((state, level, pos) -> false)
            )
            .addLayer(() -> RenderType::cutoutMipped)
            .transform(pickaxeOnly())
            .transform(FeatureToggle.registerDependent(CCBlocks.EMPTY_FAN_CATALYST))
            .blockstate((c, p) -> p.simpleBlock(c.getEntry(), AssetLookup.partialBaseModel(c, p)))
            .tag(AllTags.AllBlockTags.FAN_TRANSPARENT.tag)
            .item()
            .transform(customItemModel())
            .register();

    public static final BlockEntry<WrenchableBlock> FAN_DYEING_BROWN_CATALYST = REGISTRATE.block("fan_dyeing_brown_catalyst", WrenchableBlock::new)
            .initialProperties(() -> Blocks.IRON_BLOCK)
            .properties(p -> p
                    .mapColor(MapColor.TERRACOTTA_YELLOW)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
                    .isRedstoneConductor((state, level, pos) -> false)
            )
            .addLayer(() -> RenderType::cutoutMipped)
            .transform(pickaxeOnly())
            .transform(FeatureToggle.registerDependent(CCBlocks.EMPTY_FAN_CATALYST))
            .blockstate((c, p) -> p.simpleBlock(c.getEntry(), AssetLookup.partialBaseModel(c, p)))
            .tag(AllTags.AllBlockTags.FAN_TRANSPARENT.tag)
            .item()
            .transform(customItemModel())
            .register();

    public static final BlockEntry<WrenchableBlock> FAN_DYEING_RED_CATALYST = REGISTRATE.block("fan_dyeing_red_catalyst", WrenchableBlock::new)
            .initialProperties(() -> Blocks.IRON_BLOCK)
            .properties(p -> p
                    .mapColor(MapColor.TERRACOTTA_YELLOW)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
                    .isRedstoneConductor((state, level, pos) -> false)
            )
            .addLayer(() -> RenderType::cutoutMipped)
            .transform(pickaxeOnly())
            .transform(FeatureToggle.registerDependent(CCBlocks.EMPTY_FAN_CATALYST))
            .blockstate((c, p) -> p.simpleBlock(c.getEntry(), AssetLookup.partialBaseModel(c, p)))
            .tag(AllTags.AllBlockTags.FAN_TRANSPARENT.tag)
            .item()
            .transform(customItemModel())
            .register();

    public static final BlockEntry<WrenchableBlock> FAN_DYEING_ORANGE_CATALYST = REGISTRATE.block("fan_dyeing_orange_catalyst", WrenchableBlock::new)
            .initialProperties(() -> Blocks.IRON_BLOCK)
            .properties(p -> p
                    .mapColor(MapColor.TERRACOTTA_YELLOW)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
                    .isRedstoneConductor((state, level, pos) -> false)
            )
            .addLayer(() -> RenderType::cutoutMipped)
            .transform(pickaxeOnly())
            .transform(FeatureToggle.registerDependent(CCBlocks.EMPTY_FAN_CATALYST))
            .blockstate((c, p) -> p.simpleBlock(c.getEntry(), AssetLookup.partialBaseModel(c, p)))
            .tag(AllTags.AllBlockTags.FAN_TRANSPARENT.tag)
            .item()
            .transform(customItemModel())
            .register();

    public static final BlockEntry<WrenchableBlock> FAN_DYEING_YELLOW_CATALYST = REGISTRATE.block("fan_dyeing_yellow_catalyst", WrenchableBlock::new)
            .initialProperties(() -> Blocks.IRON_BLOCK)
            .properties(p -> p
                    .mapColor(MapColor.TERRACOTTA_YELLOW)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
                    .isRedstoneConductor((state, level, pos) -> false)
            )
            .addLayer(() -> RenderType::cutoutMipped)
            .transform(pickaxeOnly())
            .transform(FeatureToggle.registerDependent(CCBlocks.EMPTY_FAN_CATALYST))
            .blockstate((c, p) -> p.simpleBlock(c.getEntry(), AssetLookup.partialBaseModel(c, p)))
            .tag(AllTags.AllBlockTags.FAN_TRANSPARENT.tag)
            .item()
            .transform(customItemModel())
            .register();

    public static final BlockEntry<WrenchableBlock> FAN_DYEING_LIME_CATALYST = REGISTRATE.block("fan_dyeing_lime_catalyst", WrenchableBlock::new)
            .initialProperties(() -> Blocks.IRON_BLOCK)
            .properties(p -> p
                    .mapColor(MapColor.TERRACOTTA_YELLOW)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
                    .isRedstoneConductor((state, level, pos) -> false)
            )
            .addLayer(() -> RenderType::cutoutMipped)
            .transform(pickaxeOnly())
            .transform(FeatureToggle.registerDependent(CCBlocks.EMPTY_FAN_CATALYST))
            .blockstate((c, p) -> p.simpleBlock(c.getEntry(), AssetLookup.partialBaseModel(c, p)))
            .tag(AllTags.AllBlockTags.FAN_TRANSPARENT.tag)
            .item()
            .transform(customItemModel())
            .register();

    public static final BlockEntry<WrenchableBlock> FAN_DYEING_GREEN_CATALYST = REGISTRATE.block("fan_dyeing_green_catalyst", WrenchableBlock::new)
            .initialProperties(() -> Blocks.IRON_BLOCK)
            .properties(p -> p
                    .mapColor(MapColor.TERRACOTTA_YELLOW)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
                    .isRedstoneConductor((state, level, pos) -> false)
            )
            .addLayer(() -> RenderType::cutoutMipped)
            .transform(pickaxeOnly())
            .transform(FeatureToggle.registerDependent(CCBlocks.EMPTY_FAN_CATALYST))
            .blockstate((c, p) -> p.simpleBlock(c.getEntry(), AssetLookup.partialBaseModel(c, p)))
            .tag(AllTags.AllBlockTags.FAN_TRANSPARENT.tag)
            .item()
            .transform(customItemModel())
            .register();

    public static final BlockEntry<WrenchableBlock> FAN_DYEING_CYAN_CATALYST = REGISTRATE.block("fan_dyeing_cyan_catalyst", WrenchableBlock::new)
            .initialProperties(() -> Blocks.IRON_BLOCK)
            .properties(p -> p
                    .mapColor(MapColor.TERRACOTTA_YELLOW)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
                    .isRedstoneConductor((state, level, pos) -> false)
            )
            .addLayer(() -> RenderType::cutoutMipped)
            .transform(pickaxeOnly())
            .transform(FeatureToggle.registerDependent(CCBlocks.EMPTY_FAN_CATALYST))
            .blockstate((c, p) -> p.simpleBlock(c.getEntry(), AssetLookup.partialBaseModel(c, p)))
            .tag(AllTags.AllBlockTags.FAN_TRANSPARENT.tag)
            .item()
            .transform(customItemModel())
            .register();

    public static final BlockEntry<WrenchableBlock> FAN_DYEING_LIGHT_BLUE_CATALYST = REGISTRATE.block("fan_dyeing_light_blue_catalyst", WrenchableBlock::new)
            .initialProperties(() -> Blocks.IRON_BLOCK)
            .properties(p -> p
                    .mapColor(MapColor.TERRACOTTA_YELLOW)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
                    .isRedstoneConductor((state, level, pos) -> false)
            )
            .addLayer(() -> RenderType::cutoutMipped)
            .transform(pickaxeOnly())
            .transform(FeatureToggle.registerDependent(CCBlocks.EMPTY_FAN_CATALYST))
            .blockstate((c, p) -> p.simpleBlock(c.getEntry(), AssetLookup.partialBaseModel(c, p)))
            .tag(AllTags.AllBlockTags.FAN_TRANSPARENT.tag)
            .item()
            .transform(customItemModel())
            .register();

    public static final BlockEntry<WrenchableBlock> FAN_DYEING_BLUE_CATALYST = REGISTRATE.block("fan_dyeing_blue_catalyst", WrenchableBlock::new)
            .initialProperties(() -> Blocks.IRON_BLOCK)
            .properties(p -> p
                    .mapColor(MapColor.TERRACOTTA_YELLOW)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
                    .isRedstoneConductor((state, level, pos) -> false)
            )
            .addLayer(() -> RenderType::cutoutMipped)
            .transform(pickaxeOnly())
            .transform(FeatureToggle.registerDependent(CCBlocks.EMPTY_FAN_CATALYST))
            .blockstate((c, p) -> p.simpleBlock(c.getEntry(), AssetLookup.partialBaseModel(c, p)))
            .tag(AllTags.AllBlockTags.FAN_TRANSPARENT.tag)
            .item()
            .transform(customItemModel())
            .register();

    public static final BlockEntry<WrenchableBlock> FAN_DYEING_PURPLE_CATALYST = REGISTRATE.block("fan_dyeing_purple_catalyst", WrenchableBlock::new)
            .initialProperties(() -> Blocks.IRON_BLOCK)
            .properties(p -> p
                    .mapColor(MapColor.TERRACOTTA_YELLOW)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
                    .isRedstoneConductor((state, level, pos) -> false)
            )
            .addLayer(() -> RenderType::cutoutMipped)
            .transform(pickaxeOnly())
            .transform(FeatureToggle.registerDependent(CCBlocks.EMPTY_FAN_CATALYST))
            .blockstate((c, p) -> p.simpleBlock(c.getEntry(), AssetLookup.partialBaseModel(c, p)))
            .tag(AllTags.AllBlockTags.FAN_TRANSPARENT.tag)
            .item()
            .transform(customItemModel())
            .register();

    public static final BlockEntry<WrenchableBlock> FAN_DYEING_MAGENTA_CATALYST = REGISTRATE.block("fan_dyeing_magenta_catalyst", WrenchableBlock::new)
            .initialProperties(() -> Blocks.IRON_BLOCK)
            .properties(p -> p
                    .mapColor(MapColor.TERRACOTTA_YELLOW)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
                    .isRedstoneConductor((state, level, pos) -> false)
            )
            .addLayer(() -> RenderType::cutoutMipped)
            .transform(pickaxeOnly())
            .transform(FeatureToggle.registerDependent(CCBlocks.EMPTY_FAN_CATALYST))
            .blockstate((c, p) -> p.simpleBlock(c.getEntry(), AssetLookup.partialBaseModel(c, p)))
            .tag(AllTags.AllBlockTags.FAN_TRANSPARENT.tag)
            .item()
            .transform(customItemModel())
            .register();

    public static final BlockEntry<WrenchableBlock> FAN_DYEING_PINK_CATALYST = REGISTRATE.block("fan_dyeing_pink_catalyst", WrenchableBlock::new)
            .initialProperties(() -> Blocks.IRON_BLOCK)
            .properties(p -> p
                    .mapColor(MapColor.TERRACOTTA_YELLOW)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
                    .isRedstoneConductor((state, level, pos) -> false)
            )
            .addLayer(() -> RenderType::cutoutMipped)
            .transform(pickaxeOnly())
            .transform(FeatureToggle.registerDependent(CCBlocks.EMPTY_FAN_CATALYST))
            .blockstate((c, p) -> p.simpleBlock(c.getEntry(), AssetLookup.partialBaseModel(c, p)))
            .tag(AllTags.AllBlockTags.FAN_TRANSPARENT.tag)
            .item()
            .transform(customItemModel())
            .register();

    public static final BlockEntry<WrenchableBlock> FAN_DYEING_RAINBOW_CATALYST = REGISTRATE.block("fan_dyeing_rainbow_catalyst", WrenchableBlock::new)
            .initialProperties(() -> Blocks.IRON_BLOCK)
            .properties(p -> p
                    .mapColor(MapColor.TERRACOTTA_YELLOW)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
                    .isRedstoneConductor((state, level, pos) -> false)
            )
            .addLayer(() -> RenderType::cutoutMipped)
            .transform(pickaxeOnly())
            .transform(FeatureToggle.registerDependent(CCBlocks.EMPTY_FAN_CATALYST))
            .blockstate((c, p) -> p.simpleBlock(c.getEntry(), AssetLookup.partialBaseModel(c, p)))
            .tag(AllTags.AllBlockTags.FAN_TRANSPARENT.tag)
            .item()
            .transform(customItemModel())
            .register();

    public static void register() {
    }


}
