package com.onlyex.naxtech.api.fluids;

import com.onlyex.naxtech.api.unification.NTMaterials;
import gregtech.api.fluids.fluidType.FluidTypes;

import static gregtech.api.fluids.MetaFluids.setMaterialFluidTexture;

public class NTMetaFluids {
    /**
     *FluidTypes.GAS
     * 气体
     *FluidTypes.PLASMA
     *等离子体
     *FluidTypes.LIQUID
     *液体
     *FluidTypes.ACID
     *酸性物质
     * */

    public static void init(){
        // alternative names for forestry fluids = 林业液体的替代名称
        //addAlternativeNames();

        // set custom textures for fluids = 为流体设置自定义纹理
        setCustomTextures();
    }

    private static void setCustomTextures() {
        //setMaterialFluidTexture(NTMaterials., FluidTypes.LIQUID);
        setMaterialFluidTexture(NTMaterials.WhitedWarfMatter, FluidTypes.LIQUID);
        setMaterialFluidTexture(NTMaterials.Infinity, FluidTypes.LIQUID);
        setMaterialFluidTexture(NTMaterials.Spacetime, FluidTypes.LIQUID);
        setMaterialFluidTexture(NTMaterials.Eternity, FluidTypes.LIQUID);
        setMaterialFluidTexture(NTMaterials.MagnetohydrodynamicallyConstrainedStarMatter, FluidTypes.LIQUID);
    }
}
