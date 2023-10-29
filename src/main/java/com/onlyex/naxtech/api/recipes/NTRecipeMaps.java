package com.onlyex.naxtech.api.recipes;

import crafttweaker.annotations.ZenRegister;
import gregtech.api.gui.GuiTextures;
import gregtech.api.gui.widgets.ProgressWidget;
import gregtech.api.recipes.RecipeMap;
import gregtech.api.recipes.builders.AssemblerRecipeBuilder;
import gregtech.core.sound.GTSoundEvents;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenProperty;

@ZenClass("mods.naxtech.recipe.NTRecipeMaps")
@ZenRegister
public class NTRecipeMaps {
    @ZenProperty
    public static final RecipeMap<AssemblerRecipeBuilder> PACKAGING_LINE_RECIPES = new RecipeMap<>("packaging_line", 9, 1, 1, 0, new AssemblerRecipeBuilder(), false)
            .setSlotOverlay(false, false, GuiTextures.CIRCUIT_OVERLAY)
            .setProgressBar(GuiTextures.PROGRESS_BAR_CIRCUIT, ProgressWidget.MoveType.HORIZONTAL)
            .setSound(GTSoundEvents.ASSEMBLER);
}
