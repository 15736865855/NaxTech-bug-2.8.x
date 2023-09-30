package com.onlyex.naxtech.common.items;

import com.onlyex.naxtech.api.unification.ore.NTOrePrefix;
import com.onlyex.naxtech.proxy.CommonProxy;
import gregtech.api.items.metaitem.StandardMetaItem;
import gregtech.api.unification.ore.OrePrefix;

import static com.onlyex.naxtech.api.unification.NTMaterials.*;
import static com.onlyex.naxtech.common.items.NTMetaInit.metaItem_NTM;

public class NTMaterial1  extends StandardMetaItem {

    public NTMaterial1() {
        super();
    }
    //下面是一个例子，第一个数据（0）是Meta Data，不能重复
    //"test"是该物品的Meta ID，例如circuit.ulv之类的
    //TEST = metaItem1.addItem(0, "test");
    //NTMetaItems. = metaItem_NT.addItem(,"").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);

    public void registerSubItems() {
        //ID0-39
        NTMetaInit.INFINITY = metaItem_NTM.addItem(0, "infinity.bolt").setUnificationData(OrePrefix.bolt, Infinity).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.INFINITY = metaItem_NTM.addItem(1, "infinity.dust").setUnificationData(OrePrefix.dust, Infinity).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.INFINITY = metaItem_NTM.addItem(2, "infinity.dust_tiny").setUnificationData(OrePrefix.dustTiny, Infinity).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.INFINITY = metaItem_NTM.addItem(3, "infinity.dust_small").setUnificationData(OrePrefix.dustSmall, Infinity).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.INFINITY = metaItem_NTM.addItem(4, "infinity.foil").setUnificationData(OrePrefix.foil, Infinity).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.INFINITY = metaItem_NTM.addItem(5, "infinity.gear").setUnificationData(OrePrefix.gear, Infinity).setMaxStackSize(16).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.INFINITY = metaItem_NTM.addItem(6, "infinity.gear_small").setUnificationData(OrePrefix.gearSmall, Infinity).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.INFINITY = metaItem_NTM.addItem(7, "infinity.lens").setUnificationData(OrePrefix.lens, Infinity).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        //NTMetaInit.INFINITY = metaItem_NTM.addItem(8, "infinity.ingot").setUnificationData(OrePrefix.ingot, Infinity).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.INFINITY = metaItem_NTM.addItem(9, "infinity.ingot_hot").setUnificationData(OrePrefix.ingotHot, Infinity).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.INFINITY = metaItem_NTM.addItem(10, "infinity.nugget").setUnificationData(OrePrefix.nugget, Infinity).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.INFINITY = metaItem_NTM.addItem(11, "infinity.plate").setUnificationData(OrePrefix.plate, Infinity).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.INFINITY = metaItem_NTM.addItem(12, "infinity.plate_dense").setUnificationData(OrePrefix.plateDense, Infinity).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.INFINITY = metaItem_NTM.addItem(13, "infinity.plate_double").setUnificationData(OrePrefix.plateDouble, Infinity).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.INFINITY = metaItem_NTM.addItem(14, "infinity.ring").setUnificationData(OrePrefix.ring, Infinity).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.INFINITY = metaItem_NTM.addItem(15, "infinity.rotor").setUnificationData(OrePrefix.rotor, Infinity).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.INFINITY = metaItem_NTM.addItem(16, "infinity.round").setUnificationData(OrePrefix.round, Infinity).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.INFINITY = metaItem_NTM.addItem(17, "infinity.screw").setUnificationData(OrePrefix.screw, Infinity).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.INFINITY = metaItem_NTM.addItem(18, "infinity.spring").setUnificationData(OrePrefix.spring, Infinity).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.INFINITY = metaItem_NTM.addItem(19, "infinity.spring_small").setUnificationData(OrePrefix.springSmall, Infinity).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.INFINITY = metaItem_NTM.addItem(20, "infinity.stick").setUnificationData(OrePrefix.stick, Infinity).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.INFINITY = metaItem_NTM.addItem(21, "infinity.stick_long").setUnificationData(OrePrefix.stickLong, Infinity).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.INFINITY = metaItem_NTM.addItem(22, "infinity.turbine_blade").setUnificationData(OrePrefix.turbineBlade, Infinity).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.INFINITY = metaItem_NTM.addItem(23, "infinity.wire_fine").setUnificationData(OrePrefix.wireFine, Infinity).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.INFINITY = metaItem_NTM.addItem(24, "infinity.ingot_double").setUnificationData(NTOrePrefix.ingotDouble, Infinity).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.INFINITY = metaItem_NTM.addItem(25, "infinity.plate_quadruple").setUnificationData(NTOrePrefix.plateQuadruple, Infinity).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.INFINITY = metaItem_NTM.addItem(26, "infinity.plate_quintuple").setUnificationData(NTOrePrefix.plateQuintuple, Infinity).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.INFINITY = metaItem_NTM.addItem(27, "infinity.plate_triple").setUnificationData(NTOrePrefix.plateTriple, Infinity).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.INFINITY = metaItem_NTM.addItem(28, "infinity.casing_small").setUnificationData(NTOrePrefix.casingSmall, Infinity).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);



//ID40-79
        NTMetaInit.COSMIC_NEUTRONIUM = metaItem_NTM.addItem(40, "cosmic_neutronium.bolt").setUnificationData(OrePrefix.bolt, CosmicNeutronium).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.COSMIC_NEUTRONIUM = metaItem_NTM.addItem(41, "cosmic_neutronium.dust").setUnificationData(OrePrefix.dust, CosmicNeutronium).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.COSMIC_NEUTRONIUM = metaItem_NTM.addItem(42, "cosmic_neutronium.dust_tiny").setUnificationData(OrePrefix.dustTiny, CosmicNeutronium).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.COSMIC_NEUTRONIUM = metaItem_NTM.addItem(43, "cosmic_neutronium.dust_small").setUnificationData(OrePrefix.dustSmall, CosmicNeutronium).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.COSMIC_NEUTRONIUM = metaItem_NTM.addItem(44, "cosmic_neutronium.foil").setUnificationData(OrePrefix.foil, CosmicNeutronium).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.COSMIC_NEUTRONIUM = metaItem_NTM.addItem(45, "cosmic_neutronium.gear").setUnificationData(OrePrefix.gear, CosmicNeutronium).setMaxStackSize(16).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.COSMIC_NEUTRONIUM = metaItem_NTM.addItem(46, "cosmic_neutronium.gear_small").setUnificationData(OrePrefix.gearSmall, CosmicNeutronium).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        //NTMetaInit.COSMIC_NEUTRONIUM = metaItem_NTM.addItem(47, "cosmic_neutronium.ingot").setUnificationData(OrePrefix.ingot, CosmicNeutronium).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.COSMIC_NEUTRONIUM = metaItem_NTM.addItem(48, "cosmic_neutronium.ingot_hot").setUnificationData(OrePrefix.ingotHot, CosmicNeutronium).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.COSMIC_NEUTRONIUM = metaItem_NTM.addItem(49, "cosmic_neutronium.nugget").setUnificationData(OrePrefix.nugget, CosmicNeutronium).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.COSMIC_NEUTRONIUM = metaItem_NTM.addItem(50, "cosmic_neutronium.plate").setUnificationData(OrePrefix.plate, CosmicNeutronium).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.COSMIC_NEUTRONIUM = metaItem_NTM.addItem(51, "cosmic_neutronium.plate_dense").setUnificationData(OrePrefix.plateDense, CosmicNeutronium).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.COSMIC_NEUTRONIUM = metaItem_NTM.addItem(52, "cosmic_neutronium.plate_double").setUnificationData(OrePrefix.plateDouble, CosmicNeutronium).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.COSMIC_NEUTRONIUM = metaItem_NTM.addItem(53, "cosmic_neutronium.ring").setUnificationData(OrePrefix.ring, CosmicNeutronium).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.COSMIC_NEUTRONIUM = metaItem_NTM.addItem(54, "cosmic_neutronium.rotor").setUnificationData(OrePrefix.rotor, CosmicNeutronium).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.COSMIC_NEUTRONIUM = metaItem_NTM.addItem(55, "cosmic_neutronium.round").setUnificationData(OrePrefix.round, CosmicNeutronium).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.COSMIC_NEUTRONIUM = metaItem_NTM.addItem(56, "cosmic_neutronium.screw").setUnificationData(OrePrefix.screw, CosmicNeutronium).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.COSMIC_NEUTRONIUM = metaItem_NTM.addItem(57, "cosmic_neutronium.spring").setUnificationData(OrePrefix.spring, CosmicNeutronium).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.COSMIC_NEUTRONIUM = metaItem_NTM.addItem(58, "cosmic_neutronium.spring_small").setUnificationData(OrePrefix.springSmall, CosmicNeutronium).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.COSMIC_NEUTRONIUM = metaItem_NTM.addItem(59, "cosmic_neutronium.stick").setUnificationData(OrePrefix.stick, CosmicNeutronium).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.COSMIC_NEUTRONIUM = metaItem_NTM.addItem(60, "cosmic_neutronium.stick_long").setUnificationData(OrePrefix.stickLong, CosmicNeutronium).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.COSMIC_NEUTRONIUM = metaItem_NTM.addItem(61, "cosmic_neutronium.wire_fine").setUnificationData(OrePrefix.wireFine, CosmicNeutronium).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);


//ID 80-119
        NTMetaInit.WHITED_WARF_MATTER = metaItem_NTM.addItem(80, "whitedwarfmatter.bolt").setUnificationData(OrePrefix.bolt, WhitedWarfMatter).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WHITED_WARF_MATTER = metaItem_NTM.addItem(81, "whitedwarfmatter.dust").setUnificationData(OrePrefix.dust, WhitedWarfMatter).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WHITED_WARF_MATTER = metaItem_NTM.addItem(82, "whitedwarfmatter.dust_tiny").setUnificationData(OrePrefix.dustTiny, WhitedWarfMatter).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WHITED_WARF_MATTER = metaItem_NTM.addItem(83, "whitedwarfmatter.dust_small").setUnificationData(OrePrefix.dustSmall, WhitedWarfMatter).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WHITED_WARF_MATTER = metaItem_NTM.addItem(84, "whitedwarfmatter.foil").setUnificationData(OrePrefix.foil, WhitedWarfMatter).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WHITED_WARF_MATTER = metaItem_NTM.addItem(85, "whitedwarfmatter.gear").setUnificationData(OrePrefix.gear, WhitedWarfMatter).setMaxStackSize(16).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WHITED_WARF_MATTER = metaItem_NTM.addItem(86, "whitedwarfmatter.gear_small").setUnificationData(OrePrefix.gearSmall, WhitedWarfMatter).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WHITED_WARF_MATTER = metaItem_NTM.addItem(87, "whitedwarfmatter.ingot").setUnificationData(OrePrefix.ingot, WhitedWarfMatter).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WHITED_WARF_MATTER = metaItem_NTM.addItem(88, "whitedwarfmatter.ingot_hot").setUnificationData(OrePrefix.ingotHot, WhitedWarfMatter).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WHITED_WARF_MATTER = metaItem_NTM.addItem(89, "whitedwarfmatter.nugget").setUnificationData(OrePrefix.nugget, WhitedWarfMatter).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WHITED_WARF_MATTER = metaItem_NTM.addItem(90, "whitedwarfmatter.plate").setUnificationData(OrePrefix.plate, WhitedWarfMatter).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WHITED_WARF_MATTER = metaItem_NTM.addItem(91, "whitedwarfmatter.plate_dense").setUnificationData(OrePrefix.plateDense, WhitedWarfMatter).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WHITED_WARF_MATTER = metaItem_NTM.addItem(92, "whitedwarfmatter.plate_double").setUnificationData(OrePrefix.plateDouble, WhitedWarfMatter).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WHITED_WARF_MATTER = metaItem_NTM.addItem(93, "whitedwarfmatter.ring").setUnificationData(OrePrefix.ring, WhitedWarfMatter).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WHITED_WARF_MATTER = metaItem_NTM.addItem(94, "whitedwarfmatter.rotor").setUnificationData(OrePrefix.rotor, WhitedWarfMatter).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WHITED_WARF_MATTER = metaItem_NTM.addItem(95, "whitedwarfmatter.round").setUnificationData(OrePrefix.round, WhitedWarfMatter).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WHITED_WARF_MATTER = metaItem_NTM.addItem(96, "whitedwarfmatter.screw").setUnificationData(OrePrefix.screw, WhitedWarfMatter).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WHITED_WARF_MATTER = metaItem_NTM.addItem(97, "whitedwarfmatter.spring").setUnificationData(OrePrefix.spring, WhitedWarfMatter).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WHITED_WARF_MATTER = metaItem_NTM.addItem(98, "whitedwarfmatter.spring_small").setUnificationData(OrePrefix.springSmall, WhitedWarfMatter).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WHITED_WARF_MATTER = metaItem_NTM.addItem(99, "whitedwarfmatter.stick").setUnificationData(OrePrefix.stick, WhitedWarfMatter).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WHITED_WARF_MATTER = metaItem_NTM.addItem(100, "whitedwarfmatter.stick_long").setUnificationData(OrePrefix.stickLong, WhitedWarfMatter).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WHITED_WARF_MATTER = metaItem_NTM.addItem(101, "whitedwarfmatter.wire_fine").setUnificationData(OrePrefix.wireFine, WhitedWarfMatter).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WHITED_WARF_MATTER = metaItem_NTM.addItem(102, "whitedwarfmatter.nanites").setUnificationData(NTOrePrefix.nanites, WhitedWarfMatter).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.WHITED_WARF_MATTER = metaItem_NTM.addItem(103, "whitedwarfmatter.casing_small").setUnificationData(NTOrePrefix.casingSmall, WhitedWarfMatter).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);



