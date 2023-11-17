package com.onlyex.naxtech.api.recipes;

import com.onlyex.naxtech.api.recipes.builder.*;
import com.onlyex.naxtech.api.recipes.machines.*;
import crafttweaker.annotations.ZenRegister;
import gregtech.api.gui.GuiTextures;
import gregtech.api.gui.widgets.ProgressWidget;
import gregtech.api.recipes.RecipeMap;
import gregtech.api.recipes.builders.AssemblerRecipeBuilder;
import gregtech.api.recipes.builders.SimpleRecipeBuilder;
import gregtech.core.sound.GTSoundEvents;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenProperty;

@ZenClass("mods.naxtech.recipe.NTRecipeMaps")
@ZenRegister
public class NTRecipeMaps {
    @ZenProperty
    public static final RecipeMap<SimpleRecipeBuilder> COMPONENT_ASSEMBLER_RECIPES;

    @ZenProperty
    public static final RecipeMap<AssemblerRecipeBuilder> PACKAGING_LINE_RECIPES;
    @ZenProperty
    public static final RecipeMap<CACasingTierRecipeBuilder> COMPONENT_ASSEMBLY_LINE_RECIPES;
    public NTRecipeMaps() {}

    static {
        PACKAGING_LINE_RECIPES = new RecipeMap<>("packaging_line_recipes", 9, 1, 1, 0, new AssemblerRecipeBuilder(), false)
                .setSlotOverlay(false, false, GuiTextures.CIRCUIT_OVERLAY)
                .setProgressBar(GuiTextures.PROGRESS_BAR_CIRCUIT, ProgressWidget.MoveType.HORIZONTAL)
                .setSound(GTSoundEvents.ASSEMBLER);

        //  Component Assembly Line Recipemap
        COMPONENT_ASSEMBLY_LINE_RECIPES = new RecipeMapComponentAssemblyLine<>("component_assembly_line_recipes", 12, 1,  12, 0, new CACasingTierRecipeBuilder(), false)
                .setSound(GTSoundEvents.ASSEMBLER);

        COMPONENT_ASSEMBLER_RECIPES = new RecipeMap<>("component_assembler_recipes", 6, 1, 1, 0, new SimpleRecipeBuilder(), false)
                .setSlotOverlay(false, false, false, GuiTextures.CIRCUIT_OVERLAY)
                .setSlotOverlay(false, false, true, GuiTextures.CIRCUIT_OVERLAY)
                .setSound(GTSoundEvents.ASSEMBLER);
    }

}
