package com.onlyex.naxtech.common.block.blocks;

import gregtech.api.block.IStateHarvestLevel;
import gregtech.api.block.VariantBlock;
import gregtech.api.items.toolitem.ToolClasses;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import javax.annotation.Nonnull;

import static com.onlyex.naxtech.proxy.CommonProxy.NAXTECH_TAB;

public class BlockDimensionFrame extends VariantBlock<BlockDimensionFrame.BlockType> {
    public BlockDimensionFrame() {
        super(Material.IRON);
        setTranslationKey("frame");
        setSoundType(SoundType.METAL);
        setCreativeTab(NAXTECH_TAB);
        setHardness(120.0f);
        setResistance(10000.0f);
        setDefaultState(this.getState(BlockType.INFINITY_FRAME));

    }

    @Override
    public boolean canCreatureSpawn(@Nonnull IBlockState state, @Nonnull IBlockAccess world, @Nonnull BlockPos pos, @Nonnull EntityLiving.SpawnPlacementType type) {
        return false;
    }
    public enum BlockType implements IStringSerializable , IStateHarvestLevel{
        INFINITY_FRAME(0,"infinity",6),
        COSMIC_NEUTRONIUM_FRAME(1,"cosmic_neutronium",6),
        WHITED_WARF_MATTER_FRAME(2,"whitedwarfmatter",6),
        SPACETIME_FRAME(3,"spacetime",6),
        ETERNITY(4,"eternity",6),
        MAGNETOHYDRODYNAMICALETERNITYLY_CONSTRAINED_STAR_MATTER_FRAME(5,"magnetohydrodynamicallyconstrainedstarmatter",6);

        private final String name;
        private final int harvestLevel;

        BlockType(int metadata, String name, int harvestLevel) {
            this.name = name;
            this.harvestLevel = harvestLevel;
        }

        @Nonnull
        @Override
        public String getName() {
            return this.name;
        }


        @Override
        public int getHarvestLevel(IBlockState state) {
            return harvestLevel;
        }

        @Override
        public String getHarvestTool(IBlockState state) {
            return ToolClasses.WRENCH;
        }
    }

}