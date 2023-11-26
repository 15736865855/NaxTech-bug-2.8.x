package com.onlyex.naxtech.common.items;


import com.onlyex.naxtech.api.unification.ore.NTOrePrefix;
import com.onlyex.naxtech.common.CommonProxy;
import com.onlyex.naxtech.common.items.behaviors.MillBallBehavior;
import gregtech.api.items.metaitem.StandardMetaItem;
import gregtech.api.unification.material.MarkerMaterials;
import gregtech.api.unification.ore.OrePrefix;

import static com.onlyex.naxtech.common.items.NTMetaItems.*;

public class NTMetaItem1 extends StandardMetaItem {

    public NTMetaItem1() {
        this.setRegistryName("meta_item_nt");
        setCreativeTabs(CommonProxy.NAXTECH_TAB);
    }

    //NTMetaItems. = this.addItem(,"");
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
        EU_DOPED_CUBIC_ZIRCONIA_BOULE = this.addItem(20, "boule.cubic_zirconia.europium");
        EU_DOPED_CUBIC_ZIRCONIA_WAFER = this.addItem(21, "wafer.cubic_zirconia.europium");
        CRYSTAL_INTERFACE_WAFER = this.addItem(22, "wafer.crystal.interface");
        CRYSTAL_INTERFACE_PLATE = this.addItem(23, "plate.crystal.interface");
        ENGRAVED_RUBY_CRYSTAL_CHIP = this.addItem(24, "engraved.crystal_chip.ruby");
        ENGRAVED_SAPPHIRE_CRYSTAL_CHIP = this.addItem(25, "engraved.crystal_chip.sapphire");
        ENGRAVED_DIAMOND_CRYSTAL_CHIP = this.addItem(26, "engraved.crystal_chip.diamond");
        CRYSTAL_MODULATOR_RUBY = this.addItem(27, "crystal.modulator.ruby");
        CRYSTAL_MODULATOR_SAPPHIRE = this.addItem(28, "crystal.modulator.sapphire");
        CRYSTAL_MODULATOR_DIAMOND = this.addItem(29, "crystal.modulator.diamond");
        CRYSTAL_SYSTEM_ON_CHIP_SOCKET = this.addItem(30, "crystal.system_on_chip.socket");
        GLASS_FIBER = this.addItem(31,"glass_fiber");
        EUROPIUM_DOPED_MONOCRYSTALLINE_SILICON_BOULE = this.addItem(32,"europium_doped_monocrystalline_silicon_boule");
        EUROPIUM_DOPED_WAFER = this.addItem(33,"europium_doped_wafer");
        AMERICIUM_DOPED_MONOCRYSTALLINE_SILICON_BOULE = this.addItem(34,"americium_doped_monocrystalline_silicon_boule");
        AMERICIUM_DOPED_WAFER = this.addItem(35,"americium_doped_wafer");
        STATION_MKI = this.addItem(36,"station_1");
        STATION_MKII = this.addItem(37,"station_2");
        STATION_MKIII = this.addItem(38,"station_3");
        STATION_MKIV = this.addItem(39,"station_4");
        STATION_MKV = this.addItem(40,"station_5");
        RAW_ADVANCED_CRYSTAL_CHIP = this.addItem(41,"crystal.raw_advanced_chip");
        GRINDBALL_SOAPSTONE = this.addItem(42, "mill.grindball_soapstone").setMaxStackSize(1).addComponents(new MillBallBehavior());
        GRINDBALL_ALUMINIUM = this.addItem(43, "mill.grindball_aluminium").setMaxStackSize(1).addComponents(new MillBallBehavior());






        //ID 60~
        RAW_TESSERACT = this.addItem(60,"dimension.raw_tesseract");
        ENERGISED_TESSERACT = this.addItem(61,"dimension.energised_tesseract");
        BLACK_BODY_NAQUADRIA_SUPERSOLID = this.addItem(62,"dimension.black_body_naquadria_supersolid");
        HYPER_STABLE_SELF_HEALING_ADHESIVE = this.addItem(63,"dimension.hyper-stable_self-healing_adhesive");
        SUPERCONDUCTOR_RARE_EARTH_COMPOSITE = this.addItem(64,"dimension.superconductor_rare-earth_composite");
        TIMEPIECE = this.addItem(65,"timepiece");
        QUANTUM_ANOMALY = this.addItem(66,"dimension.quantum_anomaly");



