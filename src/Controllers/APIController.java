package Controllers;
/**
 * Last Updated: 4/29/21
 * This controller class is used to connect the API models and GUI.
 * @authors Leslie Macias Magana and Darlyn Mendez
 */

import Models.*;
import GUI.ApiGUI;
import db.*;
import javafx.collections.FXCollections;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import Events.APIEvent;
import Events.APIMessage;
import Events.ListenerInterface;

public class APIController implements ListenerInterface {

        // Add reference to all modules.
        protected ApiGUI gui;
        protected APIBase activeModule = null;


        public APIController(Stage primaryStage) {
            // Initialize the GUI.
            this.gui = new ApiGUI(primaryStage);
            // Register this controller as a listener.
            this.gui.addListener(this);
        }

        /*
         * Load the main menu panel. Unregisters the active module from the GUI event
         * listeners and sets the active panel to null.
         */
        private void mainPanel() {
            // Load the main GUI.
            this.gui.loadMainPanel();
            // Remove the active panel from the list of listeners.
            this.gui.removeListener(this.activeModule);
            // Clear out any active panel.
            this.activeModule = null;
        }

        // Loads the recipe results panel.
        private void recipePanel(){
            // Load the GUI
            this.gui.loadRecipeResultPanel();
            // Register Active Module as listener.
            this.registerPanelListener(new Recipe());
        }
        //Loads the farmers market panel.
        private void farmersMarketPanel(){
            // Load the GUI
            this.gui.loadFarmersMarketSearch();
            // Register Active Module as listener.
            this.registerPanelListener(new ZipCode());
        }
        private void monthsPanel(){
            // Load the GUI
            this.gui.loadMonthsPanel();
            // Register Active Module as listener.
            this.registerPanelListener(new DBModel());
        }

        // Gets input from search box from gui to get recipes.
        public String getIngredientUserInput(){
            return this.gui.searchTxt.getText();
            // System.out.println(this.gui.searchTxt);
        }

        //Gets input from zipcode Search box.
        public String getZipCodeUserInput(){
            return this.gui.zipCodeSearch.getText();
            // System.out.println(this.gui.searchTxt);
        }

        //Gets input from marketID search box.
        public String getMarketIDUserInput(){
            return this.gui.marketIDSearch.getText();
            // System.out.println(this.gui.searchTxt);
        }
        public Object getFruitChoiceBoxOption(){
           return this.gui.fruitDropDown.getValue();
        }
    public Object getVegetableChoiceBoxOption(){
        return this.gui.vegetableDropDown.getValue();
    }

    /*
         * Given a module, this method registers that module as the active module. Also
         * adds the given module as a listener to the GUI.
         */
        private void registerPanelListener(APIBase newModule) {
            this.activeModule = newModule;
            this.gui.addListener(newModule);
        }
        /*
         * Respond to events that this module is listening for.
         */
        @Override
        public void messageReceived(APIEvent event) {

            switch (event.getMessage().getCode()){
                case APIMessage.EXIT_PANEL:
                    System.out.println("Controller Responding to Main Menu Panel Event.");
                    this.mainPanel();
                    break;
                case APIMessage.RECIPE_SEARCH_PANEL:
                    System.out.println("Controller Responding to searched event.");
                    this.recipePanel();
                    break;
                case APIMessage.ADD_SEARCH:
                    System.out.println("Controller Responding to add searched event.");
                    Recipe.getRecipeByIngredient(this.getIngredientUserInput());
                    break;
                case APIMessage.FARMERS_MARKET_PANEL:
                    System.out.println("Controller Responding to zipcode search event.");
                    this.farmersMarketPanel();
                    break;
                case APIMessage.ZIPCODE_SEARCH:
                    System.out.println("Controller Responding to zipcode search event.");
                    ZipCode.getMarketByZip(this.getZipCodeUserInput());
                    break;
                case APIMessage.MARKET_ID_SEARCH:
                    System.out.println("Controller Responding to zipcode search event.");
                    MarketID.getMarketInfoByID(this.getMarketIDUserInput());
                    break;
                case APIMessage.MONTHS_PANEL:
                    System.out.println("Controller Responding to jan event.");
                    this.monthsPanel();
                    break;
                case APIMessage.FRUITS_BY_MONTH_RESULT:
                    System.out.println("Controller Responding to month event.");
                    if (getFruitChoiceBoxOption().equals("January")){
                        DBModel.JanuaryFruitMethod();
                    }
                    else if (getFruitChoiceBoxOption().equals("February")){
                        DBModel.FebruaryFruitMethod();
                    }
                    else if (getFruitChoiceBoxOption().equals("March")){
                        DBModel.MarchFruitMethod();
                    }
                    else if (getFruitChoiceBoxOption().equals("April")){
                        DBModel.AprilFruitMethod();
                    }
                    else if (getFruitChoiceBoxOption().equals("May")){
                        DBModel.MayFruitMethod();
                    }
                    else if (getFruitChoiceBoxOption().equals("June")){
                        DBModel.JuneFruitMethod();
                    }
                    else if (getFruitChoiceBoxOption().equals("July")){
                        DBModel.JulyFruitMethod();
                    }
                    else if (getFruitChoiceBoxOption().equals("August")){
                        DBModel.AugustFruitMethod();
                    }
                    else if (getFruitChoiceBoxOption().equals("September")){
                        DBModel.SeptemberFruitMethod();
                    }
                    else if (getFruitChoiceBoxOption().equals("October")){
                        DBModel.OctoberFruitMethod();
                    }
                    else if (getFruitChoiceBoxOption().equals("November")){
                        DBModel.NovemberFruitMethod();
                    }
                    else if (getFruitChoiceBoxOption().equals("December")) {
                        DBModel.DecemberFruitMethod();
                    }
                    break;
                case APIMessage.VEGATABLES_BY_MONTH_RESULT:
                    if (getVegetableChoiceBoxOption().equals("January")){
                        DBModel.JanuaryVegetableMethod();
                    }
                    else if (getVegetableChoiceBoxOption().equals("February")){
                        DBModel.FebruaryVegetableMethod();
                    }
                    else if (getVegetableChoiceBoxOption().equals("March")){
                        DBModel.MarchVegetableMethod();
                    }
                    else if (getVegetableChoiceBoxOption().equals("April")){
                        DBModel.AprilVegetableMethod();
                    }
                    else if (getVegetableChoiceBoxOption().equals("May")){
                        DBModel.MayVegetableMethod();
                    }
                    else if (getVegetableChoiceBoxOption().equals("June")){
                        DBModel.JuneVegetableMethod();
                    }
                    else if (getVegetableChoiceBoxOption().equals("July")){
                        DBModel.JulyVegetableMethod();
                    }
                    else if (getVegetableChoiceBoxOption().equals("August")){
                        DBModel.AugustVegetableMethod();
                    }
                    else if (getVegetableChoiceBoxOption().equals("September")){
                        DBModel.SeptemberVegetableMethod();
                    }
                    else if (getVegetableChoiceBoxOption().equals("October")){
                        DBModel.OctoberVegetableMethod();
                    }
                    else if (getVegetableChoiceBoxOption().equals("November")){
                        DBModel.NovemberVegetableMethod();
                    }
                    else if (getVegetableChoiceBoxOption().equals("December")){
                        DBModel.DecemberVegetableMethod();
                    }else{
                        DBModel.JanuaryVegetableMethod();
                    }
                default:
                    System.out.println("Ignoring Message Code as Irrelevant to Controller. " + event.getMessage().getCode());
                    break;
            }
        }
    }


