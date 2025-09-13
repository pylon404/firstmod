package net.pylon404.pylonfirstmod.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.pylon404.pylonfirstmod.PylonFirstMod;

public class ModItems {
    /*
    Basically gives a list of the items in this mod to NeoForged
    which will then deliver that info to Minecraft when it is time
    to load items
     */
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(PylonFirstMod.MOD_ID);

    //First Item
    public static final DeferredItem<Item> TITANIUM_INGOT = ITEMS.registerItem( "titanium_ingot",
        Item::new, new Item.Properties());

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
