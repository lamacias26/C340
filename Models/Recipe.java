package Models;

/**
 * The recipe class handles all functionality related to recipe information.
 * Last Updated: 4/27/2021
 * @author Leslie Macias Magana
 */

public class Recipe extends APIBaseClass{

    protected String ingredient;

    public void Recipe(){ }

    public static Recipe getRecipeByIngredient(String _ingredient){
        Recipe recipe = new Recipe();
        recipe.setIngredient(_ingredient);
        return APIBaseClass.myRecipeAPI.loadRecipeByIngredient(_ingredient);
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