        //ID 100~
        ELECTRIC_MOTOR_MAX = this.addItem(100, "cover.electric_motor.max");
        ELECTRIC_PISTON_MAX = this.addItem(101, "cover.electric_piston.max");
        ELECTRIC_PUMP_MAX = this.addItem(102, "cover.electric_pump.max");
        CONVEYOR_MODULE_MAX = this.addItem(103, "cover.conveyor_module.max");
        ROBOT_ARM_MAX = this.addItem(104, "cover.robot_arm.max");
        EMITTER_MAX = this.addItem(105, "cover.emitter.max");
        SENSOR_MAX = this.addItem(106, "cover.sensor.max");
        FIELD_GENERATOR_MAX = this.addItem(107, "cover.field_generator.max");

        ELECTRIC_MOTOR_MAXX = this.addItem(108, "cover.electric_motor.maxx");
        ELECTRIC_PISTON_MAXX = this.addItem(109, "cover.electric_piston.maxx");
        ELECTRIC_PUMP_MAXX = this.addItem(110, "cover.electric_pump.maxx");
        CONVEYOR_MODULE_MAXX = this.addItem(111, "cover.conveyor_module.maxx");
        ROBOT_ARM_MAXX = this.addItem(112, "cover.robot_arm.maxx");
        EMITTER_MAXX = this.addItem(113, "cover.emitter.maxx");
        SENSOR_MAXX = this.addItem(114, "cover.sensor.maxx");
        FIELD_GENERATOR_MAXX = this.addItem(115, "cover.field_generator.maxx");

        SENSOR_EX = this.addItem(116, "cover.sensor.ex");
        FIELD_GENERATOR_EX = this.addItem(117, "cover.field_generator.ex");
        ELECTRIC_MOTOR_EX = this.addItem(118, "cover.electric_motor.ex");
        ELECTRIC_PISTON_EX = this.addItem(119, "cover.electric_piston.ex");
        ELECTRIC_PUMP_EX = this.addItem(120, "cover.electric_pump.ex");
        CONVEYOR_MODULE_EX = this.addItem(121, "cover.conveyor_module.ex");
        ROBOT_ARM_EX = this.addItem(122, "cover.robot_arm.ex");
        EMITTER_EX = this.addItem(123, "cover.emitter.ex");

        BIOCELLS = this.addItem(124,"gooware.biocells");
        LIVING_BIO_WAFER = this.addItem(125,"gooware.living_bio_wafer");
        LIVING_BIO_CHIP = this.addItem(126,"gooware.living_bio_chip");

        NUCLEAR_STAR = this.addItem(127,"nuclear_star");
        LIVING_CRYSTAL_CHIP = this.addItem(128,"living_crystal_chip");
        PROTONATED_FULLERENE_SIEVING_MATRIX = this.addItem(129, "protonated_fullerene_sieving_matrix");
        SATURATED_FULLERENE_SIEVING_MATRIX = this.addItem( 130, "saturated_fullerene_sieving_matrix");

        UNSTABLE_STAR = this.addItem(131, "unstable_star");


        //140~
        OPTICALLY_ENRICHED_CRYSTALLINE_BOULE = this.addItem(140,"optical.optically_enriched_crystalline_boule");
        PHOTONICALLY_PREPARED_WAFER = this.addItem(141,"optical.photonically_prepared_wafer");
        PHOTONICALLY_ENHANCED_WAFER = this.addItem(142,"optical.photonically_enhanced_wafer");
        RAW_EXPOSED_OPTICAL_CHIP = this.addItem(143,"optical.raw_exposed_optical_chip");
        OPTICALLY_COMPATIBLE_MEMORY = this.addItem(144,"optical.optically_compatible_memory");
        OPTICALLY_PERFECTED_CPU = this.addItem(145,"optical.optically_perfected_cpu");
        OPTICAL_CPU_CONTAINMENT_HOUSING = this.addItem(146,"optical.optical_cpu_containment_housing");
        OPTICAL_CIRCUIT_BOARD = this.addItem(147,"optical.optical_circuit_board");

        OPTICAL_CAPACITOR = this.addItem(148, "component.optical_smd.capacitor");
        OPTICAL_DIODE = this.addItem(149, "component.optical_smd.diode");
        OPTICAL_RESISTOR = this.addItem(150, "component.optical_smd.resistor");
        OPTICAL_TRANSISTOR = this.addItem(151, "component.optical_smd.transistor");
        OPTICAL_INDUCTOR = this.addItem(152,"component.optical_smd.inductor");



