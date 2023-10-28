package com.onlyex.naxtech.api.unification;

import gregtech.api.fluids.fluidType.FluidTypes;
import gregtech.api.unification.material.Material;

import static com.onlyex.naxtech.api.unification.NTMaterials.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.info.MaterialIconSet.METALLIC;
import static gregtech.api.util.GTUtility.gregtechId;

public class NTFluid {
    /*
     = new Material.Builder(250, gregtechId(""))
                .fluid(FluidTypes.LIQUID)
                .color(0x)
                .element(NTElements.)
                .build();
     */
    public static void register() {
        MutatedIivingSolder = new Material.Builder(25001, gregtechId("mutated_iiving_solder"))
                .fluid(FluidTypes.LIQUID)
                .color(0x93699B).iconSet(METALLIC)
                .element(NTElements.MuIiSo)
                .build();

        EthylCyanoacrylateSuperGlue = new Material.Builder(25002, gregtechId("ethyl_cyanoacrylate_super_glue"))
                .fluid(FluidTypes.LIQUID)
                .color(0xAABEC8).iconSet(METALLIC)
                .components(Carbon, 6,Hydrogen, 7,Nitrogen, 1,Oxygen, 2)//C₆H₇NO₂
                .build();

        CyanoacrylatePolymer = new Material.Builder(25003, gregtechId("cyanoacrylate_polymer"))
                .fluid(FluidTypes.LIQUID)
                .color(0x8C96A0)
                .element(NTElements.CyPo)
                .build();

        EthylCyanoacetate = new Material.Builder(25004, gregtechId("ethyl_cyanoacetate"))
                .fluid(FluidTypes.LIQUID)
                .color(0x004BA0).iconSet(METALLIC)
                .components(Carbon, 5,Hydrogen, 7,Nitrogen, 1,Oxygen, 2)//C₅H₇NO₂
                .build();

        CopperSulfatePentahydrate = new Material.Builder(25005, gregtechId("copper_sulfate_pentahydrate"))
                .dust()
                .color(0x5AAAFF)
                .flags(NOR)
                .build()
                .setFormula("CuSO₄∙(H₂O)₅", true);

        CopperSulfate = new Material.Builder(25006, gregtechId("copper_sulfate"))
                .dust()
                .color(0xC8C8C8)
                .flags(NOR)
                .components(Copper, 1,Sulfur, 1,Oxygen, 4)//CuSO₄
                .build();

        SolidAcidCatalystMixture = new Material.Builder(25007, gregtechId("solid_acid_catalyst_mixture"))
                .fluid(FluidTypes.LIQUID)
                .color(0x502800)
                .build()
                .setFormula("?H₂SO₄?", true);

        CyanoaceticAcid = new Material.Builder(25008, gregtechId("cyanoacetic_acid"))
                .dust()
                .color(0x828228)
                .flags(NOR)
                .components(Carbon, 3,Hydrogen, 3,Nitrogen, 1,Oxygen, 2)//C₃H₃NO₂
                .build();

        SodiumCyanide = new Material.Builder(25009, gregtechId("sodium_cyanide"))
                .dust()
                .color(0xB4BEFF)
                .flags(NOR)
                .components(Sodium, 1,Carbon, 1,Nitrogen, 1)//NaCN
                .build();

        ChloroaceticMixture = new Material.Builder(25010, gregtechId("chloroacetic_mixture"))
                .fluid(FluidTypes.LIQUID)
                .color(0xD2A00A)
                .build()
                .setFormula("Cl?H?C-COOH", true);

        TrichloroaceticAcid = new Material.Builder(25011, gregtechId("trichloroacetic_acid"))
                .fluid(FluidTypes.LIQUID)
                .color(0x78641E).iconSet(METALLIC)
                .build()
                .setFormula("Cl₃C-COOH", true);

        DichloroaceticAcid = new Material.Builder(25012, gregtechId("dichloroacetic_acid"))
                .fluid(FluidTypes.LIQUID)
                .color(0xBEA03C).iconSet(METALLIC)
                .build()
                .setFormula("Cl₂CH-COOH", true);

        ChloroaceticAcid = new Material.Builder(25013, gregtechId("chloroacetic_acid"))
                .fluid(FluidTypes.LIQUID)
                .color(0xE6C85A).iconSet(METALLIC)
                .build()
                .setFormula("ClCH₂-COOH", true);

        AceticAnhydride = new Material.Builder(25014, gregtechId("acetic_anhydride"))
                .fluid(FluidTypes.LIQUID)
                .color(0xFAF06E).iconSet(METALLIC)
                .build()
                .setFormula("(CH₃CO)₂O", true);

    }
}
