package com.onlyex.naxtech.common.metatileentities.multi.electric;

import com.onlyex.naxtech.common.block.NTMetaBlocks;
import com.onlyex.naxtech.common.block.blocks.BlockBWGlasBlocks;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.api.recipes.RecipeMaps;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.client.renderer.texture.Textures;
import gregtech.common.blocks.BlockMetalCasing;
import gregtech.common.blocks.BlockMultiblockCasing;
import gregtech.common.blocks.MetaBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nonnull;

public class MetaTileEntityPackagingLine extends RecipeMapMultiblockController {

    public MetaTileEntityPackagingLine(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, RecipeMaps.ASSEMBLY_LINE_RECIPES);
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity iGregTechTileEntity) {
        return new MetaTileEntityPackagingLine(metaTileEntityId);
    }


    @Nonnull
    @Override
    protected BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start()
                .aisle("XXXXXXX", "PPPPPPP", "XXXXXXX","GGGGGGG", "#######")
                .aisle("XXXXXXX", "XCCCCCX", "XCCCCCX","GGGGGGG", "AAAAAAA")
                .aisle("XXXXXXX", "XCCCCCX", "XCCCCCX","GGGGGGG", "AAAAAAA")
                .aisle("XXXXXXX", "PPPPPPP", "XXXSXXX","GGGGGGG", "#######")
                .where('S', selfPredicate())
                .where('X',  states(getCasingState()))
                .where('P',  states(getBWGlasState()))
                .where('C',  states(MetaBlocks.MULTIBLOCK_CASING.getState(BlockMultiblockCasing.MultiblockCasingType.ASSEMBLY_LINE_CASING)))
                .where('G',  states(MetaBlocks.MULTIBLOCK_CASING.getState(BlockMultiblockCasing.MultiblockCasingType.GRATE_CASING)))
                .where('A',  states(MetaBlocks.MULTIBLOCK_CASING.getState(BlockMultiblockCasing.MultiblockCasingType.ASSEMBLY_CONTROL)))
                .where('#', any())
                .build();
    }

    @Nonnull
    protected static IBlockState getCasingState() {
        return MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.STEEL_SOLID);
        //钢制坚固机器外壳
    }

    @Nonnull
    protected static IBlockState getBWGlasState() {
        return NTMetaBlocks.BW_GlasBlocks.getState(BlockBWGlasBlocks.CasingType.TI_BORON_SILICATE_GLASS_BLOCK);
    }

    @Override
    public ICubeRenderer getBaseTexture(IMultiblockPart iMultiblockPart) {
                return Textures.SOLID_STEEL_CASING;
    }

}
