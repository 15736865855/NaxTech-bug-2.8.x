package com.onlyex.naxtech.common.metatileentities.multiblock.generator;

import com.onlyex.naxtech.api.recipe.NTRecipeMaps;
import com.onlyex.naxtech.client.renderer.texture.NTTextures;
import com.onlyex.naxtech.common.block.NTMetaBlocks;
import com.onlyex.naxtech.common.block.blocks.machinel.NTBlockMachinelCasing;
import gregicality.multiblocks.common.block.GCYMMetaBlocks;
import gregicality.multiblocks.common.block.blocks.BlockUniqueCasing;
import gregtech.api.GTValues;
import gregtech.api.capability.GregtechCapabilities;
import gregtech.api.capability.IEnergyContainer;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.FuelMultiblockController;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.MultiblockAbility;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.client.renderer.texture.Textures;
import gregtech.client.renderer.texture.cube.OrientedOverlayRenderer;
import gregtech.common.blocks.BlockFusionCasing;
import gregtech.common.blocks.BlockGlassCasing;
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

import static gregtech.api.GTValues.UHV;
import static gregtech.api.GTValues.V;

public class NTMetaTileEntityHyperReactorMk1 extends FuelMultiblockController {

    public NTMetaTileEntityHyperReactorMk1(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, NTRecipeMaps.HYPER_REACTOR_MK1_RECIPES, UHV);
        this.recipeMapWorkable.setMaximumOverclockVoltage(V[UHV]);
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity tileEntity) {
        return new NTMetaTileEntityHyperReactorMk1(metaTileEntityId);
    }

    @Nonnull
    @Override
    protected BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start()
                .aisle("  CCC  ", "  CVC  ", "  GGG  ", "  GGG  ", "  GGG  ", "  GGG  ", "  GGG  ", "  CVC  ", "  CCC  ")
                .aisle(" CCCCC ", " CCCCC ", " FUUUF ", " F   F ", " F   F ", " F   F ", " FUUUF ", " CCCCC ", " CCCCC ")
                .aisle("CCCCCCC", "CCCCCCC", "GUOOOUG", "G     G", "G     G", "G     G", "GUOOOUG", "CCCCCCC", "CCCCCCC")
                .aisle("CCCCCCC", "VCCCCCV", "GUOOOUG", "G  H  G", "G  H  G", "G  H  G", "GUOOOUG", "VCCCCCV", "CCCCCCC")
                .aisle("CCCCCCC", "CCCCCCC", "GUOOOUG", "G     G", "G     G", "G     G", "GUOOOUG", "CCCCCCC", "CCCCCCC")
                .aisle(" CCCCC ", " CCCCC ", " FUUUF ", " F   F ", " F   F ", " F   F ", " FUUUF ", " CCCCC ", " CCCCC ")
                .aisle("  CCC  ", "  CSC  ", "  GGG  ", "  GGG  ", "  GGG  ", "  GGG  ", "  GGG  ", "  CVC  ", "  CCC  ")
                .where('S', selfPredicate())
                .where('C', states(getCasingState())
                        .setMinGlobalLimited(129)
                        .or(autoAbilities(false, true, false, false, true, false, false))
                        .or(metaTileEntities(MultiblockAbility.REGISTRY.get(MultiblockAbility.OUTPUT_ENERGY).stream()
                                .filter(mte -> {
                                    IEnergyContainer container = mte.getCapability(GregtechCapabilities.CAPABILITY_ENERGY_CONTAINER, null);
                                    return container != null && container.getOutputVoltage() == GTValues.V[UHV]
                                                             && container.getOutputAmperage() == 2;
                                })
                                .toArray(MetaTileEntity[]::new)).setExactLimit(1).setPreviewCount(1)))
                .where('H', states(/*NTMetaBlocks.EP_ACTIVE_MULTIBLOCK_CASING.getState(EPBlockActiveMultiblockCasing.ActiveMultiblockCasingType.HYPER_CORE_MK1)*/))
                .where('G', states(getGlassState()))
                .where('F', states(getFrameState()))
                .where('V', states(getUniqueCasingState()))
                .where('U', states(getSecondUniqueCasingState()))
                .where('O', states(getSecondCasingState()))
                .build();
    }

    private IBlockState getCasingState() {
        return NTMetaBlocks.MACHINE_CASING.getState(NTBlockMachinelCasing.CasingType.HYPER_CASING);
    }

    private IBlockState getFrameState() {
        return MetaBlocks.FRAMES.get(null).getBlock(null);
    }//BlackPlutonium todo

    private IBlockState getGlassState() {
        return MetaBlocks.TRANSPARENT_CASING.getState(BlockGlassCasing.CasingType.FUSION_GLASS);
    }

    private IBlockState getUniqueCasingState() {
        return GCYMMetaBlocks.UNIQUE_CASING.getState(BlockUniqueCasing.UniqueCasingType.HEAT_VENT);
    }

    private IBlockState getSecondUniqueCasingState() {
        return GCYMMetaBlocks.UNIQUE_CASING.getState(BlockUniqueCasing.UniqueCasingType.ELECTROLYTIC_CELL);
    }

    private IBlockState getSecondCasingState() {
        return MetaBlocks.FUSION_CASING.getState(BlockFusionCasing.CasingType.FUSION_COIL);
    }

    @SideOnly(Side.CLIENT)
    @Nonnull
    @Override
    protected OrientedOverlayRenderer getFrontOverlay() {
        return Textures.POWER_SUBSTATION_OVERLAY;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ICubeRenderer getBaseTexture(IMultiblockPart iMultiblockPart) {
        return NTTextures.HYPER_CASING;
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World player, @Nonnull List<String> tooltip, boolean advanced) {
        super.addInformation(stack, player, tooltip, advanced);
        tooltip.add(I18n.format("naxtech.machine.hyper_reactor_mk1.tooltip.1"));
        tooltip.add(I18n.format("naxtech.machine.hyper_reactor_mk1.tooltip.2"));
    }
}
