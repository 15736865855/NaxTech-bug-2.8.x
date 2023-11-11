package com.onlyex.naxtech.api;

import com.onlyex.naxtech.api.block.ITier;
import com.onlyex.naxtech.api.block.impl.WrappedIntTier;
import com.onlyex.naxtech.common.block.NTMetaBlocks;
import com.onlyex.naxtech.common.block.blocks.BlockComponentAssemblyLineCasing;
import com.onlyex.naxtech.common.block.blocks.BlockDimensionWireCoil;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.minecraft.block.state.IBlockState;

import static gregtech.api.GregTechAPI.HEATING_COILS;

public class NTAPI {

    public static final Object2ObjectOpenHashMap<IBlockState, ITier> MAP_CA_TIRED_CASING = new Object2ObjectOpenHashMap<>();

    public static void APIBlockInit() {
        //  HEATING_COILS Addition
        for (BlockDimensionWireCoil.CoilType type : BlockDimensionWireCoil.CoilType.values()) {
            HEATING_COILS.put(NTMetaBlocks.BLOCK_DIMENSION_WIRE_COIL.getState(type), type);
        }
        //  MAP_CA_TIRED_CASING Init
        
        MAP_CA_TIRED_CASING.put(NTMetaBlocks.COMPONENT_ASSEMBLY_LINE_CASING.getState(BlockComponentAssemblyLineCasing.CasingTier.LV),
                new WrappedIntTier(BlockComponentAssemblyLineCasing.CasingTier.LV, 1));
        MAP_CA_TIRED_CASING.put(NTMetaBlocks.COMPONENT_ASSEMBLY_LINE_CASING.getState(BlockComponentAssemblyLineCasing.CasingTier.MV),
                new WrappedIntTier(BlockComponentAssemblyLineCasing.CasingTier.MV, 2));
        MAP_CA_TIRED_CASING.put(NTMetaBlocks.COMPONENT_ASSEMBLY_LINE_CASING.getState(BlockComponentAssemblyLineCasing.CasingTier.HV),
                new WrappedIntTier(BlockComponentAssemblyLineCasing.CasingTier.HV, 3));
        MAP_CA_TIRED_CASING.put(NTMetaBlocks.COMPONENT_ASSEMBLY_LINE_CASING.getState(BlockComponentAssemblyLineCasing.CasingTier.EV),
                new WrappedIntTier(BlockComponentAssemblyLineCasing.CasingTier.EV, 4));
        MAP_CA_TIRED_CASING.put(NTMetaBlocks.COMPONENT_ASSEMBLY_LINE_CASING.getState(BlockComponentAssemblyLineCasing.CasingTier.IV),
                new WrappedIntTier(BlockComponentAssemblyLineCasing.CasingTier.IV, 5));
        MAP_CA_TIRED_CASING.put(NTMetaBlocks.COMPONENT_ASSEMBLY_LINE_CASING.getState(BlockComponentAssemblyLineCasing.CasingTier.LuV),
                new WrappedIntTier(BlockComponentAssemblyLineCasing.CasingTier.LuV, 6));
        MAP_CA_TIRED_CASING.put(NTMetaBlocks.COMPONENT_ASSEMBLY_LINE_CASING.getState(BlockComponentAssemblyLineCasing.CasingTier.ZPM),
                new WrappedIntTier(BlockComponentAssemblyLineCasing.CasingTier.ZPM, 7));
        MAP_CA_TIRED_CASING.put(NTMetaBlocks.COMPONENT_ASSEMBLY_LINE_CASING.getState(BlockComponentAssemblyLineCasing.CasingTier.UV),
                new WrappedIntTier(BlockComponentAssemblyLineCasing.CasingTier.UV, 8));
        MAP_CA_TIRED_CASING.put(NTMetaBlocks.COMPONENT_ASSEMBLY_LINE_CASING.getState(BlockComponentAssemblyLineCasing.CasingTier.UHV),
                new WrappedIntTier(BlockComponentAssemblyLineCasing.CasingTier.UHV, 9));
        MAP_CA_TIRED_CASING.put(NTMetaBlocks.COMPONENT_ASSEMBLY_LINE_CASING.getState(BlockComponentAssemblyLineCasing.CasingTier.UEV),
                new WrappedIntTier(BlockComponentAssemblyLineCasing.CasingTier.UEV, 10));
        MAP_CA_TIRED_CASING.put(NTMetaBlocks.COMPONENT_ASSEMBLY_LINE_CASING.getState(BlockComponentAssemblyLineCasing.CasingTier.UIV),
                new WrappedIntTier(BlockComponentAssemblyLineCasing.CasingTier.UIV, 11));
        MAP_CA_TIRED_CASING.put(NTMetaBlocks.COMPONENT_ASSEMBLY_LINE_CASING.getState(BlockComponentAssemblyLineCasing.CasingTier.UXV),
                new WrappedIntTier(BlockComponentAssemblyLineCasing.CasingTier.UXV, 12));
        MAP_CA_TIRED_CASING.put(NTMetaBlocks.COMPONENT_ASSEMBLY_LINE_CASING.getState(BlockComponentAssemblyLineCasing.CasingTier.OpV),
                new WrappedIntTier(BlockComponentAssemblyLineCasing.CasingTier.OpV, 13));
        MAP_CA_TIRED_CASING.put(NTMetaBlocks.COMPONENT_ASSEMBLY_LINE_CASING.getState(BlockComponentAssemblyLineCasing.CasingTier.MAX),
                new WrappedIntTier(BlockComponentAssemblyLineCasing.CasingTier.MAX, 14));
    }
}