        //ID120-159 Spacetime
        NTMetaInit.SPACETIME = metaItem_NTM.addItem(120, "spacetime.bolt").setUnificationData(OrePrefix.bolt, Spacetime).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.SPACETIME = metaItem_NTM.addItem(121, "spacetime.dust").setUnificationData(OrePrefix.dust, Spacetime).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.SPACETIME = metaItem_NTM.addItem(122, "spacetime.dust_tiny").setUnificationData(OrePrefix.dustTiny, Spacetime).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.SPACETIME = metaItem_NTM.addItem(123, "spacetime.dust_small").setUnificationData(OrePrefix.dustSmall, Spacetime).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.SPACETIME = metaItem_NTM.addItem(124, "spacetime.foil").setUnificationData(OrePrefix.foil, Spacetime).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.SPACETIME = metaItem_NTM.addItem(125, "spacetime.gear").setUnificationData(OrePrefix.gear, Spacetime).setMaxStackSize(16).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.SPACETIME = metaItem_NTM.addItem(126, "spacetime.gear_small").setUnificationData(OrePrefix.gearSmall, Spacetime).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.SPACETIME = metaItem_NTM.addItem(127, "spacetime.lens").setUnificationData(OrePrefix.lens, Spacetime).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.SPACETIME = metaItem_NTM.addItem(128, "spacetime.ingot").setUnificationData(OrePrefix.ingot, Spacetime).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.SPACETIME = metaItem_NTM.addItem(129, "spacetime.ingot_hot").setUnificationData(OrePrefix.ingotHot, Spacetime).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.SPACETIME = metaItem_NTM.addItem(130, "spacetime.nugget").setUnificationData(OrePrefix.nugget, Spacetime).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.SPACETIME = metaItem_NTM.addItem(131, "spacetime.plate").setUnificationData(OrePrefix.plate, Spacetime).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.SPACETIME = metaItem_NTM.addItem(132, "spacetime.plate_dense").setUnificationData(OrePrefix.plateDense, Spacetime).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.SPACETIME = metaItem_NTM.addItem(133, "spacetime.plate_double").setUnificationData(OrePrefix.plateDouble, Spacetime).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.SPACETIME = metaItem_NTM.addItem(134, "spacetime.ring").setUnificationData(OrePrefix.ring, Spacetime).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.SPACETIME = metaItem_NTM.addItem(135, "spacetime.rotor").setUnificationData(OrePrefix.rotor, Spacetime).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.SPACETIME = metaItem_NTM.addItem(136, "spacetime.round").setUnificationData(OrePrefix.round, Spacetime).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.SPACETIME = metaItem_NTM.addItem(137, "spacetime.screw").setUnificationData(OrePrefix.screw, Spacetime).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.SPACETIME = metaItem_NTM.addItem(138, "spacetime.spring").setUnificationData(OrePrefix.spring, Spacetime).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.SPACETIME = metaItem_NTM.addItem(139, "spacetime.spring_small").setUnificationData(OrePrefix.springSmall, Spacetime).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.SPACETIME = metaItem_NTM.addItem(140, "spacetime.stick").setUnificationData(OrePrefix.stick, Spacetime).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.SPACETIME = metaItem_NTM.addItem(141, "spacetime.stick_long").setUnificationData(OrePrefix.stickLong, Spacetime).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.SPACETIME = metaItem_NTM.addItem(142, "spacetime.turbine_blade").setUnificationData(OrePrefix.turbineBlade, Spacetime).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.SPACETIME = metaItem_NTM.addItem(143, "spacetime.wire_fine").setUnificationData(OrePrefix.wireFine, Spacetime).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.SPACETIME = metaItem_NTM.addItem(144, "spacetime.ingot_double").setUnificationData(NTOrePrefix.ingotDouble, Spacetime).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.SPACETIME = metaItem_NTM.addItem(145, "spacetime.plate_quadruple").setUnificationData(NTOrePrefix.plateQuadruple, Spacetime).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.SPACETIME = metaItem_NTM.addItem(146, "spacetime.plate_quintuple").setUnificationData(NTOrePrefix.plateQuintuple, Spacetime).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.SPACETIME = metaItem_NTM.addItem(147, "spacetime.plate_triple").setUnificationData(NTOrePrefix.plateTriple, Spacetime).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.SPACETIME = metaItem_NTM.addItem(148, "spacetime.casing_small").setUnificationData(NTOrePrefix.casingSmall, Spacetime).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        


