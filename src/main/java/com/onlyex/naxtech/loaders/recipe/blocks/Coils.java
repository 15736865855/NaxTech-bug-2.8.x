package com.onlyex.naxtech.loaders.recipe.blocks;


import com.onlyex.naxtech.common.block.NTMetaBlocks;

import static gregtech.api.GTValues.*;
import static gregtech.api.recipes.RecipeMaps.ASSEMBLER_RECIPES;
import static gregtech.api.unification.material.Materials.Tritanium;
import static gregtech.api.unification.ore.OrePrefix.foil;
import static gregtech.api.unification.ore.OrePrefix.wireGtDouble;

public class Coils {

    /**
     * @param tier Based on the original duration formula of CEu, with a rounding of 5
     * @return New coil recipe duration
     */
    private static int resultDuration(int tier) {
        return (45 + tier * 5) * 20;
    }

    /**
     * @param tier Based on the original EUt formula of CEu
     * @return New coil EUt (based on UV tier)
     */
    private static int resultEUt(int tier) {
        return VA[UV + tier];
    }

    public static void init() {

        //  TODO New coil blocks recipe, use Mica Insulator...

        //  Adamantium Coil
        /*ASSEMBLER_RECIPES.recipeBuilder()
                .input(wireGtDouble, Adamantium, 8)
                .input(foil, AwakenedDraconium, 8)
                .fluidInputs(Tritanium.getFluid(L))
                .outputs(NTMetaBlocks.EP_WIRE_COIL.getItemVariant(EPBlockWireCoil.CoilType.ADAMANTIUM))
                .EUt(resultEUt(1))
                .duration(resultDuration(1))
                .buildAndRegister();*/
    }
}