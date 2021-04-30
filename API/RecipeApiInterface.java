package API;

/**
 * Last Updated 3/24/2021
 * This API interface defines the method(s) that need to be implemented for any
 * valid API connector translator class.
 * @author Leslie Macias Magana
 */
import Models.Recipe;
import java.util.ArrayList;

public interface RecipeApiInterface {

    public  ArrayList<Recipe> loadRecipeByIngredient(String _ingredient);

}