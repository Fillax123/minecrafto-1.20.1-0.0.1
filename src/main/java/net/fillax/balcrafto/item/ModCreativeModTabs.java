package net.fillax.balcrafto.item;

import net.fillax.balcrafto.Balcrafto;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.fillax.balcrafto.block.modBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Balcrafto.MODID);


    public static final RegistryObject<CreativeModeTab> BALCRAFTO = CREATIVE_MODE_TABS.register("balcrafto_tab",
            () -> CreativeModeTab.builder().icon( () -> new ItemStack(modItems.JOKER.get()))
                    .title(Component.translatable("creativetab.balcrafto_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(modItems.JOKER.get());
                        output.accept(modItems.JOLLY_JOKER.get());
                        output.accept(modBlocks.BALCRAFTO_TABLE.get());
                    })
                    .build());



    public static void register(IEventBus eventBus) {
            CREATIVE_MODE_TABS.register(eventBus);
    }

}
