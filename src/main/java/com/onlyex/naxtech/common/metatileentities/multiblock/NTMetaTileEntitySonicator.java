package com.onlyex.naxtech.common.metatileentities.multiblock;

import com.onlyex.naxtech.api.NTAPI;
import com.onlyex.naxtech.api.block.ITierGlassBlockState;
import com.onlyex.naxtech.api.metatileentity.multiblock.GlassTierMultiblockController;
import com.onlyex.naxtech.api.pattern.NTTraceabilityPredicate;
import com.onlyex.naxtech.api.recipe.NTRecipeMaps;
import com.onlyex.naxtech.client.renderer.texture.NTTextures;
import com.onlyex.naxtech.common.metatileentities.NTMetaTileEntities;
import gregicality.multiblocks.api.render.GCYMTextures;
import gregicality.multiblocks.common.block.GCYMMetaBlocks;
import gregicality.multiblocks.common.block.blocks.BlockLargeMultiblockCasing;
import gregicality.multiblocks.common.block.blocks.BlockUniqueCasing;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.api.pattern.MultiblockShapeInfo;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.common.ConfigHolder;
import gregtech.common.blocks.BlockBoilerCasing;
import gregtech.common.blocks.MetaBlocks;
import gregtech.common.metatileentities.MetaTileEntities;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class NTMetaTileEntitySonicator extends GlassTierMultiblockController {

//    private int glassTier;

    public NTMetaTileEntitySonicator(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, NTRecipeMaps.SONICATION_RECIPES);
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity iGregTechTileEntity) {
        return new NTMetaTileEntitySonicator(metaTileEntityId);
    }

    @Nonnull
    @Override
    protected BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start()
                .aisle("XXXXX", "XXXXX", "XXXXX", "     ")
                .aisle("XXXXX", "XCCCX", "XGGGX", "     ")
                .aisle("XXXXX", "XCPCX", "XGPGX", "  P  ")
                .aisle("XXXXX", "XCCCX", "XGGGX", "  P  ")
                .aisle("XXXXX", "XXXXX", "XXXXX", "  P  ")
                .aisle(" XXX ", " XPX ", " XPX ", "  P  ")
                .aisle(" XXX ", " XSX ", " XXX ", "     ")
                .where('S', selfPredicate())
                .where('X', states(getCasingState())
                        .setMinGlobalLimited(46)
                        .or(autoAbilities()))
                .where('P', states(getBoilerCasingState()))
                .where('C', states(getUniqueCasingState()))
                .where('G', NTTraceabilityPredicate.NT_GLASS.get())
                .where(' ', any())
                .build();
    }

    private static IBlockState getCasingState() {
        return GCYMMetaBlocks.LARGE_MULTIBLOCK_CASING.getState(BlockLargeMultiblockCasing.CasingType.CORROSION_PROOF_CASING);
    }

    private static IBlockState getBoilerCasingState() {
        return MetaBlocks.BOILER_CASING.getState(BlockBoilerCasing.BoilerCasingType.TITANIUM_PIPE);
    }

    private static IBlockState getUniqueCasingState() {
        return GCYMMetaBlocks.UNIQUE_CASING.getState(BlockUniqueCasing.UniqueCasingType.ELECTROLYTIC_CELL);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ICubeRenderer getBaseTexture(IMultiblockPart iMultiblockPart) {
        return GCYMTextures.CORROSION_PROOF_CASING;
    }

    @SideOnly(Side.CLIENT)
    @Nonnull
    @Override
    protected ICubeRenderer getFrontOverlay() {
        return NTTextures.SONICATOR_OVERLAY;
    }
    public List<MultiblockShapeInfo> getMatchingShapes() {
        ArrayList<MultiblockShapeInfo> shapeInfo = new ArrayList<>();
        MultiblockShapeInfo.Builder builder = MultiblockShapeInfo.builder()
                .aisle("ETABD", "XXXXX", "XXXXX", "     ")
                .aisle("XXXXX", "XCCCX", "XGGGX", "     ")
                .aisle("XXXXX", "XCPCX", "XGPGX", "  P  ")
                .aisle("XXXXX", "XCCCX", "XGGGX", "  P  ")
                .aisle("XXXXX", "XXXXX", "XXXXX", "  P  ")
                .aisle(" XXX ", " XPX ", " XPX ", "  P  ")
                .aisle(" XXX ", " XSX ", " XXX ", "     ")
                .where('S', NTMetaTileEntities.SONICATOR, EnumFacing.SOUTH)
                .where('X', getCasingState())
                .where('P', getBoilerCasingState())
                .where('C', getUniqueCasingState())
                .where('A', MetaTileEntities.ITEM_EXPORT_BUS[4], EnumFacing.NORTH)
                .where('B', MetaTileEntities.FLUID_IMPORT_HATCH[4], EnumFacing.NORTH)
                .where('D', MetaTileEntities.FLUID_EXPORT_HATCH[4], EnumFacing.NORTH)
                .where('E', MetaTileEntities.ENERGY_INPUT_HATCH[4], EnumFacing.NORTH)
                .where('T', () -> {
                    return ConfigHolder.machines.enableMaintenance ? MetaTileEntities.MAINTENANCE_HATCH : GCYMMetaBlocks.LARGE_MULTIBLOCK_CASING.getState(BlockLargeMultiblockCasing.CasingType.NONCONDUCTING_CASING);
                }, EnumFacing.NORTH);
        NTAPI.MAP_GLASS_SHAPE_INFO.entrySet().stream().sorted(Comparator.comparingInt((entry) -> {
            return ((ITierGlassBlockState)entry.getValue()).getGlassTier();
        })).forEach((entry) -> {
            shapeInfo.add(builder.where('G', (IBlockState)entry.getKey()).build());
        });
        return shapeInfo;
    }
}
