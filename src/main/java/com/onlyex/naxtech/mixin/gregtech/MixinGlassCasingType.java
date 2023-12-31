package com.onlyex.naxtech.mixin.gregtech;

import com.onlyex.naxtech.api.block.ITierGlassBlockState;
import gregtech.api.GTValues;
import gregtech.common.blocks.BlockGlassCasing;
import net.minecraft.util.IStringSerializable;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(BlockGlassCasing.CasingType.class)
public abstract class MixinGlassCasingType implements IStringSerializable, ITierGlassBlockState {

    @Override
    public boolean isOpticalGlass() {
        return false;
    }

    @Override
    public int getGlassTier() {
        return switch (getName()) {
            case ("fusion_glass") -> GTValues.UV;
            case ("laminated_glass") -> GTValues.IV;
            default -> GTValues.HV;
        };
    }
}
