package com.onlyex.naxtech.common.items;


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

        NTMetaInit.GOOWARE_PROCESSOR = metaItem_NT.addItem(0, "circuit.gooware_processor").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.ZPM);
        NTMetaInit.GOOWARE_ASSEMBLY = metaItem_NT.addItem(1, "circuit.gooware_assembly").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UV);
        NTMetaInit.GOOWARE_COMPUTER = metaItem_NT.addItem(2, "circuit.gooware_computer").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UHV);
        NTMetaInit.GOOWARE_MAINFRAME = metaItem_NT.addItem(3, "circuit.gooware_mainframe").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UEV);

        NTMetaInit.OPTICAL_PROCESSOR = metaItem_NT.addItem(4,"circuit.optical_processor").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UV);
        NTMetaInit.OPTICAL_ASSEMBLY = metaItem_NT.addItem(5,"circuit.optical_assembly").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UHV);
        NTMetaInit.OPTICAL_COMPUTER = metaItem_NT.addItem(6,"circuit.optical_computer").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UEV);
        NTMetaInit.OPTICAL_MAINFRAME = metaItem_NT.addItem(7,"circuit.optical_mainframe").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UIV);

        NTMetaInit.SPINTRONIC_PROCESSOR = metaItem_NT.addItem(8, "circuit.spintronic_processor").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UHV);
        NTMetaInit.SPINTRONIC_ASSEMBLY = metaItem_NT.addItem(9, "circuit.spintronic_assembly").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UEV);
        NTMetaInit.SPINTRONIC_COMPUTER = metaItem_NT.addItem(10, "circuit.spintronic_computer").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UIV);
        NTMetaInit.SPINTRONIC_MAINFRAME = metaItem_NT.addItem(11, "circuit.spintronic_mainframe").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UXV);

        NTMetaInit.COSMIC_PROCESSOR = metaItem_NT.addItem(12, "circuit.cosmic_processor").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UEV);
        NTMetaInit.COSMIC_ASSEMBLY = metaItem_NT.addItem(13, "circuit.cosmic_assembly").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UIV);
        NTMetaInit.COSMIC_COMPUTER = metaItem_NT.addItem(14, "circuit.cosmic_computer").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UXV);
        NTMetaInit.COSMIC_MAINFRAME = metaItem_NT.addItem(15, "circuit.cosmic_mainframe").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.OpV);

        NTMetaInit.SUPRACAUSAL_PROCESSOR = metaItem_NT.addItem(16, "circuit.supracausal_processor").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UIV);
        NTMetaInit.SUPRACAUSAL_ASSEMBLY = metaItem_NT.addItem(17, "circuit.supracausal_assembly").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UXV);
        NTMetaInit.SUPRACAUSAL_COMPUTER = metaItem_NT.addItem(18, "circuit.supracausal_computer").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.OpV);
        NTMetaInit.SUPRACAUSAL_MAINFRAME = metaItem_NT.addItem(19, "circuit.supracausal_mainframe").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.MAX);

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
        NTMetaInit.BZ_REACTION_CHAMBER = metaItem_NT.addItem(180, "reaction_chamber.bz");
        NTMetaInit.NONLINEAR_CHEMICAL_OSCILLATOR = metaItem_NT.addItem(181, "nonlinear_chemical_oscillator");

        //ID 200~219
        NTMetaInit.PHASE_CHANGE_MEMORY = metaItem_NT.addItem(200, "plate.phase_change_memory");
        NTMetaInit.OPTICAL_FIBER = metaItem_NT.addItem(201, "optical_fiber");
        NTMetaInit.DIELECTRIC_MIRROR = metaItem_NT.addItem(202, "dielectric_mirror");
        NTMetaInit.EMPTY_LASER_ASSEMBLY = metaItem_NT.addItem(203, "laser.assembly.empty");
        NTMetaInit.HELIUM_NEON_LASER = metaItem_NT.addItem(204, "laser.helium_neon");
        NTMetaInit.ND_YAG_LASER = metaItem_NT.addItem(205, "laser.nd_yag");
        NTMetaInit.OPTICAL_LASER_CONTROL_UNIT = metaItem_NT.addItem(206, "optical_laser_control_unit");

        //ID 220~239
        NTMetaInit.SPIN_TRANSFER_TORQUE_MEMORY = metaItem_NT.addItem(220, "plate.spin_transfer_torque_memory");
        NTMetaInit.TOPOLOGICAL_INSULATOR_TUBE = metaItem_NT.addItem(221, "tube.topological_insulator");
        NTMetaInit.BOSE_EINSTEIN_CONDENSATE_CONTAINMENT_UNIT = metaItem_NT.addItem(222, "containment_unit.bose_einstein_condensate");
        NTMetaInit.BOSE_EINSTEIN_CONDENSATE = metaItem_NT.addItem(223, "bose_einstein_condensate");
        NTMetaInit.ESR_COMPUTATION_UNIT = metaItem_NT.addItem(224, "esr_computation_unit");

        //ID 240~X
        NTMetaInit.EIGENFOLDED_KERR_MANIFOLD = metaItem_NT.addItem(240, "eigenfolded.kerr.manifold");
        NTMetaInit.HYPERDIMENSIONAL_DRONE = metaItem_NT.addItem(241, "hyperdimensional.drone");

        NTMetaInit.NANO_POWER_IC_WAFER = metaItem_NT.addItem(356, "wafer.nano_power_integrated_circuit");
        NTMetaInit.PICO_POWER_IC_WAFER = metaItem_NT.addItem(357, "wafer.pico_power_integrated_circuit");
        NTMetaInit.FEMTO_POWER_IC_WAFER = metaItem_NT.addItem(358, "wafer.femto_power_integrated_circuit");

        NTMetaInit.NANO_POWER_IC = metaItem_NT.addItem(368, "plate.nano_power_integrated_circuit");
        NTMetaInit.PICO_POWER_IC = metaItem_NT.addItem(369, "plate.pico_power_integrated_circuit");
        NTMetaInit.FEMTO_POWER_IC = metaItem_NT.addItem(370, "plate.femto_power_integrated_circuit");



        NTMetaInit.SPINTRONIC_CAPACITOR = metaItem_NT.addItem(425, "component.spintronic_smd.capacitor");
        NTMetaInit.SPINTRONIC_DIODE = metaItem_NT.addItem(426, "component.spintronic_smd.diode");
        NTMetaInit.SPINTRONIC_RESISTOR = metaItem_NT.addItem(427, "component.spintronic_smd.resistor");
        NTMetaInit.SPINTRONIC_TRANSISTOR = metaItem_NT.addItem(428, "component.spintronic_smd.transistor");
        NTMetaInit.SPINTRONIC_INDUCTOR = metaItem_NT.addItem(429, "component.spintronic_smd.inductor");

        //400
        NTMetaInit.BIO_PROCESSING_UNIT = metaItem_NT.addItem(400,"item.bio_processing_unit").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.ADVANCED_PROCESSOR_BOARD = metaItem_NT.addItem(401,"item.advanced_processor_board").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.ADVANCED_BOARD = metaItem_NT.addItem(402,"item.advanced_board").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.QUANTUM_PROCESSOR_BOARD = metaItem_NT.addItem(403,"item.quantum_processor_board").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.QUANTUM_BOARD = metaItem_NT.addItem(404,"item.quantum_board").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.NANO_PROCESSOR_BOARD = metaItem_NT.addItem(405,"item.nano_processor_board").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.NANO_BOARD = metaItem_NT.addItem(406,"item.nano_board").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
    }

}
