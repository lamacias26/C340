package API;

/**
 * Last Updated: 04-07-21
 * Prints recipes and their urls depending on the ingredient that was entered by the user.
 * @author Leslie Macias Magana
 */

import Models.MarketID;
import Models.Recipe;
import Models.ZipCode;
import java.util.Scanner;

public class ApiMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean addAdditionalIngredient = false;
        String userChoice;
        String ingredientInput;

        // Ask user for ingredient input.
        System.out.println("Enter the ingredient you want included in your recipe:");
        ingredientInput = input.nextLine();

        // Loop to ask user if they want to add additional ingredients until they say no;
        do{
            System.out.println("Would you like to add another ingredient? yes or no");
            userChoice = input.nextLine();

            if (userChoice.equals("no")){
                addAdditionalIngredient = false;
                Recipe.getRecipeByIngredient(ingredientInput);
            } else if (userChoice.equals("yes")){
                System.out.println("Enter new ingredient");
                ingredientInput = ingredientInput + "," + input.nextLine();
                addAdditionalIngredient = true;

            } else {
                System.out.println("Invalid input.");
            }
        } while (addAdditionalIngredient == true);

        //Gives option for user to find local farmers markets.
        System.out.println("Looking for local farmers markets? Enter 5 digit zipcode. (US only)");
        String zipCodeInput = input.nextLine();
        ZipCode.getMarketByZip(zipCodeInput);
        System.out.println();
        //Given a market ID, the address of the market and the products sold is given.
        System.out.println("Enter market ID for more details.");
        String marketID = input.nextLine();
        MarketID.getMarketInfoByID(marketID);

    }
}
