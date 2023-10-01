package com.onlyex.naxtech.api.unification;

import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.info.MaterialFlag;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static gregtech.api.unification.material.Materials.EXT2_METAL;
import static gregtech.api.unification.material.info.MaterialFlags.*;

public class NTMaterials {

    public static final List<MaterialFlag> ONTEA = new ArrayList<>();
    public static final List<MaterialFlag> NONTM = new ArrayList<>();

    static {
        ONTEA.addAll(EXT2_METAL);
        ONTEA.addAll(Arrays.asList(GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_DENSE, GENERATE_DOUBLE_PLATE, GENERATE_FOIL));

        NONTM.addAll(ONTEA);
        NONTM.addAll(Arrays.asList(NO_UNIFICATION, EXCLUDE_BLOCK_CRAFTING_RECIPES));
    }

    //材料
    public static Material BlackdWarfMatter;
    public static Material WhitedWarfMatter;
    public static Material Infinity;
    public static Material CosmicNeutronium;
    public static Material Spacetime;
    public static Material Universium;
    public static Material Eternity;
    public static Material MagnetohydrodynamicallyConstrainedStarMatter;
    public static Material DraconiumAwakened;
    public static Material Draconium;
    public static Material Lumium;
    public static Material Enderium;
    public static Material Signalum;
    public static Material Mithril;
    public static Material Shirabon;
    public static Material AstralTitanium;
    public static Material CelestialTungsten;
    public static Material Rhugnor;
    //public static Material ;
    //public static Material ;
    //public static Material ;
    //public static Material ;
    //public static Material ;
    //public static Material ;
    //public static Material ;
    //public static Material ;

    //流体
    //public static Material ;
    //public static Material ;
    //public static Material ;
    //public static Material ;
    //public static Material ;
    //public static Material ;
    //public static Material ;
    //public static Material ;
    //public static Material ;
    //public static Material ;
    //public static Material ;




    public NTMaterials() {}
    public static void initregister() {
        // 24000-25000
        NTDimensionMaterials.register();
        // 25000-26000
        NTFluid.register();

    }
}
