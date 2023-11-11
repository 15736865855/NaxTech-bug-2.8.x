package com.onlyex.naxtech.common.metatileentities;

import com.onlyex.naxtech.api.utils.NTLog;
import com.onlyex.naxtech.common.metatileentities.multi.electric.MetaTileEntityComponentAssemblyLine;
import com.onlyex.naxtech.common.metatileentities.multi.electric.MetaTileEntityPackagingLine;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.multiblock.MultiblockControllerBase;

import static com.onlyex.naxtech.api.utils.NTUtils.epId;
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
    public static MetaTileEntityComponentAssemblyLine COMPONENT_ASSEMBLY_LINE;
    private static <F extends MetaTileEntity> F registerSingleMetaTileEntity(int id, F mte) {
        if (id > 1000) return null;
        return registerMetaTileEntity(id + 14000, mte);
    }

    //  Range: 13301-14300
    private static <T extends MultiblockControllerBase> T registerMultiMetaTileEntity(int id, T mte) {
        return registerMetaTileEntity(id + 16000, mte);
    }
    public static void init() {
        NTLog.logger.info("Registering MetaTileEntities");
        //12000
        PACKAGING_LINE= registerMultiMetaTileEntity(2, new MetaTileEntityPackagingLine(epId("packaging_line")));
        COMPONENT_ASSEMBLY_LINE = registerMultiMetaTileEntity(1, new MetaTileEntityComponentAssemblyLine(epId("component_assembly_line")));
    }
}
