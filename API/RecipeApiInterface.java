package API;

/**
 * This API interface defines the method(s) that need to be implemented for any
 * valid API connector translator class.
 * Last Updated 3/24/2021
 * @author Leslie Macias Magana
 */
import Models.Recipe;

public interface RecipeApiInterface {

    public Recipe loadRecipeByIngredient(String _ingredient);

}