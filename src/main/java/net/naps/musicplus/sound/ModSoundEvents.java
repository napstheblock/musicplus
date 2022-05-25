package net.naps.musicplus.sound;

import net.minecraft.client.resources.sounds.Sound;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.Music;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.naps.musicplus.MusicPlus;

public class ModSoundEvents {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MusicPlus.MOD_ID);
    //Discs
    public static RegistryObject<SoundEvent> TALL = registerSoundEvent("music_disc_tall");
    public static RegistryObject<SoundEvent> DIMENSIONS = registerSoundEvent("music_disc_dimensions");

    //Ambience
    public static RegistryObject<SoundEvent> KALL = registerSoundEvent("kall");


    private static RegistryObject<SoundEvent> registerSoundEvent(String name){
        return SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(MusicPlus.MOD_ID, name)));
    }

    public static void register (IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
