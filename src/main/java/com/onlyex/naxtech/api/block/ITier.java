package com.onlyex.naxtech.api.block;

import net.minecraft.util.IStringSerializable;

public interface ITier extends IStringSerializable {
    default Object getInfo(){
        return null;
    }

    default Object getTier(){
        return 0;
    }
}
