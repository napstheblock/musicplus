package net.naps.musicplus.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MUSIC_PLUS = new CreativeModeTab("musicplus") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TALL.get());
        }
    };
}
