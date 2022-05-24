package net.naps.musicplus.item;

import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.registries.RegistryObject;
import net.naps.musicplus.MusicPlus;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.naps.musicplus.sound.ModSoundEvents;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MusicPlus.MOD_ID);

    public static final RegistryObject<Item> TALL = ITEMS.register("music_disc_tall", () -> new RecordItem(4, ModSoundEvents.TALL,
            new Item.Properties()
                    .tab(ModCreativeModeTab.MUSIC_PLUS)
                    .rarity(Rarity.RARE)
                    .stacksTo(1)));
    public static final RegistryObject<Item> DIMENSIONS = ITEMS.register("music_disc_dimensions", () -> new RecordItem(4, ModSoundEvents.DIMENSIONS,
            new Item.Properties()
                    .tab(ModCreativeModeTab.MUSIC_PLUS)
                    .rarity(Rarity.RARE)
                    .stacksTo(1)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
