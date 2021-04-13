package Models;

/**
 * Parent class for any class that is going to make calls to the Recipe API
 * Last Updated: 3/24/21
 * @author Leslie Macias Magana
 */

import API.RecipeApiInterface;
import API.RecipeAPITranslator;

public class APIBaseClass {

    //Designates the translator that we want to use. In this case RecipeAPITranslator.
    protected final static RecipeApiInterface myRecipeAPI = new RecipeAPITranslator();

}
