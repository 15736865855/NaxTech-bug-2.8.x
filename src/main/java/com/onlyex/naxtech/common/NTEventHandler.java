package com.onlyex.naxtech.common;

import gregtech.api.unification.material.event.MaterialEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(
        modid = "naxtech"
)
public class NTEventHandler {
    public NTEventHandler() {}

    @SubscribeEvent(
            priority = EventPriority.HIGH
    )
    public static void registerMaterials(MaterialEvent event)
    {
        //NTMaterials.register();
        //在此处注册材料
    }
}
