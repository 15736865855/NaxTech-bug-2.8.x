package com.onlyex.naxtech.common.metatileentities;

import com.onlyex.naxtech.api.metatileentity.single.SimpleSteamMetaTileEntity;
import com.onlyex.naxtech.api.metatileentity.single.SteamProgressIndicator;
import com.onlyex.naxtech.api.metatileentity.single.SteamProgressIndicators;
import com.onlyex.naxtech.api.recipe.NTRecipeMaps;
import com.onlyex.naxtech.api.utils.NTUtils;
import com.onlyex.naxtech.client.renderer.texture.NTTextures;
import com.onlyex.naxtech.common.block.NTMetaBlocks;
import com.onlyex.naxtech.common.block.blocks.machinel.NTBlockMachinelCasingA;
import com.onlyex.naxtech.common.metatileentities.multiblock.*;
import com.onlyex.naxtech.common.metatileentities.multiblock.generator.*;
import com.onlyex.naxtech.common.metatileentities.multiblock.part.*;
import gregtech.api.GTValues;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.SimpleGeneratorMetaTileEntity;
import gregtech.api.metatileentity.SimpleMachineMetaTileEntity;
import gregtech.api.metatileentity.multiblock.MultiblockControllerBase;
import gregtech.api.recipes.RecipeMap;
import gregtech.api.recipes.RecipeMaps;
import gregtech.api.util.GTUtility;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.client.renderer.texture.Textures;
import gregtech.common.blocks.BlockFusionCasing;
import gregtech.common.blocks.BlockTurbineCasing;
import gregtech.common.blocks.MetaBlocks;
import gregtech.common.metatileentities.multi.multiblockpart.MetaTileEntityEnergyHatch;

import static com.onlyex.naxtech.api.utils.NTUtils.ntId;
import static gregtech.api.util.GTUtility.genericGeneratorTankSizeFunction;
import static gregtech.common.metatileentities.MetaTileEntities.registerMetaTileEntity;
import static gregtech.common.metatileentities.MetaTileEntities.registerSimpleMetaTileEntity;

public class NTMetaTileEntities {

    //  SingleBlock---MultiblockHatches Range:1-300
    public static NTMetaTileEntityBufferHatch MULTIPART_BUFFER_HATCH;
    public static NTMetaTileEntityMillBallHatch MULTIPART_BALL_HATCH;
    public static NTMetaTileEntityCatalystHatch MULTIPART_CATALYST_HATCH;
    public static NTMetaTileEntityIndustrialMaintenanceHatch INDUSTRIAL_MAINTENANCE_HATCH;
    public static final NTMetaTileEntityReinforcedRotorHolder[] REINFORCED_ROTOR_HOLDER = new NTMetaTileEntityReinforcedRotorHolder[6]; //LuV, ZPM, UV, UHV, UEV, UIV
    public static MetaTileEntityEnergyHatch[] INPUT_ENERGY_HATCH_4A = new MetaTileEntityEnergyHatch[4];
    public static MetaTileEntityEnergyHatch[] INPUT_ENERGY_HATCH_16A = new MetaTileEntityEnergyHatch[4];
    public static MetaTileEntityEnergyHatch[] OUTPUT_ENERGY_HATCH_4A = new MetaTileEntityEnergyHatch[7];
    public static MetaTileEntityEnergyHatch[] OUTPUT_ENERGY_HATCH_16A = new MetaTileEntityEnergyHatch[8];

    //  SingleBlock---SimpleMachines Range:301-600
    public static SimpleMachineMetaTileEntity[] DRYER = new SimpleMachineMetaTileEntity[GTValues.V.length - 1];
    public static final SimpleGeneratorMetaTileEntity[] NAQUADAH_REACTOR = new SimpleGeneratorMetaTileEntity[3];
    public static SimpleSteamMetaTileEntity[] STEAM_VACUUM_CHAMBER = new SimpleSteamMetaTileEntity[2];
    public static SimpleMachineMetaTileEntity[] VACUUM_CHAMBER = new SimpleMachineMetaTileEntity[GTValues.V.length - 1];
    public static SimpleMachineMetaTileEntity[] COMPONENT_ASSEMBLER = new SimpleMachineMetaTileEntity[GTValues.IV + 1];
    public static SimpleMachineMetaTileEntity[] DECAY_CHAMBER = new SimpleMachineMetaTileEntity[GTValues.V.length - 1];
    public static SimpleMachineMetaTileEntity[] CRYSTALLIZER = new SimpleMachineMetaTileEntity[GTValues.V.length - 1];
    public static final SimpleGeneratorMetaTileEntity[] ROCKET_ENGINE = new SimpleGeneratorMetaTileEntity[3];
    public static SimpleMachineMetaTileEntity[] ULTRAVIOLET_LAMP_CHAMBER = new SimpleMachineMetaTileEntity[GTValues.V.length - 1];

