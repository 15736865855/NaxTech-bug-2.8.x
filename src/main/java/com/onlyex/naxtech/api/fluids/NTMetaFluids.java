package com.onlyex.naxtech.api.fluids;

import com.onlyex.naxtech.api.unification.NTMaterials;
import gregtech.api.fluids.MetaFluids;
import gregtech.api.fluids.fluidType.FluidTypes;


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
        //MetaFluids.setMaterialFluidTexture(NTMaterials., FluidTypes.LIQUID);
        MetaFluids.setMaterialFluidTexture(NTMaterials.WhitedWarfMatter, FluidTypes.LIQUID);
        MetaFluids.setMaterialFluidTexture(NTMaterials.Infinity, FluidTypes.LIQUID);
        MetaFluids.setMaterialFluidTexture(NTMaterials.Spacetime, FluidTypes.LIQUID);
        MetaFluids.setMaterialFluidTexture(NTMaterials.Eternity, FluidTypes.LIQUID);
        MetaFluids.setMaterialFluidTexture(NTMaterials.MagnetohydrodynamicallyConstrainedStarMatter, FluidTypes.LIQUID);
        MetaFluids.setMaterialFluidTexture(NTMaterials.TemporalFluid, FluidTypes.LIQUID);
        MetaFluids.setMaterialFluidTexture(NTMaterials.SpatialFluid, FluidTypes.LIQUID);
        MetaFluids.setMaterialFluidTexture(NTMaterials.Rawstarmatter, FluidTypes.LIQUID);
        MetaFluids.setMaterialFluidTexture(NTMaterials.PrimordialMatter, FluidTypes.LIQUID);


        MetaFluids.setMaterialFluidTexture(NTMaterials.DimensionallyTranscendentResidue, FluidTypes.PLASMA);
        MetaFluids.setMaterialFluidTexture(NTMaterials.ExciteddtCC, FluidTypes.PLASMA);
        MetaFluids.setMaterialFluidTexture(NTMaterials.ExciteddtPC, FluidTypes.PLASMA);
        MetaFluids.setMaterialFluidTexture(NTMaterials.ExciteddtRC, FluidTypes.PLASMA);
        MetaFluids.setMaterialFluidTexture(NTMaterials.ExciteddtEC, FluidTypes.PLASMA);
        MetaFluids.setMaterialFluidTexture(NTMaterials.ExciteddtSC, FluidTypes.PLASMA);

    }
}
