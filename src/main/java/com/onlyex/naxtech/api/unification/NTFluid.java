package com.onlyex.naxtech.api.unification;

import gregtech.api.fluids.fluidType.FluidTypes;
import gregtech.api.unification.material.Material;

import static gregtech.api.unification.material.info.MaterialIconSet.METALLIC;
import static gregtech.api.util.GTUtility.gregtechId;
import static com.onlyex.naxtech.api.unification.NTMaterials.*;

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
                .element(NTElements.EtCySuGl)
                .build();

        CyanoacrylatePolymer = new Material.Builder(25003, gregtechId("cyanoacrylate_polymer"))
                .fluid(FluidTypes.LIQUID)
                .color(0x8C96A0)
                .element(NTElements.CyPo)
                .build();

        EthylCyanoacetate = new Material.Builder(25004, gregtechId("ethyl_cyanoacetate"))
                .fluid(FluidTypes.LIQUID)
                .color(0x004BA0).iconSet(METALLIC)
                .element(NTElements.EtCy)
                .build();

        CopperSulfatePentahydrate = new Material.Builder(25005, gregtechId("copper_sulfate_pentahydrate"))
                .dust()
                .color(0x5AAAFF)
                .flags(NOR)
                .element(NTElements.CoSuPe)
                .build();

        CopperSulfate = new Material.Builder(25006, gregtechId("copper_sulfate"))
                .dust()
                .color(0xC8C8C8)
                .flags(NOR)
                .element(NTElements.CoSu)
                .build();

        SolidAcidCatalystMixture = new Material.Builder(25007, gregtechId("solid_acid_catalyst_mixture"))
                .fluid(FluidTypes.LIQUID)
                .color(0x502800)
                .element(NTElements.SoAcCaMi)
                .build();

        CyanoaceticAcid = new Material.Builder(25008, gregtechId("cyanoacetic_acid"))
                .dust()
                .color(0x828228)
                .flags(NOR)
                .element(NTElements.CyAc)
                .build();

        SodiumCyanide = new Material.Builder(25009, gregtechId("sodium_cyanide"))
                .dust()
                .color(0xB4BEFF)
                .flags(NOR)
                .element(NTElements.SoCy)
                .build();

        ChloroaceticMixture = new Material.Builder(25010, gregtechId("chloroacetic_mixture"))
                .fluid(FluidTypes.LIQUID)
                .color(0xD2A00A)
                .element(NTElements.ChMi)
                .build();

        TrichloroaceticAcid = new Material.Builder(25011, gregtechId("trichloroacetic_acid"))
                .fluid(FluidTypes.LIQUID)
                .color(0x78641E).iconSet(METALLIC)
                .element(NTElements.TrAc)
                .build();

        DichloroaceticAcid = new Material.Builder(25012, gregtechId("dichloroacetic_acid"))
                .fluid(FluidTypes.LIQUID)
                .color(0xBEA03C).iconSet(METALLIC)
                .element(NTElements.DiAc)
                .build();

        ChloroaceticAcid = new Material.Builder(25013, gregtechId("chloroacetic_acid"))
                .fluid(FluidTypes.LIQUID)
                .color(0xE6C85A).iconSet(METALLIC)
                .element(NTElements.ChAc)
                .build();

        AceticAnhydride = new Material.Builder(25014, gregtechId("acetic_anhydride"))
                .fluid(FluidTypes.LIQUID)
                .color(0xFAF06E).iconSet(METALLIC)
                .element(NTElements.AcAn)
                .build();

    }
}
