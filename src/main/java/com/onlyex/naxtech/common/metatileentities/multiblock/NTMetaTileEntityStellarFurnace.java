package com.onlyex.naxtech.common.metatileentities.multiblock;

import com.onlyex.naxtech.api.recipe.NTRecipeMaps;
import com.onlyex.naxtech.client.renderer.texture.NTTextures;
import com.onlyex.naxtech.common.block.NTMetaBlocks;
import com.onlyex.naxtech.common.block.blocks.machinel.NTBlockMachinelCasing;
import com.onlyex.naxtech.common.block.blocks.machinel.NTBlockMachinelCasingA;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.api.unification.material.Materials;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.common.blocks.BlockFusionCasing;
import gregtech.common.blocks.MetaBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.I18n;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;

public class NTMetaTileEntityStellarFurnace extends RecipeMapMultiblockController {

    public NTMetaTileEntityStellarFurnace(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, NTRecipeMaps.STELLAR_FURNACE_RECIPES);
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity iGregTechTileEntity) {
        return new NTMetaTileEntityStellarFurnace(metaTileEntityId);
    }

    @Nonnull
    @Override
    protected BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start()
                .aisle("               ", "      CCC      ", "      C C      ", "      C C      ", "      C C      ", "      C C      ", "      C C      ", "      CCC      ", "               ")
                .aisle("      C C      ", "     FFFFF     ", "               ", "               ", "               ", "               ", "               ", "     FFFFF     ", "      C C      ")
                .aisle("      C C      ", "   FF     FF   ", "               ", "               ", "               ", "               ", "               ", "   FF     FF   ", "      C C      ")
                .aisle("      C C      ", "  F         F  ", "     FFFFF     ", "               ", "               ", "               ", "     FFFFF     ", "  F         F  ", "      C C      ")
                .aisle("      C C      ", "  F         F  ", "    F XXX F    ", "      XXX      ", "      XXX      ", "      XXX      ", "    F XXX F    ", "  F         F  ", "      C C      ")
                .aisle("      C C      ", " F           F ", "   F X   X F   ", "     X   X     ", "     X   X     ", "     X   X     ", "   F X   X F   ", " F           F ", "      C C      ")
                .aisle(" CCCCCCMCCCCCC ", "CF    XXX    FC", "C  FX     XF  C", "C   X     X   C", "C   X     X   C", "C   X     X   C", "C  FX     XF  C", "CF    XXX    FC", " CCCCCCMCCCCCC ")
                .aisle("      MMM      ", "CF    XXX    FC", "   FX     XF   ", "    X     X    ", "    X     X    ", "    X     X    ", "   FX     XF   ", "CF    XXX    FC", "      MMM      ")
                .aisle(" CCCCCCMCCCCCC ", "CF    XXX    FC", "C  FX     XF  C", "C   X     X   C", "C   X     X   C", "C   X     X   C", "C  FX     XF  C", "CF    XXX    FC", " CCCCCCMCCCCCC ")
                .aisle("      C C      ", " F           F ", "   F X   X F   ", "     X   X     ", "     X   X     ", "     X   X     ", "   F X   X F   ", " F           F ", "      C C      ")
                .aisle("      C C      ", "  F         F  ", "    F XXX F    ", "      XXX      ", "      XXX      ", "      XXX      ", "    F XXX F    ", "  F         F  ", "      C C      ")
                .aisle("      C C      ", "  F         F  ", "     FFFFF     ", "               ", "               ", "               ", "     FFFFF     ", "  F         F  ", "      C C      ")
                .aisle("      C C      ", "   FF     FF   ", "               ", "               ", "               ", "               ", "               ", "   FF     FF   ", "      C C      ")
                .aisle("      C C      ", "     FFFFF     ", "               ", "               ", "               ", "               ", "               ", "     FFFFF     ", "      C C      ")
                .aisle("               ", "      CSC      ", "      C C      ", "      C C      ", "      C C      ", "      C C      ", "      C C      ", "      CCC      ", "               ")
                .where('S', selfPredicate())
                .where('C', states(getCasingState())
                        .setMinGlobalLimited(145)
                        .or(autoAbilities(true, true, true, true, true, true, false)))
                .where('X', states(getSecondCasingState()))
                .where('F', states(getCoilState()))
                .where('M', states(getFrameState()))
                .build();
    }

    private static IBlockState getCasingState() {
        return NTMetaBlocks.MACHINE_CASING.getState(NTBlockMachinelCasing.CasingType.TRITANIUM_CASING);
    }

    private static IBlockState getSecondCasingState() {
        return NTMetaBlocks.MACHINE_CASING_A.getState(NTBlockMachinelCasingA.CasingType.STELLAR_CONTAINMENT_CASING);
    }

    //  TODO Maybe high tier fusion coil?
    private static IBlockState getCoilState() {
        return MetaBlocks.FUSION_CASING.getState(BlockFusionCasing.CasingType.FUSION_COIL);
    }

    private static IBlockState getFrameState() {
        return MetaBlocks.FRAMES.get(Materials.Tritanium).getBlock(Materials.Tritanium);
    }

    @SideOnly(Side.CLIENT)
    @Nonnull
    @Override
    protected ICubeRenderer getFrontOverlay() {
        return NTTextures.STELLAR_FURNACE_OVERLAY;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ICubeRenderer getBaseTexture(IMultiblockPart iMultiblockPart) {
        return NTTextures.TRITANIUM_CASING;
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World player, @Nonnull List<String> tooltip, boolean advanced) {
        super.addInformation(stack, player, tooltip, advanced);
        tooltip.add(I18n.format("naxtech.machine.stellar_furnace.tooltip.1"));
        tooltip.add(I18n.format("naxtech.machine.stellar_furnace.tooltip.2"));
        tooltip.add(I18n.format("naxtech.machine.stellar_furnace.tooltip.3"));
        tooltip.add(I18n.format("naxtech.machine.stellar_furnace.tooltip.4"));
    }
}
