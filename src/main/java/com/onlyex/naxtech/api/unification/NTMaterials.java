package com.onlyex.naxtech.api.unification;

import com.onlyex.naxtech.api.unification.materials.MachineCasingMaterials;
import com.onlyex.naxtech.api.unification.materials.NTDimensionMaterials;
import com.onlyex.naxtech.api.unification.materials.NTFluid;
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
    public static final List<MaterialFlag> NOR = new ArrayList<>();

    static {
        ONTEA.addAll(EXT2_METAL);
        ONTEA.addAll(Arrays.asList(GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_DENSE, GENERATE_DOUBLE_PLATE, GENERATE_FOIL));

        NONTM.addAll(ONTEA);
        NONTM.addAll(Arrays.asList(NO_UNIFICATION, EXCLUDE_BLOCK_CRAFTING_RECIPES));

        NOR.addAll(Arrays.asList(NO_UNIFICATION, DISABLE_DECOMPOSITION));
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
    public static Material ElectrumFlux;
    public static Material Hypogen;
    public static Material MARM200Steel;
    //public static Material ;
    //public static Material ;
    //public static Material ;
    //public static Material ;
    //public static Material ;
    //public static Material ;

    //流体
    public static Material MutatedIivingSolder;
    public static Material EthylCyanoacrylateSuperGlue;
    public static Material CyanoacrylatePolymer;
    public static Material EthylCyanoacetate;
    public static Material CopperSulfatePentahydrate;
    public static Material CopperSulfate;
    public static Material SolidAcidCatalystMixture;
    public static Material CyanoaceticAcid;
    public static Material SodiumCyanide;
    public static Material ChloroaceticMixture;
    public static Material TrichloroaceticAcid;
    public static Material DichloroaceticAcid;
    public static Material ChloroaceticAcid;
    public static Material AceticAnhydride;
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
        // 25001-26000
        NTFluid.register();
        //26001-27000
        MachineCasingMaterials.register();

    }
}
