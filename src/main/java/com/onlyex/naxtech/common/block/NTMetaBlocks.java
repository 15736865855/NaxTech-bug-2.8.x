package com.onlyex.naxtech.common.block;

import com.onlyex.naxtech.common.block.blocks.BlockBWGlasBlocks;
import com.onlyex.naxtech.common.block.blocks.BlockDimensionWireCoil;
import gregtech.common.blocks.BlockLamp;
import gregtech.common.blocks.MetaBlocks;
import com.onlyex.naxtech.common.block.blocks.BlockDimension;
import com.onlyex.naxtech.common.block.blocks.BlockDimensionFrame;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static gregtech.common.blocks.MetaBlocks.BORDERLESS_LAMPS;

public class NTMetaBlocks {

    public static BlockDimension DIMENSION;
    public static BlockDimensionFrame DIMENSION_FRAME;
    public static BlockDimensionWireCoil BLOCK_DIMENSION_WIRE_COIL;
    public static BlockBWGlasBlocks BW_GlasBlocks;

    private NTMetaBlocks() {}
    public static void init() {
        DIMENSION = new BlockDimension();
        DIMENSION.setRegistryName("block");
        DIMENSION_FRAME = new BlockDimensionFrame();
        DIMENSION_FRAME.setRegistryName("frame");
        BLOCK_DIMENSION_WIRE_COIL = new BlockDimensionWireCoil();
        BLOCK_DIMENSION_WIRE_COIL.setRegistryName("wire_coil");
        BW_GlasBlocks = new BlockBWGlasBlocks();
        BW_GlasBlocks.setRegistryName("bw_glasses_casing");
    }

    @SideOnly(Side.CLIENT)
    public static void registerItemModels() {
        registerItemModel(DIMENSION);
        registerItemModel(DIMENSION_FRAME);
        registerItemModel(BW_GlasBlocks);

        BLOCK_DIMENSION_WIRE_COIL.onModelRegister();
        for (BlockLamp lamp : BORDERLESS_LAMPS.values()) lamp.onModelRegister();

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
