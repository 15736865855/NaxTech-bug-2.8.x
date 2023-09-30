package com.onlyex.naxtech.api.unification.info;

import crafttweaker.annotations.ZenRegister;
import stanhebben.zenscript.annotations.ZenClass;

import javax.annotation.Nonnull;


@ZenClass("mods.naxtesh.material.MaterialIconSet")
@ZenRegister
public class MaterialIconSet extends gregtech.api.unification.material.info.MaterialIconSet {


    //public static final MaterialIconSet IF = new MaterialIconSet("infinity");


    public MaterialIconSet(@Nonnull String name) {
        super(name);
    }
}
