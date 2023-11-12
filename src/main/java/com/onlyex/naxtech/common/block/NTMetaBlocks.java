package com.onlyex.naxtech.common.block;

import com.onlyex.naxtech.common.block.blocks.*;
import gregtech.common.blocks.MetaBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Objects;

public class NTMetaBlocks {
    public static BlockDimensionWireCoil BLOCK_DIMENSION_WIRE_COIL;//线圈
    public static BlockGlassCasing GLASS_CASING;//强化硅酸盐硼玻璃
    public static BlockControlCasing CONTROL_CASING;//控制外壳
    public static BlockMachinelCasing MACHINE_CASING;//机械外壳
    public static BlockPipelinelCasing PIPELINE_CASING;//管道外壳
    public static BlockPackagingline PACKAGING_LINE;//封装线外壳
    public static BlockComponentAssemblyLineCasing COMPONENT_ASSEMBLY_LINE_CASING;//部件装配线外壳
    public static BlockAdvancedAssemblyLineCasing ADVANCED_ASSEMBLY_LINE_CASING;//进阶装配线外壳

    private NTMetaBlocks() {}
    public static void init() {
        BLOCK_DIMENSION_WIRE_COIL = new BlockDimensionWireCoil();
        BLOCK_DIMENSION_WIRE_COIL.setRegistryName("wire_coil");
        GLASS_CASING = new BlockGlassCasing();
        GLASS_CASING.setRegistryName("glasses_casing");
        CONTROL_CASING = new BlockControlCasing();
        CONTROL_CASING.setRegistryName("control_casing");
        MACHINE_CASING = new BlockMachinelCasing();
        MACHINE_CASING.setRegistryName("machine_casing");
        PACKAGING_LINE = new BlockPackagingline();
        PACKAGING_LINE.setRegistryName("packaging_line");
        COMPONENT_ASSEMBLY_LINE_CASING = new BlockComponentAssemblyLineCasing();
        COMPONENT_ASSEMBLY_LINE_CASING.setRegistryName("component_assembly_line_casing");
        ADVANCED_ASSEMBLY_LINE_CASING = new BlockAdvancedAssemblyLineCasing();
        ADVANCED_ASSEMBLY_LINE_CASING.setRegistryName("advanced_assembly_line_casing");
        PIPELINE_CASING = new BlockPipelinelCasing();
        PIPELINE_CASING.setRegistryName("pipelinel_casing");
    }

    @SideOnly(Side.CLIENT)
    public static void registerItemModels() {
        registerItemModel(CONTROL_CASING);
        registerItemModel(MACHINE_CASING);
        registerItemModel(PACKAGING_LINE);
        registerItemModel(COMPONENT_ASSEMBLY_LINE_CASING);
        registerItemModel(ADVANCED_ASSEMBLY_LINE_CASING);
        registerItemModel(PIPELINE_CASING);

        //  VariantActiveBlock Registry
        BLOCK_DIMENSION_WIRE_COIL.onModelRegister();
        GLASS_CASING.onModelRegister();

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
