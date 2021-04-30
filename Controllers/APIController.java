package Controllers;

import Models.*;
import GUI.ApiGUI;
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

        private void recipePanel(){
            // Load the GUI
            this.gui.loadRecipeResultPanel();
            // Register Active Module as listener.
            this.registerPanelListener(new Recipe());
        }

        private void farmersMarketPanel(){
            // Load the GUI
            this.gui.loadFarmersMarketSearch();
            // Register Active Module as listener.
            this.registerPanelListener(new ZipCode());
        }

        /*
         * Gets input from search box from gui to get recipes.
         */
        public String getIngredientUserInput(){
            return this.gui.searchTxt.getText();
            // System.out.println(this.gui.searchTxt);
        }

        //Gets input from zipcode Search box.
        public String getZipCodeUserInput(){
            return this.gui.zipCodeSearch.getText();
            // System.out.println(this.gui.searchTxt);
        }

        public String getMarketIDUserInput(){
            return this.gui.marketIDSearch.getText();
            // System.out.println(this.gui.searchTxt);
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

            // We're only interested in 3 particular events.
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
                default:
                    System.out.println("Ignoring Message Code as Irrelevant to Controller. " + event.getMessage().getCode());
                    break;
            }
        }
    }


