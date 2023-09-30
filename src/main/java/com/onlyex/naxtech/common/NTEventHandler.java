package com.onlyex.naxtech.common;

import com.onlyex.naxtech.NaxTech;
import com.onlyex.naxtech.api.unification.NTMaterials;
import gregtech.api.unification.material.event.MaterialEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = NaxTech.MOD_ID)
public class NTEventHandler {
    public NTEventHandler() {}

    @SubscribeEvent(priority = EventPriority.HIGH)
    public static void registerMaterials(MaterialEvent event)
    {
        NTMaterials.initregister();
        //在此处注册材料
    }
}
