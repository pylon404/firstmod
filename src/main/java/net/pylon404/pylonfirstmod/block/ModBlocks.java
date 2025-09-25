package net.pylon404.pylonfirstmod.block;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.pylon404.pylonfirstmod.PylonFirstMod;
import net.pylon404.pylonfirstmod.item.ModItems;

import java.util.function.Function;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(PylonFirstMod.MOD_ID);

    public static final DeferredBlock<Block> TITANIUM_ORE = registerBlock(
            "titanium_ore",
            properties -> new Block(properties),
                    BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE));



    private static <B extends Block> DeferredBlock<B> registerBlock(String name, Function<BlockBehaviour.Properties, ? extends B> blockFactory, BlockBehaviour.Properties blockProperties) {
        DeferredBlock<B> toReturn = BLOCKS.registerBlock(name, blockFactory, blockProperties);
        registerBlock(name, toReturn);
        return toReturn;
    }

    private static <B extends Block> void registerBlock(String name, DeferredBlock<B> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation
                        .fromNamespaceAndPath("pylonfirstmod","titanium_ore")))));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
