package com.onlyex.naxtech.api;

import com.onlyex.naxtech.api.block.ITier;
import com.onlyex.naxtech.api.block.impl.WrappedIntTier;
import com.onlyex.naxtech.common.block.NTMetaBlocks;
import com.onlyex.naxtech.common.block.blocks.BlockComponentAssemblyLineCasing;
import com.onlyex.naxtech.common.block.blocks.BlockDimensionWireCoil;
import com.onlyex.naxtech.common.block.blocks.BlockMachinelCasing;
import gregtech.common.blocks.BlockBoilerCasing;
import gregtech.common.blocks.BlockMachineCasing;
import gregtech.common.blocks.BlockMetalCasing;
import gregtech.common.blocks.MetaBlocks;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.minecraft.block.state.IBlockState;

import java.util.Arrays;
import java.util.stream.Collectors;

import static gregtech.api.GregTechAPI.HEATING_COILS;

public class NTAPI {

    public static final Object2ObjectOpenHashMap<IBlockState, ITier> MAP_CA_TIRED_CASING = new Object2ObjectOpenHashMap<>();
    public static final Object2ObjectOpenHashMap<IBlockState, ITier> MAP_PA_CASING = new Object2ObjectOpenHashMap<>();
    public static final Object2ObjectOpenHashMap<IBlockState, ITier> MAP_PA_INTERNAL_CASING = new Object2ObjectOpenHashMap<>();
    public static final Object2ObjectOpenHashMap<IBlockState, ITier> MAP_MACHINE_CASING = new Object2ObjectOpenHashMap<>();
    public static final Object2ObjectOpenHashMap<IBlockState, ITier> MAP_CP_CASING = new Object2ObjectOpenHashMap<>();
    public static final Object2ObjectOpenHashMap<IBlockState, ITier> MAP_CP_TUBE = new Object2ObjectOpenHashMap<>();
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

        //  MAP_PA_CASING Init
        MAP_PA_CASING.put(NTMetaBlocks.MACHINE_CASING.getState(BlockMachinelCasing.CasingType.PRECISE_ASSEMBLER_CASING_MK1),
                new WrappedIntTier(BlockMachinelCasing.CasingType.PRECISE_ASSEMBLER_CASING_MK1, 1));
        MAP_PA_CASING.put(NTMetaBlocks.MACHINE_CASING.getState(BlockMachinelCasing.CasingType.PRECISE_ASSEMBLER_CASING_MK2),
                new WrappedIntTier(BlockMachinelCasing.CasingType.PRECISE_ASSEMBLER_CASING_MK2, 2));
        MAP_PA_CASING.put(NTMetaBlocks.MACHINE_CASING.getState(BlockMachinelCasing.CasingType.PRECISE_ASSEMBLER_CASING_MK3),
                new WrappedIntTier(BlockMachinelCasing.CasingType.PRECISE_ASSEMBLER_CASING_MK3, 3));

        //  MAP_PA_INTERNAL_CASING Init
        MAP_PA_INTERNAL_CASING.put(MetaBlocks.MACHINE_CASING.getState(BlockMachineCasing.MachineCasingType.LuV),
                new WrappedIntTier(BlockMachineCasing.MachineCasingType.LuV, 1));
        MAP_PA_INTERNAL_CASING.put(MetaBlocks.MACHINE_CASING.getState(BlockMachineCasing.MachineCasingType.ZPM),
                new WrappedIntTier(BlockMachineCasing.MachineCasingType.ZPM, 2));
        MAP_PA_INTERNAL_CASING.put(MetaBlocks.MACHINE_CASING.getState(BlockMachineCasing.MachineCasingType.UV),
                new WrappedIntTier(BlockMachineCasing.MachineCasingType.UV, 3));

        //  MAP_MACHINE_CASING Init
        for (BlockMachineCasing.MachineCasingType type : Arrays.stream(BlockMachineCasing.MachineCasingType.values()).filter((c)-> c.ordinal()<10).collect(Collectors.toList())) {
            MAP_MACHINE_CASING.put(MetaBlocks.MACHINE_CASING.getState(type),new WrappedIntTier(type,type.ordinal()));
        }

        //  MAP_CP_CASING Init
        MAP_CP_CASING.put(MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.BRONZE_BRICKS),
                new WrappedIntTier(BlockMetalCasing.MetalCasingType.BRONZE_BRICKS,1));
        MAP_CP_CASING.put(MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.STEEL_SOLID),
                new WrappedIntTier(BlockMetalCasing.MetalCasingType.STEEL_SOLID,2));
        MAP_CP_CASING.put(MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.ALUMINIUM_FROSTPROOF),
                new WrappedIntTier(BlockMetalCasing.MetalCasingType.ALUMINIUM_FROSTPROOF,3));
        MAP_CP_CASING.put(MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.STAINLESS_CLEAN),
                new WrappedIntTier(BlockMetalCasing.MetalCasingType.STAINLESS_CLEAN,4));
        MAP_CP_CASING.put(MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.TITANIUM_STABLE),
                new WrappedIntTier(BlockMetalCasing.MetalCasingType.TITANIUM_STABLE,5));
        MAP_CP_CASING.put(MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.TUNGSTENSTEEL_ROBUST),
                new WrappedIntTier(BlockMetalCasing.MetalCasingType.TUNGSTENSTEEL_ROBUST,6));

        //  MAP_CP_TUBE Init
        MAP_CP_TUBE.put(MetaBlocks.BOILER_CASING.getState(BlockBoilerCasing.BoilerCasingType.BRONZE_PIPE),
                new WrappedIntTier(BlockBoilerCasing.BoilerCasingType.BRONZE_PIPE,1));
        MAP_CP_TUBE.put(MetaBlocks.BOILER_CASING.getState(BlockBoilerCasing.BoilerCasingType.STEEL_PIPE),
                new WrappedIntTier(BlockBoilerCasing.BoilerCasingType.STEEL_PIPE,2));
        MAP_CP_TUBE.put(MetaBlocks.BOILER_CASING.getState(BlockBoilerCasing.BoilerCasingType.TITANIUM_PIPE),
                new WrappedIntTier(BlockBoilerCasing.BoilerCasingType.BRONZE_PIPE,5));
        MAP_CP_TUBE.put(MetaBlocks.BOILER_CASING.getState(BlockBoilerCasing.BoilerCasingType.TUNGSTENSTEEL_PIPE),
                new WrappedIntTier(BlockBoilerCasing.BoilerCasingType.TUNGSTENSTEEL_PIPE,6));
    }
}
