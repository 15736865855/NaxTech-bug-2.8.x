package com.onlyex.naxtech.api.unification;

import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.info.MaterialFlag;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static gregtech.api.unification.material.Materials.EXT2_METAL;
import static gregtech.api.unification.material.info.MaterialFlags.*;


/**
 * 材料注册
 * <p>
 * 所有材料建设者应遵循以下通用格式:
 * <p>
 * material = new MaterialBuilder(id, name)
 * .ingot().fluid().ore()                <--- 类型
 * .color().iconSet()                    <--- 外观
 * .flags()                              <--- 特殊生成
 * .element() / .components()            <--- 成分
 * .toolStats()                          <---
 * .oreByProducts()                         | 其他属性
 * ...                                   <---
 * .blastTemp()                          <--- 鼓风温度
 * .build();
 * <p>
 * 使用默认值对您有利！一些默认值:
 * - iconSet: DULL
 * - color: 0xFFFFFF
 */
public class NTMaterials {

    public static final List<MaterialFlag> ONTEA = new ArrayList<>();

    static {
        ONTEA.addAll(EXT2_METAL);
        ONTEA.addAll(Arrays.asList(GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_DENSE, GENERATE_DOUBLE_PLATE, GENERATE_FOIL));
    }

    //材料
    public static Material BlackdWarfMatter;
    public static Material WhitedWarfMatter;
    public static Material Infinity;
    public static Material CosmicNeutronium;
    public static Material Spacetime;
    public static Material Universium;
    public static Material Eternity;
    public static Material MagnetohydrodynamicallyConstrainedStarMatter;
    public static Material DraconiumAwakened;
    public static Material Draconium;
    public static Material Lumium;
    public static Material Enderium;
    public static Material Signalum;
    public static Material Mithril;
    public static Material Shirabon;
    public static Material AstralTitanium;
    public static Material CelestialTungsten;
    public static Material Rhugnor;
    //public static Material ;
    //public static Material ;
    //public static Material ;
    //public static Material ;
    //public static Material ;
    //public static Material ;
    //public static Material ;
    //public static Material ;

    //流体
    //public static Material ;
    //public static Material ;
    //public static Material ;
    //public static Material ;
    //public static Material ;
    //public static Material ;
    //public static Material ;
    //public static Material ;
    //public static Material ;
    //public static Material ;
    //public static Material ;




    public NTMaterials() {}
    public static void initregister() {
        // 24000-25000
        NTDimensionMaterials.init();
        // 25000-26000
        NTFluid.init();

    }
}
