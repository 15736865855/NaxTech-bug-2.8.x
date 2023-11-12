package com.onlyex.naxtech.api.unification.materials;

import com.onlyex.naxtech.api.unification.NTElements;
import gregtech.api.fluids.fluidType.FluidTypes;
import gregtech.api.unification.Elements;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.properties.ToolProperty;

import static com.onlyex.naxtech.api.unification.NTMaterials.*;
import static com.onlyex.naxtech.api.unification.info.NTMaterialIconSet.*;
import static gregtech.api.GTValues.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.unification.material.info.MaterialIconSet.*;
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
                .ingot().fluid(FluidTypes.LIQUID)
                .iconSet(CUSTOM_WWM)
                .flags(DIMENSION)
                .build();

        Infinity = new Material.Builder(getMaterialsId(), gregtechId("infinity"))
                .ingot().fluid(FluidTypes.LIQUID, true)
                .iconSet(CUSTOM_IF)
                .flags(DIMENSION)
                .element(NTElements.If)
                .build();

        CosmicNeutronium = new Material.Builder(getMaterialsId(), gregtechId("cosmic_neutronium"))//TODO 方块 流体 材质
                .ingot().fluid(FluidTypes.LIQUID, true)
                .element(NTElements.CoNe)
                .color(0x323232).iconSet(CUSTOM_CN)
                .flags(DIMENSION)
                .build();

        Spacetime = new Material.Builder(getMaterialsId(), gregtechId("spacetime"))
                .ingot().fluid(FluidTypes.LIQUID)
                .iconSet(CUSTOM_SPACETIME)
                .flags(DIMENSION)
                .element(NTElements.SpTi)
                .build();

        Eternity = new Material.Builder(getMaterialsId(), gregtechId("eternity"))
                .ingot().fluid(FluidTypes.LIQUID)
                .iconSet(CUSTOM_ETERNITY)
                .flags(DIMENSION)
                .element(NTElements.Et)
                .build();

        MagnetohydrodynamicallyConstrainedStarMatter = new Material.Builder(getMaterialsId(), gregtechId("magneto_hydrodynamically_constrained_star_matter"))
                .ingot().fluid(FluidTypes.LIQUID)
                .iconSet(CUSTOM_MHCSM)
                .flags(NONTM, GENERATE_FRAME, GENERATE_GEAR, GENERATE_SMALL_GEAR, GENERATE_ROUND, GENERATE_RING)
                .element(NTElements.MaCoStMa)
                .build();

        DraconiumChaotic = new Material.Builder(getMaterialsId(),gregtechId("draconium_chaotic"))
                .ingot(10).fluid()
                .color(0x2C195A).iconSet(METALLIC)
                .flags(NONTM)
                .fluidTemp(9430)
                .element(NTElements.ChaoticDraconium)
                .build();

        DraconiumAwakened = new Material.Builder(getMaterialsId(),gregtechId("draconium_awakened"))
                .ingot(9).fluid()
                .color(0xFFA157).iconSet(METALLIC)
                .flags(NONTM)
                .fluidTemp(8460)
                .element(NTElements.AwakenedDraconium)
                .build();

        Draconium = new Material.Builder(getMaterialsId(),gregtechId("draconium"))
                .ingot(8).fluid()
                .color(0x6200e7).iconSet(METALLIC)
                .flags(NONTM)
                .fluidTemp(7250)
                .element(NTElements.Draconium)
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
                .fluid()
                .color(0xBE00FF).iconSet(METALLIC)
                .fluidTemp((int) (V[UIV] - V[UV]))
                .element(NTElements.Rhugnor)
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
                .ingot()
                .fluid()
                .plasma()
                .fluidTemp((int) (V[UXV] - V[LuV]))
                .element(NTElements.Hypogen)
                .color(0xDC784B)
                .iconSet(CUSTOM_HYPOGEN)
                .toolStats(ToolProperty.Builder.of(20.0F, 200.0F, 2000000, 200).unbreakable().enchantability(33).magnetic().build())
                .flags(GENERATE_PLATE, NO_UNIFICATION)
                .build();

        TranscendentMetal = new Material.Builder(getMaterialsId(), gregtechId("transcendent_metal"))
                .fluid(FluidTypes.LIQUID, true)
                .iconSet(METALLIC)
                .build();

        DegenerateRhenium = new Material.Builder(getMaterialsId(), gregtechId("degenerate_rhenium"))
                .dust()
                .fluid(FluidTypes.PLASMA)
                .fluidTemp((int) V[UV])
                .color(0x6666FF)
                .iconSet(CUSTOM_DEGENERATE_RHENIUM)
                .element(Elements.Rh)
                .flags(GENERATE_PLATE, NO_UNIFICATION)
                .build()
                .setFormula("§cR§de", false);

    }

    private static int getMaterialsId() {
        if (startId < END_ID) {
            return startId++;
        }
        throw new ArrayIndexOutOfBoundsException();
    }


}
