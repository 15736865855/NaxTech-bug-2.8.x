package com.onlyex.naxtech.common.items;


import com.onlyex.naxtech.api.unification.ore.NTOrePrefix;
import com.onlyex.naxtech.proxy.CommonProxy;
import gregtech.api.items.metaitem.StandardMetaItem;
import gregtech.api.unification.material.MarkerMaterials;
import gregtech.api.unification.ore.OrePrefix;

import static com.onlyex.naxtech.common.items.NTMetaInit.*;

public class NTMetaItem1 extends StandardMetaItem {

    public NTMetaItem1() {
        this.setRegistryName("meta_item_nt");
        setCreativeTabs(CommonProxy.NAXTECH_TAB);
    }

    //下面是一个例子，第一个数据（0）是Meta Data，不能重复
    //"test"是该物品的Meta ID，例如circuit.ulv之类的
    //TEST = metaItem1.addItem(0, "test");
    //NTMetaItems. = this.addItem(,"").setMaxStackSize(64);
    public void registerSubItems(){

        //ID 0~19

        GOOWARE_PROCESSOR = this.addItem(0, "circuit.gooware_processor").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.ZPM);
        GOOWARE_ASSEMBLY = this.addItem(1, "circuit.gooware_assembly").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UV);
        GOOWARE_COMPUTER = this.addItem(2, "circuit.gooware_computer").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UHV);
        GOOWARE_MAINFRAME = this.addItem(3, "circuit.gooware_mainframe").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UEV);

        OPTICAL_PROCESSOR = this.addItem(4,"circuit.optical_processor").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UV);
        OPTICAL_ASSEMBLY = this.addItem(5,"circuit.optical_assembly").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UHV);
        OPTICAL_COMPUTER = this.addItem(6,"circuit.optical_computer").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UEV);
        OPTICAL_MAINFRAME = this.addItem(7,"circuit.optical_mainframe").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UIV);

        SPINTRONIC_PROCESSOR = this.addItem(8, "circuit.spintronic_processor").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UHV);
        SPINTRONIC_ASSEMBLY = this.addItem(9, "circuit.spintronic_assembly").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UEV);
        SPINTRONIC_COMPUTER = this.addItem(10, "circuit.spintronic_computer").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UIV);
        SPINTRONIC_MAINFRAME = this.addItem(11, "circuit.spintronic_mainframe").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UXV);

        COSMIC_PROCESSOR = this.addItem(12, "circuit.cosmic_processor").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UEV);
        COSMIC_ASSEMBLY = this.addItem(13, "circuit.cosmic_assembly").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UIV);
        COSMIC_COMPUTER = this.addItem(14, "circuit.cosmic_computer").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UXV);
        COSMIC_MAINFRAME = this.addItem(15, "circuit.cosmic_mainframe").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.OpV);

        SUPRACAUSAL_PROCESSOR = this.addItem(16, "circuit.supracausal_processor").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UIV);
        SUPRACAUSAL_ASSEMBLY = this.addItem(17, "circuit.supracausal_assembly").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UXV);
        SUPRACAUSAL_COMPUTER = this.addItem(18, "circuit.supracausal_computer").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.OpV);
        SUPRACAUSAL_MAINFRAME = this.addItem(19, "circuit.supracausal_mainframe").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.MAX);

        //ID 20~59
        EU_DOPED_CUBIC_ZIRCONIA_BOULE = this.addItem(20, "boule.cubic_zirconia.europium").setMaxStackSize(64);
        EU_DOPED_CUBIC_ZIRCONIA_WAFER = this.addItem(21, "wafer.cubic_zirconia.europium").setMaxStackSize(64);
        CRYSTAL_INTERFACE_WAFER = this.addItem(22, "wafer.crystal.interface").setMaxStackSize(64);
        CRYSTAL_INTERFACE_PLATE = this.addItem(23, "plate.crystal.interface").setMaxStackSize(64);
        ENGRAVED_RUBY_CRYSTAL_CHIP = this.addItem(24, "engraved.crystal_chip.ruby").setMaxStackSize(64);
        ENGRAVED_SAPPHIRE_CRYSTAL_CHIP = this.addItem(25, "engraved.crystal_chip.sapphire").setMaxStackSize(64);
        ENGRAVED_DIAMOND_CRYSTAL_CHIP = this.addItem(26, "engraved.crystal_chip.diamond").setMaxStackSize(64);
        CRYSTAL_MODULATOR_RUBY = this.addItem(27, "crystal.modulator.ruby").setMaxStackSize(64);
        CRYSTAL_MODULATOR_SAPPHIRE = this.addItem(28, "crystal.modulator.sapphire").setMaxStackSize(64);
        CRYSTAL_MODULATOR_DIAMOND = this.addItem(29, "crystal.modulator.diamond").setMaxStackSize(64);
        CRYSTAL_SYSTEM_ON_CHIP_SOCKET = this.addItem(30, "crystal.system_on_chip.socket").setMaxStackSize(64);
        GLASS_FIBER = this.addItem(31,"glass_fiber").setMaxStackSize(64);
        EUROPIUM_DOPED_MONOCRYSTALLINE_SILICON_BOULE = this.addItem(32,"europium_doped_monocrystalline_silicon_boule").setMaxStackSize(64);
        EUROPIUM_DOPED_WAFER = this.addItem(33,"europium_doped_wafer").setMaxStackSize(64);
        AMERICIUM_DOPED_MONOCRYSTALLINE_SILICON_BOULE = this.addItem(34,"americium_doped_monocrystalline_silicon_boule").setMaxStackSize(64);
        AMERICIUM_DOPED_WAFER = this.addItem(35,"americium_doped_wafer").setMaxStackSize(64);
        BIO_CIRCUIT_BOARD = this.addItem(36,"bio_circuit_board").setMaxStackSize(64);
        ULTRA_BIO_MUTATED_CIRCUIT_BOARD = this.addItem(37,"ultra_bio_mutated_circuit_board").setMaxStackSize(64);
        STATION_MKI = this.addItem(38,"station_1").setMaxStackSize(64);
        STATION_MKII = this.addItem(39,"station_2").setMaxStackSize(64);
        STATION_MKIII = this.addItem(40,"station_3").setMaxStackSize(64);
        STATION_MKIV = this.addItem(41,"station_4").setMaxStackSize(64);
        STATION_MKV = this.addItem(42,"station_5").setMaxStackSize(64);
        RAW_ADVANCED_CRYSTAL_CHIP = this.addItem(43,"crystal.raw_advanced_chip").setMaxStackSize(64);





        //ID 60~79
        RAW_TESSERACT = this.addItem(60,"dimension.raw_tesseract").setMaxStackSize(64);
        ENERGISED_TESSERACT = this.addItem(61,"dimension.energised_tesseract").setMaxStackSize(64);
        BLACK_BODY_NAQUADRIA_SUPERSOLID = this.addItem(62,"dimension.black_body_naquadria_supersolid").setMaxStackSize(64);
        HYPER_STABLE_SELF_HEALING_ADHESIVE = this.addItem(63,"dimension.hyper-stable_self-healing_adhesive").setMaxStackSize(64);
        SUPERCONDUCTOR_RARE_EARTH_COMPOSITE = this.addItem(64,"dimension.superconductor_rare-earth_composite").setMaxStackSize(64);
        TIMEPIECE = this.addItem(65,"timepiece").setMaxStackSize(64);
        QUANTUM_ANOMALY = this.addItem(66,"dimension.quantum_anomaly").setMaxStackSize(64);


        //ID 80~99

        //ID 100~119
        BIOCELLS = this.addItem(125,"gooware.biocells").setMaxStackSize(64);
        LIVING_BIO_WAFER = this.addItem(126,"gooware.living_bio_wafer").setMaxStackSize(64);
        LIVING_BIO_CHIP = this.addItem(127,"gooware.living_bio_chip").setMaxStackSize(64);

        NUCLEAR_STAR = this.addItem(128,"nuclear_star").setMaxStackSize(64);
        LIVING_CRYSTAL_CHIP = this.addItem(129,"living_crystal_chip").setMaxStackSize(64);


        //140~
        OPTICALLY_ENRICHED_CRYSTALLINE_BOULE = this.addItem(140,"optical.optically_enriched_crystalline_boule").setMaxStackSize(64);
        PHOTONICALLY_PREPARED_WAFER = this.addItem(141,"optical.photonically_prepared_wafer").setMaxStackSize(64);
        PHOTONICALLY_ENHANCED_WAFER = this.addItem(142,"optical.photonically_enhanced_wafer").setMaxStackSize(64);
        RAW_EXPOSED_OPTICAL_CHIP = this.addItem(143,"optical.raw_exposed_optical_chip").setMaxStackSize(64);
        OPTICALLY_COMPATIBLE_MEMORY = this.addItem(144,"optical.optically_compatible_memory").setMaxStackSize(64);
        OPTICALLY_PERFECTED_CPU = this.addItem(145,"optical.optically_perfected_cpu").setMaxStackSize(64);
        OPTICAL_CPU_CONTAINMENT_HOUSING = this.addItem(146,"optical.optical_cpu_containment_housing").setMaxStackSize(64);
        OPTICAL_CIRCUIT_BOARD = this.addItem(147,"optical.optical_circuit_board").setMaxStackSize(64);
        OPTICAL_CAPACITOR = this.addItem(148, "optical.optical_smd.capacitor").setMaxStackSize(64);
        OPTICAL_DIODE = this.addItem(149, "optical.optical_smd.diode").setMaxStackSize(64);
        OPTICAL_RESISTOR = this.addItem(150, "optical.optical_smd.resistor").setMaxStackSize(64);
        OPTICAL_TRANSISTOR = this.addItem(151, "optical.optical_smd.transistor").setMaxStackSize(64);
        OPTICAL_INDUCTOR = this.addItem(152,"optical.optical_smd.inductor").setMaxStackSize(64);



        //ID 180~199
        BZ_REACTION_CHAMBER = this.addItem(180, "reaction_chamber.bz");
        NONLINEAR_CHEMICAL_OSCILLATOR = this.addItem(181, "nonlinear_chemical_oscillator");

        //ID 200~219
        PHASE_CHANGE_MEMORY = this.addItem(200, "plate.phase_change_memory");
        OPTICAL_FIBER = this.addItem(201, "optical_fiber");
        DIELECTRIC_MIRROR = this.addItem(202, "dielectric_mirror");
        EMPTY_LASER_ASSEMBLY = this.addItem(203, "laser.assembly.empty");
        HELIUM_NEON_LASER = this.addItem(204, "laser.helium_neon");
        ND_YAG_LASER = this.addItem(205, "laser.nd_yag");
        OPTICAL_LASER_CONTROL_UNIT = this.addItem(206, "optical_laser_control_unit");

        //ID 220~239
        SPIN_TRANSFER_TORQUE_MEMORY = this.addItem(220, "plate.spin_transfer_torque_memory");
        TOPOLOGICAL_INSULATOR_TUBE = this.addItem(221, "tube.topological_insulator");
        BOSE_EINSTEIN_CONDENSATE_CONTAINMENT_UNIT = this.addItem(222, "containment_unit.bose_einstein_condensate");
        BOSE_EINSTEIN_CONDENSATE = this.addItem(223, "bose_einstein_condensate");
        ESR_COMPUTATION_UNIT = this.addItem(224, "esr_computation_unit");

        //ID 240~X
        EIGENFOLDED_KERR_MANIFOLD = this.addItem(240, "eigenfolded.kerr.manifold");
        HYPERDIMENSIONAL_DRONE = this.addItem(241, "hyperdimensional.drone");

        NANO_POWER_IC_WAFER = this.addItem(356, "wafer.nano_power_integrated_circuit");
        PICO_POWER_IC_WAFER = this.addItem(357, "wafer.pico_power_integrated_circuit");
        FEMTO_POWER_IC_WAFER = this.addItem(358, "wafer.femto_power_integrated_circuit");

        NANO_POWER_IC = this.addItem(368, "plate.nano_power_integrated_circuit");
        PICO_POWER_IC = this.addItem(369, "plate.pico_power_integrated_circuit");
        FEMTO_POWER_IC = this.addItem(370, "plate.femto_power_integrated_circuit");

        BIO_PROCESSING_UNIT = this.addItem(400,"item.bio_processing_unit").setMaxStackSize(64);
        ADVANCED_PROCESSOR_BOARD = this.addItem(401,"item.advanced_processor_board").setMaxStackSize(64);
        ADVANCED_BOARD = this.addItem(402,"item.advanced_board").setMaxStackSize(64);
        QUANTUM_PROCESSOR_BOARD = this.addItem(403,"item.quantum_processor_board").setMaxStackSize(64);
        QUANTUM_BOARD = this.addItem(404,"item.quantum_board").setMaxStackSize(64);
        NANO_PROCESSOR_BOARD = this.addItem(405,"item.nano_processor_board").setMaxStackSize(64);
        NANO_BOARD = this.addItem(406,"item.nano_board").setMaxStackSize(64);

        SPINTRONIC_CAPACITOR = this.addItem(425, "component.spintronic_smd.capacitor");
        SPINTRONIC_DIODE = this.addItem(426, "component.spintronic_smd.diode");
        SPINTRONIC_RESISTOR = this.addItem(427, "component.spintronic_smd.resistor");
        SPINTRONIC_TRANSISTOR = this.addItem(428, "component.spintronic_smd.transistor");
        SPINTRONIC_INDUCTOR = this.addItem(429, "component.spintronic_smd.inductor");

        //400


        //1200
        WRAP_CIRCUIT_ULV = this.addItem(1200, "wrapcircuit.ulv").setUnificationData(NTOrePrefix.wrapCircuit, MarkerMaterials.Tier.ULV);
        WRAP_CIRCUIT_LV = this.addItem(1201, "wrapcircuit.lv").setUnificationData(NTOrePrefix.wrapCircuit, MarkerMaterials.Tier.LV);
        WRAP_CIRCUIT_MV = this.addItem(1202, "wrapcircuit.mv").setUnificationData(NTOrePrefix.wrapCircuit, MarkerMaterials.Tier.MV);
        WRAP_CIRCUIT_HV = this.addItem(1203, "wrapcircuit.hv").setUnificationData(NTOrePrefix.wrapCircuit, MarkerMaterials.Tier.HV);
        WRAP_CIRCUIT_EV = this.addItem(1204, "wrapcircuit.ev").setUnificationData(NTOrePrefix.wrapCircuit, MarkerMaterials.Tier.EV);
        WRAP_CIRCUIT_IV = this.addItem(1205, "wrapcircuit.iv").setUnificationData(NTOrePrefix.wrapCircuit, MarkerMaterials.Tier.IV);
        WRAP_CIRCUIT_LUV = this.addItem(1206, "wrapcircuit.luv").setUnificationData(NTOrePrefix.wrapCircuit, MarkerMaterials.Tier.LuV);
        WRAP_CIRCUIT_ZPM = this.addItem(1207, "wrapcircuit.zpm").setUnificationData(NTOrePrefix.wrapCircuit, MarkerMaterials.Tier.ZPM);
        WRAP_CIRCUIT_UV = this.addItem(1208, "wrapcircuit.uv").setUnificationData(NTOrePrefix.wrapCircuit, MarkerMaterials.Tier.UV);
        WRAP_CIRCUIT_UHV = this.addItem(1209, "wrapcircuit.uhv").setUnificationData(NTOrePrefix.wrapCircuit, MarkerMaterials.Tier.UHV);
        WRAP_CIRCUIT_UEV = this.addItem(1210, "wrapcircuit.uev").setUnificationData(NTOrePrefix.wrapCircuit, MarkerMaterials.Tier.UEV);
        WRAP_CIRCUIT_UIV = this.addItem(1211, "wrapcircuit.uiv").setUnificationData(NTOrePrefix.wrapCircuit, MarkerMaterials.Tier.UIV);
        WRAP_CIRCUIT_UXV = this.addItem(1212, "wrapcircuit.uxv").setUnificationData(NTOrePrefix.wrapCircuit, MarkerMaterials.Tier.UXV);
        WRAP_CIRCUIT_OPV = this.addItem(1213, "wrapcircuit.opv").setUnificationData(NTOrePrefix.wrapCircuit, MarkerMaterials.Tier.OpV);
        WRAP_CIRCUIT_MAX = this.addItem(1214, "wrapcircuit.nax").setUnificationData(NTOrePrefix.wrapCircuit, MarkerMaterials.Tier.MAX);

        WRAP_COATED_BOARD = this.addItem(1215, "wrap.coated_board").setMaxStackSize(64);
        WRAP_PHENOLIC_BOARD = this.addItem(1216, "wrap.phenolic_board").setMaxStackSize(64);
        WRAP_PLASTIC_BOARD = this.addItem(1217, "wrap.plastic_board").setMaxStackSize(64);
        WRAP_EPOXY_BOARD = this.addItem(1218, "wrap.epoxy_board").setMaxStackSize(64);
        WRAP_FIBER_BOARD = this.addItem(1219, "wrap.fiber_board").setMaxStackSize(64);
        WRAP_MULTILAYER_FIBER_BOARD = this.addItem(1220, "wrap.multilayer_fiber_board").setMaxStackSize(64);
        WRAP_WETWARE_BOARD = this.addItem(1221, "wrap.wetware_board").setMaxStackSize(64);


        WRAP_BASIC_CIRCUIT_BOARD = this.addItem(1222, "wrap.basic_circuit_board").setMaxStackSize(64);
        WRAP_GOOD_CIRCUIT_BOARD = this.addItem(1223, "wrap.good_circuit_board").setMaxStackSize(64);
        WRAP_PLASTIC_CIRCUIT_BOARD = this.addItem(1224, "wrap.plastic_circuit_board").setMaxStackSize(64);
        WRAP_ADVANCED_CIRCUIT_BOARD = this.addItem(1225, "wrap.advanced_circuit_board").setMaxStackSize(64);
        WRAP_EXTREME_CIRCUIT_BOARD = this.addItem(1226, "wrap.extreme_circuit_board").setMaxStackSize(64);
        WRAP_ELITE_CIRCUIT_BOARD = this.addItem(1227, "wrap.elite_circuit_board").setMaxStackSize(64);
        WRAP_WETWARE_CIRCUIT_BOARD = this.addItem(1228, "wrap.wetware_circuit_board").setMaxStackSize(64);

        WRAP_SMD_CAPACITOR = this.addItem(1229, "wrap.smd_capacitor").setMaxStackSize(64);
        WRAP_SMD_DIODE = this.addItem(1230, "wrap.smd_diode").setMaxStackSize(64);
        WRAP_SMD_RESISTOR = this.addItem(1231, "wrap.smd_resistor").setMaxStackSize(64);
        WRAP_SMD_TRANSISTOR = this.addItem(1232, "wrap.smd_transistor").setMaxStackSize(64);
        WRAP_SMD_INDUCTOR = this.addItem(1233, "wrap.smd_inductor").setMaxStackSize(64);
        WRAP_ADVANCED_SMD_CAPACITOR = this.addItem(1234, "wrap.advanced_smd_capacitor").setMaxStackSize(64);
        WRAP_ADVANCED_SMD_DIODE = this.addItem(1235, "wrap.advanced_smd_diode").setMaxStackSize(64);
        WRAP_ADVANCED_SMD_RESISTOR = this.addItem(1236, "wrap.advanced_smd_resistor").setMaxStackSize(64);
        WRAP_ADVANCED_SMD_TRANSISTOR = this.addItem(1237, "wrap.advanced_smd_transistor").setMaxStackSize(64);
        WRAP_ADVANCED_SMD_INDUCTOR = this.addItem(1238, "wrap.advanced_smd_inductor").setMaxStackSize(64);

        WRAP_NEURO_PROCESSOR = this.addItem(1239, "wrap.neuro_processor").setMaxStackSize(64);
        WRAP_STEM_CELLS = this.addItem(1240, "wrap.stem_cells").setMaxStackSize(64);
        WRAP_ENGRAVED_LAPOTRON_CHIP = this.addItem(1241, "wrap.engraved_lapotron_chip").setMaxStackSize(64);
        WRAP_ENGRAVED_CRYSTAL_CHIP = this.addItem(1242, "wrap.engraved_crystal_chip").setMaxStackSize(64);
        WRAP_CRYSTAL_CENTRAL_PROCESSING_UNIT = this.addItem(1243, "wrap.crystal_central_processing_unit").setMaxStackSize(64);

        WRAP_CENTRAL_PROCESSING_UNIT = this.addItem(1244, "wrap.central_processing_unit").setMaxStackSize(64);
        WRAP_RANDOM_ACCESS_MEMORY = this.addItem(1245, "wrap.random_access_memory").setMaxStackSize(64);
        WRAP_INTEGRATED_LOGIC_CIRCUIT = this.addItem(1246, "wrap.integrated_logic_circuit").setMaxStackSize(64);
        WRAP_NANO_CENTRAL_PROCESSING_UNIT = this.addItem(1247, "wrap.nano_central_processing_unit").setMaxStackSize(64);
        WRAP_QUBIT_CENTRAL_PROCESSING_UNIT = this.addItem(1248, "wrap.qubit_central_processing_unit").setMaxStackSize(64);
        WRAP_SIMPLE_SYSTEM_ON_CHIP = this.addItem(1249, "wrap.simple_system_on_chip").setMaxStackSize(64);
        WRAP_SYSTEM_ON_CHIP = this.addItem(1250, "wrap.system_on_chip").setMaxStackSize(64);
        WRAP_ADVANCED_SYSTEM_ON_CHIP = this.addItem(1251, "wrap.advanced_system_on_chip").setMaxStackSize(64);
        WRAP_HIGHLY_ADVANCED_SOC = this.addItem(1252, "wrap.highly_advanced_system_on_chip").setMaxStackSize(64);
        WRAP_NAND_MEMORY_CHIP = this.addItem(1253, "wrap.nand_memory_chip").setMaxStackSize(64);
        WRAP_NOR_MEMORY_CHIP = this.addItem(1254, "wrap.nor_memory_chip").setMaxStackSize(64);
        WRAP_ULTRA_LOW_POWER_INTEGRATED_CIRCUIT = this.addItem(1255, "wrap.ultra_low_power_integrated_circuit").setMaxStackSize(64);
        WRAP_LOW_POWER_INTEGRATED_CIRCUIT = this.addItem(1256, "wrap.low_power_integrated_circuit").setMaxStackSize(64);
        WRAP_POWER_INTEGRATED_CIRCUIT = this.addItem(1257, "wrap.power_integrated_circuit").setMaxStackSize(64);
        WRAP_HIGH_POWER_INTEGRATED_CIRCUIT = this.addItem(1258, "wrap.high_power_integrated_circuit").setMaxStackSize(64);
        WRAP_ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT = this.addItem(1259, "wrap.ultra_high_power_integrated_circuit").setMaxStackSize(64);

        WRAP_NANO_POWER_IC = this.addItem(1260, "wrap.nano_power_integrated_circuit").setMaxStackSize(64);
        WRAP_PICO_POWER_IC = this.addItem(1261, "wrap.pico_power_integrated_circuit").setMaxStackSize(64);
        WRAP_FEMTO_POWER_IC = this.addItem(1262, "wrap.femto_power_integrated_circuit").setMaxStackSize(64);

        WRAP_RAW_EXPOSED_OPTICAL_CHIP = this.addItem(1263, "wrap.optically_compatible_memory").setMaxStackSize(64);
        WRAP_OPTICALLY_COMPATIBLE_MEMORY = this.addItem(1264, "wrap.optically_perfected_cpu").setMaxStackSize(64);
        WRAP_OPTICALLY_PERFECTED_CPU = this.addItem(1265, "wrap.raw_exposed_optical_chip").setMaxStackSize(64);
        WRAP_OPTICAL_CPU_CONTAINMENT_HOUSING = this.addItem(1266, "wrap.optical_cpu_containment_housing").setMaxStackSize(64);
        WRAP_OPTICAL_CIRCUIT_BOARD = this.addItem(1267, "wrap.optical_circuit_board").setMaxStackSize(64);
        WRAP_OPTICAL_CAPACITOR = this.addItem(1268, "wrap.optical_smd.capacitor").setMaxStackSize(64);
        WRAP_OPTICAL_DIODE = this.addItem(1269, "wrap.optical_smd.diode").setMaxStackSize(64);
        WRAP_OPTICAL_RESISTOR = this.addItem(1270, "wrap.optical_smd.inductor").setMaxStackSize(64);
        WRAP_OPTICAL_TRANSISTOR = this.addItem(1271, "wrap.optical_smd.resistor").setMaxStackSize(64);
        WRAP_OPTICAL_INDUCTOR = this.addItem(1272, "wrap.optical_smd.transistor").setMaxStackSize(64);

        WRAP_LIVING_CRYSTAL_CHIP = this.addItem(1273, "wrap.living_crystal_chip").setMaxStackSize(64);
        WRAP_LIVING_BIO_CHIP = this.addItem(1274, "wrap.gooware.living_bio_chip").setMaxStackSize(64);
        WRAP_BIOCELLS = this.addItem(1275, "wrap.gooware.biocells").setMaxStackSize(64);
        WRAP_BIO_CIRCUIT_BOARD = this.addItem(1276, "wrap.bio_circuit_board").setMaxStackSize(64);
        WRAP_ULTRA_BIO_MUTATED_CIRCUIT_BOARD = this.addItem(1277, "wrap.ultra_bio_mutated_circuit_board").setMaxStackSize(64);
        WRAP_CRYSTAL_SYSTEM_ON_CHIP = this.addItem(1278, "wrap.crystal_system_on_chip").setMaxStackSize(64);
        WRAP_RAW_ADVANCED_CRYSTAL_CHIP = this.addItem(1279, "wrap.raw_advanced_crystal_chip").setMaxStackSize(64);

        WRAP_SPINTRONIC_CAPACITOR = this.addItem(1280, "wrap.spintronic_smd.capacitor").setMaxStackSize(64);
        WRAP_SPINTRONIC_DIODE = this.addItem(1281, "wrap.spintronic_smd.diode").setMaxStackSize(64);
        WRAP_SPINTRONIC_RESISTOR = this.addItem(1282, "wrap.spintronic_smd.resistor").setMaxStackSize(64);
        WRAP_SPINTRONIC_TRANSISTOR = this.addItem(1283, "wrap.spintronic_smd.transistor").setMaxStackSize(64);
        WRAP_SPINTRONIC_INDUCTOR = this.addItem(1284, "wrap.spintronic_smd.inductor").setMaxStackSize(64);






        //WRAP_ = this.addItem(12, "wrap.").setMaxStackSize(64);
    }
}
