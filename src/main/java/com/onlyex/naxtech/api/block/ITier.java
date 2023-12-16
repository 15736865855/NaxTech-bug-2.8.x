package com.onlyex.naxtech.api.block;

import net.minecraft.util.IStringSerializable;

import javax.annotation.Nonnull;

public interface ITier extends IStringSerializable {
    default Object getInfo(){
        return null;
    }

    @Nonnull
    String getName();

    default Object getTier(){
        return 0;
    }
}
