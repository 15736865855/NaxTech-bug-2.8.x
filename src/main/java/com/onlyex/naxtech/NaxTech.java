package com.onlyex.naxtech;

import com.onlyex.naxtech.api.NTValues;
import com.onlyex.naxtech.api.fluids.NTMetaFluids;
import com.onlyex.naxtech.api.utils.NTLog;
import com.onlyex.naxtech.common.block.NTMetaBlocks;
import com.onlyex.naxtech.common.items.NTMetaInit;
import com.onlyex.naxtech.common.metatileentities.NTMetaTileEntities;
import com.onlyex.naxtech.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(
        modid = NTValues.MOD_ID,
        name="NaxTech",
        acceptedMinecraftVersions = "[1.12.2]",
        version = "1.0" ,
        dependencies = "required-after:gregtech@[2.7.3-beta,) ;"
)
public class NaxTech {
    @Mod.Instance(NTValues.MOD_ID)
    public static NaxTech instance;

    @SidedProxy(
            clientSide = "com.onlyex.naxtech.proxy.ClientProxy",
            serverSide = "com.onlyex.naxtech.proxy.CommonProxy"
    )
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        NTLog.init(event.getModLog());
        NTMetaInit.init();
        NTMetaTileEntities.init();
        NTMetaBlocks.init();
        proxy.preLoad();

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
