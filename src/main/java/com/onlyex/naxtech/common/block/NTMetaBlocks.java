package com.onlyex.naxtech.common.block;

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

public class NTMetaBlocks {

    public static BlockDimension DIMENSION;
    public static BlockDimensionFrame DIMENSION_FRAME;

    private NTMetaBlocks() {}
    public static void init() {
        DIMENSION = new BlockDimension();
        DIMENSION.setRegistryName("block");
        DIMENSION_FRAME = new BlockDimensionFrame();
        DIMENSION_FRAME.setRegistryName("frame");
    }

    @SideOnly(Side.CLIENT)
    public static void registerItemModels() {
        registerItemModel(DIMENSION);
        registerItemModel(DIMENSION_FRAME);

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