        //ID 180~199
        BZ_REACTION_CHAMBER = this.addItem(180, "reaction_chamber.bz");
        NONLINEAR_CHEMICAL_OSCILLATOR = this.addItem(181, "nonlinear_chemical_oscillator");

        //ID 200~
        OPTICAL_FIBER = this.addItem(200, "optical_fiber");
        DIELECTRIC_MIRROR = this.addItem(201, "dielectric_mirror");
        EMPTY_LASER_ASSEMBLY = this.addItem(202, "laser.assembly.empty");
        HELIUM_NEON_LASER = this.addItem(203, "laser.helium_neon");
        ND_YAG_LASER = this.addItem(204, "laser.nd_yag");
        OPTICAL_LASER_CONTROL_UNIT = this.addItem(205, "optical_laser_control_unit");

        TOPOLOGICAL_INSULATOR_TUBE = this.addItem(206, "tube.topological_insulator");
        BOSE_EINSTEIN_CONDENSATE_CONTAINMENT_UNIT = this.addItem(207, "containment_unit.bose_einstein_condensate");
        BOSE_EINSTEIN_CONDENSATE = this.addItem(208, "bose_einstein_condensate");
        ESR_COMPUTATION_UNIT = this.addItem(209, "esr_computation_unit");
        EIGENFOLDED_KERR_MANIFOLD = this.addItem(210, "eigenfolded.kerr.manifold");
        HYPERDIMENSIONAL_DRONE = this.addItem(211, "hyperdimensional.drone");


        //300~
        GOOWARE_BOARD = this.addItem(300, "board.gooware");
        OPTICAL_BOARD = this.addItem(301, "board.optical");
        SPINTRONIC_BOARD = this.addItem(302, "board.spintronic");
        GOOWARE_CIRCUIT = this.addItem(303, "circuit_board.gooware");
        OPTICAL_CIRCUIT = this.addItem(304, "circuit_board.optical");
        SPINTRONIC_CIRCUIT = this.addItem(305, "circuit_board.spintronic");

        //400~
        BIO_PROCESSING_UNIT = this.addItem(400,"item.bio_processing_unit");
        ADVANCED_PROCESSOR_BOARD = this.addItem(401,"item.advanced_processor_board");
        ADVANCED_BOARD = this.addItem(402,"item.advanced_board");
        QUANTUM_PROCESSOR_BOARD = this.addItem(403,"item.quantum_processor_board");
        QUANTUM_BOARD = this.addItem(404,"item.quantum_board");
        NANO_PROCESSOR_BOARD = this.addItem(405,"item.nano_processor_board");
        NANO_BOARD = this.addItem(406,"item.nano_board");

        SPINTRONIC_CAPACITOR = this.addItem(425, "component.spintronic_smd.capacitor");
        SPINTRONIC_DIODE = this.addItem(426, "component.spintronic_smd.diode");
        SPINTRONIC_RESISTOR = this.addItem(427, "component.spintronic_smd.resistor");
        SPINTRONIC_TRANSISTOR = this.addItem(428, "component.spintronic_smd.transistor");
        SPINTRONIC_INDUCTOR = this.addItem(429, "component.spintronic_smd.inductor");

        COSMIC_TRANSISTOR = this.addItem(430, "component.cosmic_smd.transistor");
        COSMIC_RESISTOR = this.addItem(431, "component.cosmic_smd.resistor");
        COSMIC_CAPACITOR = this.addItem(432, "component.cosmic_smd.capacitor");
        COSMIC_DIODE = this.addItem(433, "component.cosmic_smd.diode");
        COSMIC_INDUCTOR = this.addItem(434, "component.cosmic_smd.inductor");

        SUPRACAUSAL_TRANSISTOR = this.addItem(435, "component.supracausal_smd.transistor");
        SUPRACAUSAL_RESISTOR = this.addItem(436, "component.supracausal_smd.resistor");
        SUPRACAUSAL_CAPACITOR = this.addItem(437, "component.supracausal_smd.capacitor");
        SUPRACAUSAL_DIODE = this.addItem(438, "component.supracausal_smd.diode");
        SUPRACAUSAL_INDUCTOR = this.addItem(439, "component.supracausal_smd.inductor");

