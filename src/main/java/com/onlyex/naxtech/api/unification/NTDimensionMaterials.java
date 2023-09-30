package com.onlyex.naxtech.api.unification;

import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.properties.BlastProperty;

import static gregtech.api.GTValues.*;
import static gregtech.api.unification.material.info.MaterialIconSet.METALLIC;
import static gregtech.api.util.GTUtility.gregtechId;
import static com.onlyex.naxtech.api.unification.NTMaterials.*;



//24000-25000
public class NTDimensionMaterials {

    public static void init() {

        BlackdWarfMatter = new Material.Builder(24000,gregtechId("blackd_warf_matter"))
                .ingot().fluid()
                .color(0x000000).iconSet(METALLIC)
                .flags(ONTEA)
                .blastTemp(10800, BlastProperty.GasTier.HIGH, VA[UIV], 300)
                .fluidTemp(0)
                .build();

        WhitedWarfMatter = new Material.Builder(24001, gregtechId("whited_warf_matter"))
                .fluid()
                .build();

        Infinity = new Material.Builder(24002, gregtechId("infinity"))
                .fluid()
                .element(NTElements.If)
                .build();

        CosmicNeutronium = new Material.Builder(24003, gregtechId("cosmic_neutronium"))
                .element(NTElements.CN)
                .build();

        Spacetime = new Material.Builder(24004, gregtechId("spacetime"))
                .fluid()
                .element(NTElements.ST)
                .build();

        Eternity = new Material.Builder(24005, gregtechId("eternity"))
                .fluid()
                .element(NTElements.N_UNCOUNT)
                .build();

        MagnetohydrodynamicallyConstrainedStarMatter = new Material.Builder(24006, gregtechId("magnetohydrodynamically_constrained_star_matter"))
                .fluid()
                .element(NTElements.MCSM)
                .build();

        DraconiumAwakened = new Material.Builder(24007,gregtechId("draconium_awakened"))
                .ingot().fluid()
                .color(0xFFA157).iconSet(METALLIC)
                .flags(ONTEA)
                .blastTemp(8600, BlastProperty.GasTier.HIGH, VA[UHV], 300)
                .fluidTemp(8460)
                .build();

        Draconium = new Material.Builder(24008,gregtechId("draconium"))
                .ingot().fluid()
                .color(0x6200e7).iconSet(METALLIC)
                .flags(ONTEA)
                .blastTemp(7600, BlastProperty.GasTier.HIGH, VA[UV], 180)
                .fluidTemp(7250)
                .build();

        Lumium = new Material.Builder(24009, gregtechId("lumium"))
                .build();

        Enderium = new Material.Builder(24010, gregtechId("enderium"))
                .build();

        Signalum = new Material.Builder(24011, gregtechId("signalum"))
                .build();

        Mithril = new Material.Builder(24012, gregtechId("mithril"))
                .build();

/*
        Shirabon = new Material.Builder(24013, gregtechId("shirabon"))
                .ingot().fluid()
                .color(0xBE125C).iconSet(METALLIC)
                .element(NTElements.SHON)
                //.flags(ONTEA)
                //.blastTemp(13000, BlastProperty.GasTier.HIGH, VA[OpV], 1200)
                //.fluidTemp(26000)
                .build();

        AstralTitanium = new Material.Builder(24014, gregtechId("astral_titanium"))
                .ingot().fluid()
                .color(0xE5ABF6).iconSet(METALLIC)
                .element(NTElements.ATi)
                //.flags(ONTEA)
                //.blastTemp(9700, BlastProperty.GasTier.HIGH, VA[UHV], 900)
                //.fluidTemp(6900)
                .build();

        CelestialTungsten = new Material.Builder(24015, gregtechId("celestial_tungsten"))
                .ingot().fluid()
                .color(0x303030).iconSet(METALLIC)
                .element(NTElements.CTW)
                //.flags(ONTEA)
                //.blastTemp(10470, BlastProperty.GasTier.HIGH, VA[UEV], 480)
                //.fluidTemp(8700)
                .build();

        Rhugnor = new Material.Builder(24016, gregtechId("rhugnor"))
                .ingot().fluid()
                .color(0xA80000).iconSet(METALLIC)
                //.flags(ONTEA)
                .build();

         */
    }




}
