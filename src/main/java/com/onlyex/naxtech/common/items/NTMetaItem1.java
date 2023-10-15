package com.onlyex.naxtech.common.items;


import com.onlyex.naxtech.api.unification.ore.NTOrePrefix;
import com.onlyex.naxtech.proxy.CommonProxy;
import gregtech.api.items.metaitem.StandardMetaItem;
import gregtech.api.unification.material.MarkerMaterials;
import gregtech.api.unification.ore.OrePrefix;

import static com.onlyex.naxtech.common.items.NTMetaInit.metaItem_NT;

public class NTMetaItem1 extends StandardMetaItem {

    public NTMetaItem1() {
        super();
    }

    //下面是一个例子，第一个数据（0）是Meta Data，不能重复
    //"test"是该物品的Meta ID，例如circuit.ulv之类的
    //TEST = metaItem1.addItem(0, "test");
    //NTMetaItems. = metaItem_NT.addItem(,"").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
    public void registerSubItems(){

        //ID 0~19

        NTMetaInit.GOOWARE_PROCESSOR = metaItem_NT.addItem(0, "circuit.gooware_processor").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.ZPM).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.GOOWARE_ASSEMBLY = metaItem_NT.addItem(1, "circuit.gooware_assembly").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UV).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.GOOWARE_COMPUTER = metaItem_NT.addItem(2, "circuit.gooware_computer").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UHV).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.GOOWARE_MAINFRAME = metaItem_NT.addItem(3, "circuit.gooware_mainframe").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UEV).setCreativeTabs(CommonProxy.NAXTECH_TAB);

        NTMetaInit.OPTICAL_PROCESSOR = metaItem_NT.addItem(4,"circuit.optical_processor").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UV).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.OPTICAL_ASSEMBLY = metaItem_NT.addItem(5,"circuit.optical_assembly").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UHV).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.OPTICAL_COMPUTER = metaItem_NT.addItem(6,"circuit.optical_computer").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UEV).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.OPTICAL_MAINFRAME = metaItem_NT.addItem(7,"circuit.optical_mainframe").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UIV).setCreativeTabs(CommonProxy.NAXTECH_TAB);

        NTMetaInit.SPINTRONIC_PROCESSOR = metaItem_NT.addItem(8, "circuit.spintronic_processor").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UHV).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.SPINTRONIC_ASSEMBLY = metaItem_NT.addItem(9, "circuit.spintronic_assembly").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UEV).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.SPINTRONIC_COMPUTER = metaItem_NT.addItem(10, "circuit.spintronic_computer").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UIV).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.SPINTRONIC_MAINFRAME = metaItem_NT.addItem(11, "circuit.spintronic_mainframe").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UXV).setCreativeTabs(CommonProxy.NAXTECH_TAB);

        NTMetaInit.COSMIC_PROCESSOR = metaItem_NT.addItem(12, "circuit.cosmic_processor").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UEV).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.COSMIC_ASSEMBLY = metaItem_NT.addItem(13, "circuit.cosmic_assembly").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UIV).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.COSMIC_COMPUTER = metaItem_NT.addItem(14, "circuit.cosmic_computer").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UXV).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.COSMIC_MAINFRAME = metaItem_NT.addItem(15, "circuit.cosmic_mainframe").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.OpV).setCreativeTabs(CommonProxy.NAXTECH_TAB);

        NTMetaInit.SUPRACAUSAL_PROCESSOR = metaItem_NT.addItem(16, "circuit.supracausal_processor").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UIV).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.SUPRACAUSAL_ASSEMBLY = metaItem_NT.addItem(17, "circuit.supracausal_assembly").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UXV).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.SUPRACAUSAL_COMPUTER = metaItem_NT.addItem(18, "circuit.supracausal_computer").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.OpV).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.SUPRACAUSAL_MAINFRAME = metaItem_NT.addItem(19, "circuit.supracausal_mainframe").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.MAX).setCreativeTabs(CommonProxy.NAXTECH_TAB);

        //ID 20~59
        NTMetaInit.EU_DOPED_CUBIC_ZIRCONIA_BOULE = metaItem_NT.addItem(20, "boule.cubic_zirconia.europium").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.EU_DOPED_CUBIC_ZIRCONIA_WAFER = metaItem_NT.addItem(21, "wafer.cubic_zirconia.europium").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.CRYSTAL_INTERFACE_WAFER = metaItem_NT.addItem(22, "wafer.crystal.interface").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.CRYSTAL_INTERFACE_PLATE = metaItem_NT.addItem(23, "plate.crystal.interface").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.ENGRAVED_RUBY_CRYSTAL_CHIP = metaItem_NT.addItem(24, "engraved.crystal_chip.ruby").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.ENGRAVED_SAPPHIRE_CRYSTAL_CHIP = metaItem_NT.addItem(25, "engraved.crystal_chip.sapphire").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.ENGRAVED_DIAMOND_CRYSTAL_CHIP = metaItem_NT.addItem(26, "engraved.crystal_chip.diamond").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.CRYSTAL_MODULATOR_RUBY = metaItem_NT.addItem(27, "crystal.modulator.ruby").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.CRYSTAL_MODULATOR_SAPPHIRE = metaItem_NT.addItem(28, "crystal.modulator.sapphire").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.CRYSTAL_MODULATOR_DIAMOND = metaItem_NT.addItem(29, "crystal.modulator.diamond").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.CRYSTAL_SYSTEM_ON_CHIP_SOCKET = metaItem_NT.addItem(30, "crystal.system_on_chip.socket").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.GLASS_FIBER = metaItem_NT.addItem(31,"glass_fiber").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.EUROPIUM_DOPED_MONOCRYSTALLINE_SILICON_BOULE = metaItem_NT.addItem(32,"europium_doped_monocrystalline_silicon_boule").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.EUROPIUM_DOPED_WAFER = metaItem_NT.addItem(33,"europium_doped_wafer").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.AMERICIUM_DOPED_MONOCRYSTALLINE_SILICON_BOULE = metaItem_NT.addItem(34,"americium_doped_monocrystalline_silicon_boule").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.AMERICIUM_DOPED_WAFER = metaItem_NT.addItem(35,"americium_doped_wafer").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.BIO_CIRCUIT_BOARD = metaItem_NT.addItem(36,"bio_circuit_board").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.ULTRA_BIO_MUTATED_CIRCUIT_BOARD = metaItem_NT.addItem(37,"ultra_bio_mutated_circuit_board").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.STATION_MKI = metaItem_NT.addItem(38,"station_1").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.STATION_MKII = metaItem_NT.addItem(39,"station_2").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.STATION_MKIII = metaItem_NT.addItem(40,"station_3").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.STATION_MKIV = metaItem_NT.addItem(41,"station_4").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.STATION_MKV = metaItem_NT.addItem(42,"station_5").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.RAW_ADVANCED_CRYSTAL_CHIP = metaItem_NT.addItem(43,"crystal.raw_advanced_chip").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);





        //ID 60~79
        NTMetaInit.RAW_TESSERACT = metaItem_NT.addItem(60,"dimension.raw_tesseract").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.ENERGISED_TESSERACT = metaItem_NT.addItem(61,"dimension.energised_tesseract").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.BLACK_BODY_NAQUADRIA_SUPERSOLID = metaItem_NT.addItem(62,"dimension.black_body_naquadria_supersolid").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.HYPER_STABLE_SELF_HEALING_ADHESIVE = metaItem_NT.addItem(63,"dimension.hyper-stable_self-healing_adhesive").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.SUPERCONDUCTOR_RARE_EARTH_COMPOSITE = metaItem_NT.addItem(64,"dimension.superconductor_rare-earth_composite").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.TIMEPIECE = metaItem_NT.addItem(65,"timepiece").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.QUANTUM_ANOMALY = metaItem_NT.addItem(66,"dimension.quantum_anomaly").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);


        //ID 80~99

        //ID 100~119
        NTMetaInit.BIOCELLS = metaItem_NT.addItem(125,"gooware.biocells").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.LIVING_BIO_WAFER = metaItem_NT.addItem(126,"gooware.living_bio_wafer").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.LIVING_BIO_CHIP = metaItem_NT.addItem(127,"gooware.living_bio_chip").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);

        NTMetaInit.NUCLEAR_STAR = metaItem_NT.addItem(128,"nuclear_star").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.LIVING_CRYSTAL_CHIP = metaItem_NT.addItem(129,"living_crystal_chip").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);


        //140~
        NTMetaInit.OPTICALLY_ENRICHED_CRYSTALLINE_BOULE = metaItem_NT.addItem(140,"optical.optically_enriched_crystalline_boule").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.PHOTONICALLY_PREPARED_WAFER = metaItem_NT.addItem(141,"optical.photonically_prepared_wafer").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.PHOTONICALLY_ENHANCED_WAFER = metaItem_NT.addItem(142,"optical.photonically_enhanced_wafer").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.RAW_EXPOSED_OPTICAL_CHIP = metaItem_NT.addItem(143,"optical.raw_exposed_optical_chip").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.OPTICALLY_COMPATIBLE_MEMORY = metaItem_NT.addItem(144,"optical.optically_compatible_memory").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.OPTICALLY_PERFECTED_CPU = metaItem_NT.addItem(145,"optical.optically_perfected_cpu").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.OPTICAL_CPU_CONTAINMENT_HOUSING = metaItem_NT.addItem(146,"optical.optical_cpu_containment_housing").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.OPTICAL_CIRCUIT_BOARD = metaItem_NT.addItem(147,"optical.optical_circuit_board").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.OPTICAL_CAPACITOR = metaItem_NT.addItem(148, "optical.optical_smd.capacitor").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.OPTICAL_DIODE = metaItem_NT.addItem(149, "optical.optical_smd.diode").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.OPTICAL_RESISTOR = metaItem_NT.addItem(150, "optical.optical_smd.resistor").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.OPTICAL_TRANSISTOR = metaItem_NT.addItem(151, "optical.optical_smd.transistor").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.OPTICAL_INDUCTOR = metaItem_NT.addItem(152,"optical.optical_smd.inductor").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);



        //ID 180~199
        NTMetaInit.BZ_REACTION_CHAMBER = metaItem_NT.addItem(180, "reaction_chamber.bz").setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.NONLINEAR_CHEMICAL_OSCILLATOR = metaItem_NT.addItem(181, "nonlinear_chemical_oscillator").setCreativeTabs(CommonProxy.NAXTECH_TAB);

        //ID 200~219
        NTMetaInit.PHASE_CHANGE_MEMORY = metaItem_NT.addItem(200, "plate.phase_change_memory").setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.OPTICAL_FIBER = metaItem_NT.addItem(201, "optical_fiber").setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.DIELECTRIC_MIRROR = metaItem_NT.addItem(202, "dielectric_mirror").setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.EMPTY_LASER_ASSEMBLY = metaItem_NT.addItem(203, "laser.assembly.empty").setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.HELIUM_NEON_LASER = metaItem_NT.addItem(204, "laser.helium_neon").setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.ND_YAG_LASER = metaItem_NT.addItem(205, "laser.nd_yag").setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.OPTICAL_LASER_CONTROL_UNIT = metaItem_NT.addItem(206, "optical_laser_control_unit").setCreativeTabs(CommonProxy.NAXTECH_TAB);

        //ID 220~239
        NTMetaInit.SPIN_TRANSFER_TORQUE_MEMORY = metaItem_NT.addItem(220, "plate.spin_transfer_torque_memory").setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.TOPOLOGICAL_INSULATOR_TUBE = metaItem_NT.addItem(221, "tube.topological_insulator").setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.BOSE_EINSTEIN_CONDENSATE_CONTAINMENT_UNIT = metaItem_NT.addItem(222, "containment_unit.bose_einstein_condensate").setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.BOSE_EINSTEIN_CONDENSATE = metaItem_NT.addItem(223, "bose_einstein_condensate").setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.ESR_COMPUTATION_UNIT = metaItem_NT.addItem(224, "esr_computation_unit").setCreativeTabs(CommonProxy.NAXTECH_TAB);

        //ID 240~X
        NTMetaInit.EIGENFOLDED_KERR_MANIFOLD = metaItem_NT.addItem(240, "eigenfolded.kerr.manifold").setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.HYPERDIMENSIONAL_DRONE = metaItem_NT.addItem(241, "hyperdimensional.drone").setCreativeTabs(CommonProxy.NAXTECH_TAB);

        NTMetaInit.NANO_POWER_IC_WAFER = metaItem_NT.addItem(356, "wafer.nano_power_integrated_circuit").setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.PICO_POWER_IC_WAFER = metaItem_NT.addItem(357, "wafer.pico_power_integrated_circuit").setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.FEMTO_POWER_IC_WAFER = metaItem_NT.addItem(358, "wafer.femto_power_integrated_circuit").setCreativeTabs(CommonProxy.NAXTECH_TAB);

        NTMetaInit.NANO_POWER_IC = metaItem_NT.addItem(368, "plate.nano_power_integrated_circuit").setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.PICO_POWER_IC = metaItem_NT.addItem(369, "plate.pico_power_integrated_circuit").setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.FEMTO_POWER_IC = metaItem_NT.addItem(370, "plate.femto_power_integrated_circuit").setCreativeTabs(CommonProxy.NAXTECH_TAB);



        NTMetaInit.SPINTRONIC_CAPACITOR = metaItem_NT.addItem(425, "component.spintronic_smd.capacitor").setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.SPINTRONIC_DIODE = metaItem_NT.addItem(426, "component.spintronic_smd.diode").setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.SPINTRONIC_RESISTOR = metaItem_NT.addItem(427, "component.spintronic_smd.resistor").setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.SPINTRONIC_TRANSISTOR = metaItem_NT.addItem(428, "component.spintronic_smd.transistor").setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.SPINTRONIC_INDUCTOR = metaItem_NT.addItem(429, "component.spintronic_smd.inductor").setCreativeTabs(CommonProxy.NAXTECH_TAB);

        //400
        NTMetaInit.BIO_PROCESSING_UNIT = metaItem_NT.addItem(400,"item.bio_processing_unit").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.ADVANCED_PROCESSOR_BOARD = metaItem_NT.addItem(401,"item.advanced_processor_board").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.ADVANCED_BOARD = metaItem_NT.addItem(402,"item.advanced_board").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.QUANTUM_PROCESSOR_BOARD = metaItem_NT.addItem(403,"item.quantum_processor_board").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.QUANTUM_BOARD = metaItem_NT.addItem(404,"item.quantum_board").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.NANO_PROCESSOR_BOARD = metaItem_NT.addItem(405,"item.nano_processor_board").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.NANO_BOARD = metaItem_NT.addItem(406,"item.nano_board").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);

        //1200
        NTMetaInit.WRAP_CIRCUIT_ULV = metaItem_NT.addItem(1200, "wrapcircuit.ulv").setUnificationData(NTOrePrefix.wrapCircuit, MarkerMaterials.Tier.ULV).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_CIRCUIT_LV = metaItem_NT.addItem(1201, "wrapcircuit.lv").setUnificationData(NTOrePrefix.wrapCircuit, MarkerMaterials.Tier.LV).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_CIRCUIT_MV = metaItem_NT.addItem(1202, "wrapcircuit.mv").setUnificationData(NTOrePrefix.wrapCircuit, MarkerMaterials.Tier.MV).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_CIRCUIT_HV = metaItem_NT.addItem(1203, "wrapcircuit.hv").setUnificationData(NTOrePrefix.wrapCircuit, MarkerMaterials.Tier.HV).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_CIRCUIT_EV = metaItem_NT.addItem(1204, "wrapcircuit.ev").setUnificationData(NTOrePrefix.wrapCircuit, MarkerMaterials.Tier.EV).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_CIRCUIT_IV = metaItem_NT.addItem(1205, "wrapcircuit.iv").setUnificationData(NTOrePrefix.wrapCircuit, MarkerMaterials.Tier.IV).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_CIRCUIT_LUV = metaItem_NT.addItem(1206, "wrapcircuit.luv").setUnificationData(NTOrePrefix.wrapCircuit, MarkerMaterials.Tier.LuV).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_CIRCUIT_ZPM = metaItem_NT.addItem(1207, "wrapcircuit.zpm").setUnificationData(NTOrePrefix.wrapCircuit, MarkerMaterials.Tier.ZPM).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_CIRCUIT_UV = metaItem_NT.addItem(1208, "wrapcircuit.uv").setUnificationData(NTOrePrefix.wrapCircuit, MarkerMaterials.Tier.UV).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_CIRCUIT_UHV = metaItem_NT.addItem(1209, "wrapcircuit.uhv").setUnificationData(NTOrePrefix.wrapCircuit, MarkerMaterials.Tier.UHV).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_CIRCUIT_UEV = metaItem_NT.addItem(1210, "wrapcircuit.uev").setUnificationData(NTOrePrefix.wrapCircuit, MarkerMaterials.Tier.UEV).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_CIRCUIT_UIV = metaItem_NT.addItem(1211, "wrapcircuit.uiv").setUnificationData(NTOrePrefix.wrapCircuit, MarkerMaterials.Tier.UIV).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_CIRCUIT_UXV = metaItem_NT.addItem(1212, "wrapcircuit.uxv").setUnificationData(NTOrePrefix.wrapCircuit, MarkerMaterials.Tier.UXV).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_CIRCUIT_OPV = metaItem_NT.addItem(1213, "wrapcircuit.opv").setUnificationData(NTOrePrefix.wrapCircuit, MarkerMaterials.Tier.OpV).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_CIRCUIT_MAX = metaItem_NT.addItem(1214, "wrapcircuit.nax").setUnificationData(NTOrePrefix.wrapCircuit, MarkerMaterials.Tier.MAX).setCreativeTabs(CommonProxy.NAXTECH_TAB);

        NTMetaInit.WRAP_COATED_BOARD = metaItem_NT.addItem(1215, "wrap.coated_board").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_PHENOLIC_BOARD = metaItem_NT.addItem(1216, "wrap.phenolic_board").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_PLASTIC_BOARD = metaItem_NT.addItem(1217, "wrap.plastic_board").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_EPOXY_BOARD = metaItem_NT.addItem(1218, "wrap.epoxy_board").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_FIBER_BOARD = metaItem_NT.addItem(1219, "wrap.fiber_board").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_MULTILAYER_FIBER_BOARD = metaItem_NT.addItem(1220, "wrap.multilayer_fiber_board").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_WETWARE_BOARD = metaItem_NT.addItem(1221, "wrap.wetware_board").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);


        NTMetaInit.WRAP_BASIC_CIRCUIT_BOARD = metaItem_NT.addItem(1222, "wrap.basic_circuit_board").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_GOOD_CIRCUIT_BOARD = metaItem_NT.addItem(1223, "wrap.good_circuit_board").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_PLASTIC_CIRCUIT_BOARD = metaItem_NT.addItem(1224, "wrap.plastic_circuit_board").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_ADVANCED_CIRCUIT_BOARD = metaItem_NT.addItem(1225, "wrap.advanced_circuit_board").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_EXTREME_CIRCUIT_BOARD = metaItem_NT.addItem(1226, "wrap.extreme_circuit_board").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_ELITE_CIRCUIT_BOARD = metaItem_NT.addItem(1227, "wrap.elite_circuit_board").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_WETWARE_CIRCUIT_BOARD = metaItem_NT.addItem(1228, "wrap.wetware_circuit_board").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);

        NTMetaInit.WRAP_SMD_CAPACITOR = metaItem_NT.addItem(1229, "wrap.smd_capacitor").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_SMD_DIODE = metaItem_NT.addItem(1230, "wrap.smd_diode").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_SMD_RESISTOR = metaItem_NT.addItem(1231, "wrap.smd_resistor").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_SMD_TRANSISTOR = metaItem_NT.addItem(1232, "wrap.smd_transistor").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_SMD_INDUCTOR = metaItem_NT.addItem(1233, "wrap.smd_inductor").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_ADVANCED_SMD_CAPACITOR = metaItem_NT.addItem(1234, "wrap.advanced_smd_capacitor").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_ADVANCED_SMD_DIODE = metaItem_NT.addItem(1235, "wrap.advanced_smd_diode").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_ADVANCED_SMD_RESISTOR = metaItem_NT.addItem(1236, "wrap.advanced_smd_resistor").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_ADVANCED_SMD_TRANSISTOR = metaItem_NT.addItem(1237, "wrap.advanced_smd_transistor").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_ADVANCED_SMD_INDUCTOR = metaItem_NT.addItem(1238, "wrap.advanced_smd_inductor").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);

        NTMetaInit.WRAP_NEURO_PROCESSOR = metaItem_NT.addItem(1239, "wrap.neuro_processor").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_STEM_CELLS = metaItem_NT.addItem(1240, "wrap.stem_cells").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_ENGRAVED_LAPOTRON_CHIP = metaItem_NT.addItem(1241, "wrap.engraved_lapotron_chip").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_ENGRAVED_CRYSTAL_CHIP = metaItem_NT.addItem(1242, "wrap.engraved_crystal_chip").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_CRYSTAL_CENTRAL_PROCESSING_UNIT = metaItem_NT.addItem(1243, "wrap.crystal_central_processing_unit").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);

        NTMetaInit.WRAP_CENTRAL_PROCESSING_UNIT = metaItem_NT.addItem(1244, "wrap.central_processing_unit").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_RANDOM_ACCESS_MEMORY = metaItem_NT.addItem(1245, "wrap.random_access_memory").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_INTEGRATED_LOGIC_CIRCUIT = metaItem_NT.addItem(1246, "wrap.integrated_logic_circuit").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_NANO_CENTRAL_PROCESSING_UNIT = metaItem_NT.addItem(1247, "wrap.nano_central_processing_unit").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_QUBIT_CENTRAL_PROCESSING_UNIT = metaItem_NT.addItem(1248, "wrap.qubit_central_processing_unit").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_SIMPLE_SYSTEM_ON_CHIP = metaItem_NT.addItem(1249, "wrap.simple_system_on_chip").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_SYSTEM_ON_CHIP = metaItem_NT.addItem(1250, "wrap.system_on_chip").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_ADVANCED_SYSTEM_ON_CHIP = metaItem_NT.addItem(1251, "wrap.advanced_system_on_chip").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_HIGHLY_ADVANCED_SOC = metaItem_NT.addItem(1252, "wrap.highly_advanced_system_on_chip").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_NAND_MEMORY_CHIP = metaItem_NT.addItem(1253, "wrap.nand_memory_chip").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_NOR_MEMORY_CHIP = metaItem_NT.addItem(1254, "wrap.nor_memory_chip").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_ULTRA_LOW_POWER_INTEGRATED_CIRCUIT = metaItem_NT.addItem(1255, "wrap.ultra_low_power_integrated_circuit").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_LOW_POWER_INTEGRATED_CIRCUIT = metaItem_NT.addItem(1256, "wrap.low_power_integrated_circuit").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_POWER_INTEGRATED_CIRCUIT = metaItem_NT.addItem(1257, "wrap.power_integrated_circuit").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_HIGH_POWER_INTEGRATED_CIRCUIT = metaItem_NT.addItem(1258, "wrap.high_power_integrated_circuit").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_ULTRA_HIGH_POWER_INTEGRATED_CIRCUIT = metaItem_NT.addItem(1259, "wrap.ultra_high_power_integrated_circuit").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);

        NTMetaInit.WRAP_NANO_POWER_IC = metaItem_NT.addItem(1260, "wrap.nano_power_integrated_circuit").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_PICO_POWER_IC = metaItem_NT.addItem(1261, "wrap.pico_power_integrated_circuit").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_FEMTO_POWER_IC = metaItem_NT.addItem(1262, "wrap.femto_power_integrated_circuit").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);

        NTMetaInit.WRAP_RAW_EXPOSED_OPTICAL_CHIP = metaItem_NT.addItem(1263, "wrap.optically_compatible_memory").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_OPTICALLY_COMPATIBLE_MEMORY = metaItem_NT.addItem(1264, "wrap.optically_perfected_cpu").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_OPTICALLY_PERFECTED_CPU = metaItem_NT.addItem(1265, "wrap.raw_exposed_optical_chip").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_OPTICAL_CPU_CONTAINMENT_HOUSING = metaItem_NT.addItem(1266, "wrap.optical_cpu_containment_housing").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_OPTICAL_CIRCUIT_BOARD = metaItem_NT.addItem(1267, "wrap.optical_circuit_board").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_OPTICAL_CAPACITOR = metaItem_NT.addItem(1268, "wrap.optical_smd.capacitor").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_OPTICAL_DIODE = metaItem_NT.addItem(1269, "wrap.optical_smd.diode").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_OPTICAL_RESISTOR = metaItem_NT.addItem(1270, "wrap.optical_smd.inductor").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_OPTICAL_TRANSISTOR = metaItem_NT.addItem(1271, "wrap.optical_smd.resistor").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_OPTICAL_INDUCTOR = metaItem_NT.addItem(1272, "wrap.optical_smd.transistor").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);

        NTMetaInit.WRAP_LIVING_CRYSTAL_CHIP = metaItem_NT.addItem(1273, "wrap.living_crystal_chip").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_LIVING_BIO_CHIP = metaItem_NT.addItem(1274, "wrap.gooware.living_bio_chip").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_BIOCELLS = metaItem_NT.addItem(1275, "wrap.gooware.biocells").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_BIO_CIRCUIT_BOARD = metaItem_NT.addItem(1276, "wrap.bio_circuit_board").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_ULTRA_BIO_MUTATED_CIRCUIT_BOARD = metaItem_NT.addItem(1277, "wrap.ultra_bio_mutated_circuit_board").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_CRYSTAL_SYSTEM_ON_CHIP = metaItem_NT.addItem(1278, "wrap.crystal_system_on_chip").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_RAW_ADVANCED_CRYSTAL_CHIP = metaItem_NT.addItem(1279, "wrap.raw_advanced_crystal_chip").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);

        NTMetaInit.WRAP_SPINTRONIC_CAPACITOR = metaItem_NT.addItem(1280, "wrap.spintronic_smd.capacitor").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_SPINTRONIC_DIODE = metaItem_NT.addItem(1281, "wrap.spintronic_smd.diode").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_SPINTRONIC_RESISTOR = metaItem_NT.addItem(1282, "wrap.spintronic_smd.resistor").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_SPINTRONIC_TRANSISTOR = metaItem_NT.addItem(1283, "wrap.spintronic_smd.transistor").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WRAP_SPINTRONIC_INDUCTOR = metaItem_NT.addItem(1284, "wrap.spintronic_smd.inductor").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);






        //NTMetaInit.WRAP_ = metaItem_NT.addItem(12, "wrap.").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
    }
}
