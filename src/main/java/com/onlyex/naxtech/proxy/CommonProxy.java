package com.onlyex.naxtech.proxy;

import gregtech.api.block.VariantItemBlock;
import com.onlyex.naxtech.NaxTech;
import com.onlyex.naxtech.api.utils.NTLog;
import com.onlyex.naxtech.common.block.NTMetaBlocks;
import com.onlyex.naxtech.common.items.NTMetaInit;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.Objects;
import java.util.function.Function;
@Mod.EventBusSubscriber(modid = NaxTech.MOD_ID)
public class CommonProxy {

    public static final CreativeTabs NAXTECH_TAB = new CreativeTabs("NaxTech") {
        @Override
        public ItemStack createIcon() {
            return NTMetaInit.ENERGISED_TESSERACT.getStackForm();
        }
    };

    public void preInit(FMLPreInitializationEvent event ) {


    }
    public void init(FMLInitializationEvent event ) {
    }

    public CommonProxy() {
    }

    public void preLoad() {

    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
        NTLog.logger.info("Registering blocks...");
        IForgeRegistry<Block> registry = event.getRegistry();
        /*
        在此处注册方块
        例子：
        registry.register(方块实例);
        在注册MetaBlock时用到
        */

        registry.register(NTMetaBlocks.DIMENSION);
        registry.register(NTMetaBlocks.DIMENSION_FRAME);

    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
    {
        NTLog.logger.info("Registering Items...");
        IForgeRegistry<Item> registry = event.getRegistry();
        /*
        在此处注册方块的物品
        例子：
        registry.register(createItemBlock(方块实例, VariantItemBlock::new));
        在注册MetaBlock时用到
        */

        registry.register(createItemBlock(NTMetaBlocks.DIMENSION, VariantItemBlock::new));
        registry.register(createItemBlock(NTMetaBlocks.DIMENSION_FRAME, VariantItemBlock::new));

    }

    private static <T extends Block> ItemBlock createItemBlock(T block, Function<T, ItemBlock> producer) {
        ItemBlock itemBlock = producer.apply(block);
        itemBlock.setRegistryName(Objects.requireNonNull(block.getRegistryName()));
        return itemBlock;
    }

    @SubscribeEvent
    public static void registerRecipes(RegistryEvent.Register<IRecipe> event)
    {
        NTLog.logger.info("Registering recipes...");

    }
}
