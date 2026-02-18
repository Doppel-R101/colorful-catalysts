package net.doppelr.colorful_catalysts;

import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class AllTags {
    public static class BlockTags {
        public static final TagKey<Block> DYED_CATALYSTS = createTag("dyed_catalysts");

        private static TagKey<Block> createTag(String name) {
            return net.minecraft.tags.BlockTags.create(CreateColorfulCatalysts.rl(name));
        }
    }
}
