package com.onlyex.naxtech.api.block;

import net.minecraft.util.IStringSerializable;

public interface ITired extends IStringSerializable {

    default Object getInfo(){
        return null;
    }
    
    default Object getTire(){
        return this.getName();
    }
}