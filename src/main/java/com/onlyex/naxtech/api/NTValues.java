package com.onlyex.naxtech.api;

import com.onlyex.naxtech.NaxTech;
import net.minecraft.util.ResourceLocation;

public class NTValues {
    public static ResourceLocation gtqtcoreId(String id) {
        return new ResourceLocation(NTValues.MOD_ID, id);
    }


    public static final int MAXX = 15;
    public static final int UEX = 16;
    public static final String[] VN = new String[]{"MAXX", "EX"};
    public static final String[] VNF = new String[]{};
    public static final int[] VC = new int[]{0x000000, 0x000000};
    public static final String[] VOLTAGE_NAMES = new String[]{"Maximum Voltage Plus", "Unconventional Extreme Voltage"};
    public static final String MOD_ID = "naxtech",
    MODID_JEI = "jei";

    public static final int IF = 65536;
}