        //500~
        //  Cosmic Components
        COSMIC_INFORMATION_MODULE = this.addItem(500, "component.cosmic.information_module");
        HOLOGRAPHIC_INFORMATION_IMC = this.addItem(501, "component.cosmic.holographic_imc");

        //  Supracausal Components
        SPACETIME_CONDENSER = this.addItem(502, "component.supracausal.spacetime_condenser");
        LIGHT_CONE_MODULE = this.addItem(503, "component.supracausal.light_cone_module");


        //1200~
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

        WRAP_COATED_BOARD = this.addItem(1215, "wrap.coated_board").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_PHENOLIC_BOARD = this.addItem(1216, "wrap.phenolic_board").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_PLASTIC_BOARD = this.addItem(1217, "wrap.plastic_board").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_EPOXY_BOARD = this.addItem(1218, "wrap.epoxy_board").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_FIBER_BOARD = this.addItem(1219, "wrap.fiber_board").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_MULTILAYER_FIBER_BOARD = this.addItem(1220, "wrap.multilayer_fiber_board").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_WETWARE_BOARD = this.addItem(1221, "wrap.wetware_board").setUnificationData(NTOrePrefix.wrap, null);


        WRAP_BASIC_CIRCUIT_BOARD = this.addItem(1222, "wrap.basic_circuit_board").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_GOOD_CIRCUIT_BOARD = this.addItem(1223, "wrap.good_circuit_board").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_PLASTIC_CIRCUIT_BOARD = this.addItem(1224, "wrap.plastic_circuit_board").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_ADVANCED_CIRCUIT_BOARD = this.addItem(1225, "wrap.advanced_circuit_board").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_EXTREME_CIRCUIT_BOARD = this.addItem(1226, "wrap.extreme_circuit_board").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_ELITE_CIRCUIT_BOARD = this.addItem(1227, "wrap.elite_circuit_board").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_WETWARE_CIRCUIT_BOARD = this.addItem(1228, "wrap.wetware_circuit_board").setUnificationData(NTOrePrefix.wrap, null);

        WRAP_SMD_CAPACITOR = this.addItem(1229, "wrap.smd_capacitor").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_SMD_DIODE = this.addItem(1230, "wrap.smd_diode").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_SMD_RESISTOR = this.addItem(1231, "wrap.smd_resistor").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_SMD_TRANSISTOR = this.addItem(1232, "wrap.smd_transistor").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_SMD_INDUCTOR = this.addItem(1233, "wrap.smd_inductor").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_ADVANCED_SMD_CAPACITOR = this.addItem(1234, "wrap.advanced_smd_capacitor").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_ADVANCED_SMD_DIODE = this.addItem(1235, "wrap.advanced_smd_diode").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_ADVANCED_SMD_RESISTOR = this.addItem(1236, "wrap.advanced_smd_resistor").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_ADVANCED_SMD_TRANSISTOR = this.addItem(1237, "wrap.advanced_smd_transistor").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_ADVANCED_SMD_INDUCTOR = this.addItem(1238, "wrap.advanced_smd_inductor").setUnificationData(NTOrePrefix.wrap, null);

        WRAP_NEURO_PROCESSOR = this.addItem(1239, "wrap.neuro_processor").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_STEM_CELLS = this.addItem(1240, "wrap.stem_cells").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_ENGRAVED_LAPOTRON_CHIP = this.addItem(1241, "wrap.engraved_lapotron_chip").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_ENGRAVED_CRYSTAL_CHIP = this.addItem(1242, "wrap.engraved_crystal_chip").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_CRYSTAL_CENTRAL_PROCESSING_UNIT = this.addItem(1243, "wrap.crystal_central_processing_unit").setUnificationData(NTOrePrefix.wrap, null);

