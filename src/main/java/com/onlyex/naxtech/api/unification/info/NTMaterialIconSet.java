package com.onlyex.naxtech.api.unification.info;

import crafttweaker.annotations.ZenRegister;
import gregtech.api.unification.material.info.MaterialIconSet;
import stanhebben.zenscript.annotations.ZenClass;


@ZenClass("mods.naxtesh.material.MaterialIconSet")
@ZenRegister
public class NTMaterialIconSet {
    public static final MaterialIconSet CUSTOM_IF = new MaterialIconSet("infinity", null, true);
    public static final MaterialIconSet CUSTOM_MHCSM = new MaterialIconSet("mhcsm", null, true);
    public static final MaterialIconSet CUSTOM_CN = new MaterialIconSet("cosmic_neutronium", null, true);
    public static final MaterialIconSet CUSTOM_ETERNITY = new MaterialIconSet("eternity", null, true);
    public static final MaterialIconSet CUSTOM_SPACETIME = new MaterialIconSet("spacetime", null, true);
    public static final MaterialIconSet CUSTOM_WWM = new MaterialIconSet("whited_warf_matter", null, true);
    public static final MaterialIconSet CUSTOM_DEGENERATE_RHENIUM = new MaterialIconSet("degenerate_rhenium", null, true);
    public static final MaterialIconSet CUSTOM_HYPOGEN = new MaterialIconSet("hypogen", null, true);
}
