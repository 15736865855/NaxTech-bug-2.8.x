package com.onlyex.naxtech.api.unification.ore;


import com.onlyex.naxtech.api.unification.info.NTMaterialIconType;
import crafttweaker.annotations.ZenRegister;
import gregtech.api.unification.material.info.MaterialIconType;
import gregtech.api.unification.ore.OrePrefix;
import stanhebben.zenscript.annotations.ZenClass;

import static gregtech.api.GTValues.M;
import static gregtech.api.unification.ore.OrePrefix.Conditions.hasIngotProperty;
import static gregtech.api.unification.ore.OrePrefix.Flags.ENABLE_UNIFICATION;

@ZenClass("mods.naxtech.ore.NTOrePrefix")
@ZenRegister
public class NTOrePrefix {
    public static final OrePrefix nanites = new OrePrefix("nanites", M*24, null, NTMaterialIconType.nanites, ENABLE_UNIFICATION, hasIngotProperty);
    public static final OrePrefix ingotDouble = new OrePrefix("ingotDouble", M*2, null, MaterialIconType.ingotDouble, ENABLE_UNIFICATION, hasIngotProperty);
    public static final OrePrefix plateQuadruple = new OrePrefix("plateQuadruple", M*4, null, MaterialIconType.plateQuadruple, ENABLE_UNIFICATION, hasIngotProperty);
    public static final OrePrefix plateQuintuple = new OrePrefix("plateQuintuple", M*5, null, MaterialIconType.plateQuintuple, ENABLE_UNIFICATION, hasIngotProperty);
    public static final OrePrefix plateTriple = new OrePrefix("plateTriple", M*3, null, MaterialIconType.plateTriple, ENABLE_UNIFICATION, hasIngotProperty);
    public static final OrePrefix casingSmall = new OrePrefix("casingSmall", M, null, NTMaterialIconType.casingSmall, ENABLE_UNIFICATION, hasIngotProperty);
    public static final OrePrefix wrapCircuit = new OrePrefix("wrapCircuit", -1, null, null, ENABLE_UNIFICATION, null);

}