    //  Multiblocks
    public static NTMetaTileEntitySonicator SONICATOR;
    public static NTMetaTileEntityCVDUnit CVD_UNIT;
    public static NTMetaTileEntityNanoscaleFabricator NANOSCALE_FABRICATOR;
    public static NTMetaTileEntityCrystallizationCrucible CRYSTALLIZATION_CRUCIBLE;
    public static NTMetaTileEntityCatalyticReformer CATALYTIC_REFORMER;
    public static NTMetaTileEntityFermentationTank FERMENTATION_TANK;
    public static NTMetaTileEntityBlazingBlastFurnace BLAZING_BLAST_FURNACE;
    public static NTMetaTileEntityCryogenicFreezer CRYOGENIC_FREEZER;
    public static NTMetaTileEntityIsaMill ISA_MILL;
    public static NTMetaTileEntityFlotationFactory FLOTATION_FACTORY;
    public static NTMetaTileEntityVacuumDryingFurnace VACUUM_DRYING_FURNACE;
    public static NTMetaTileEntityBurnerReactor BURNER_REACTOR;
    public static NTMetaTileEntityCryogenicReactor CRYOGENIC_REACTOR;
    public static NTMetaTileEntityMegaAlloyBlastSmelter MEGA_ALLOY_BLAST_SMELTER;
    public static NTMetaTileEntityChemicalPlant CHEMICAL_PLANT;
    public static NTMetaTileEntityMegaOilCrackingUnit MEGA_OIL_CRACKING_UNIT;
    public static NTMetaTileEntityMegaChemicalReactor MEGA_CHEMICAL_REACTOR;

//    public static NTMetaTileEntityAlgaeFarm ALGAE_FARM;
    public static NTMetaTileEntityIndustrialFishingPond INDUSTRIAL_FISHING_POND;
    public static NTMetaTileEntityRoaster ROASTER;
    public static NTMetaTileEntityIndustrialDrill INDUSTRIAL_DRILL;
    public static NTMetaTileEntityFracker FRACKER;
    public static NTMetaTileEntityGeneralProcessingPlant GENERAL_PROCESSING_PLANT;
    public static NTMetaTileEntityIntegratedOreFactory INTEGRATED_ORE_FACTORY;
    public static NTMetaTileEntityDissolutionTank DISSOLUTION_TANK;
    public static NTMetaTileEntityDigester DIGESTER;
//    public static NTMetaTileEntityBiologicalReactionChamber BIOLOGICAL_REACTION_CHAMBER;
//    public static NTMetaTileEntityComputingTerminal COMPUTING_TERMINAL;
//    public static NTMetaTileEntityElectronCryomicroscopy ELECTRON_CRYOMICROSCOPY;
    public static NTMetaTileEntityCosmicRayDetector COSMIC_RAY_DETECTOR;
//    public static NTMetaTileEntityPCBFactory PCB_FACTORY;
    public static NTMetaTileEntityIonImplantater ION_IMPLANTATER;
    public static NTMetaTileEntityPlasmaCVDUnit PLASMA_CVD;
    public static NTMetaTileEntityLaserCVDUnit LASER_CVD;
    public static NTMetaTileEntityLargeNaquadahReactor LARGE_NAQUADAH_REACTOR;
    public static NTMetaTileEntityFuelRefineFactory FUEL_REFINE_FACTORY;
    public static NTMetaTileEntityHyperReactorMk1 HYPER_REACTOR_MK1;
    public static NTMetaTileEntityHyperReactorMk2 HYPER_REACTOR_MK2;
    public static NTMetaTileEntityHyperReactorMk3 HYPER_REACTOR_MK3;
    public static NTMetaTileEntityLargeVacuumChamber LARGE_VACUUM_CHAMBER;
    public static NTMetaTileEntityMegaTurbine MEGA_STEAM_TURBINE;
    public static NTMetaTileEntityMegaTurbine MEGA_GAS_TURBINE;
    public static NTMetaTileEntityMegaTurbine MEGA_PLASMA_TURBINE;
    public static NTMetaTileEntityStellarFurnace STELLAR_FURNACE;
//    public static NTMetaTileEntityCompressedFusionReactor[] COMPACT_FUSION_REACTOR = new NTMetaTileEntityCompressedFusionReactor[5];
    public static NTMetaTileEntityPlasmaCondenser PLASMA_CONDENSER;
    public static NTMetaTileEntityLargeHeatExchanger LARGE_HEAT_EXCHANGER;
    public static NTMetaTileEntityMegaHeatExchanger MEGA_HEAT_EXCHANGER;
//    public static NTMetaTileEntityExtremeHeatExchanger EXTREME_HEAT_EXCHANGER;
    public static NTMetaTileEntityLargeTurbine HIGH_PRESSURE_STEAM_TURBINE;
    public static NTMetaTileEntityLargeTurbine SUPERCRITICAL_STEAM_TURBINE;
    public static NTMetaTileEntityMegaTurbine MEGA_HIGH_PRESSURE_STEAM_TURBINE;
    public static NTMetaTileEntityMegaTurbine MEGA_SUPERCRITICAL_STEAM_TURBINE;
    public static NTMetaTileEntityPreciseAssembler PRECISE_ASSEMBLER;
    public static NTMetaTileEntityComponentAssemblyLine COMPONENT_ASSEMBLY_LINE;
//    public static NTMetaTileEntityLargeCircuitAssemblyLine LARGE_CIRCUIT_ASSEMBLY_LINE;
    public static NTMetaTileEntityCompactCyclotron CYCLOTRON;
    public static NTMetaTileEntityDragonFusionUnit DRAGON_FUSION_UNIT;
    public static NTMetaTileEntityDangoteDistillery DANGOTE_DISTILLERY;
    public static NTMetaTileEntityIndustrialPrimitiveBlastFurnace INDUSTRIAL_PRIMITIVE_BLAST_FURNACE;
    public static NTMetaTileEntityLargeSteamCompressor LARGE_STEAM_COMPRESSOR;
    public static NTMetaTileEntityQuantumForceTransformer QUANTUM_FORCE_TRANSFORMER;
    public static final NTMetaTileEntityHighTireFusionReactor[] HIGH_TIRE_FUSION_REACTORS = new NTMetaTileEntityHighTireFusionReactor[3];