        //ID160-199
        NTMetaInit.ETERNITY = metaItem_NTM.addItem(160, "eternity.bolt").setUnificationData(OrePrefix.bolt, Eternity).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.ETERNITY = metaItem_NTM.addItem(161, "eternity.dust").setUnificationData(OrePrefix.dust, Eternity).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.ETERNITY = metaItem_NTM.addItem(162, "eternity.dust_tiny").setUnificationData(OrePrefix.dustTiny, Eternity).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.ETERNITY = metaItem_NTM.addItem(163, "eternity.dust_small").setUnificationData(OrePrefix.dustSmall, Eternity).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.ETERNITY = metaItem_NTM.addItem(164, "eternity.foil").setUnificationData(OrePrefix.foil, Eternity).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.ETERNITY = metaItem_NTM.addItem(165, "eternity.gear").setUnificationData(OrePrefix.gear, Eternity).setMaxStackSize(16).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.ETERNITY = metaItem_NTM.addItem(166, "eternity.gear_small").setUnificationData(OrePrefix.gearSmall, Eternity).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.ETERNITY = metaItem_NTM.addItem(167, "eternity.lens").setUnificationData(OrePrefix.lens, Eternity).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.ETERNITY = metaItem_NTM.addItem(168, "eternity.ingot").setUnificationData(OrePrefix.ingot, Eternity).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.ETERNITY = metaItem_NTM.addItem(169, "eternity.ingot_hot").setUnificationData(OrePrefix.ingotHot, Eternity).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.ETERNITY = metaItem_NTM.addItem(170, "eternity.nugget").setUnificationData(OrePrefix.nugget, Eternity).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.ETERNITY = metaItem_NTM.addItem(171, "eternity.plate").setUnificationData(OrePrefix.plate, Eternity).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.ETERNITY = metaItem_NTM.addItem(172, "eternity.plate_dense").setUnificationData(OrePrefix.plateDense, Eternity).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.ETERNITY = metaItem_NTM.addItem(173, "eternity.plate_double").setUnificationData(OrePrefix.plateDouble, Eternity).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.ETERNITY = metaItem_NTM.addItem(174, "eternity.ring").setUnificationData(OrePrefix.ring, Eternity).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.ETERNITY = metaItem_NTM.addItem(175, "eternity.rotor").setUnificationData(OrePrefix.rotor, Eternity).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.ETERNITY = metaItem_NTM.addItem(176, "eternity.round").setUnificationData(OrePrefix.round, Eternity).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.ETERNITY = metaItem_NTM.addItem(177, "eternity.screw").setUnificationData(OrePrefix.screw, Eternity).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.ETERNITY = metaItem_NTM.addItem(178, "eternity.spring").setUnificationData(OrePrefix.spring, Eternity).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.ETERNITY = metaItem_NTM.addItem(179, "eternity.spring_small").setUnificationData(OrePrefix.springSmall, Eternity).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.ETERNITY = metaItem_NTM.addItem(180, "eternity.stick").setUnificationData(OrePrefix.stick, Eternity).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.ETERNITY = metaItem_NTM.addItem(181, "eternity.stick_long").setUnificationData(OrePrefix.stickLong, Eternity).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.ETERNITY = metaItem_NTM.addItem(182, "eternity.turbine_blade").setUnificationData(OrePrefix.turbineBlade, Eternity).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.ETERNITY = metaItem_NTM.addItem(183, "eternity.wire_fine").setUnificationData(OrePrefix.wireFine, Eternity).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.ETERNITY = metaItem_NTM.addItem(184, "eternity.nanites").setUnificationData(NTOrePrefix.nanites, Eternity).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.ETERNITY = metaItem_NTM.addItem(185, "eternity.ingot_double").setUnificationData(NTOrePrefix.ingotDouble, Eternity).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.ETERNITY = metaItem_NTM.addItem(186, "eternity.plate_quadruple").setUnificationData(NTOrePrefix.plateQuadruple, Eternity).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.ETERNITY = metaItem_NTM.addItem(187, "eternity.plate_quintuple").setUnificationData(NTOrePrefix.plateQuintuple, Eternity).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.ETERNITY = metaItem_NTM.addItem(188, "eternity.plate_triple").setUnificationData(NTOrePrefix.plateTriple, Eternity).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.ETERNITY = metaItem_NTM.addItem(189, "eternity.casing_small").setUnificationData(NTOrePrefix.casingSmall, Eternity).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);



        //ID200-239
        NTMetaInit.MAGNETOHYDRODYNAMICALLYCONSTRAINEDSTARMATTER = metaItem_NTM.addItem(200, "magnetohydrodynamicallyconstrainedstarmatter.bolt").setUnificationData(OrePrefix.bolt, MagnetohydrodynamicallyConstrainedStarMatter).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.MAGNETOHYDRODYNAMICALLYCONSTRAINEDSTARMATTER = metaItem_NTM.addItem(201, "magnetohydrodynamicallyconstrainedstarmatter.dust").setUnificationData(OrePrefix.dust, MagnetohydrodynamicallyConstrainedStarMatter).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.MAGNETOHYDRODYNAMICALLYCONSTRAINEDSTARMATTER = metaItem_NTM.addItem(202, "magnetohydrodynamicallyconstrainedstarmatter.dust_tiny").setUnificationData(OrePrefix.dustTiny, MagnetohydrodynamicallyConstrainedStarMatter).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.MAGNETOHYDRODYNAMICALLYCONSTRAINEDSTARMATTER = metaItem_NTM.addItem(203, "magnetohydrodynamicallyconstrainedstarmatter.dust_small").setUnificationData(OrePrefix.dustSmall, MagnetohydrodynamicallyConstrainedStarMatter).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.MAGNETOHYDRODYNAMICALLYCONSTRAINEDSTARMATTER = metaItem_NTM.addItem(204, "magnetohydrodynamicallyconstrainedstarmatter.foil").setUnificationData(OrePrefix.foil, MagnetohydrodynamicallyConstrainedStarMatter).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.MAGNETOHYDRODYNAMICALLYCONSTRAINEDSTARMATTER = metaItem_NTM.addItem(205, "magnetohydrodynamicallyconstrainedstarmatter.gear").setUnificationData(OrePrefix.gear, MagnetohydrodynamicallyConstrainedStarMatter).setMaxStackSize(16).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.MAGNETOHYDRODYNAMICALLYCONSTRAINEDSTARMATTER = metaItem_NTM.addItem(206, "magnetohydrodynamicallyconstrainedstarmatter.gear_small").setUnificationData(OrePrefix.gearSmall, MagnetohydrodynamicallyConstrainedStarMatter).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.MAGNETOHYDRODYNAMICALLYCONSTRAINEDSTARMATTER = metaItem_NTM.addItem(207, "magnetohydrodynamicallyconstrainedstarmatter.ingot").setUnificationData(OrePrefix.ingot, MagnetohydrodynamicallyConstrainedStarMatter).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.MAGNETOHYDRODYNAMICALLYCONSTRAINEDSTARMATTER = metaItem_NTM.addItem(208, "magnetohydrodynamicallyconstrainedstarmatter.ingot_hot").setUnificationData(OrePrefix.ingotHot, MagnetohydrodynamicallyConstrainedStarMatter).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.MAGNETOHYDRODYNAMICALLYCONSTRAINEDSTARMATTER = metaItem_NTM.addItem(209, "magnetohydrodynamicallyconstrainedstarmatter.nugget").setUnificationData(OrePrefix.nugget, MagnetohydrodynamicallyConstrainedStarMatter).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.MAGNETOHYDRODYNAMICALLYCONSTRAINEDSTARMATTER = metaItem_NTM.addItem(210, "magnetohydrodynamicallyconstrainedstarmatter.plate").setUnificationData(OrePrefix.plate, MagnetohydrodynamicallyConstrainedStarMatter).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.MAGNETOHYDRODYNAMICALLYCONSTRAINEDSTARMATTER = metaItem_NTM.addItem(211, "magnetohydrodynamicallyconstrainedstarmatter.plate_dense").setUnificationData(OrePrefix.plateDense, MagnetohydrodynamicallyConstrainedStarMatter).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.MAGNETOHYDRODYNAMICALLYCONSTRAINEDSTARMATTER = metaItem_NTM.addItem(212, "magnetohydrodynamicallyconstrainedstarmatter.plate_double").setUnificationData(OrePrefix.plateDouble, MagnetohydrodynamicallyConstrainedStarMatter).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.MAGNETOHYDRODYNAMICALLYCONSTRAINEDSTARMATTER = metaItem_NTM.addItem(213, "magnetohydrodynamicallyconstrainedstarmatter.ring").setUnificationData(OrePrefix.ring, MagnetohydrodynamicallyConstrainedStarMatter).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.MAGNETOHYDRODYNAMICALLYCONSTRAINEDSTARMATTER = metaItem_NTM.addItem(214, "magnetohydrodynamicallyconstrainedstarmatter.round").setUnificationData(OrePrefix.round, MagnetohydrodynamicallyConstrainedStarMatter).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.MAGNETOHYDRODYNAMICALLYCONSTRAINEDSTARMATTER = metaItem_NTM.addItem(215, "magnetohydrodynamicallyconstrainedstarmatter.screw").setUnificationData(OrePrefix.screw, MagnetohydrodynamicallyConstrainedStarMatter).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.MAGNETOHYDRODYNAMICALLYCONSTRAINEDSTARMATTER = metaItem_NTM.addItem(216, "magnetohydrodynamicallyconstrainedstarmatter.spring").setUnificationData(OrePrefix.spring, MagnetohydrodynamicallyConstrainedStarMatter).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.MAGNETOHYDRODYNAMICALLYCONSTRAINEDSTARMATTER = metaItem_NTM.addItem(217, "magnetohydrodynamicallyconstrainedstarmatter.spring_small").setUnificationData(OrePrefix.springSmall, MagnetohydrodynamicallyConstrainedStarMatter).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.MAGNETOHYDRODYNAMICALLYCONSTRAINEDSTARMATTER = metaItem_NTM.addItem(218, "magnetohydrodynamicallyconstrainedstarmatter.stick").setUnificationData(OrePrefix.stick, MagnetohydrodynamicallyConstrainedStarMatter).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.MAGNETOHYDRODYNAMICALLYCONSTRAINEDSTARMATTER = metaItem_NTM.addItem(219, "magnetohydrodynamicallyconstrainedstarmatter.stick_long").setUnificationData(OrePrefix.stickLong, MagnetohydrodynamicallyConstrainedStarMatter).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.MAGNETOHYDRODYNAMICALLYCONSTRAINEDSTARMATTER = metaItem_NTM.addItem(220, "magnetohydrodynamicallyconstrainedstarmatter.ingot_double").setUnificationData(NTOrePrefix.ingotDouble, MagnetohydrodynamicallyConstrainedStarMatter).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.MAGNETOHYDRODYNAMICALLYCONSTRAINEDSTARMATTER = metaItem_NTM.addItem(221, "magnetohydrodynamicallyconstrainedstarmatter.plate_quadruple").setUnificationData(NTOrePrefix.plateQuadruple, MagnetohydrodynamicallyConstrainedStarMatter).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.MAGNETOHYDRODYNAMICALLYCONSTRAINEDSTARMATTER = metaItem_NTM.addItem(222, "magnetohydrodynamicallyconstrainedstarmatter.plate_quintuple").setUnificationData(NTOrePrefix.plateQuintuple, MagnetohydrodynamicallyConstrainedStarMatter).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.MAGNETOHYDRODYNAMICALLYCONSTRAINEDSTARMATTER = metaItem_NTM.addItem(223, "magnetohydrodynamicallyconstrainedstarmatter.plate_triple").setUnificationData(NTOrePrefix.plateTriple, MagnetohydrodynamicallyConstrainedStarMatter).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.MAGNETOHYDRODYNAMICALLYCONSTRAINEDSTARMATTER = metaItem_NTM.addItem(224, "magnetohydrodynamicallyconstrainedstarmatter.casing_small").setUnificationData(NTOrePrefix.casingSmall, MagnetohydrodynamicallyConstrainedStarMatter).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);



        //ID240-279(tf)
        NTMetaInit.LUMIUM = metaItem_NTM.addItem(240, "lumium.ingot").setUnificationData(OrePrefix.ingot, Lumium).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.LUMIUM = metaItem_NTM.addItem(241, "lumium.plate").setUnificationData(OrePrefix.plate, Lumium).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.LUMIUM = metaItem_NTM.addItem(242, "lumium.gear").setUnificationData(OrePrefix.gear, Lumium).setMaxStackSize(16).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.LUMIUM = metaItem_NTM.addItem(243, "lumium.dust").setUnificationData(OrePrefix.dust, Lumium).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.LUMIUM = metaItem_NTM.addItem(244, "lumium.nugget").setUnificationData(OrePrefix.nugget, Lumium).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);

        NTMetaInit.ENDERIUM = metaItem_NTM.addItem(245, "enderium.ingot").setUnificationData(OrePrefix.ingot, Enderium).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.ENDERIUM = metaItem_NTM.addItem(246, "enderium.plate").setUnificationData(OrePrefix.plate, Enderium).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.ENDERIUM = metaItem_NTM.addItem(247, "enderium.gear").setUnificationData(OrePrefix.gear, Enderium).setMaxStackSize(16).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.ENDERIUM = metaItem_NTM.addItem(248, "enderium.dust").setUnificationData(OrePrefix.dust, Enderium).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.ENDERIUM = metaItem_NTM.addItem(249, "enderium.nugget").setUnificationData(OrePrefix.nugget, Enderium).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);

        NTMetaInit.SIGNALUM = metaItem_NTM.addItem(250, "signalum.ingot").setUnificationData(OrePrefix.ingot, Signalum).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.SIGNALUM = metaItem_NTM.addItem(251, "signalum.plate").setUnificationData(OrePrefix.plate, Signalum).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.SIGNALUM = metaItem_NTM.addItem(252, "signalum.gear").setUnificationData(OrePrefix.gear, Signalum).setMaxStackSize(16).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.SIGNALUM = metaItem_NTM.addItem(253, "signalum.dust").setUnificationData(OrePrefix.dust, Signalum).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.SIGNALUM = metaItem_NTM.addItem(254, "signalum.nugget").setUnificationData(OrePrefix.nugget, Signalum).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);

        NTMetaInit.MITHRIL = metaItem_NTM.addItem(255, "mithril.ingot").setUnificationData(OrePrefix.ingot, Mithril).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.MITHRIL = metaItem_NTM.addItem(256, "mithril.plate").setUnificationData(OrePrefix.plate, Mithril).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.MITHRIL = metaItem_NTM.addItem(257, "mithril.gear").setUnificationData(OrePrefix.gear, Mithril).setMaxStackSize(16).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.MITHRIL = metaItem_NTM.addItem(258, "mithril.dust").setUnificationData(OrePrefix.dust, Mithril).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.MITHRIL = metaItem_NTM.addItem(259, "mithril.nugget").setUnificationData(OrePrefix.nugget, Mithril).setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);

        NTMetaInit.TDUST = metaItem_NTM.addItem(260, "dust_basalz").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.TDUST = metaItem_NTM.addItem(261, "dust_aerotheum").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.TDUST = metaItem_NTM.addItem(262, "dust_blaze").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.TDUST = metaItem_NTM.addItem(263, "dust_blitz").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.TDUST = metaItem_NTM.addItem(264, "dust_blizz").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.TDUST = metaItem_NTM.addItem(265, "dust_pyrotheum").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.TDUST = metaItem_NTM.addItem(266, "dust_petrotheum").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.TDUST = metaItem_NTM.addItem(267, "dust_cryotheum").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.TDUST = metaItem_NTM.addItem(268, "dust_mana").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);

        NTMetaInit.TROD = metaItem_NTM.addItem(269, "rod_basalz").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.TROD = metaItem_NTM.addItem(270, "rod_blitz").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.TROD = metaItem_NTM.addItem(271, "rod_blizz").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);

        NTMetaInit.TCRYSTAL = metaItem_NTM.addItem(272, "crystal_redstone").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.TCRYSTAL = metaItem_NTM.addItem(273, "crystal_crude_oil").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.TCRYSTAL = metaItem_NTM.addItem(274, "crystal_glowstone").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.TCRYSTAL = metaItem_NTM.addItem(275, "crystal_ender").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);
        NTMetaInit.TCRYSTAL = metaItem_NTM.addItem(276, "crystal_geode").setMaxStackSize(64).setCreativeTabs(CommonProxy.NAXTECH_TAB);





        //ID240-239
    }
}
