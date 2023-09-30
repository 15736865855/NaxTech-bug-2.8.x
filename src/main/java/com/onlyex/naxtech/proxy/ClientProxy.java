package com.onlyex.naxtech.proxy;

import com.onlyex.naxtech.api.textures.NTTextures;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber({Side.CLIENT})

public class ClientProxy extends CommonProxy {
    public ClientProxy() {
    }

    public void preLoad()
    {
        super.preLoad();
        NTTextures.init();
    }
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event)
    {
        //NTMetaBlocks.registerItemModels();
    }

}
