package com.onlyex.naxtech.client.textures;

import com.onlyex.naxtech.client.renderer.texture.custom.IsaMillRenderer;
import gregtech.client.renderer.texture.cube.OrientedOverlayRenderer;
import gregtech.client.renderer.texture.cube.SimpleOverlayRenderer;
import gregtech.client.renderer.texture.cube.SimpleSidedCubeRenderer;

public class NTTextures {
//public static final OrientedOverlayRenderer ;
/*
SimpleSidedCubeRenderer
SimpleOverlayRenderer
OrientedOverlayRenderer
*/
    public static NTOverlayRenderer PACKAGING_LINE = new NTOverlayRenderer("casings/solid/machine_packaging_line");
    public static NTOverlayRenderer ADVANCED_ASSEMBLY_LINE = new NTOverlayRenderer("casings/solid/advanced_assembly_line");
    public static NTOverlayRenderer MULTIPART_CATALYST_HATCH = new NTOverlayRenderer("multiparts/overlay_catalyst_hatch");
    public static NTOverlayRenderer ADVANCED_INVAR_CASING = new NTOverlayRenderer("casings/solid/advanced_invar_casing");
    public static NTOverlayRenderer ADVANCED_ALUMINIUM_CASING = new NTOverlayRenderer("casings/solid/advanced_aluminium_casing");
    public static NTOverlayRenderer PRECISE_ASSEMBLER_CASING_MK1 = new NTOverlayRenderer("casings/solid/precise_assembler_casing_mk1");
    public static NTOverlayRenderer PRECISE_ASSEMBLER_CASING_MK2 = new NTOverlayRenderer("casings/solid/precise_assembler_casing_mk2");
    public static NTOverlayRenderer PRECISE_ASSEMBLER_CASING_MK3 = new NTOverlayRenderer("casings/solid/precise_assembler_casing_mk3");
    public static OrientedOverlayRenderer CRYOGENIC_REACTOR_OVERLAY = new OrientedOverlayRenderer("multiblock/cryogenic_reactor");
    public static NTOverlayRenderer IRIDIUM_CASING = new NTOverlayRenderer("casings/solid/advanced_assembly_line");
    public static OrientedOverlayRenderer CVD_UNIT_OVERLAY = new OrientedOverlayRenderer("multiblock/cvd_unit");
    public static OrientedOverlayRenderer CHEMICAL_PLANT_OVERLAY = new OrientedOverlayRenderer("multiblock/chemical_plant");
    public static NTOverlayRenderer FLOTATION_CASING = new NTOverlayRenderer("casings/solid/flotation_casing");
    public static NTOverlayRenderer ISA_MILL_CASING = new NTOverlayRenderer("casings/solid/isa_mill_casing");
    public static NTOverlayRenderer MULTIPART_BUFFER_HATCH = new NTOverlayRenderer("multiparts/overlay_buffer_hatch");
    public static OrientedOverlayRenderer ISA_MILL_OVERLAY = new OrientedOverlayRenderer("multiblock/isa_mill");

    public static IsaMillRenderer ISA_MILL = new IsaMillRenderer();
    public static void preInit() {}
}
