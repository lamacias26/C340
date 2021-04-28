package API;

/**
 *  Last Updated: 4/28/2021
 *  APITesting Class tests different API calls for the Recipe API and Farmers Market API
 * @author Leslie Macias Magana
 */

import Models.Recipe;
import Models.ZipCode;

public class APITesting {

    public static void main(String[] args) {

/**
 *      Testing that the zipcode search works for multiple states in the US
 *      // Passes
        System.out.println("North Carolina");
        ZipCode.getMarketByZip("27407");

        System.out.println("Arizona");
        ZipCode.getMarketByZip("85254");

        System.out.println("North Dakota");
        ZipCode.getMarketByZip("58102");

        System.out.println("Texas");
        ZipCode.getMarketByZip("75034");

        System.out.println("Oklahoma");
        ZipCode.getMarketByZip("73008");

        System.out.println("Alaska");
        ZipCode.getMarketByZip("99501");

*/

/**
 *      Testing for ingredient input variation to account for user mistakes.
        // Passes
        Recipe.getRecipeByIngredient("Bellpepper");
        Recipe.getRecipeByIngredient("bellpepper");
        Recipe.getRecipeByIngredient("BellPepper");
        Recipe.getRecipeByIngredient("BelLpePPeR");
        Recipe.getRecipeByIngredient("BELLPEPPER");
        Recipe.getRecipeByIngredient("bellpeppers");
        Recipe.getRecipeByIngredient("bell pepper");


*/
    }
}
