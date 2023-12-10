package com.onlyex.naxtech.common.block.blocks;

import gregtech.api.block.VariantActiveBlock;
import gregtech.api.items.toolitem.ToolClasses;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import javax.annotation.Nonnull;

public class NTBlockActiveMultiblockCasing extends VariantActiveBlock<NTBlockActiveMultiblockCasing.CasingType> {
    public NTBlockActiveMultiblockCasing() {
        super(Material.IRON);
        this.setTranslationKey("active_multiblock_casing");
        this.setHardness(5.0f);
        this.setResistance(10.0f);
        this.setSoundType(SoundType.METAL);
        this.setHarvestLevel("wrench", 2);
        this.setDefaultState(this.getState(CasingType.FLOTATION_INTAKE_CASING));
    }

    @Override
    public boolean canCreatureSpawn(@Nonnull IBlockState state, @Nonnull IBlockAccess world, @Nonnull BlockPos pos, @Nonnull EntityLiving.SpawnPlacementType type) {
        return false;
    }

    public enum CasingType implements IStringSerializable {


        FLOTATION_INTAKE_CASING("flotation_intake_casing"),
        STELLAR_CONTAINMENT_CASING("stellar_containment_casing"),
        SUPERCRITICAL_FLUID_TURBINE_CASING("supercritical_fluid_turbine_casing"),
        SUPERCRITICAL_FLUID_TURBINE_SHAFT_BLOCK("supercritical_fluid_turbine_shaft_block"),
        SUBSTRATE_CASING("substrate_casing"),
        ADVANCED_SUBSTRATE_CASING("advanced_substrate_casing"),
        CYCLOTRON_CASING("cyclotron_casing"),
        //DRAGON_FUSION_COIL("dragon_fusion_coil"),
        CYCLOTRON_COIL("cyclotron_coil");

        private final String name;

        CasingType(String name) {
            this.name = name;
        }

        @Nonnull
        @Override
        public String getName() {
            return this.name;
        }

    }
}
