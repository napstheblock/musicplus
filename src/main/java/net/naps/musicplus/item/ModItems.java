package net.naps.musicplus.item;

import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.registries.RegistryObject;
import net.naps.musicplus.MusicPlus;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MusicPlus.MOD_ID);

    public static final RegistryObject<Item> TALL = ITEMS.register("music_disc_tall", () -> new Item(
            new Item.Properties()
                    .tab(CreativeModeTab.TAB_MISC)
                    .stacksTo(1)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
