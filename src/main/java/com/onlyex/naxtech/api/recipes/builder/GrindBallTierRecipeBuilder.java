package com.onlyex.naxtech.api.recipes.builder;

import com.onlyex.naxtech.api.recipes.properties.GrindBallTierProperty;
import com.onlyex.naxtech.api.utils.NTLog;
import gregtech.api.recipes.Recipe;
import gregtech.api.recipes.RecipeBuilder;
import gregtech.api.recipes.RecipeMap;
import gregtech.api.util.EnumValidationResult;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.annotation.Nonnull;

public class GrindBallTierRecipeBuilder extends RecipeBuilder<GrindBallTierRecipeBuilder> {
    public GrindBallTierRecipeBuilder() {/**/}

    public GrindBallTierRecipeBuilder(Recipe recipe, RecipeMap<GrindBallTierRecipeBuilder> recipeMap) {
        super(recipe, recipeMap);
    }

    public GrindBallTierRecipeBuilder(RecipeBuilder<GrindBallTierRecipeBuilder> recipeBuilder) {
        super(recipeBuilder);
    }

    @Override
    public GrindBallTierRecipeBuilder copy() {
        return new GrindBallTierRecipeBuilder(this);
    }

    public int getLevel() {
        return this.recipePropertyStorage == null ? 0 :
                this.recipePropertyStorage.getRecipePropertyValue(GrindBallTierProperty.getInstance(), 0);
    }

    @Override
    public boolean applyProperty(@Nonnull String key, Object value) {
        if (key.equals(GrindBallTierProperty.KEY)) {
            this.grindBallTier(((Number) value).intValue());
            return true;
        }
        return super.applyProperty(key, value);
    }

    public GrindBallTierRecipeBuilder grindBallTier(int level) {
        if (level <= 0) {
            NTLog.logger.error("Grind Ball Tier cannot be less than or equal to 0", new IllegalArgumentException());
            recipeStatus = EnumValidationResult.INVALID;
        }
        this.applyProperty(GrindBallTierProperty.getInstance(), level);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .appendSuper(super.toString())
                .append(GrindBallTierProperty.getInstance().getKey(), getLevel())
                .toString();
    }
}
