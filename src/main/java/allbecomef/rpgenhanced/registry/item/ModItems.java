// src/main/java/allbecomef/rpgenhenhanced/Registry.java
package allbecomef.rpgenhanced.registry.item;

import allbecomef.rpgenhanced.RPGEnhanced;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModItems {
    // create a DeferredRegister for ITEMS under your mod ID
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(Registries.ITEM, RPGEnhanced.MODID);

    // register "golem_core" as a simple Item with stack size 16, uncommon rarity
    public static final Supplier<Item> GOLEM_CORE =
            ITEMS.register("golem_core",
                    () -> new Item(new Item.Properties()
                            .stacksTo(16)
                            .rarity(Rarity.UNCOMMON)
                    )
            );

    /** Call this from your main mod constructor to hook into the event bus */
    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}
