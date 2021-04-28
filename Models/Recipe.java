package Models;

/**
 * Last Updated: 4/28/2021
 * The recipe class handles all functionality related to recipe information.
 * @author Leslie Macias Magana
 */

public class Recipe extends APIBaseClass{

    protected static String ingredient;

    // trying this for the controller
    public Recipe(){
        System.out.println("Recipe Model Loaded");
    }
    // Method to get recipe results given ingredient(s).
    public static Recipe getRecipeByIngredient(String _ingredient){
        Recipe recipe = new Recipe();
        // If an ingredient has a space, the space is filled with a comma to follow the api guideline.
        _ingredient = _ingredient.replace(' ', ',');
        recipe.setIngredient(_ingredient);
        return APIBaseClass.myRecipeAPI.loadRecipeByIngredient(_ingredient);
    }

    // trying this for the controller
    public static void getRecipeByIngredient(){
        getRecipeByIngredient(Recipe.ingredient);
    }


    // ================ GETTERS =================
    public String getIngredient(){
        return this.ingredient;
    }

    // ================ SETTERS =================
    public void setIngredient(String _ingredient){
        this.ingredient = _ingredient;
    }
}
