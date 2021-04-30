package API;

/**
 * Last Updated: 4-29-21
 * This translator class is used to speak to the edamam.com API.
 * @authors Leslie Macias Magana and Darlyn Mendez
 */

import org.json.JSONArray;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

import Models.*;

public class RecipeAPITranslator implements RecipeApiInterface {

    // Create a HTTP Connection.
    private static final String baseUrl = "https://api.edamam.com";
    private static final String callAction = "/search?";
    private static final String api_ID = "f280c55e";
    private static final String apiKey = "36412eb89628b49e91b06ad4390b9be4";

    /**
     * Given a string ingredient, this method queries the recipe API for a
     * list of recipes and returns them along with their urls.
     * @param _ingredient
     * @return
     */
    @Override
    public ArrayList<Recipe> loadRecipeByIngredient(String _ingredient) {
        //Build URL String.
        String urlString =  callAction + "q=" + _ingredient + "&app_id=" + api_ID + "&app_key=" + RecipeAPITranslator.apiKey;
        ArrayList<Recipe> recipeNames = new ArrayList<>();
        try {
            // Make the connection.
            URL url = new URL(RecipeAPITranslator.baseUrl + urlString);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            // Examine the response code.
            int status = con.getResponseCode();
            if (status != 200) {
                System.out.println("Error: Could not load " + status);
            } else {
                //Parsing input stream into a text string
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuffer content = new StringBuffer();
                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine);
                }
                // Close the connections.
                in.close();
                con.disconnect();

                //Parse that object into a usable Java JSON object.
                JSONObject obj = new JSONObject(content.toString());

                // Gets the hits array which contains the list of recipes.
                JSONArray hitsArray = obj.getJSONArray("hits");
                System.out.println("Number of recommended recipes: " + hitsArray.length());

                if (hitsArray.length() == 0){
                    System.out.println("Sorry no results found for " + _ingredient);
                }

                //Outputs each recommended recipe and its url.
                for (int i = 0; i < hitsArray.length(); i++) {
                    JSONObject obj_RecipeList = hitsArray.getJSONObject(i);
                    JSONObject recipe = obj_RecipeList.getJSONObject("recipe");
                    System.out.println("Recipe Name: " + recipe.getString("label"));
                    String recipesNames = recipe.getString("label");
                    System.out.println("URL: " + recipe.getString("url"));
                    String recipesUrl = recipe.getString("url");
                    Recipe recipes = new Recipe(recipesNames, recipesUrl);
                    recipeNames.add(recipes);
                }

            }
        } catch (Exception ex) {
            System.out.println("Error:" + ex);
        }
        return recipeNames;
    }
}
