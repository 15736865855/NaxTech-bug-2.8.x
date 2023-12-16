package com.onlyex.naxtech.common.metatileentities.multiblock;

import com.onlyex.naxtech.api.NTAPI;
import com.onlyex.naxtech.api.block.ITierGlassBlockState;
import com.onlyex.naxtech.api.metatileentity.multiblock.GlassTierMultiblockController;
import com.onlyex.naxtech.api.pattern.NTTraceabilityPredicate;
import com.onlyex.naxtech.api.recipe.NTRecipeMaps;
import com.onlyex.naxtech.client.renderer.texture.NTTextures;
import com.onlyex.naxtech.common.block.NTMetaBlocks;
import com.onlyex.naxtech.common.block.blocks.machinel.NTBlockMachinelCasingA;
import com.onlyex.naxtech.common.metatileentities.NTMetaTileEntities;
import gregicality.multiblocks.api.render.GCYMTextures;
import gregicality.multiblocks.common.block.GCYMMetaBlocks;
import gregicality.multiblocks.common.block.blocks.BlockLargeMultiblockCasing;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.api.pattern.MultiblockShapeInfo;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.client.renderer.texture.cube.OrientedOverlayRenderer;
import gregtech.common.ConfigHolder;
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

public class NTMetaTileEntityCVDUnit extends GlassTierMultiblockController {

    public NTMetaTileEntityCVDUnit(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, NTRecipeMaps.CVD_RECIPES);
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity metaTileEntityHolder) {
        return new NTMetaTileEntityCVDUnit(metaTileEntityId);
    }

    @Nonnull
    @Override
    protected BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start()
                .aisle("XXXXX", "XGGGX", "XGGGX")
                .aisle("XXXXX", "XCCCX", "XGGGX").setRepeatable(3)
                .aisle("XXXXX", "SGGGX", "XGGGX")
                .where('S', selfPredicate())
                .where('X', states(getCasingState())
                        .setMinGlobalLimited(35)
                        .or(autoAbilities()))
                .where('G', NTTraceabilityPredicate.NT_GLASS.get())
                .where('C', states(getSubstrateState()))
                .build();
    }

    private static IBlockState getCasingState() {
        return GCYMMetaBlocks.LARGE_MULTIBLOCK_CASING.getState(BlockLargeMultiblockCasing.CasingType.NONCONDUCTING_CASING);
    }

    private static IBlockState getSubstrateState() {
        return NTMetaBlocks.MACHINE_CASING_A.getState(NTBlockMachinelCasingA.CasingType.SUBSTRATE_CASING);
    }

    @SideOnly(Side.CLIENT)
    @Nonnull
    @Override
    protected OrientedOverlayRenderer getFrontOverlay() {
        return NTTextures.CVD_UNIT_OVERLAY;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ICubeRenderer getBaseTexture(IMultiblockPart iMultiblockPart) {
        return GCYMTextures.NONCONDUCTING_CASING;
    }

    public List<MultiblockShapeInfo> getMatchingShapes() {
        ArrayList<MultiblockShapeInfo> shapeInfo = new ArrayList<>();
        MultiblockShapeInfo.Builder builder = MultiblockShapeInfo.builder()
                .aisle("EETXX", "RGGGU", "PGGGQ")
                .aisle("XXXXX", "XCCCX", "XGGGX")
                .aisle("XXXXX", "XCCCX", "XGGGX")
                .aisle("XXXXX", "XCCCX", "XGGGX")
                .aisle("XXXXX", "SGGGX", "XGGGX")
                .where('S', NTMetaTileEntities.CVD_UNIT, EnumFacing.SOUTH)
                .where('X', getCasingState())
                .where('C', getSubstrateState())
                .where('P', MetaTileEntities.ITEM_IMPORT_BUS[4], EnumFacing.NORTH)
                .where('Q', MetaTileEntities.ITEM_EXPORT_BUS[4], EnumFacing.NORTH)
                .where('R', MetaTileEntities.FLUID_IMPORT_HATCH[4], EnumFacing.NORTH)
                .where('U', MetaTileEntities.FLUID_EXPORT_HATCH[4], EnumFacing.NORTH)
                .where('E', MetaTileEntities.ENERGY_INPUT_HATCH[4], EnumFacing.NORTH)
                .where('T', () -> {
                    return ConfigHolder.machines.enableMaintenance ? MetaTileEntities.MAINTENANCE_HATCH : GCYMMetaBlocks.LARGE_MULTIBLOCK_CASING.getState(BlockLargeMultiblockCasing.CasingType.NONCONDUCTING_CASING);
                }, EnumFacing.NORTH);
        NTAPI.MAP_GLASS_SHAPE_INFO.entrySet().stream().sorted(Comparator.comparingInt((entry) -> ((ITierGlassBlockState)entry.getValue()).getGlassTier())).forEach((entry) -> {
            shapeInfo.add(builder.where('G', entry.getKey()).build());
        });
        return shapeInfo;
    }
}
