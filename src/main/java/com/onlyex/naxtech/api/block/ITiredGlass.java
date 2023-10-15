package com.onlyex.naxtech.api.block;

import com.onlyex.naxtech.common.block.NTMetaBlocks;
import gregtech.api.GTValues;
import gregtech.common.blocks.MetaBlocks;
import net.minecraft.block.state.IBlockState;

public interface ITiredGlass extends ITired {


    @Override
    default Object getTire() {
        return getGlassTier();
    }
    
    int getGlassTier();
    
    default long getTireVoltage(){
        return GTValues.V[getGlassTier()];
    }
    
    default String getTireName(){
        return GTValues.VN[getGlassTier()];
    }
    
    default String getTireNameColored(){
        return GTValues.VNF[getGlassTier()];
    }
    
    static int getGlassTier(IBlockState state){
        if(state.getBlock() == MetaBlocks.TRANSPARENT_CASING){
            return ((ITiredGlass)(Object)MetaBlocks.TRANSPARENT_CASING.getState(state)).getGlassTier();
        }
        if(state.getBlock() == NTMetaBlocks.BW_GlasBlocks){
            return NTMetaBlocks.BW_GlasBlocks.getState(state).getGlassTier();
        }
        return 0;
    }
}
