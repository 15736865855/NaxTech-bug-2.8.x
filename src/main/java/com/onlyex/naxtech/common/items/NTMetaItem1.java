package com.onlyex.naxtech.common.items;


import com.onlyex.naxtech.proxy.CommonProxy;
import gregtech.api.items.metaitem.StandardMetaItem;
import gregtech.api.unification.material.MarkerMaterials;
import gregtech.api.unification.ore.OrePrefix;

import static com.onlyex.naxtech.common.items.NTMetaItems.metaItem_NT;

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

        NTMetaItems.GOOWARE_PROCESSOR = metaItem_NT.addItem(0, "circuit.gooware_processor").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.ZPM);
        NTMetaItems.GOOWARE_ASSEMBLY = metaItem_NT.addItem(1, "circuit.gooware_assembly").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UV);
        NTMetaItems.GOOWARE_COMPUTER = metaItem_NT.addItem(2, "circuit.gooware_computer").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UHV);
        NTMetaItems.GOOWARE_MAINFRAME = metaItem_NT.addItem(3, "circuit.gooware_mainframe").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UEV);

        NTMetaItems.OPTICAL_PROCESSOR = metaItem_NT.addItem(4,"circuit.optical_processor").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UV);
        NTMetaItems.OPTICAL_ASSEMBLY = metaItem_NT.addItem(5,"circuit.optical_assembly").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UHV);
        NTMetaItems.OPTICAL_COMPUTER = metaItem_NT.addItem(6,"circuit.optical_computer").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UEV);
        NTMetaItems.OPTICAL_MAINFRAME = metaItem_NT.addItem(7,"circuit.optical_mainframe").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UIV);

        NTMetaItems.SPINTRONIC_PROCESSOR = metaItem_NT.addItem(8, "circuit.spintronic_processor").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UHV);
        NTMetaItems.SPINTRONIC_ASSEMBLY = metaItem_NT.addItem(9, "circuit.spintronic_assembly").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UEV);
        NTMetaItems.SPINTRONIC_COMPUTER = metaItem_NT.addItem(10, "circuit.spintronic_computer").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UIV);
        NTMetaItems.SPINTRONIC_MAINFRAME = metaItem_NT.addItem(11, "circuit.spintronic_mainframe").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UXV);

        NTMetaItems.COSMIC_PROCESSOR = metaItem_NT.addItem(12, "circuit.cosmic_processor").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UEV);
        NTMetaItems.COSMIC_ASSEMBLY = metaItem_NT.addItem(13, "circuit.cosmic_assembly").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UIV);
        NTMetaItems.COSMIC_COMPUTER = metaItem_NT.addItem(14, "circuit.cosmic_computer").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UXV);
        NTMetaItems.COSMIC_MAINFRAME = metaItem_NT.addItem(15, "circuit.cosmic_mainframe").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.OpV);

        NTMetaItems.SUPRACAUSAL_PROCESSOR = metaItem_NT.addItem(16, "circuit.supracausal_processor").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UIV);
        NTMetaItems.SUPRACAUSAL_ASSEMBLY = metaItem_NT.addItem(17, "circuit.supracausal_assembly").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.UXV);
        NTMetaItems.SUPRACAUSAL_COMPUTER = metaItem_NT.addItem(18, "circuit.supracausal_computer").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.OpV);
        NTMetaItems.SUPRACAUSAL_MAINFRAME = metaItem_NT.addItem(19, "circuit.supracausal_mainframe").setUnificationData(OrePrefix.circuit, MarkerMaterials.Tier.MAX);

        //ID 20~59
        NTMetaItems.EU_DOPED_CUBIC_ZIRCONIA_BOULE = metaItem_NT.addItem(20, "boule.cubic_zirconia.europium").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaItems.EU_DOPED_CUBIC_ZIRCONIA_WAFER = metaItem_NT.addItem(21, "wafer.cubic_zirconia.europium").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaItems.CRYSTAL_INTERFACE_WAFER = metaItem_NT.addItem(22, "wafer.crystal.interface").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaItems.CRYSTAL_INTERFACE_PLATE = metaItem_NT.addItem(23, "plate.crystal.interface").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaItems.ENGRAVED_RUBY_CRYSTAL_CHIP = metaItem_NT.addItem(24, "engraved.crystal_chip.ruby").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaItems.ENGRAVED_SAPPHIRE_CRYSTAL_CHIP = metaItem_NT.addItem(25, "engraved.crystal_chip.sapphire").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaItems.ENGRAVED_DIAMOND_CRYSTAL_CHIP = metaItem_NT.addItem(26, "engraved.crystal_chip.diamond").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaItems.CRYSTAL_MODULATOR_RUBY = metaItem_NT.addItem(27, "crystal.modulator.ruby").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaItems.CRYSTAL_MODULATOR_SAPPHIRE = metaItem_NT.addItem(28, "crystal.modulator.sapphire").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaItems.CRYSTAL_MODULATOR_DIAMOND = metaItem_NT.addItem(29, "crystal.modulator.diamond").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaItems.CRYSTAL_SYSTEM_ON_CHIP_SOCKET = metaItem_NT.addItem(30, "crystal.system_on_chip.socket").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaItems.GLASS_FIBER = metaItem_NT.addItem(31,"glass_fiber").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaItems.EUROPIUM_DOPED_MONOCRYSTALLINE_SILICON_BOULE = metaItem_NT.addItem(32,"europium_doped_monocrystalline_silicon_boule").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaItems.EUROPIUM_DOPED_WAFER = metaItem_NT.addItem(33,"europium_doped_wafer").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaItems.AMERICIUM_DOPED_MONOCRYSTALLINE_SILICON_BOULE = metaItem_NT.addItem(34,"americium_doped_monocrystalline_silicon_boule").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaItems.AMERICIUM_DOPED_WAFER = metaItem_NT.addItem(35,"americium_doped_wafer").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaItems.BIO_CIRCUIT_BOARD = metaItem_NT.addItem(36,"bio_circuit_board").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaItems.ULTRA_BIO_MUTATED_CIRCUIT_BOARD = metaItem_NT.addItem(37,"ultra_bio_mutated_circuit_board").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaItems.STATION_MKI = metaItem_NT.addItem(38,"station_1").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaItems.STATION_MKII = metaItem_NT.addItem(39,"station_2").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaItems.STATION_MKIII = metaItem_NT.addItem(40,"station_3").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaItems.STATION_MKIV = metaItem_NT.addItem(41,"station_4").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaItems.STATION_MKV = metaItem_NT.addItem(42,"station_5").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);






        //ID 60~79
        NTMetaItems.RAW_TESSERACT = metaItem_NT.addItem(60,"dimension.raw_tesseract").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaItems.ENERGISED_TESSERACT = metaItem_NT.addItem(61,"dimension.energised_tesseract").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaItems.BLACK_BODY_NAQUADRIA_SUPERSOLID = metaItem_NT.addItem(62,"dimension.black_body_naquadria_supersolid").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaItems.HYPER_STABLE_SELF_HEALING_ADHESIVE = metaItem_NT.addItem(63,"dimension.hyper-stable_self-healing_adhesive").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaItems.SUPERCONDUCTOR_RARE_EARTH_COMPOSITE = metaItem_NT.addItem(64,"dimension.superconductor_rare-earth_composite").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaItems.TIMEPIECE = metaItem_NT.addItem(65,"timepiece").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaItems.QUANTUM_ANOMALY = metaItem_NT.addItem(66,"dimension.quantum_anomaly").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);


        //ID 80~99

        //ID 100~119
        NTMetaItems.BIOCELLS = metaItem_NT.addItem(125,"gooware.biocells").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaItems.LIVING_BIO_WAFER = metaItem_NT.addItem(126,"gooware.living_bio_wafer").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaItems.LIVING_BIO_CHIP = metaItem_NT.addItem(127,"gooware.living_bio_chip").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);

        NTMetaItems.NUCLEAR_STAR = metaItem_NT.addItem(128,"nuclear_star").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaItems.LIVING_CRYSTAL_CHIP = metaItem_NT.addItem(129,"living_crystal_chip").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);


        //140~
        NTMetaItems.OPTICALLY_ENRICHED_CRYSTALLINE_BOULE = metaItem_NT.addItem(140,"optical.optically_enriched_crystalline_boule").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaItems.PHOTONICALLY_PREPARED_WAFER = metaItem_NT.addItem(141,"optical.photonically_prepared_wafer").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaItems.PHOTONICALLY_ENHANCED_WAFER = metaItem_NT.addItem(142,"optical.photonically_enhanced_wafer").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaItems.RAW_EXPOSED_OPTICAL_CHIP = metaItem_NT.addItem(143,"optical.raw_exposed_optical_chip").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaItems.OPTICALLY_COMPATIBLE_MEMORY = metaItem_NT.addItem(144,"optical.optically_compatible_memory").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaItems.OPTICALLY_PERFECTED_CPU = metaItem_NT.addItem(145,"optical.optically_perfected_cpu").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaItems.OPTICAL_CPU_CONTAINMENT_HOUSING = metaItem_NT.addItem(146,"optical.optical_cpu_containment_housing").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaItems.OPTICAL_CIRCUIT_BOARD = metaItem_NT.addItem(147,"optical.optical_circuit_board").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaItems.OPTICAL_CAPACITOR = metaItem_NT.addItem(148, "optical.optical_smd.capacitor").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaItems.OPTICAL_DIODE = metaItem_NT.addItem(149, "optical.optical_smd.diode").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaItems.OPTICAL_RESISTOR = metaItem_NT.addItem(150, "optical.optical_smd.resistor").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaItems.OPTICAL_TRANSISTOR = metaItem_NT.addItem(151, "optical.optical_smd.transistor").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaItems.OPTICAL_INDUCTOR = metaItem_NT.addItem(152,"optical.optical_smd.inductor").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);



        //ID 180~199
        NTMetaItems.BZ_REACTION_CHAMBER = metaItem_NT.addItem(180, "reaction_chamber.bz");
        NTMetaItems.NONLINEAR_CHEMICAL_OSCILLATOR = metaItem_NT.addItem(181, "nonlinear_chemical_oscillator");

        //ID 200~219
        NTMetaItems.PHASE_CHANGE_MEMORY = metaItem_NT.addItem(200, "plate.phase_change_memory");
        NTMetaItems.OPTICAL_FIBER = metaItem_NT.addItem(201, "optical_fiber");
        NTMetaItems.DIELECTRIC_MIRROR = metaItem_NT.addItem(202, "dielectric_mirror");
        NTMetaItems.EMPTY_LASER_ASSEMBLY = metaItem_NT.addItem(203, "laser.assembly.empty");
        NTMetaItems.HELIUM_NEON_LASER = metaItem_NT.addItem(204, "laser.helium_neon");
        NTMetaItems.ND_YAG_LASER = metaItem_NT.addItem(205, "laser.nd_yag");
        NTMetaItems.OPTICAL_LASER_CONTROL_UNIT = metaItem_NT.addItem(206, "optical_laser_control_unit");

        //ID 220~239
        NTMetaItems.SPIN_TRANSFER_TORQUE_MEMORY = metaItem_NT.addItem(220, "plate.spin_transfer_torque_memory");
        NTMetaItems.TOPOLOGICAL_INSULATOR_TUBE = metaItem_NT.addItem(221, "tube.topological_insulator");
        NTMetaItems.BOSE_EINSTEIN_CONDENSATE_CONTAINMENT_UNIT = metaItem_NT.addItem(222, "containment_unit.bose_einstein_condensate");
        NTMetaItems.BOSE_EINSTEIN_CONDENSATE = metaItem_NT.addItem(223, "bose_einstein_condensate");
        NTMetaItems.ESR_COMPUTATION_UNIT = metaItem_NT.addItem(224, "esr_computation_unit");

        //ID 240~X
        NTMetaItems.EIGENFOLDED_KERR_MANIFOLD = metaItem_NT.addItem(240, "eigenfolded.kerr.manifold");
        NTMetaItems.HYPERDIMENSIONAL_DRONE = metaItem_NT.addItem(241, "hyperdimensional.drone");

        NTMetaItems.NANO_POWER_IC_WAFER = metaItem_NT.addItem(356, "wafer.nano_power_integrated_circuit");
        NTMetaItems.PICO_POWER_IC_WAFER = metaItem_NT.addItem(357, "wafer.pico_power_integrated_circuit");
        NTMetaItems.FEMTO_POWER_IC_WAFER = metaItem_NT.addItem(358, "wafer.femto_power_integrated_circuit");

        NTMetaItems.NANO_POWER_IC = metaItem_NT.addItem(368, "plate.nano_power_integrated_circuit");
        NTMetaItems.PICO_POWER_IC = metaItem_NT.addItem(369, "plate.pico_power_integrated_circuit");
        NTMetaItems.FEMTO_POWER_IC = metaItem_NT.addItem(370, "plate.femto_power_integrated_circuit");



        NTMetaItems.SPINTRONIC_CAPACITOR = metaItem_NT.addItem(425, "component.spintronic_smd.capacitor");
        NTMetaItems.SPINTRONIC_DIODE = metaItem_NT.addItem(426, "component.spintronic_smd.diode");
        NTMetaItems.SPINTRONIC_RESISTOR = metaItem_NT.addItem(427, "component.spintronic_smd.resistor");
        NTMetaItems.SPINTRONIC_TRANSISTOR = metaItem_NT.addItem(428, "component.spintronic_smd.transistor");
        NTMetaItems.SPINTRONIC_INDUCTOR = metaItem_NT.addItem(429, "component.spintronic_smd.inductor");

        //400
        NTMetaItems.BIO_PROCESSING_UNIT = metaItem_NT.addItem(400,"item.bio_processing_unit").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaItems.ADVANCED_PROCESSOR_BOARD = metaItem_NT.addItem(401,"item.advanced_processor_board").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaItems.ADVANCED_BOARD = metaItem_NT.addItem(402,"item.advanced_board").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaItems.QUANTUM_PROCESSOR_BOARD = metaItem_NT.addItem(403,"item.quantum_processor_board").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaItems.QUANTUM_BOARD = metaItem_NT.addItem(404,"item.quantum_board").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaItems.NANO_PROCESSOR_BOARD = metaItem_NT.addItem(405,"item.nano_processor_board").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaItems.NANO_BOARD = metaItem_NT.addItem(406,"item.nano_board").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
    }

}
