package net.pylon404.pylonfirstmod.item;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.pylon404.pylonfirstmod.PylonFirstMod;

public class ModItems {
    /*
    Basically gives a list of the items in this mod to NeoForged
    which will then deliver that info to Minecraft when it is time
    to load items
     */
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(PylonFirstMod.MOD_ID);


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