    //  Range: 12301-13300
    private static void registerSimpleSteamMetaTileEntity(SimpleSteamMetaTileEntity[] machines, int startId, String name, RecipeMap<?> recipeMap, SteamProgressIndicator progressIndicator, ICubeRenderer texture, boolean isBricked) {
        machines[0] = registerMetaTileEntity(startId, new SimpleSteamMetaTileEntity(ntId(String.format("%s.bronze", name)), recipeMap, progressIndicator, texture, isBricked, false));
        machines[1] = registerMetaTileEntity(startId + 1, new SimpleSteamMetaTileEntity(ntId(String.format("%s.steel", name)), recipeMap, progressIndicator, texture, isBricked, true));
    }

    private static <F extends MetaTileEntity> F registerSingleMetaTileEntity(int id, F mte) {
        if (id > 1000) return null;
        return registerMetaTileEntity(id + 12300, mte);
    }

    //  Range: 13301-14300
    private static <T extends MultiblockControllerBase> T registerMultiMetaTileEntity(int id, T mte) {
        return registerMetaTileEntity(id + 13300, mte);
    }

    public static void init() {

        //  Single Blocks range: 12301-13300

        //  Multiblock Hatches range: 12301-12600
        MULTIPART_BUFFER_HATCH = registerSingleMetaTileEntity(1, new NTMetaTileEntityBufferHatch(ntId("buffer_hatch")));
        MULTIPART_BALL_HATCH = registerSingleMetaTileEntity(2, new NTMetaTileEntityMillBallHatch(ntId("mill_ball_hatch")));
        MULTIPART_CATALYST_HATCH = registerSingleMetaTileEntity(3, new NTMetaTileEntityCatalystHatch(ntId("catalyst_hatch")));
        INDUSTRIAL_MAINTENANCE_HATCH = registerSingleMetaTileEntity(4, new NTMetaTileEntityIndustrialMaintenanceHatch(ntId("industrial_maintenance_hatch")));
        REINFORCED_ROTOR_HOLDER[0] = registerSingleMetaTileEntity(5, new NTMetaTileEntityReinforcedRotorHolder(ntId("reinforced_rotor_holder.luv"), GTValues.LuV));
        REINFORCED_ROTOR_HOLDER[1] = registerSingleMetaTileEntity(6, new NTMetaTileEntityReinforcedRotorHolder(ntId("reinforced_rotor_holder.zpm"), GTValues.ZPM));
        REINFORCED_ROTOR_HOLDER[2] = registerSingleMetaTileEntity(7, new NTMetaTileEntityReinforcedRotorHolder(ntId("reinforced_rotor_holder.uv"), GTValues.UV));
        REINFORCED_ROTOR_HOLDER[3] = registerSingleMetaTileEntity(8, new NTMetaTileEntityReinforcedRotorHolder(ntId("reinforced_rotor_holder.uhv"), GTValues.UHV));
        REINFORCED_ROTOR_HOLDER[4] = registerSingleMetaTileEntity(9, new NTMetaTileEntityReinforcedRotorHolder(ntId("reinforced_rotor_holder.uev"), GTValues.UEV));
        REINFORCED_ROTOR_HOLDER[5] = registerSingleMetaTileEntity(10, new NTMetaTileEntityReinforcedRotorHolder(ntId("reinforced_rotor_holder.uiv"), GTValues.UIV));
        INPUT_ENERGY_HATCH_4A[0] = registerSingleMetaTileEntity(11, new NTMetaTileEntityEnergyHatch(ntId("energy_hatch.input_4a.uev"), 10, 4, false));
        INPUT_ENERGY_HATCH_4A[1] = registerSingleMetaTileEntity(12, new NTMetaTileEntityEnergyHatch(ntId("energy_hatch.input_4a.uiv"), 11, 4, false));
        INPUT_ENERGY_HATCH_4A[2] = registerSingleMetaTileEntity(13, new NTMetaTileEntityEnergyHatch(ntId("energy_hatch.input_4a.uxv"), 12, 4, false));
        INPUT_ENERGY_HATCH_4A[3] = registerSingleMetaTileEntity(14, new NTMetaTileEntityEnergyHatch(ntId("energy_hatch.input_4a.opv"), 13, 4, false));
        INPUT_ENERGY_HATCH_16A[0] = registerSingleMetaTileEntity(15, new NTMetaTileEntityEnergyHatch(ntId("energy_hatch.input_16a.uev"), 10, 16, false));
        INPUT_ENERGY_HATCH_16A[1] = registerSingleMetaTileEntity(16, new NTMetaTileEntityEnergyHatch(ntId("energy_hatch.input_16a.uiv"), 11, 16, false));
        INPUT_ENERGY_HATCH_16A[2] = registerSingleMetaTileEntity(17, new NTMetaTileEntityEnergyHatch(ntId("energy_hatch.input_16a.uxv"), 12, 16, false));
        INPUT_ENERGY_HATCH_16A[3] = registerSingleMetaTileEntity(18, new NTMetaTileEntityEnergyHatch(ntId("energy_hatch.input_16a.opv"), 13, 16, false));
        OUTPUT_ENERGY_HATCH_4A[0] = registerSingleMetaTileEntity(19, new NTMetaTileEntityEnergyHatch(ntId("energy_hatch.output_4a.lv"), 1, 4, true));
        OUTPUT_ENERGY_HATCH_4A[1] = registerSingleMetaTileEntity(20, new NTMetaTileEntityEnergyHatch(ntId("energy_hatch.output_4a.mv"), 2, 4, true));
        OUTPUT_ENERGY_HATCH_4A[2] = registerSingleMetaTileEntity(21, new NTMetaTileEntityEnergyHatch(ntId("energy_hatch.output_4a.hv"), 3, 4, true));
        OUTPUT_ENERGY_HATCH_4A[3] = registerSingleMetaTileEntity(22, new NTMetaTileEntityEnergyHatch(ntId("energy_hatch.output_4a.uev"), 10, 4, true));
        OUTPUT_ENERGY_HATCH_4A[4] = registerSingleMetaTileEntity(23, new NTMetaTileEntityEnergyHatch(ntId("energy_hatch.output_4a.uiv"), 11, 4, true));
        OUTPUT_ENERGY_HATCH_4A[5] = registerSingleMetaTileEntity(24, new NTMetaTileEntityEnergyHatch(ntId("energy_hatch.output_4a.uxv"), 12, 4, true));
        OUTPUT_ENERGY_HATCH_4A[6] = registerSingleMetaTileEntity(25, new NTMetaTileEntityEnergyHatch(ntId("energy_hatch.output_4a.opv"), 13, 4, true));
        OUTPUT_ENERGY_HATCH_16A[0] = registerSingleMetaTileEntity(26, new NTMetaTileEntityEnergyHatch(ntId("energy_hatch.output_16a.lv"), 1, 16, true));
        OUTPUT_ENERGY_HATCH_16A[1] = registerSingleMetaTileEntity(27, new NTMetaTileEntityEnergyHatch(ntId("energy_hatch.output_16a.mv"), 2, 16, true));
        OUTPUT_ENERGY_HATCH_16A[2] = registerSingleMetaTileEntity(28, new NTMetaTileEntityEnergyHatch(ntId("energy_hatch.output_16a.hv"), 3, 16, true));
        OUTPUT_ENERGY_HATCH_16A[3] = registerSingleMetaTileEntity(29, new NTMetaTileEntityEnergyHatch(ntId("energy_hatch.output_16a.ev"), 4, 16, true));
        OUTPUT_ENERGY_HATCH_16A[4] = registerSingleMetaTileEntity(30, new NTMetaTileEntityEnergyHatch(ntId("energy_hatch.output_16a.uev"), 10, 16, true));
        OUTPUT_ENERGY_HATCH_16A[5] = registerSingleMetaTileEntity(31, new NTMetaTileEntityEnergyHatch(ntId("energy_hatch.output_16a.uiv"), 11, 16, true));
        OUTPUT_ENERGY_HATCH_16A[6] = registerSingleMetaTileEntity(32, new NTMetaTileEntityEnergyHatch(ntId("energy_hatch.output_16a.uxv"), 12, 16, true));
        OUTPUT_ENERGY_HATCH_16A[7] = registerSingleMetaTileEntity(33, new NTMetaTileEntityEnergyHatch(ntId("energy_hatch.output_16a.opv"), 13, 16, true));

        //  Simple Machines range: 12601-12900
        registerSimpleMetaTileEntity(DRYER, 12601, "dryer", NTRecipeMaps.DRYER_RECIPES, NTTextures.DRYER_OVERLAY, true, NTUtils::ntId, GTUtility.hvCappedTankSizeFunction);
        NAQUADAH_REACTOR[0] = registerMetaTileEntity(12614, new SimpleGeneratorMetaTileEntity(ntId("naquadah_reactor.iv"), NTRecipeMaps.NAQUADAH_REACTOR_RECIPES, NTTextures.NAQUADAH_REACTOR_OVERLAY, 5, genericGeneratorTankSizeFunction));
        NAQUADAH_REACTOR[1] = registerMetaTileEntity(12615, new SimpleGeneratorMetaTileEntity(ntId("naquadah_reactor.luv"), NTRecipeMaps.NAQUADAH_REACTOR_RECIPES, NTTextures.NAQUADAH_REACTOR_OVERLAY, 6, genericGeneratorTankSizeFunction));
        NAQUADAH_REACTOR[2] = registerMetaTileEntity(12616, new SimpleGeneratorMetaTileEntity(ntId("naquadah_reactor.zpm"),  NTRecipeMaps.NAQUADAH_REACTOR_RECIPES, NTTextures.NAQUADAH_REACTOR_OVERLAY, 7, genericGeneratorTankSizeFunction));
        registerSimpleSteamMetaTileEntity(STEAM_VACUUM_CHAMBER, 12617, "vacuum_chamber", NTRecipeMaps.VACUUM_CHAMBER_RECIPES, SteamProgressIndicators.COMPRESS, Textures.GAS_COLLECTOR_OVERLAY, false);
        registerSimpleMetaTileEntity(VACUUM_CHAMBER, 12619, "vacuum_chamber", NTRecipeMaps.VACUUM_CHAMBER_RECIPES, Textures.GAS_COLLECTOR_OVERLAY, true, NTUtils::ntId, GTUtility.hvCappedTankSizeFunction);
        registerSimpleMetaTileEntity(COMPONENT_ASSEMBLER, 12632, "component_assembler", NTRecipeMaps.COMPONENT_ASSEMBLER_RECIPES, Textures.ASSEMBLER_OVERLAY, true, NTUtils::ntId, GTUtility.hvCappedTankSizeFunction);
        registerSimpleMetaTileEntity(DECAY_CHAMBER, 12637, "decay_chamber", NTRecipeMaps.DECAY_CHAMBER_RECIPES, Textures.CHEMICAL_BATH_OVERLAY, true, NTUtils::ntId, GTUtility.hvCappedTankSizeFunction);
        registerSimpleMetaTileEntity(CRYSTALLIZER, 12650, "crystallizer", NTRecipeMaps.CRYSTALLIZATION_RECIPES, Textures.AUTOCLAVE_OVERLAY, true, NTUtils::ntId, GTUtility.hvCappedTankSizeFunction);
        ROCKET_ENGINE[0] = registerMetaTileEntity(12663, new SimpleGeneratorMetaTileEntity(ntId("rocket_engine.ev"), NTRecipeMaps.ROCKET_ENGINE_RECIPES, NTTextures.ROCKET_ENGINE_OVERLAY, 4, genericGeneratorTankSizeFunction));
        ROCKET_ENGINE[1] = registerMetaTileEntity(12664, new SimpleGeneratorMetaTileEntity(ntId("rocket_engine.iv"), NTRecipeMaps.ROCKET_ENGINE_RECIPES, NTTextures.ROCKET_ENGINE_OVERLAY, 5, genericGeneratorTankSizeFunction));
        ROCKET_ENGINE[2] = registerMetaTileEntity(12665, new SimpleGeneratorMetaTileEntity(ntId("rocket_engine.luv"), NTRecipeMaps.ROCKET_ENGINE_RECIPES, NTTextures.ROCKET_ENGINE_OVERLAY, 6, genericGeneratorTankSizeFunction));
        registerSimpleMetaTileEntity(ULTRAVIOLET_LAMP_CHAMBER, 12666, "ultraviolet_lamp_chamber", NTRecipeMaps.ULTRAVIOLET_LAMP_CHAMBER_RECIPES, Textures.LASER_ENGRAVER_OVERLAY, true, NTUtils::ntId, GTUtility.hvCappedTankSizeFunction);

        //  Multiblocks range: 13301-14300
        SONICATOR = registerMultiMetaTileEntity(1, new NTMetaTileEntitySonicator(ntId("sonicator")));
        CVD_UNIT = registerMultiMetaTileEntity(2, new NTMetaTileEntityCVDUnit(ntId("cvd_unit")));
        NANOSCALE_FABRICATOR = registerMultiMetaTileEntity(3, new NTMetaTileEntityNanoscaleFabricator(ntId("nanoscale_fabricator")));
        CRYSTALLIZATION_CRUCIBLE = registerMultiMetaTileEntity(4, new NTMetaTileEntityCrystallizationCrucible(ntId("crystallization_crucible")));
        CATALYTIC_REFORMER = registerMultiMetaTileEntity(5, new NTMetaTileEntityCatalyticReformer(ntId("catalytic_reformer")));
        FERMENTATION_TANK= registerMultiMetaTileEntity(6, new NTMetaTileEntityFermentationTank(ntId("fermentation_tank")));
        BLAZING_BLAST_FURNACE = registerMultiMetaTileEntity(7, new NTMetaTileEntityBlazingBlastFurnace(ntId("blazing_blast_furnace")));
        CRYOGENIC_FREEZER = registerMultiMetaTileEntity(8, new NTMetaTileEntityCryogenicFreezer(ntId("cryogenic_freezer")));
        ISA_MILL = registerMultiMetaTileEntity(9, new NTMetaTileEntityIsaMill(ntId("isa_mill")));
        FLOTATION_FACTORY = registerMultiMetaTileEntity(10, new NTMetaTileEntityFlotationFactory(ntId("flotation_factory")));
        VACUUM_DRYING_FURNACE = registerMultiMetaTileEntity(11, new NTMetaTileEntityVacuumDryingFurnace(ntId("vacuum_drying_furnace")));
        BURNER_REACTOR = registerMultiMetaTileEntity(12, new NTMetaTileEntityBurnerReactor(ntId("burner_reactor")));
        CRYOGENIC_REACTOR = registerMultiMetaTileEntity(13, new NTMetaTileEntityCryogenicReactor(ntId("cryogenic_reactor")));
        MEGA_ALLOY_BLAST_SMELTER = registerMultiMetaTileEntity(14, new NTMetaTileEntityMegaAlloyBlastSmelter(ntId("mega_alloy_blast_smelter")));
        CHEMICAL_PLANT = registerMultiMetaTileEntity(15, new NTMetaTileEntityChemicalPlant(ntId("chemical_plant")));
        MEGA_OIL_CRACKING_UNIT = registerMultiMetaTileEntity(16, new NTMetaTileEntityMegaOilCrackingUnit(ntId("mega_oil_cracking_unit")));
        MEGA_CHEMICAL_REACTOR = registerMultiMetaTileEntity(17, new NTMetaTileEntityMegaChemicalReactor(ntId("mega_chemical_reactor")));
//        ALGAE_FARM = registerMultiMetaTileEntity(18, new NTMetaTileEntityAlgaeFarm(ntId("algae_farm")));
        INDUSTRIAL_FISHING_POND = registerMultiMetaTileEntity(19, new NTMetaTileEntityIndustrialFishingPond(ntId("industrial_fishing_pond")));
        ROASTER = registerMultiMetaTileEntity(20, new NTMetaTileEntityRoaster(ntId("roaster")));
        INDUSTRIAL_DRILL = registerMultiMetaTileEntity(21, new NTMetaTileEntityIndustrialDrill(ntId("industrial_drill")));
        FRACKER = registerMultiMetaTileEntity(22, new NTMetaTileEntityFracker(ntId("fracker"), GTValues.ZPM));
        GENERAL_PROCESSING_PLANT = registerMultiMetaTileEntity(23, new NTMetaTileEntityGeneralProcessingPlant(ntId("general_processing_plant")));
        INTEGRATED_ORE_FACTORY = registerMultiMetaTileEntity(24, new NTMetaTileEntityIntegratedOreFactory(ntId("integrated_ore_factory")));
        DISSOLUTION_TANK = registerMultiMetaTileEntity(25, new NTMetaTileEntityDissolutionTank(ntId("dissolution_tank")));
        DIGESTER = registerMultiMetaTileEntity(26, new NTMetaTileEntityDigester(ntId("digester")));
//        BIOLOGICAL_REACTION_CHAMBER = registerMultiMetaTileEntity(27, new NTMetaTileEntityBiologicalReactionChamber(ntId()));
//        COMPUTING_TERMINAL = registerMultiMetaTileEntity(28, new NTMetaTileEntityComputingTerminal(ntId("computing_terminal")));
//        ELECTRON_CRYOMICROSCOPY = registerMultiMetaTileEntity(29, new NTMetaTileEntityElectronCryomicroscopy(ntId()));
        COSMIC_RAY_DETECTOR = registerMultiMetaTileEntity(30, new NTMetaTileEntityCosmicRayDetector(ntId("cosmic_ray_detector")));
        ION_IMPLANTATER = registerMultiMetaTileEntity(31, new NTMetaTileEntityIonImplantater(ntId("ion_implantater")));
        PLASMA_CVD = registerMultiMetaTileEntity(32, new NTMetaTileEntityPlasmaCVDUnit(ntId("plasma_cvd_unit")));
        LASER_CVD = registerMultiMetaTileEntity(33, new NTMetaTileEntityLaserCVDUnit(ntId("laser_cvd_unit")));
        LARGE_NAQUADAH_REACTOR = registerMultiMetaTileEntity(34, new NTMetaTileEntityLargeNaquadahReactor(ntId("large_naquadah_reactor")));
//        PCB_FACTORY = registerMultiMetaTileEntity(35, new NTMetaTileEntityPCBFactory(ntId("pcb_factory")));
        FUEL_REFINE_FACTORY = registerMultiMetaTileEntity(36, new NTMetaTileEntityFuelRefineFactory(ntId("fuel_refine_factory")));
        HYPER_REACTOR_MK1 = registerMultiMetaTileEntity(37, new NTMetaTileEntityHyperReactorMk1(ntId("hyper_reactor_mk1")));
        HYPER_REACTOR_MK2 = registerMultiMetaTileEntity(38, new NTMetaTileEntityHyperReactorMk2(ntId("hyper_reactor_mk2")));
        HYPER_REACTOR_MK3 = registerMultiMetaTileEntity(39, new NTMetaTileEntityHyperReactorMk3(ntId("hyper_reactor_mk3")));
        LARGE_VACUUM_CHAMBER = registerMultiMetaTileEntity(40, new NTMetaTileEntityLargeVacuumChamber(ntId("large_vacuum_chamber")));
        MEGA_STEAM_TURBINE = registerMultiMetaTileEntity(41, new NTMetaTileEntityMegaTurbine(ntId("mega_turbine.steam"), RecipeMaps.STEAM_TURBINE_FUELS, 3, MetaBlocks.TURBINE_CASING.getState(BlockTurbineCasing.TurbineCasingType.STEEL_TURBINE_CASING), MetaBlocks.TURBINE_CASING.getState(BlockTurbineCasing.TurbineCasingType.STEEL_GEARBOX), Textures.SOLID_STEEL_CASING, false, NTTextures.MEGA_TURBINE_OVERLAY));
        MEGA_GAS_TURBINE = registerMultiMetaTileEntity(42, new NTMetaTileEntityMegaTurbine(ntId("mega_turbine.gas"), RecipeMaps.GAS_TURBINE_FUELS, 4, MetaBlocks.TURBINE_CASING.getState(BlockTurbineCasing.TurbineCasingType.STAINLESS_TURBINE_CASING), MetaBlocks.TURBINE_CASING.getState(BlockTurbineCasing.TurbineCasingType.STAINLESS_STEEL_GEARBOX), Textures.CLEAN_STAINLESS_STEEL_CASING, true, NTTextures.MEGA_TURBINE_OVERLAY));
        MEGA_PLASMA_TURBINE = registerMultiMetaTileEntity(43, new NTMetaTileEntityMegaTurbine(ntId("mega_turbine.plasma"), RecipeMaps.PLASMA_GENERATOR_FUELS, 5, MetaBlocks.TURBINE_CASING.getState(BlockTurbineCasing.TurbineCasingType.TUNGSTENSTEEL_TURBINE_CASING), MetaBlocks.TURBINE_CASING.getState(BlockTurbineCasing.TurbineCasingType.TUNGSTENSTEEL_GEARBOX), Textures.ROBUST_TUNGSTENSTEEL_CASING, false, NTTextures.MEGA_TURBINE_OVERLAY));
        PLASMA_CONDENSER = registerMultiMetaTileEntity(44, new NTMetaTileEntityPlasmaCondenser(ntId("plasma_condenser")));
        LARGE_HEAT_EXCHANGER = registerMultiMetaTileEntity(45, new NTMetaTileEntityLargeHeatExchanger(ntId("large_heat_exchanger")));
        MEGA_HEAT_EXCHANGER = registerMultiMetaTileEntity(46, new NTMetaTileEntityMegaHeatExchanger(ntId("mega_heat_exchanger")));
//        EXTREME_HEAT_EXCHANGER = registerMultiMetaTileEntity(47, new NTMetaTileEntityExtremeHeatExchanger(ntId("extreme_heat_exchanger")));
        STELLAR_FURNACE = registerMultiMetaTileEntity(48, new NTMetaTileEntityStellarFurnace(ntId("stellar_furnace")));
        HIGH_PRESSURE_STEAM_TURBINE = registerMultiMetaTileEntity(50, new NTMetaTileEntityLargeTurbine(ntId("high_pressure_steam_turbine"), NTRecipeMaps.HIGH_PRESSURE_STEAM_TURBINE_FUELS, 4, MetaBlocks.TURBINE_CASING.getState(BlockTurbineCasing.TurbineCasingType.TITANIUM_TURBINE_CASING), MetaBlocks.TURBINE_CASING.getState(BlockTurbineCasing.TurbineCasingType.TITANIUM_GEARBOX), Textures.STABLE_TITANIUM_CASING, false, Textures.LARGE_STEAM_TURBINE_OVERLAY));
        SUPERCRITICAL_STEAM_TURBINE = registerMultiMetaTileEntity(51, new NTMetaTileEntityLargeTurbine(ntId("supercritical_steam_turbine"), NTRecipeMaps.SUPERCRITICAL_STEAM_TURBINE_FUELS, 6, NTMetaBlocks.MACHINE_CASING_A.getState(NTBlockMachinelCasingA.CasingType.SUPERCRITICAL_FLUID_TURBINE_CASING), NTMetaBlocks.MACHINE_CASING_A.getState(NTBlockMachinelCasingA.CasingType.SUPERCRITICAL_FLUID_TURBINE_SHAFT_BLOCK), NTTextures.SUPERCRITICAL_FLUID_TURBINE_CASING, false, Textures.LARGE_STEAM_TURBINE_OVERLAY));
        MEGA_HIGH_PRESSURE_STEAM_TURBINE = registerMultiMetaTileEntity(52, new NTMetaTileEntityMegaTurbine(ntId("mega_high_pressure_steam_turbine"), NTRecipeMaps.HIGH_PRESSURE_STEAM_TURBINE_FUELS, 4, MetaBlocks.TURBINE_CASING.getState(BlockTurbineCasing.TurbineCasingType.TITANIUM_TURBINE_CASING), MetaBlocks.TURBINE_CASING.getState(BlockTurbineCasing.TurbineCasingType.TITANIUM_GEARBOX), Textures.STABLE_TITANIUM_CASING, false, NTTextures.MEGA_TURBINE_OVERLAY));
        MEGA_SUPERCRITICAL_STEAM_TURBINE = registerMultiMetaTileEntity(53, new NTMetaTileEntityMegaTurbine(ntId("mega_supercritical_steam_turbine"), NTRecipeMaps.SUPERCRITICAL_STEAM_TURBINE_FUELS, 6, NTMetaBlocks.MACHINE_CASING_A.getState(NTBlockMachinelCasingA.CasingType.SUPERCRITICAL_FLUID_TURBINE_CASING), NTMetaBlocks.MACHINE_CASING_A.getState(NTBlockMachinelCasingA.CasingType.SUPERCRITICAL_FLUID_TURBINE_SHAFT_BLOCK), NTTextures.SUPERCRITICAL_FLUID_TURBINE_CASING, false, NTTextures.MEGA_TURBINE_OVERLAY));
//        COMPACT_FUSION_REACTOR[0] = registerMultiMetaTileEntity(54, new NTMetaTileEntityCompressedFusionReactor(ntId("compact_fusion_reactor_mk1"), GTValues.LuV, MetaBlocks.FUSION_CASING.getState(BlockFusionCasing.CasingType.FUSION_CASING), MetaBlocks.FRAMES.get(Materials.NaquadahAlloy).getBlock(Materials.NaquadahAlloy), MetaBlocks.FUSION_CASING.getState(BlockFusionCasing.CasingType.SUPERCONDUCTOR_COIL), MetaBlocks.TRANSPARENT_CASING.getState(BlockGlassCasing.CasingType.FUSION_GLASS)));
//        COMPACT_FUSION_REACTOR[1] = registerMultiMetaTileEntity(55, new NTMetaTileEntityCompressedFusionReactor(ntId("compact_fusion_reactor_mk2"), GTValues.ZPM, MetaBlocks.FUSION_CASING.getState(BlockFusionCasing.CasingType.FUSION_CASING_MK2), MetaBlocks.FRAMES.get(Materials.Trinium).getBlock(Materials.Trinium), MetaBlocks.FUSION_CASING.getState(BlockFusionCasing.CasingType.FUSION_COIL), MetaBlocks.TRANSPARENT_CASING.getState(BlockGlassCasing.CasingType.FUSION_GLASS)));
//        COMPACT_FUSION_REACTOR[2] = registerMultiMetaTileEntity(56, new NTMetaTileEntityCompressedFusionReactor(ntId("compact_fusion_reactor_mk3"), GTValues.UV, MetaBlocks.FUSION_CASING.getState(BlockFusionCasing.CasingType.FUSION_CASING_MK3), MetaBlocks.FRAMES.get(Materials.Tritanium).getBlock(Materials.Tritanium), MetaBlocks.FUSION_CASING.getState(BlockFusionCasing.CasingType.FUSION_COIL), MetaBlocks.TRANSPARENT_CASING.getState(BlockGlassCasing.CasingType.FUSION_GLASS)));
//        COMPACT_FUSION_REACTOR[3] = registerMultiMetaTileEntity(57, new NTMetaTileEntityCompressedFusionReactor(ntId("compact_fusion_reactor_mk4"), 9, );
//        COMPACT_FUSION_REACTOR[4] = registerMultiMetaTileEntity(58, new NTMetaTileEntityCompressedFusionReactor(ntId("compact_fusion_reactor_mk5"), 10, );
        PRECISE_ASSEMBLER = registerMultiMetaTileEntity(59, new NTMetaTileEntityPreciseAssembler(ntId("precise_assembler")));
        COMPONENT_ASSEMBLY_LINE = registerMultiMetaTileEntity(60, new NTMetaTileEntityComponentAssemblyLine(ntId("component_assembly_line")));
//        LARGE_CIRCUIT_ASSEMBLY_LINE = registerMultiMetaTileEntity(61, new NTMetaTileEntityLargeCircuitAssemblyLine(ntId("large_circuit_assembly_line")));
        CYCLOTRON = registerMultiMetaTileEntity(62, new NTMetaTileEntityCompactCyclotron(ntId("compact_cyclotron")));
        DRAGON_FUSION_UNIT = registerMultiMetaTileEntity(63, new NTMetaTileEntityDragonFusionUnit(ntId("dragon_fusion_unit")));
        DANGOTE_DISTILLERY = registerMultiMetaTileEntity(64, new NTMetaTileEntityDangoteDistillery(ntId("dangote_distillery")));
        INDUSTRIAL_PRIMITIVE_BLAST_FURNACE = registerMultiMetaTileEntity(65, new NTMetaTileEntityIndustrialPrimitiveBlastFurnace(ntId("industrial_primitive_blast_furnace")));
        LARGE_STEAM_COMPRESSOR = registerMultiMetaTileEntity(66, new NTMetaTileEntityLargeSteamCompressor(ntId("large_steam_compressor")));
        QUANTUM_FORCE_TRANSFORMER = registerMultiMetaTileEntity(67, new NTMetaTileEntityQuantumForceTransformer(ntId("quantum_force_transformer")));
//        HIGH_TIRE_FUSION_REACTORS[0] = registerMultiMetaTileEntity(68, new NTMetaTileEntityHighTireFusionReactor(ntId("fusion_reactor.uhv"), GTValues.UHV, NTMetablocks.NT_BLOCK_FUSION_CASING.getState(NTBlockFusionCasing.CasingType.CASING_FUSION_MKIV), NTMetablocks.NT_ADV_GLASS_CASING.getState(NTBlockAdvGlass.AdvGlassType.FUSION_GLASS_IV), MetaBlocks.FUSION_CASING.getState(BlockFusionCasing.CasingType.SUPERCONDUCTOR_COIL)));
//        HIGH_TIRE_FUSION_REACTORS[1] = registerMultiMetaTileEntity(69, new NTMetaTileEntityHighTireFusionReactor(ntId("fusion_reactor.uev"), GTValues.UEV, NTMetablocks.NT_BLOCK_FUSION_CASING.getState(NTBlockFusionCasing.CasingType.CASING_FUSION_MKV), NTMetablocks.NT_ADV_GLASS_CASING.getState(NTBlockAdvGlass.AdvGlassType.FUSION_GLASS_V), MetaBlocks.FUSION_CASING.getState(BlockFusionCasing.CasingType.SUPERCONDUCTOR_COIL)));
//        HIGH_TIRE_FUSION_REACTORS[2] = registerMultiMetaTileEntity(70, new NTMetaTileEntityHighTireFusionReactor(ntId("fusion_reactor.uiv"), GTValues.UIV, NTMetablocks.NT_BLOCK_FUSION_CASING.getState(NTBlockFusionCasing.CasingType.CASING_FUSION_MKVI), NTMetablocks.NT_ADV_GLASS_CASING.getState(NTBlockAdvGlass.AdvGlassType.FUSION_GLASS_VI), MetaBlocks.FUSION_CASING.getState(BlockFusionCasing.CasingType.SUPERCONDUCTOR_COIL)));
    }
}
