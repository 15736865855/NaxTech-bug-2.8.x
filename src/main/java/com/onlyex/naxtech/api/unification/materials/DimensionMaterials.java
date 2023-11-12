package com.onlyex.naxtech.api.unification.materials;

import com.onlyex.naxtech.api.unification.NTElements;
import gregtech.api.fluids.fluidType.FluidTypes;
import gregtech.api.unification.material.Material;

import static com.onlyex.naxtech.api.unification.NTMaterials.*;
import static gregtech.api.unification.material.info.MaterialIconSet.METALLIC;
import static gregtech.api.util.GTUtility.gregtechId;



//24000-25000
public class DimensionMaterials {
    private static int startId = 24001;
    private static final int END_ID = startId + 1000;

    public static void register() {

        BlackdWarfMatter = new Material.Builder(getMaterialsId(),gregtechId("blackd_warf_matter"))
                .ingot(11).fluid()
                .color(0x000000).iconSet(METALLIC)
                .flags(NONTM)
                .fluidTemp(0)
                .build();

        WhitedWarfMatter = new Material.Builder(getMaterialsId(), gregtechId("whited_warf_matter"))
                .fluid(FluidTypes.LIQUID)
                .iconSet(METALLIC)
                .build();

        Infinity = new Material.Builder(getMaterialsId(), gregtechId("infinity"))
                .fluid(FluidTypes.LIQUID)
                .iconSet(METALLIC)
                .element(NTElements.If)
                .build();

        CosmicNeutronium = new Material.Builder(getMaterialsId(), gregtechId("cosmic_neutronium"))
                .element(NTElements.CoNe)
                .build();

        Spacetime = new Material.Builder(getMaterialsId(), gregtechId("spacetime"))
                .fluid(FluidTypes.LIQUID)
                .iconSet(METALLIC)
                .element(NTElements.SpTi)
                .build();

        Eternity = new Material.Builder(getMaterialsId(), gregtechId("eternity"))
                .fluid(FluidTypes.LIQUID)
                .iconSet(METALLIC)
                .element(NTElements.Et)
                .build();

        MagnetohydrodynamicallyConstrainedStarMatter = new Material.Builder(getMaterialsId(), gregtechId("magnetohydrodynamically_constrained_star_matter"))
                .fluid(FluidTypes.LIQUID)
                .iconSet(METALLIC)
                .element(NTElements.MaCoStMa)
                .build();

        DraconiumAwakened = new Material.Builder(getMaterialsId(),gregtechId("draconium_awakened"))
                .ingot(9).fluid()
                .color(0xFFA157).iconSet(METALLIC)
                .flags(NONTM)
                .fluidTemp(8460)
                .build();

        Draconium = new Material.Builder(getMaterialsId(),gregtechId("draconium"))
                .ingot(8).fluid()
                .color(0x6200e7).iconSet(METALLIC)
                .flags(NONTM)
                .fluidTemp(7250)
                .build();

        Lumium = new Material.Builder(getMaterialsId(), gregtechId("lumium"))
                .build();

        Enderium = new Material.Builder(getMaterialsId(), gregtechId("enderium"))
                .build();

        Signalum = new Material.Builder(getMaterialsId(), gregtechId("signalum"))
                .build();

        Mithril = new Material.Builder(getMaterialsId(), gregtechId("mithril"))
                .build();


        Shirabon = new Material.Builder(getMaterialsId(), gregtechId("shirabon"))
                .ingot(13).fluid()
                .color(0xBE125C).iconSet(METALLIC)
                .flags(NONTM)
                .element(NTElements.Shir)
                .fluidTemp(26000)
                .build();

        AstralTitanium = new Material.Builder(getMaterialsId(), gregtechId("astral_titanium"))
                .ingot(9).fluid()
                .color(0xE5ABF6).iconSet(METALLIC)
                .flags(NONTM)
                .element(NTElements.AsTi)
                .fluidTemp(6900)
                .build();

        CelestialTungsten = new Material.Builder(getMaterialsId(), gregtechId("celestial_tungsten"))
                .ingot(10).fluid()
                .color(0x303030).iconSet(METALLIC)
                .flags(NONTM)
                .element(NTElements.CeTu)
                .fluidTemp(8700)
                .build();

        Rhugnor = new Material.Builder(getMaterialsId(), gregtechId("rhugnor"))
                .ingot().fluid()
                .color(0xA80000).iconSet(METALLIC)
                .flags(NONTM)
                .build();

        Universium = new Material.Builder(getMaterialsId(), gregtechId("universium"))
                .element(NTElements.Un)
                .iconSet(METALLIC)
                .build();

        ElectrumFlux = new Material.Builder(getMaterialsId(), gregtechId("electrum_flux"))
                .iconSet(METALLIC)
                .build()
                .setFormula("(CuAu₄)(AuMa*)(CuAu₄ZnCu₃(Fe₅₀C)₂(NiAuAgCu₃(Fe₅₀C)₃)₄)(Ag₂FeMa)((CuAg₄)(Nq₂KeC)(Sn₉Sb)(CuAg₄BiZnCu₃(Fe₅₀C)₂(NiAuAgCu₃(Fe₅₀C)₃)₄)", true);

        Hypogen = new Material.Builder(getMaterialsId(), gregtechId("hypogen"))
                .iconSet(METALLIC)
                .build();
    }

    private static int getMaterialsId() {
        if (startId < END_ID) {
            return startId++;
        }
        throw new ArrayIndexOutOfBoundsException();
    }


}
