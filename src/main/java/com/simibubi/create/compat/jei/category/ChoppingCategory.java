package com.simibubi.create.compat.jei.category;

import java.util.Arrays;
import java.util.List;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.simibubi.create.AllBlocks;
import com.simibubi.create.AllItems;
import com.simibubi.create.compat.jei.category.animations.AnimatedChop;
import com.simibubi.create.content.contraptions.components.chopper.ChoppingRecipe;
import com.simibubi.create.content.contraptions.processing.ProcessingOutput;
import com.simibubi.create.foundation.gui.AllGuiTextures;

import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.gui.ingredient.IGuiItemStackGroup;
import mezz.jei.api.ingredients.IIngredients;

public class ChoppingCategory extends CreateRecipeCategory<ChoppingRecipe> {

    private AnimatedChop chop = new AnimatedChop(false);

    public ChoppingCategory() {
        super(itemIcon(AllBlocks.MECHANICAL_CHOP.get()), emptyBackground(177, 70));
    }

    @Override
    public Class<? extends ChoppingRecipe> getRecipeClass() {
        return ChoppingRecipe.class;
    }

    @Override
    public void setIngredients(ChoppingRecipe recipe, IIngredients ingredients) {
        ingredients.setInputIngredients(recipe.getIngredients());
        ingredients.setOutputs(VanillaTypes.ITEM, recipe.getRollableResultsAsItemStacks());
    }

    @Override
    public void setRecipe(IRecipeLayout recipeLayout, ChoppingRecipe recipe, IIngredients ingredients) {
        IGuiItemStackGroup itemStacks = recipeLayout.getItemStacks();
        itemStacks.init(0, true, 26, 50);
        itemStacks.set(0, Arrays.asList(recipe.getIngredients()
                .get(0)
                .getMatchingStacks()));

        List<ProcessingOutput> results = recipe.getRollableResults();
        for (int outputIndex = 0; outputIndex < results.size(); outputIndex++) {
            itemStacks.init(outputIndex + 1, false, 131 + 19 * outputIndex, 50);
            itemStacks.set(outputIndex + 1, results.get(outputIndex)
                    .getStack());
        }

        addStochasticTooltip(itemStacks, results);
    }

    @Override
    public void draw(ChoppingRecipe recipe, MatrixStack matrixStack, double mouseX, double mouseY) {
        AllGuiTextures.JEI_SLOT.draw(matrixStack, 26, 50);
        getRenderedSlot(recipe, 0).draw(matrixStack, 131, 50);
        if (recipe.getRollableResults()
                .size() > 1)
            getRenderedSlot(recipe, 1).draw(matrixStack, 131 + 19, 50);
        AllGuiTextures.JEI_SHADOW.draw(matrixStack, 61, 41);
        AllGuiTextures.JEI_LONG_ARROW.draw(matrixStack, 52, 54);
        chop.draw(matrixStack, getBackground().getWidth() / 2 - 17, 22);
    }

}