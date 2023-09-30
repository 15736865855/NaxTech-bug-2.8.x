package com.onlyex.naxtech;

import com.onlyex.naxtech.api.utils.NTLog;
import com.onlyex.naxtech.common.items.NTMetaItems;
import com.onlyex.naxtech.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(
        modid = "naxtech",
        name="NaxTech",
        acceptedMinecraftVersions = "[1.12.2]",
        version = "1.0" ,
        dependencies = "required-after:gregtech@[2.7.3-beta,) ;"
)
public class NaxTech {
    public static final String MOD_ID = "naxtech";
    public static final String NAME = "NaxTech";
    public static final String VERSION = "1.0";

    @Mod.Instance(NaxTech.MOD_ID)
    public static NaxTech instance;

    @SidedProxy(
            clientSide = "onlyex.naxtech.proxy.ClientProxy",
            serverSide = "onlyex.naxtech.proxy.CommonProxy"
    )
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        NTLog.init(event.getModLog());
        NTMetaItems.init();
        /*NTMetaTileEntities.initialization();
        NTMetaBlocks.init();*/
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