        WRAP_CENTRAL_PROCESSING_UNIT = this.addItem(1244, "wrap.central_processing_unit").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_RANDOM_ACCESS_MEMORY = this.addItem(1245, "wrap.random_access_memory").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_INTEGRATED_LOGIC_CIRCUIT = this.addItem(1246, "wrap.integrated_logic_circuit").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_NANO_CENTRAL_PROCESSING_UNIT = this.addItem(1247, "wrap.nano_central_processing_unit").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_QUBIT_CENTRAL_PROCESSING_UNIT = this.addItem(1248, "wrap.qubit_central_processing_unit").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_SIMPLE_SYSTEM_ON_CHIP = this.addItem(1249, "wrap.simple_system_on_chip").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_SYSTEM_ON_CHIP = this.addItem(1250, "wrap.system_on_chip").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_ADVANCED_SYSTEM_ON_CHIP = this.addItem(1251, "wrap.advanced_system_on_chip").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_HIGHLY_ADVANCED_SOC = this.addItem(1252, "wrap.highly_advanced_system_on_chip").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_NAND_MEMORY_CHIP = this.addItem(1253, "wrap.nand_memory_chip").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_NOR_MEMORY_CHIP = this.addItem(1254, "wrap.nor_memory_chip").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_ULTRA_LOW_PIC = this.addItem(1255, "wrap.ultra_low_pic").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_LOW_PIC = this.addItem(1256, "wrap.low_pic").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_PIC = this.addItem(1257, "wrap.pic").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_HIGH_PIC = this.addItem(1258, "wrap.high_pic").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_ULTRA_HIGH_PIC = this.addItem(1259, "wrap.ultra_high_pic").setUnificationData(NTOrePrefix.wrap, null);

        WRAP_NANO_PIC = this.addItem(1260, "wrap.nano_pic").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_PICO_PIC = this.addItem(1261, "wrap.pico_pic").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_FEMTO_PIC = this.addItem(1262, "wrap.femto_pic").setUnificationData(NTOrePrefix.wrap, null);

        WRAP_RAW_EXPOSED_OPTICAL_CHIP = this.addItem(1263, "wrap.optically_compatible_memory").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_OPTICALLY_COMPATIBLE_MEMORY = this.addItem(1264, "wrap.optically_perfected_cpu").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_OPTICALLY_PERFECTED_CPU = this.addItem(1265, "wrap.raw_exposed_optical_chip").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_OPTICAL_CPU_CONTAINMENT_HOUSING = this.addItem(1266, "wrap.optical_cpu_containment_housing").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_OPTICAL_CIRCUIT_BOARD = this.addItem(1267, "wrap.optical_circuit_board").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_OPTICAL_CAPACITOR = this.addItem(1268, "wrap.optical_smd.capacitor").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_OPTICAL_DIODE = this.addItem(1269, "wrap.optical_smd.diode").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_OPTICAL_RESISTOR = this.addItem(1270, "wrap.optical_smd.inductor").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_OPTICAL_TRANSISTOR = this.addItem(1271, "wrap.optical_smd.resistor").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_OPTICAL_INDUCTOR = this.addItem(1272, "wrap.optical_smd.transistor").setUnificationData(NTOrePrefix.wrap, null);

        WRAP_LIVING_CRYSTAL_CHIP = this.addItem(1273, "wrap.living_crystal_chip").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_LIVING_BIO_CHIP = this.addItem(1274, "wrap.gooware.living_bio_chip").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_BIOCELLS = this.addItem(1275, "wrap.gooware.biocells").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_GOOWARE_BOARD = this.addItem(1276, "wrap.board.gooware").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_GOOWARE_CIRCUIT = this.addItem(1277, "wrap.circuit_board.gooware").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_CRYSTAL_SYSTEM_ON_CHIP = this.addItem(1278, "wrap.crystal_system_on_chip").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_RAW_ADVANCED_CRYSTAL_CHIP = this.addItem(1279, "wrap.raw_advanced_crystal_chip").setUnificationData(NTOrePrefix.wrap, null);

        WRAP_SPINTRONIC_CAPACITOR = this.addItem(1280, "wrap.spintronic_smd.capacitor").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_SPINTRONIC_DIODE = this.addItem(1281, "wrap.spintronic_smd.diode").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_SPINTRONIC_RESISTOR = this.addItem(1282, "wrap.spintronic_smd.resistor").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_SPINTRONIC_TRANSISTOR = this.addItem(1283, "wrap.spintronic_smd.transistor").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_SPINTRONIC_INDUCTOR = this.addItem(1284, "wrap.spintronic_smd.inductor").setUnificationData(NTOrePrefix.wrap, null);

        WRAP_COSMIC_INFORMATION_MODULE = this.addItem(1285, "wrap.cosmic.information_module").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_HOLOGRAPHIC_INFORMATION_IMC = this.addItem(1286, "wrap.cosmic.holographic_imc").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_SPACETIME_CONDENSER = this.addItem(1287, "wrap.supracausal.spacetime_condenser").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_LIGHT_CONE_MODULE = this.addItem(1288, "wrap.supracausal.light_cone_module");

