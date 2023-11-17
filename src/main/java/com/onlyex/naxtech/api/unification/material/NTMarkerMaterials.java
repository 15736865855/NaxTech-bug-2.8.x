package com.onlyex.naxtech.api.unification.material;

import com.onlyex.naxtech.api.NTValues;
import gregtech.api.unification.material.MarkerMaterial;
import gregtech.api.unification.material.MarkerMaterials;
import net.minecraft.block.material.Material;

public class NTMarkerMaterials {
    public static class Tier {
        public static final MarkerMaterial MAXX = new MarkerMaterial(NTValues.VN[NTValues.MAXX].toLowerCase());
        public static final MarkerMaterial EXU = new MarkerMaterial(NTValues.VN[NTValues.EXU].toLowerCase());
    }
}
