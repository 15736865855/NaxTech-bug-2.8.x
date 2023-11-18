package com.onlyex.naxtech.common.block.blocks;

import gregtech.api.block.VariantBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import javax.annotation.Nonnull;

import static com.onlyex.naxtech.proxy.CommonProxy.NAXTECH_TAB;

public class BlockMachinelCasing  extends VariantBlock<BlockMachinelCasing.CasingType> {


    public BlockMachinelCasing() {
        super(Material.IRON);
        this.setTranslationKey("machine_casing");
        this.setHardness(5.0F);
        this.setResistance(10.0F);
        this.setSoundType(SoundType.METAL);
        setCreativeTab(NAXTECH_TAB);
        this.setHarvestLevel("wrench", 2);
        this.setDefaultState(this.getState(CasingType.IRIDIUM));
    }

    public boolean canCreatureSpawn(@Nonnull IBlockState state, @Nonnull IBlockAccess world, @Nonnull BlockPos pos, @Nonnull EntityLiving.SpawnPlacementType type) {
        return false;
    }



    public enum CasingType implements IStringSerializable {

        IRIDIUM("iridium"),
        ADVANCED_INVAR_CASING("advanced_invar_casing"),
        ADVANCED_ALUMINIUM_CASING("advanced_aluminium_casing"),
        PRECISE_ASSEMBLER_CASING_MK1("precise_assembler_casing_mk1"),
        PRECISE_ASSEMBLER_CASING_MK2("precise_assembler_casing_mk2"),
        PRECISE_ASSEMBLER_CASING_MK3("precise_assembler_casing_mk3");

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