        WRAP_COSMIC_TRANSISTOR = this.addItem(1289, "wrap.cosmic_smd.transistor").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_COSMIC_RESISTOR = this.addItem(1290, "wrap.cosmic_smd.resistor").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_COSMIC_CAPACITOR = this.addItem(1291, "wrap.cosmic_smd.capacitor").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_COSMIC_DIODE = this.addItem(1292, "wrap.cosmic_smd.diode").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_COSMIC_INDUCTOR = this.addItem(1293, "wrap.cosmic_smd.inductor").setUnificationData(NTOrePrefix.wrap, null);

        WRAP_SUPRACAUSAL_TRANSISTOR = this.addItem(1294, "wrap.supracausal_smd.transistor").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_SUPRACAUSAL_RESISTOR = this.addItem(1295, "wrap.supracausal_smd.resistor").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_SUPRACAUSAL_CAPACITOR = this.addItem(1296, "wrap.supracausal_smd.capacitor").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_SUPRACAUSAL_DIODE = this.addItem(1297, "wrap.supracausal_smd.diode").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_SUPRACAUSAL_INDUCTOR = this.addItem(1298, "wrap.supracausal_smd.inductor").setUnificationData(NTOrePrefix.wrap, null);

        WRAP_ATTO_PIC = this.addItem(1299, "wrap.atto_pic").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_ZEPTO_PIC = this.addItem(1300, "wrap.zepto_pic").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_UHASOC_CHIP = this.addItem(1301, "wrap.uhasoc").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_PHASE_CHANGE_MEMORY = this.addItem(1302, "wrap.phase_change_memory").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_OPTICAL_NOR_MEMORY_CHIP = this.addItem(1303, "wrap.optical_nor_memory_chip").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_SPIN_TRANSFER_TORQUE_MEMORY = this.addItem(1304, "wrap.spin_transfer_torque_memory").setUnificationData(NTOrePrefix.wrap, null);
        WRAP_SPINTRONIC_NAND_MEMORY_CHIP = this.addItem(1305, "wrap.spintronic_nand_memory_chip").setUnificationData(NTOrePrefix.wrap, null);

        WRAP_OPTICAL_BOARD = this.addItem(1306, "wrap.board.optical");
        WRAP_SPINTRONIC_BOARD = this.addItem(1307, "wrap.board.spintronic");
        WRAP_OPTICAL_CIRCUIT = this.addItem(1308, "wrap.circuit_board.optical");
        WRAP_SPINTRONIC_CIRCUIT = this.addItem(1309, "wrap.circuit_board.spintronic");

        //1400~
        NANO_PIC_WAFER = this.addItem(1400, "wafer.nano_pic");
        PICO_PIC_WAFER = this.addItem(1401, "wafer.pico_pic");
        FEMTO_PIC_WAFER = this.addItem(1402, "wafer.femto_pic");
        NANO_PIC = this.addItem(1403, "plate.nano_pic");
        PICO_PIC = this.addItem(1404, "plate.pico_pic");
        FEMTO_PIC = this.addItem(1405, "plate.femto_pic");
        ATTO_PIC_WAFER = this.addItem(1406, "wafer.atto_pic");
        ATTO_PIC = this.addItem(1407, "plate.atto_pic");
        ZEPTO_PIC_WAFER = this.addItem(1408, "wafer.zepto_pic");
        ZEPTO_PIC = this.addItem(1409, "plate.zepto_pic");
        UHASOC_WAFER = this.addItem(1410, "wafer.uhasoc");
        UHASOC_CHIP = this.addItem(1411, "plate.uhasoc");
        PHASE_CHANGE_MEMORY = this.addItem(1412, "plate.phase_change_memory");
        OPTICAL_NOR_MEMORY_CHIP = this.addItem(1413, "plate.optical_nor_memory_chip");
        SPIN_TRANSFER_TORQUE_MEMORY = this.addItem(1414, "plate.spin_transfer_torque_memory");
        SPINTRONIC_NAND_MEMORY_CHIP = this.addItem(1415, "plate.spintronic_nand_memory_chip");






        //WRAP_ = this.addItem(12, "wrap.");
    }
}
