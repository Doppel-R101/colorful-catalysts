package net.doppelr.colorful_catalysts.datagen;

import net.doppelr.colorful_catalysts.blocks.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.enchantment.Enchantment;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }
    HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);

    protected void generate() {
        dropSelf(ModBlocks.FAN_DYEING_WHITE_CATALYST.get());
        dropSelf(ModBlocks.FAN_DYEING_LIGHT_GRAY_CATALYST.get());
        dropSelf(ModBlocks.FAN_DYEING_GRAY_CATALYST.get());
        dropSelf(ModBlocks.FAN_DYEING_BLACK_CATALYST.get());
        dropSelf(ModBlocks.FAN_DYEING_BROWN_CATALYST.get());
        dropSelf(ModBlocks.FAN_DYEING_RED_CATALYST.get());
        dropSelf(ModBlocks.FAN_DYEING_ORANGE_CATALYST.get());
        dropSelf(ModBlocks.FAN_DYEING_YELLOW_CATALYST.get());
        dropSelf(ModBlocks.FAN_DYEING_LIME_CATALYST.get());
        dropSelf(ModBlocks.FAN_DYEING_GREEN_CATALYST.get());
        dropSelf(ModBlocks.FAN_DYEING_CYAN_CATALYST.get());
        dropSelf(ModBlocks.FAN_DYEING_LIGHT_BLUE_CATALYST.get());
        dropSelf(ModBlocks.FAN_DYEING_BLUE_CATALYST.get());
        dropSelf(ModBlocks.FAN_DYEING_PURPLE_CATALYST.get());
        dropSelf(ModBlocks.FAN_DYEING_MAGENTA_CATALYST.get());
        dropSelf(ModBlocks.FAN_DYEING_PINK_CATALYST.get());
        dropSelf(ModBlocks.FAN_DYEING_RAINBOW_CATALYST.get());
    }
}
