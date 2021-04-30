package Controllers;
/**
 * Last Updated: 04-07-21
 * Loads application. Prints recipes and their urls depending on the ingredient that was entered by the user.
 * @author Leslie Macias Magana
 */

import javafx.application.Application;
import javafx.stage.Stage;

public class MainGUI extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a recipes to infinity object.
        APIController recipesToInfinity = new APIController(primaryStage);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}

