package com.onlyex.naxtech.common.metatileentities;

import com.onlyex.naxtech.api.utils.NTLog;
import com.onlyex.naxtech.common.metatileentities.multi.electric.MetaTileEntityPackagingLine;

import static gregtech.api.util.GTUtility.gregtechId;
import static gregtech.common.metatileentities.MetaTileEntities.registerMetaTileEntity;
//checkEnergyln: false/true
//检查能量输入
//checkMaintenance: false/true
//检查维护
//checkltemln: false/true
//检查物品输入
//checkltemOut: false/true
//检查物品输出
//checkFluidIn: false/true
//检查流体输入
//checkFluidOut: false/true
//检查液体输出
//checkMuffler: false/true
//检查消声器
public class NTMetaTileEntities {
    //单方块
    //public static final SimpleMachineMetaTileEntity[]  = new SimpleMachineMetaTileEntity[GTValues.V.length - 1];

    //多方块
    public static MetaTileEntityPackagingLine PACKAGING_LINE;

    public static void init() {
        NTLog.logger.info("Registering MetaTileEntities");
        //12000
        PACKAGING_LINE= registerMetaTileEntity(12000, new MetaTileEntityPackagingLine(gregtechId("packaging_line")));
    }
}
