package com.onlyex.naxtech.common.block.blocks.machinel;

import gregtech.api.block.VariantBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import javax.annotation.Nonnull;

import static com.onlyex.naxtech.common.CommonProxy.NAXTECH_TAB;

public class NTBlockMachinelCasingA extends VariantBlock<NTBlockMachinelCasingA.CasingType> {


    public NTBlockMachinelCasingA() {
        super(Material.IRON);
        this.setTranslationKey("machine_casing_a");
        this.setHardness(5.0F);
        this.setResistance(10.0F);
        this.setSoundType(SoundType.METAL);
        this.setCreativeTab(NAXTECH_TAB);
        this.setHarvestLevel("wrench", 2);
        this.setDefaultState(this.getState(NTBlockMachinelCasingA.CasingType.HG_1223_CASING));
    }

    public boolean canCreatureSpawn(@Nonnull IBlockState state, @Nonnull IBlockAccess world, @Nonnull BlockPos pos, @Nonnull EntityLiving.SpawnPlacementType type) {
        return false;
    }



    public enum CasingType implements IStringSerializable {
        HG_1223_CASING("hg_1223_casing"),
        STELLAR_CONTAINMENT_CASING("stellar_containment_casing"),
        SUPERCRITICAL_FLUID_TURBINE_CASING("supercritical_fluid_turbine_casing"),
        SUPERCRITICAL_FLUID_TURBINE_SHAFT_BLOCK("supercritical_fluid_turbine_shaft_block"),
        SUBSTRATE_CASING("substrate_casing"),
        ADVANCED_SUBSTRATE_CASING("advanced_substrate_casing"),
        CYCLOTRON_CASING("cyclotron_casing"),
        DRAGON_FUSION_COIL("dragon_fusion_coil"),
        CYCLOTRON_COIL("cyclotron_coil");

        private final String name;

        CasingType(String name) {
            this.name = name;
        }

        @Nonnull
        @Override
        public String getName() {
            return name;
        }
    }

}
