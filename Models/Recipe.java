package Models;

import java.util.ArrayList;

/**
 * The recipe class handles all functionality related to recipe information.
 * Last Updated: 3/24/2021
 * @author Leslie Macias Magana
 */

public class Recipe extends APIBaseClass {
    protected String ingredient;
    protected String recipeName;
    protected String recipeUrl;

    public Recipe(){
        System.out.println("Recipe Model Loaded");
    }

    public Recipe (String recipeName, String recipeUrl) {
        this.recipeName = recipeName;
        this.recipeUrl = recipeUrl;
    }

    public static ArrayList<Recipe> getRecipeByIngredient(String _ingredient){
        Recipe recipe = new Recipe();
        // If an ingredient has a space, the space is filled with a comma to follow the api guideline.
        _ingredient = _ingredient.replace(' ', ',');
        recipe.setIngredient(_ingredient);
        return APIBaseClass.myRecipeAPI.loadRecipeByIngredient(_ingredient);
    }

    // ================ GETTERS =================
    public String getIngredient(){
        return this.ingredient;
    }

    public String getRecipeName() {
        return this.recipeName;
    }

    public String getRecipeUrl() {
        return this.recipeUrl;
    }

    // ================ SETTERS =================
    public void setIngredient(String _ingredient){
        this.ingredient = _ingredient;
    }

    public void setRecipeName(String _recipeName) {
        this.recipeName = _recipeName;
    }

    public void setRecipeUrl(String _recipeUrl) {
        this.recipeUrl = _recipeUrl;
    }
}
