package com.onlyex.naxtech.api.unification.materials;

import com.onlyex.naxtech.api.unification.NTElements;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.properties.BlastProperty;

import static com.onlyex.naxtech.api.unification.NTMaterials.*;
import static com.onlyex.naxtech.api.unification.material.info.NTMaterialIconSet.*;
import static gregtech.api.GTValues.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.unification.material.info.MaterialIconSet.*;
import static gregtech.api.util.GTUtility.gregtechId;

public class MachineCasingMaterials {
    private static int startId = 26001;
    private static final int END_ID = startId + 1000;
    public static void register() {

        MARM200Steel = new Material.Builder(getMaterialsId(), gregtechId("mar_m_200_steel"))
                .ingot()
                .fluid()
                .color(0x515151)
                .iconSet(SHINY)
                .blastTemp(5000, BlastProperty.GasTier.HIGHER, VA[IV], 200)
                .components(Niobium, 2, Chrome, 9, Aluminium, 5, Titanium, 2, Cobalt, 10, Tungsten, 13, Nickel, 18)
                .flags(GENERATE_PLATE, GENERATE_ROTOR, GENERATE_ROD, GENERATE_FRAME, NO_UNIFICATION)
                .build();

        Celestite = new Material.Builder(getMaterialsId(), gregtechId("celestite"))
                .gem()
                .color(0x4AE3E6)
                .iconSet(OPAL)
                .components(Strontium, 1, Sulfur, 1, Oxygen, 4)
                .flags(CRYSTALLIZABLE, DISABLE_DECOMPOSITION, GENERATE_LENS, NO_UNIFICATION)
                .build();

        Vibranium = new Material.Builder(getMaterialsId(), gregtechId("vibranium"))
                .ingot()
                .fluid()
                .plasma()
                .color(0xC880FF)
                .iconSet(SHINY)
                .flags(GENERATE_PLATE, GENERATE_FOIL, GENERATE_DOUBLE_PLATE, GENERATE_FINE_WIRE, GENERATE_FRAME, NO_UNIFICATION)
                .element(NTElements.Vibranium)
                .blastTemp(4852, BlastProperty.GasTier.HIGH)
                .build();

        Adamantium = new Material.Builder(getMaterialsId(), gregtechId("adamantium"))
                .ingot()
                .fluid()
                .plasma()
                .color(0xFF0040)
                .iconSet(METALLIC)
                .flags(GENERATE_PLATE, GENERATE_ROTOR, GENERATE_ROD, GENERATE_LONG_ROD, GENERATE_FRAME, GENERATE_GEAR, GENERATE_SMALL_GEAR, GENERATE_ROUND, GENERATE_SPRING, GENERATE_DOUBLE_PLATE, NO_UNIFICATION)
                .element(NTElements.Adamantium)
                .blastTemp(5225, BlastProperty.GasTier.HIGH)
                .cableProperties(VA[UHV], 18, 9, false)
                .build();

        Orichalcum = new Material.Builder(getMaterialsId(), gregtechId("orichalcum"))
                .ingot()
                .fluid()
                .color(0x72A0C1)
                .iconSet(METALLIC)
                .element(NTElements.Orichalcum)
                .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_FRAME, GENERATE_GEAR, NO_UNIFICATION)
                .blastTemp(9000, BlastProperty.GasTier.HIGH)
                .build();

        Taranium = new Material.Builder(getMaterialsId(), gregtechId("taranium"))
                .ingot()
                .fluid()
                .plasma()
                .color(0x4F404F)
                .iconSet(METALLIC)
                .element(NTElements.Taranium)
                .flags(GENERATE_PLATE, GENERATE_DOUBLE_PLATE, NO_UNIFICATION)
                .build();

        Legendarium = new Material.Builder(getMaterialsId(), gregtechId("legendarium"))
                .ingot()
                .fluid()
                .color(0xF58FDA)
                .iconSet(CUSTOM_LEGENDARIUM)
                .components(Naquadria, 1, Trinium, 1, Duranium, 1, Tritanium, 1, Orichalcum, 1, Adamantium, 1, Vibranium, 1, Taranium, 1)
                //  TODO UEV stage coil?
                .blastTemp(12960, BlastProperty.GasTier.HIGHEST, VA[UIV], 4998)
                .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_LONG_ROD, GENERATE_RING, GENERATE_ROUND, GENERATE_BOLT_SCREW, GENERATE_FRAME, GENERATE_DOUBLE_PLATE, GENERATE_GEAR, GENERATE_SMALL_GEAR, NO_UNIFICATION)
                .build();


    }

    private static int getMaterialsId() {
        if (startId < END_ID) {
            return startId++;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}
