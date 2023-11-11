package com.onlyex.naxtech.api.unification.materials;

import com.onlyex.naxtech.api.unification.NTElements;
import gregtech.api.fluids.fluidType.FluidTypes;
import gregtech.api.unification.material.Material;

import static com.onlyex.naxtech.api.unification.NTMaterials.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.info.MaterialIconSet.METALLIC;
import static gregtech.api.util.GTUtility.gregtechId;

public class NTFluid {
    /*
     = new Material.Builder(getMaterialsId(), gregtechId(""))
                .fluid(FluidTypes.LIQUID)
                .color(0x)
                .element(NTElements.)
                .build();
     */
    private static int startId = 25001;
    private static final int END_ID = startId + 1000;
    public static void register() {
        MutatedIivingSolder = new Material.Builder(getMaterialsId(), gregtechId("mutated_iiving_solder"))
                .fluid(FluidTypes.LIQUID)
                .color(0x93699B).iconSet(METALLIC)
                .element(NTElements.MuIiSo)
                .build();

        EthylCyanoacrylateSuperGlue = new Material.Builder(getMaterialsId(), gregtechId("ethyl_cyanoacrylate_super_glue"))
                .fluid(FluidTypes.LIQUID)
                .color(0xAABEC8).iconSet(METALLIC)
                .components(Carbon, 6,Hydrogen, 7,Nitrogen, 1,Oxygen, 2)//C₆H₇NO₂
                .build();

        CyanoacrylatePolymer = new Material.Builder(getMaterialsId(), gregtechId("cyanoacrylate_polymer"))
                .fluid(FluidTypes.LIQUID)
                .color(0x8C96A0)
                .element(NTElements.CyPo)
                .build();

        EthylCyanoacetate = new Material.Builder(getMaterialsId(), gregtechId("ethyl_cyanoacetate"))
                .fluid(FluidTypes.LIQUID)
                .color(0x004BA0).iconSet(METALLIC)
                .components(Carbon, 5,Hydrogen, 7,Nitrogen, 1,Oxygen, 2)//C₅H₇NO₂
                .build();

        CopperSulfatePentahydrate = new Material.Builder(getMaterialsId(), gregtechId("copper_sulfate_pentahydrate"))
                .dust()
                .color(0x5AAAFF)
                .flags(NOR)
                .build()
                .setFormula("CuSO₄∙(H₂O)₅", true);

        CopperSulfate = new Material.Builder(getMaterialsId(), gregtechId("copper_sulfate"))
                .dust()
                .color(0xC8C8C8)
                .flags(NOR)
                .components(Copper, 1,Sulfur, 1,Oxygen, 4)//CuSO₄
                .build();

        SolidAcidCatalystMixture = new Material.Builder(getMaterialsId(), gregtechId("solid_acid_catalyst_mixture"))
                .fluid(FluidTypes.LIQUID)
                .color(0x502800)
                .build()
                .setFormula("?H₂SO₄?", true);

        CyanoaceticAcid = new Material.Builder(getMaterialsId(), gregtechId("cyanoacetic_acid"))
                .dust()
                .color(0x828228)
                .flags(NOR)
                .components(Carbon, 3,Hydrogen, 3,Nitrogen, 1,Oxygen, 2)//C₃H₃NO₂
                .build();

        SodiumCyanide = new Material.Builder(getMaterialsId(), gregtechId("sodium_cyanide"))
                .dust()
                .color(0xB4BEFF)
                .flags(NOR)
                .components(Sodium, 1,Carbon, 1,Nitrogen, 1)//NaCN
                .build();

        ChloroaceticMixture = new Material.Builder(getMaterialsId(), gregtechId("chloroacetic_mixture"))
                .fluid(FluidTypes.LIQUID)
                .color(0xD2A00A)
                .build()
                .setFormula("Cl?H?C-COOH", true);

        TrichloroaceticAcid = new Material.Builder(getMaterialsId(), gregtechId("trichloroacetic_acid"))
                .fluid(FluidTypes.LIQUID)
                .color(0x78641E).iconSet(METALLIC)
                .build()
                .setFormula("Cl₃C-COOH", true);

        DichloroaceticAcid = new Material.Builder(getMaterialsId(), gregtechId("dichloroacetic_acid"))
                .fluid(FluidTypes.LIQUID)
                .color(0xBEA03C).iconSet(METALLIC)
                .build()
                .setFormula("Cl₂CH-COOH", true);

        ChloroaceticAcid = new Material.Builder(getMaterialsId(), gregtechId("chloroacetic_acid"))
                .fluid(FluidTypes.LIQUID)
                .color(0xE6C85A).iconSet(METALLIC)
                .build()
                .setFormula("ClCH₂-COOH", true);

        AceticAnhydride = new Material.Builder(getMaterialsId(), gregtechId("acetic_anhydride"))
                .fluid(FluidTypes.LIQUID)
                .color(0xFAF06E).iconSet(METALLIC)
                .build()
                .setFormula("(CH₃CO)₂O", true);

    }
    private static int getMaterialsId() {
        if (startId < END_ID) {
            return startId++;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}
