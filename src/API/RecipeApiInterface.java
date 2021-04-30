package API;

/**
 * Last Updated 4/29/2021
 * This API interface defines the method(s) that need to be implemented for any
 * valid API connector translator class.
 * @authors Leslie Macias Magana and Darlyn Mendez
 */
import Models.Recipe;
import java.util.ArrayList;

public interface RecipeApiInterface {

    public  ArrayList<Recipe> loadRecipeByIngredient(String _ingredient);

}