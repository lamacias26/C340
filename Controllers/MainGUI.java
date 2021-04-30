package Controllers;
/**
 * Last Updated: 04-07-21

 * Prints recipes and their urls depending on the ingredient that was entered by the user.
 * @author Leslie Macias Magana
 */

import Controllers.APIController;
import javafx.application.Application;
import javafx.stage.Stage;

import java.util.Scanner;


public class MainGUI extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a SimpleRegister object.
        APIController simpleRegister = new APIController(primaryStage);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        // Initialize the Transaction object.
    }

}

