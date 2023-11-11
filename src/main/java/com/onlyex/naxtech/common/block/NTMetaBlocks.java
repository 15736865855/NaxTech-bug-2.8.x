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

    public static BlockDimension DIMENSION;
    public static BlockDimensionFrame DIMENSION_FRAME;
    public static BlockDimensionWireCoil BLOCK_DIMENSION_WIRE_COIL;//线圈
    public static BlockGlassCasing BW_GlasBlocks;//强化硅酸盐硼玻璃
    public static BlockControlCasing CONTROL_CASING;//控制外壳
    public static BlockMachinelCasing MACHINE_CASING;//机械外壳
    public static BlockPackagingline PACKAGING_LINE;

    private NTMetaBlocks() {}
    public static void init() {
        DIMENSION = new BlockDimension();
        DIMENSION.setRegistryName("block");
        DIMENSION_FRAME = new BlockDimensionFrame();
        DIMENSION_FRAME.setRegistryName("frame");
        BLOCK_DIMENSION_WIRE_COIL = new BlockDimensionWireCoil();
        BLOCK_DIMENSION_WIRE_COIL.setRegistryName("wire_coil");
        BW_GlasBlocks = new BlockGlassCasing();
        BW_GlasBlocks.setRegistryName("glasses_casing");
        CONTROL_CASING = new BlockControlCasing();
        CONTROL_CASING.setRegistryName("control_casing");
        MACHINE_CASING = new BlockMachinelCasing();
        MACHINE_CASING.setRegistryName("machine_casing");
        PACKAGING_LINE = new BlockPackagingline();
        PACKAGING_LINE.setRegistryName("packaging_line");
    }

    @SideOnly(Side.CLIENT)
    public static void registerItemModels() {
        registerItemModel(DIMENSION);
        registerItemModel(DIMENSION_FRAME);
        registerItemModel(CONTROL_CASING);
        registerItemModel(MACHINE_CASING);
        registerItemModel(PACKAGING_LINE);

        //  VariantActiveBlock Registry
        BLOCK_DIMENSION_WIRE_COIL.onModelRegister();
        BW_GlasBlocks.onModelRegister();

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
