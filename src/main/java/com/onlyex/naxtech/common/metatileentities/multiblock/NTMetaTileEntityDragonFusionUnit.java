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

public class NTMetaTileEntityDragonFusionUnit extends RecipeMapMultiblockController {

    public NTMetaTileEntityDragonFusionUnit(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, NTRecipeMaps.DRAGON_FUSION_UNIT_RECIPES);
    }

    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity tileEntity) {
        return new NTMetaTileEntityDragonFusionUnit(this.metaTileEntityId);
    }

    @Nonnull
    protected BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start()
                .aisle("CCCCC", "     ", "     ", "     ", "     ", "     ", "     ", "     ", "     ", "CCCCC")
                .aisle("CCCCC", "  W  ", "     ", " DDD ", "     ", "     ", " DDD ", "     ", "  W  ", "CCCCC")
                .aisle("CCCCC", " WOW ", "  O  ", " DOD ", "  O  ", "  O  ", " DOD ", "  O  ", " WOW ", "CCCCC")
                .aisle("CCCCC", "  W  ", "     ", " DDD ", "     ", "     ", " DDD ", "     ", "  W  ", "CCCCC")
                .aisle("CCSCC", "     ", "     ", "     ", "     ", "     ", "     ", "     ", "     ", "CCCCC")
                .where('S', this.selfPredicate())
                .where('C', states(getCasingState())
                        .setMinGlobalLimited(40)
                        .or(autoAbilities()))
                .where('O', states(getSecondCoilState()))
                .where('W', states(getThirdCoilState()))
                .where('D', states(getCoilState()))
                .where(' ', any())
                .build();
    }

    private static IBlockState getCasingState() {
        return NTMetaBlocks.MACHINE_CASING.getState(NTBlockMachinelCasing.CasingType.DRACONIUM_CASING);
    }

    private static IBlockState getCoilState() {
        return NTMetaBlocks.MACHINE_CASING_A.getState(NTBlockMachinelCasingA.CasingType.DRAGON_FUSION_COIL);
    }

    private static IBlockState getSecondCoilState() {
        return MetaBlocks.FUSION_CASING.getState(BlockFusionCasing.CasingType.FUSION_COIL);
    }

    private static IBlockState getThirdCoilState() {
        return MetaBlocks.FUSION_CASING.getState(BlockFusionCasing.CasingType.SUPERCONDUCTOR_COIL);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ICubeRenderer getBaseTexture(IMultiblockPart iMultiblockPart) {
        return NTTextures.DRACONIUM_CASING;
    }

    @SideOnly(Side.CLIENT)
    @Nonnull
    protected ICubeRenderer getFrontOverlay() {
        return NTTextures.DRAGON_FUSION_OVERLAY;
    }

    public void addInformation(ItemStack stack, @Nullable World player, @Nonnull List<String> tooltip, boolean advanced) {
        super.addInformation(stack, player, tooltip, advanced);
        tooltip.add(I18n.format("naxtech.machine.dragon_fusion_unit.tooltip.1"));
    }
}