package com.onlyex.naxtech.common.metatileentities.multiblock;

import com.onlyex.naxtech.api.recipe.NTRecipeMaps;
import com.onlyex.naxtech.client.renderer.texture.NTTextures;
import com.onlyex.naxtech.common.block.NTMetaBlocks;
import com.onlyex.naxtech.common.block.blocks.machinel.NTBlockMachinelCasing;
import com.onlyex.naxtech.common.block.blocks.machinel.NTBlockMachinelCasingA;
import gregicality.multiblocks.api.unification.GCYMMaterials;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.client.renderer.texture.cube.OrientedOverlayRenderer;
import gregtech.common.blocks.BlockGlassCasing;
import gregtech.common.blocks.MetaBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nonnull;

import static gregtech.common.blocks.MetaBlocks.FRAMES;

public class NTMetaTileEntityLaserCVDUnit extends RecipeMapMultiblockController {
    public NTMetaTileEntityLaserCVDUnit(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, NTRecipeMaps.LASER_CVD_RECIPES);
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity iGregTechTileEntity) {
        return new NTMetaTileEntityLaserCVDUnit(metaTileEntityId);
    }

    @Nonnull
    @Override
    protected BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start()
                .aisle("   XXXXX", "   XGGGX", "   XGGGX", "   XGGGX", "    XXX ")
                .aisle("XXXXXXXX", "XXXFCCCF", "XXXF   F", "XXXF   F", "    FFF ")
                .aisle("XXXXXXXX", "X XFCCCF", "X G    X", "XXXF   F", "    FFF ")
                .aisle("XXXXXXXX", "XXXFCCCF", "XSXF   F", "XXXF   F", "    FFF ")
                .aisle("   XXXXX", "   XGGGX", "   XGGGX", "   XGGGX", "    XXX ")
                .where('S', selfPredicate())
                .where('X', states(getCasingState())
                        .setMinGlobalLimited(60)
                        .or(autoAbilities()))
                .where('G', states(getGlassState()))
                .where('C', states(getSubstrateState()))
                .where('F', states(getFrameState()))
                .build();
    }

    private static IBlockState getCasingState() {
        return null;//NTMetaBlocks.EP_MULTIBLOCK_CASING_B.getState(NTBlockMachinelCasing.CasingType.HASTELLOYX78_CASING);todo
    }

    private static IBlockState getSubstrateState() {
        return NTMetaBlocks.MACHINE_CASING_A.getState(NTBlockMachinelCasingA.CasingType.ADVANCED_SUBSTRATE_CASING);
    }

    private static IBlockState getGlassState() {
        return MetaBlocks.TRANSPARENT_CASING.getState(BlockGlassCasing.CasingType.FUSION_GLASS);
    }

    private static IBlockState getFrameState() {
        return FRAMES.get(GCYMMaterials.HastelloyX).getBlock(GCYMMaterials.HastelloyX);
    }

    @Nonnull
    @Override
    protected OrientedOverlayRenderer getFrontOverlay() {
        return NTTextures.CVD_UNIT_OVERLAY;
    }

    @Override
    public ICubeRenderer getBaseTexture(IMultiblockPart iMultiblockPart) {
        return NTTextures.HASTELLOY_X78_CASING;
    }
}

