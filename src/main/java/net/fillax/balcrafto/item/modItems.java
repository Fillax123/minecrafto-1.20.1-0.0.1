package net.fillax.balcrafto.item;

import net.fillax.balcrafto.Balcrafto;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class modItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Balcrafto.MODID);


    public static final RegistryObject<Item> JOKER = ITEMS.register("joker", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JOLLY_JOKER = ITEMS.register("jolly_joker", () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
