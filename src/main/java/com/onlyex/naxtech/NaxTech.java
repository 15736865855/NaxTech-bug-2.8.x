package com.onlyex.naxtech;

import com.onlyex.naxtech.api.NTAPI;
import com.onlyex.naxtech.api.capability.pollution.IPollution;
import com.onlyex.naxtech.api.capability.pollution.PollutionProvider;
import com.onlyex.naxtech.api.utils.NTLog;
import com.onlyex.naxtech.common.block.NTMetaBlocks;
import com.onlyex.naxtech.common.items.NTMetaInit;
import com.onlyex.naxtech.common.metatileentities.NTMetaTileEntities;
import com.onlyex.naxtech.proxy.CommonProxy;
import gregtech.common.ConfigHolder;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import static com.onlyex.naxtech.api.NTValues.MOD_ID;

@Mod(
        modid = MOD_ID,
        name="NaxTech",
        acceptedMinecraftVersions = "[1.12.2,1.13)",
        version = "1.0" ,
        dependencies = "required-after:gregtech@[2.7.4-beta,) ;"
)
public class NaxTech {

    @SidedProxy(
            modId = MOD_ID,
            clientSide = "com.onlyex.naxtech.proxy.ClientProxy",
            serverSide = "com.onlyex.naxtech.proxy.CommonProxy"
    )
    public static CommonProxy proxy;
    @Mod.EventHandler
    public void onConstruction(FMLConstructionEvent event)
    {
        ConfigHolder.machines.highTierContent = true;
    }
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        NTLog.init(event.getModLog());
        ConfigHolder.machines.highTierContent = true;
        NTLog.logger.info("Enabled GregTechCEu highTierContent");
        NTMetaInit.init();
        NTMetaTileEntities.init();
        NTMetaBlocks.init();
        NTAPI.APIBlockInit();

        CapabilityManager.INSTANCE.register(IPollution.class, new PollutionProvider.Storage(), PollutionProvider.Impl::new);
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
