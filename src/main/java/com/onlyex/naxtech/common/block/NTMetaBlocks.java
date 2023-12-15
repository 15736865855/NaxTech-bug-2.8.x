package com.onlyex.naxtech.common.block;

import com.onlyex.naxtech.common.block.blocks.*;
import com.onlyex.naxtech.common.block.blocks.machinel.NTBlockMachinelCasing;
import com.onlyex.naxtech.common.block.blocks.machinel.NTBlockMachinelCasingA;
import com.onlyex.naxtech.common.block.blocks.quantum.BlockQuantumForceTransformerCasing;
import com.onlyex.naxtech.common.block.blocks.quantum.BlockQuantumForceTransformerGlassCasing;
import gregtech.common.blocks.MetaBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class NTMetaBlocks {
    public static NTBlockDimensionWireCoil NT_WIRE_COIL;//线圈
    public static NTBlockGlassCasing GLASS_CASING;//强化硅酸盐硼玻璃
    public static NTBlockControlCasing CONTROL_CASING;//控制外壳-1
    public static NTBlockMachinelCasing MACHINE_CASING;//机械外壳-1
    public static NTBlockMachinelCasingA MACHINE_CASING_A;//机械外壳-2
    public static NTBlockPipelinelCasing PIPELINE_CASING;//管道外壳-1
    public static NTBlockPackagingline PACKAGING_LINE;//封装线外壳
    public static NTBlockComponentAssemblyLineCasing COMPONENT_ASSEMBLY_LINE_CASING;//部件装配线外壳
    public static NTBlockAdvancedAssemblyLineCasing ADVANCED_ASSEMBLY_LINE_CASING;//进阶装配线外壳
    public static NTBlockActiveMultiblockCasing ACTIVE_MULTIBLOCK_CASING;//活跃多块外壳
    public static BlockQuantumForceTransformerCasing QUANTUM_FORCE_TRANSFORMER_CASING;//量子操纵者外壳
    public static BlockQuantumForceTransformerGlassCasing QUANTUM_FORCE_TRANSFORMER_GLASS_CASING;//量子操纵者玻璃

    private NTMetaBlocks() {}
    public static void init() {
        NT_WIRE_COIL = new NTBlockDimensionWireCoil();
        NT_WIRE_COIL.setRegistryName("wire_coil");
        GLASS_CASING = new NTBlockGlassCasing();
        GLASS_CASING.setRegistryName("glasses_casing");
        CONTROL_CASING = new NTBlockControlCasing();
        CONTROL_CASING.setRegistryName("control_casing");
        MACHINE_CASING = new NTBlockMachinelCasing();
        MACHINE_CASING.setRegistryName("machine_casing");
        MACHINE_CASING_A = new NTBlockMachinelCasingA();
        MACHINE_CASING_A.setRegistryName("machine_casing_a");
        PACKAGING_LINE = new NTBlockPackagingline();
        PACKAGING_LINE.setRegistryName("packaging_line");
        COMPONENT_ASSEMBLY_LINE_CASING = new NTBlockComponentAssemblyLineCasing();
        COMPONENT_ASSEMBLY_LINE_CASING.setRegistryName("component_assembly_line_casing");
        ADVANCED_ASSEMBLY_LINE_CASING = new NTBlockAdvancedAssemblyLineCasing();
        ADVANCED_ASSEMBLY_LINE_CASING.setRegistryName("advanced_assembly_line_casing");
        PIPELINE_CASING = new NTBlockPipelinelCasing();
        PIPELINE_CASING.setRegistryName("pipelinel_casing");
        ACTIVE_MULTIBLOCK_CASING = new NTBlockActiveMultiblockCasing();
        ACTIVE_MULTIBLOCK_CASING.setRegistryName("active_multiblock_casing");
        QUANTUM_FORCE_TRANSFORMER_CASING = new BlockQuantumForceTransformerCasing();
        QUANTUM_FORCE_TRANSFORMER_CASING.setRegistryName("quantum_force_transformer_casing");
        QUANTUM_FORCE_TRANSFORMER_GLASS_CASING = new BlockQuantumForceTransformerGlassCasing();
        QUANTUM_FORCE_TRANSFORMER_GLASS_CASING.setRegistryName("quantum_force_transformer_glasses_casing");
    }

    @SideOnly(Side.CLIENT)
    public static void registerItemModels() {
        registerItemModel(CONTROL_CASING);
        registerItemModel(MACHINE_CASING);
        registerItemModel(MACHINE_CASING_A);
        registerItemModel(PACKAGING_LINE);
        registerItemModel(COMPONENT_ASSEMBLY_LINE_CASING);
        registerItemModel(ADVANCED_ASSEMBLY_LINE_CASING);
        registerItemModel(PIPELINE_CASING);
        registerItemModel(QUANTUM_FORCE_TRANSFORMER_CASING);


        //  VariantActiveBlock Registry
        NT_WIRE_COIL.onModelRegister();
        GLASS_CASING.onModelRegister();
        ACTIVE_MULTIBLOCK_CASING.onModelRegister();
        QUANTUM_FORCE_TRANSFORMER_GLASS_CASING.onModelRegister();

    }

    @SideOnly(Side.CLIENT)
    private static void registerItemModel(Block block) {
        for (IBlockState state : block.getBlockState().getValidStates()) {
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block),
                    block.getMetaFromState(state),
                    new ModelResourceLocation(block.getRegistryName(),
                            MetaBlocks.statePropertiesToString(state.getProperties())));
        }
    }

}
