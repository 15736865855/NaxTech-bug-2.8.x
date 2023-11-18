package com.onlyex.naxtech.common.metatileentities;

import com.onlyex.naxtech.api.recipes.NTRecipeMaps;
import com.onlyex.naxtech.api.utils.NTLog;
import com.onlyex.naxtech.api.utils.NTUtils;
import com.onlyex.naxtech.common.metatileentities.multi.electric.*;
import com.onlyex.naxtech.common.metatileentities.multi.part.*;
import gregtech.api.GTValues;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.SimpleMachineMetaTileEntity;
import gregtech.api.metatileentity.multiblock.MultiblockControllerBase;
import gregtech.api.util.GTUtility;
import gregtech.client.renderer.texture.Textures;

import static com.onlyex.naxtech.api.utils.NTUtils.epId;
import static gregtech.common.metatileentities.MetaTileEntities.registerMetaTileEntity;
import static gregtech.common.metatileentities.MetaTileEntities.registerSimpleMetaTileEntity;

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
    public static NTMetaTileEntityEnergyHatch[] INPUT_ENERGY_HATCH_4A = new NTMetaTileEntityEnergyHatch[4];
    public static NTMetaTileEntityEnergyHatch[] INPUT_ENERGY_HATCH_16A = new NTMetaTileEntityEnergyHatch[4];
    public static NTMetaTileEntityEnergyHatch[] OUTPUT_ENERGY_HATCH_4A = new NTMetaTileEntityEnergyHatch[7];
    public static NTMetaTileEntityEnergyHatch[] OUTPUT_ENERGY_HATCH_16A = new NTMetaTileEntityEnergyHatch[8];
    public static NTMetaTileEntityCatalystHatch MULTIPART_CATALYST_HATCH;
    public static NTMetaTileEntityIndustrialMaintenanceHatch INDUSTRIAL_MAINTENANCE_HATCH;
    public static NTMetaTileEntityBufferHatch MULTIPART_BUFFER_HATCH;

    public static SimpleMachineMetaTileEntity[] COMPONENT_ASSEMBLER = new SimpleMachineMetaTileEntity[GTValues.IV + 1];


    //多方块
    public static MetaTileEntityPackagingLine PACKAGING_LINE;
    public static MetaTileEntityComponentAssemblyLine COMPONENT_ASSEMBLY_LINE;
    public static MetaTileEntityBlazingBlastFurnace BLAZING_BLAST_FURNACE;
    public static MetaTileEntityCryogenicFreezer CRYOGENIC_FREEZER;
    public static MetaTileEntityPreciseAssembler PRECISE_ASSEMBLER;
    public static MetaTileEntityIntegratedOreFactory INTEGRATED_ORE_FACTORY;
    //public static MetaTileEntityCompressedFusionReactor[] COMPACT_FUSION_REACTOR = new MetaTileEntityCompressedFusionReactor[5];

    public static MetaTileEntityFlotationFactory FLOTATION_FACTORY;
    private static <F extends MetaTileEntity> F registerSingleMetaTileEntity(int id, F mte) {
        if (id > 500) return null;
        return registerMetaTileEntity(id + 14000, mte);
    }

    private static <T extends MultiblockControllerBase> T registerMultiMetaTileEntity(int id, T mte) {
        return registerMetaTileEntity(id + 16000, mte);
    }
    public static void init() {
        NTLog.logger.info("Registering MetaTileEntities");
        //1400
        INPUT_ENERGY_HATCH_4A[0] = registerSingleMetaTileEntity(1, new NTMetaTileEntityEnergyHatch(epId("energy_hatch.input_4a.uev"), 10, 4, false));
        INPUT_ENERGY_HATCH_4A[1] = registerSingleMetaTileEntity(2, new NTMetaTileEntityEnergyHatch(epId("energy_hatch.input_4a.uiv"), 11, 4, false));
        INPUT_ENERGY_HATCH_4A[2] = registerSingleMetaTileEntity(3, new NTMetaTileEntityEnergyHatch(epId("energy_hatch.input_4a.uxv"), 12, 4, false));
        INPUT_ENERGY_HATCH_4A[3] = registerSingleMetaTileEntity(4, new NTMetaTileEntityEnergyHatch(epId("energy_hatch.input_4a.opv"), 13, 4, false));

        INPUT_ENERGY_HATCH_16A[0] = registerSingleMetaTileEntity(5, new NTMetaTileEntityEnergyHatch(epId("energy_hatch.input_16a.uev"), 10, 16, false));
        INPUT_ENERGY_HATCH_16A[1] = registerSingleMetaTileEntity(6, new NTMetaTileEntityEnergyHatch(epId("energy_hatch.input_16a.uiv"), 11, 16, false));
        INPUT_ENERGY_HATCH_16A[2] = registerSingleMetaTileEntity(7, new NTMetaTileEntityEnergyHatch(epId("energy_hatch.input_16a.uxv"), 12, 16, false));
        INPUT_ENERGY_HATCH_16A[3] = registerSingleMetaTileEntity(8, new NTMetaTileEntityEnergyHatch(epId("energy_hatch.input_16a.opv"), 13, 16, false));

        OUTPUT_ENERGY_HATCH_4A[0] = registerSingleMetaTileEntity(9, new NTMetaTileEntityEnergyHatch(epId("energy_hatch.output_4a.lv"), 1, 4, true));
        OUTPUT_ENERGY_HATCH_4A[1] = registerSingleMetaTileEntity(10, new NTMetaTileEntityEnergyHatch(epId("energy_hatch.output_4a.mv"), 2, 4, true));
        OUTPUT_ENERGY_HATCH_4A[2] = registerSingleMetaTileEntity(11, new NTMetaTileEntityEnergyHatch(epId("energy_hatch.output_4a.hv"), 3, 4, true));
        OUTPUT_ENERGY_HATCH_4A[3] = registerSingleMetaTileEntity(12, new NTMetaTileEntityEnergyHatch(epId("energy_hatch.output_4a.uev"), 10, 4, true));
        OUTPUT_ENERGY_HATCH_4A[4] = registerSingleMetaTileEntity(13, new NTMetaTileEntityEnergyHatch(epId("energy_hatch.output_4a.uiv"), 11, 4, true));
        OUTPUT_ENERGY_HATCH_4A[5] = registerSingleMetaTileEntity(14, new NTMetaTileEntityEnergyHatch(epId("energy_hatch.output_4a.uxv"), 12, 4, true));
        OUTPUT_ENERGY_HATCH_4A[6] = registerSingleMetaTileEntity(15, new NTMetaTileEntityEnergyHatch(epId("energy_hatch.output_4a.opv"), 13, 4, true));

        OUTPUT_ENERGY_HATCH_16A[0] = registerSingleMetaTileEntity(16, new NTMetaTileEntityEnergyHatch(epId("energy_hatch.output_16a.lv"), 1, 16, true));
        OUTPUT_ENERGY_HATCH_16A[1] = registerSingleMetaTileEntity(17, new NTMetaTileEntityEnergyHatch(epId("energy_hatch.output_16a.mv"), 2, 16, true));
        OUTPUT_ENERGY_HATCH_16A[2] = registerSingleMetaTileEntity(18, new NTMetaTileEntityEnergyHatch(epId("energy_hatch.output_16a.hv"), 3, 16, true));
        OUTPUT_ENERGY_HATCH_16A[3] = registerSingleMetaTileEntity(19, new NTMetaTileEntityEnergyHatch(epId("energy_hatch.output_16a.ev"), 4, 16, true));
        OUTPUT_ENERGY_HATCH_16A[4] = registerSingleMetaTileEntity(20, new NTMetaTileEntityEnergyHatch(epId("energy_hatch.output_16a.uev"), 10, 16, true));
        OUTPUT_ENERGY_HATCH_16A[5] = registerSingleMetaTileEntity(21, new NTMetaTileEntityEnergyHatch(epId("energy_hatch.output_16a.uiv"), 11, 16, true));
        OUTPUT_ENERGY_HATCH_16A[6] = registerSingleMetaTileEntity(22, new NTMetaTileEntityEnergyHatch(epId("energy_hatch.output_16a.uxv"), 12, 16, true));
        OUTPUT_ENERGY_HATCH_16A[7] = registerSingleMetaTileEntity(23, new NTMetaTileEntityEnergyHatch(epId("energy_hatch.output_16a.opv"), 13, 16, true));

        MULTIPART_CATALYST_HATCH = registerSingleMetaTileEntity(24, new NTMetaTileEntityCatalystHatch(epId("catalyst_hatch")));
        INDUSTRIAL_MAINTENANCE_HATCH = registerSingleMetaTileEntity(25, new NTMetaTileEntityIndustrialMaintenanceHatch(epId("industrial_maintenance_hatch")));
        MULTIPART_BUFFER_HATCH = registerSingleMetaTileEntity(26, new NTMetaTileEntityBufferHatch(epId("buffer_hatch")));


        //14500
        registerSimpleMetaTileEntity(COMPONENT_ASSEMBLER, 14500, "component_assembler", NTRecipeMaps.COMPONENT_ASSEMBLER_RECIPES, Textures.ASSEMBLER_OVERLAY, true, NTUtils::epId, GTUtility.hvCappedTankSizeFunction);





        //16000
        PACKAGING_LINE= registerMultiMetaTileEntity(1, new MetaTileEntityPackagingLine(epId("packaging_line")));
        COMPONENT_ASSEMBLY_LINE = registerMultiMetaTileEntity(2, new MetaTileEntityComponentAssemblyLine(epId("component_assembly_line")));
        BLAZING_BLAST_FURNACE = registerMultiMetaTileEntity(3, new MetaTileEntityBlazingBlastFurnace(epId("blazing_blast_furnace")));
        CRYOGENIC_FREEZER = registerMultiMetaTileEntity(4, new MetaTileEntityCryogenicFreezer(epId("cryogenic_freezer")));
        PRECISE_ASSEMBLER = registerMultiMetaTileEntity(5, new MetaTileEntityPreciseAssembler(epId("precise_assembler")));
        //COMPACT_FUSION_REACTOR[0] = registerMultiMetaTileEntity(6, new MetaTileEntityCompressedFusionReactor(epId("compact_fusion_reactor_mk1"), GTValues.LuV, MetaBlocks.FUSION_CASING.getState(BlockFusionCasing.CasingType.FUSION_CASING), MetaBlocks.FRAMES.get(Materials.NaquadahAlloy).getBlock(Materials.NaquadahAlloy), MetaBlocks.FUSION_CASING.getState(BlockFusionCasing.CasingType.SUPERCONDUCTOR_COIL), MetaBlocks.TRANSPARENT_CASING.getState(BlockGlassCasing.CasingType.FUSION_GLASS)));
        //COMPACT_FUSION_REACTOR[1] = registerMultiMetaTileEntity(7, new MetaTileEntityCompressedFusionReactor(epId("compact_fusion_reactor_mk2"), GTValues.ZPM, MetaBlocks.FUSION_CASING.getState(BlockFusionCasing.CasingType.FUSION_CASING_MK2), MetaBlocks.FRAMES.get(Materials.Trinium).getBlock(Materials.Trinium), MetaBlocks.FUSION_CASING.getState(BlockFusionCasing.CasingType.FUSION_COIL), MetaBlocks.TRANSPARENT_CASING.getState(BlockGlassCasing.CasingType.FUSION_GLASS)));
        //COMPACT_FUSION_REACTOR[2] = registerMultiMetaTileEntity(8, new MetaTileEntityCompressedFusionReactor(epId("compact_fusion_reactor_mk3"), GTValues.UV, MetaBlocks.FUSION_CASING.getState(BlockFusionCasing.CasingType.FUSION_CASING_MK3), MetaBlocks.FRAMES.get(Materials.Tritanium).getBlock(Materials.Tritanium), MetaBlocks.FUSION_CASING.getState(BlockFusionCasing.CasingType.FUSION_COIL), MetaBlocks.TRANSPARENT_CASING.getState(BlockGlassCasing.CasingType.FUSION_GLASS)));
        //COMPACT_FUSION_REACTOR[3] = registerMultiMetaTileEntity(9, new MetaTileEntityCompressedFusionReactor(epId("compact_fusion_reactor_mk4"), 9, );
        INTEGRATED_ORE_FACTORY = registerMultiMetaTileEntity(10, new MetaTileEntityIntegratedOreFactory(epId("integrated_ore_factory")));
        FLOTATION_FACTORY = registerMultiMetaTileEntity(11, new MetaTileEntityFlotationFactory(epId("flotation_factory")));
    }
}
