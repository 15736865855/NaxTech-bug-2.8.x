package com.onlyex.naxtech.loaders;


import com.onlyex.naxtech.api.unification.NTMaterials;
import com.onlyex.naxtech.common.block.NTMetaBlocks;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.ore.OrePrefix;
import net.minecraft.item.ItemStack;

public class NTOreDictionaryLoader {
    public static void init() {
        //NTOreDictUnifier.registerOre(new ItemStack());bolt
        //for (Material material : new Material[]{NTMaterials.Infinity,NTMaterials.CosmicNeutronium}) {
        //            for (ItemStack BlockDimension : OreDictUnifier.getAll(new UnificationEntry(OrePrefix.block, material))) {
        //               OreDictUnifier.registerOre(BlockDimension, OrePrefix.block, material);
        //            }
        //        }


        OreDictUnifier.registerOre(new ItemStack(NTMetaBlocks.DIMENSION,1,0), OrePrefix.block, NTMaterials.WhitedWarfMatter);
        OreDictUnifier.registerOre(new ItemStack(NTMetaBlocks.DIMENSION,1,1), OrePrefix.block, NTMaterials.Spacetime);
        OreDictUnifier.registerOre(new ItemStack(NTMetaBlocks.DIMENSION,1,2), OrePrefix.block, NTMaterials.Eternity);


        OreDictUnifier.registerOre(new ItemStack(NTMetaBlocks.DIMENSION_FRAME,1,0), OrePrefix.frameGt, NTMaterials.Infinity);
        OreDictUnifier.registerOre(new ItemStack(NTMetaBlocks.DIMENSION_FRAME,1,1), OrePrefix.frameGt, NTMaterials.CosmicNeutronium);
        OreDictUnifier.registerOre(new ItemStack(NTMetaBlocks.DIMENSION_FRAME,1,2), OrePrefix.frameGt, NTMaterials.WhitedWarfMatter);
        OreDictUnifier.registerOre(new ItemStack(NTMetaBlocks.DIMENSION_FRAME,1,3), OrePrefix.frameGt, NTMaterials.Spacetime);
        OreDictUnifier.registerOre(new ItemStack(NTMetaBlocks.DIMENSION_FRAME,1,4), OrePrefix.frameGt, NTMaterials.Eternity);
        OreDictUnifier.registerOre(new ItemStack(NTMetaBlocks.DIMENSION_FRAME,1,5), OrePrefix.frameGt, NTMaterials.MagnetohydrodynamicallyConstrainedStarMatter);

    }
}
