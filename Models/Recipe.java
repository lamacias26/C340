package Models;

import java.util.ArrayList;
/**
 * Last Updated: 4/28/2021
 * The recipe class handles all functionality related to recipe information.
 * @author Leslie Macias Magana
 */

import Events.APIEvent;
import Events.APIMessage;

import java.util.ArrayList;

public class Recipe extends APIBase {

    protected static String ingredient;
    protected String recipeName;
    protected String recipeUrl;

    public Recipe(){
        System.out.println("Register Model Loaded");
    }

    public Recipe (String recipeName, String recipeUrl) {
        this.recipeName = recipeName;
        this.recipeUrl = recipeUrl;
    }


    // Method to get recipe results given ingredient(s).
    public static ArrayList<Recipe> getRecipeByIngredient(String _ingredient){
        Recipe recipe = new Recipe();
        // If an ingredient has a space, the space is filled with a comma to follow the api guideline.
        _ingredient = _ingredient.replace(' ', ',');
        recipe.setIngredient(_ingredient);
        return APIBase.myRecipeAPI.loadRecipeByIngredient(_ingredient);
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





    public void recipeHasBeenSearched() {
        // An item has been added to the ticket. Fire an event and let everyone know.
        System.out.println("recipe has been searched.");
    }
    public void recipeHasBeenRemoved() {
        // An item has been added to the ticket. Fire an event and let everyone know.
        System.out.println("recipe has been removed.");
    }


    @Override
    public void messageReceived(APIEvent event) {
        switch (event.getMessage().getCode()) {
            case APIMessage.RECIPE_SEARCH_PANEL:
                this.recipeHasBeenSearched();
                break;
            case APIMessage.REMOVE_SEARCH:
                this.recipeHasBeenRemoved();
                break;
            default:
                System.out.println("Ignoring Message Event. Irrelevant to Inventory: " + event.getMessage().getCode());
                break;
        }
    }
}
