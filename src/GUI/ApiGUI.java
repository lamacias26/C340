package GUI;
/**
 * GUI class. Handles the recipe, ingredient, and farmers market views.
 * @Authors Christopher Jackson and Leslie Macias Magana
 */

import API.RecipeAPITranslator;
import Events.APIEvent;
import Events.APIMessage;
import Models.Recipe;
import db.DBModel;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import Models.APIBase;

import java.util.ArrayList;

public class ApiGUI extends APIBase {
        // Enumerating values.
        private final Stage primaryStage;
        public TextField searchTxt;
        public ChoiceBox fruitDropDown;
        public ChoiceBox vegetableDropDown;
        public TextField zipCodeSearch;
        public TextField marketIDSearch;

        private int DEFUALT_TEXTBOX_WIDTH = 130;
        private int DEFAULT_RECIPE_BUTTON_XCOORD = 335;
        private int DEFAULT_RECIPE_BUTTON_YCOORD = 100;

        private int FRUIT_VEG_LABEL_FONT_SIZE = 15;

        private int DEFAULT_FARMERS_BUTTON_XCOORD = 300;
        private int DEFAULT_FARMERS_BUTTON_YCOORD = 200;

        private int DEFAULT_MONTHS_HOME_BUTTON_XCOORD = 700;
        private int DEFAULT_MONTHS_HOME_BUTTON_YCOORD = 400;

        private int DEFAULT_MONTHS_XCOORD = 300;
        private int DEFAULT_MONTHS_YCOORD = 195;

        private int DEFAULT_FRUIT_DROPDOWN_XCOORD = 400;
        private int DEFAULT_FRUIT_DROPDOWN_YCOORD = 130;

        private int DEFAULT_VEGETABLE_DROPDOWN_XCOORD = 200;
        private int DEFAULT_VEGETABLE_DROPDOWN_YCOORD = 100;

        private int DEFAULT_VEGETABLE_LABEL_XCOORD = 205;
        private int DEFAULT_VEGETABLE_LABEL_YCOORD = 20;

        private int DEFAULT_FRUIT_LABEL_XCOORD = 425;
        private int DEFAULT_FRUIT_LABEL_YCOORD = 45;

        private int DEFAULT_SCENE_HEIGHT = 800;
        private int DEFAULT_SCENE_WIDTH = 600;

    // Track the primary stage so we can add scenes to it.
        public ApiGUI(Stage _primaryStage){
            this.primaryStage = _primaryStage;
            // Build the main panel.
            this.loadMainPanel();
        }

        // Loads the menu panel.
        public void loadMainPanel(){
            System.out.println("Loading Main Panel");
            Scene rootScene = this.buildMainPanel();
            this.primaryStage.setTitle("Recipes To Infinity");
            this.primaryStage.setScene(rootScene);
            this.primaryStage.show();
        }

        // Loads the recipe results panel.
        public void loadRecipeResultPanel(){
            System.out.println("Loading Recipe Result Panel");
            Scene recipeScene = this.buildRecipePanel();
            this.primaryStage.setTitle("Recipe panel Panel");
            this.primaryStage.setScene(recipeScene);
            this.primaryStage.show();
        }
        // Loads the farmers market search panel.
        public void loadFarmersMarketSearch(){
            System.out.println("Loading Farmers Market Search Panel");
            Scene farmersMarketScene = this.buildFarmersMarketPanel();
            this.primaryStage.setTitle("Farmers Market Panel");
            this.primaryStage.setScene(farmersMarketScene);
            this.primaryStage.show();
        }
        // Loads the months panel.
        public void loadMonthsPanel(){
            System.out.println("Loading Months Search Panel");
            Scene monthsScene = this.buildMonthsPanel();
            this.primaryStage.setTitle("Ingredient Search By Month Panel");
            this.primaryStage.setScene(monthsScene);
            this.primaryStage.show();
        }
       // Method for main page image
        public ImageView mainPic(){
        Image image = new Image("mainPic.PNG");
        ImageView imageView = new ImageView(image);
        return imageView;
    }

    /*
         * Helper function for building the main panel.
         */
        private Scene buildMainPanel() {
            Button btnFarmersSearch = this.addButton("Search For Farmers Markets", new APIMessage(APIMessage.FARMERS_MARKET_PANEL));
            btnFarmersSearch.setTranslateX(DEFAULT_FARMERS_BUTTON_XCOORD);
            btnFarmersSearch.setTranslateY(DEFAULT_FARMERS_BUTTON_YCOORD);

            Button btnTxtSearch = this.addButton("Recipe Search", new APIMessage(APIMessage.RECIPE_SEARCH_PANEL));
            btnTxtSearch.setTranslateX(DEFAULT_RECIPE_BUTTON_XCOORD);
            btnTxtSearch.setTranslateY(DEFAULT_FARMERS_BUTTON_YCOORD);

            Button btnMonths = this.addButton("Search Ingredient by Month", new APIMessage(APIMessage.MONTHS_PANEL));
            btnMonths.setTranslateX(DEFAULT_MONTHS_XCOORD);
            btnMonths.setTranslateY(DEFAULT_MONTHS_YCOORD);

            VBox vbox = this.addVBox("Recipes To Infinity");
            vbox.getChildren().add(btnMonths);
            vbox.getChildren().add(btnFarmersSearch);
            vbox.getChildren().add(btnTxtSearch);
            // Create the scene and return.
            Scene scene = new Scene(vbox, DEFAULT_SCENE_HEIGHT, DEFAULT_SCENE_WIDTH);
            return scene;

        }

        /*
         * Helper function for building the recipe panel.
         */
        private Scene buildRecipePanel(){
            searchTxt = this.addTextField2("Enter Ingredient");
            Button btn2 = this.addButton("Submit", new APIMessage(APIMessage.ADD_SEARCH));
            Button homeButton = this.addButton("Home", new APIMessage(APIMessage.EXIT_PANEL));

            VBox vbox = this.addVBox("Recipe Search Results");
            vbox.getChildren().add(searchTxt);
            vbox.getChildren().add(btn2);
            vbox.getChildren().add(homeButton);
            // Create the scene and return.
            Scene scene = new Scene(vbox, DEFAULT_SCENE_HEIGHT, DEFAULT_SCENE_WIDTH);
            return scene;
        }

       /*
        * Helper function for building the months panel.
        */
        private Scene buildMonthsPanel(){
            Button homeButton = this.addButton("Home", new APIMessage(APIMessage.EXIT_PANEL));
            homeButton.setTranslateX(DEFAULT_MONTHS_HOME_BUTTON_XCOORD);
            homeButton.setTranslateY(DEFAULT_MONTHS_HOME_BUTTON_YCOORD);

            Label fruitLabel = new Label("Fruits");
            Label vegetableLabel = new Label("Vegatables");

            fruitLabel.setTranslateX(DEFAULT_FRUIT_LABEL_XCOORD);
            fruitLabel.setTranslateY(DEFAULT_FRUIT_LABEL_YCOORD);
            fruitLabel.setFont(Font.font("Arial", FontWeight.BOLD, FRUIT_VEG_LABEL_FONT_SIZE));

            vegetableLabel.setTranslateX(DEFAULT_VEGETABLE_LABEL_XCOORD);
            vegetableLabel.setTranslateY(DEFAULT_VEGETABLE_LABEL_YCOORD);
            vegetableLabel.setFont(Font.font("Arial", FontWeight.BOLD, FRUIT_VEG_LABEL_FONT_SIZE));

            fruitDropDown = this.ingredientsMonth(new APIMessage((APIMessage.FRUITS_BY_MONTH_RESULT)));
            vegetableDropDown = this.ingredientsMonth(new APIMessage((APIMessage.VEGATABLES_BY_MONTH_RESULT)));

            // Setting position of the dropdown menus.
            fruitDropDown.setTranslateX(DEFAULT_FRUIT_DROPDOWN_XCOORD);
            fruitDropDown.setTranslateY(DEFAULT_FRUIT_DROPDOWN_YCOORD);
            vegetableDropDown.setTranslateX(DEFAULT_VEGETABLE_DROPDOWN_XCOORD);
            vegetableDropDown.setTranslateY(DEFAULT_VEGETABLE_DROPDOWN_YCOORD);

            VBox vbox = this.addVBox("Month Results");
            vbox.getChildren().add(fruitDropDown);
            vbox.getChildren().add(vegetableDropDown);
            vbox.getChildren().add(fruitLabel);
            vbox.getChildren().add(vegetableLabel);
            vbox.getChildren().add(homeButton);
            // Create the scene and return.
            Scene scene = new Scene(vbox, DEFAULT_SCENE_HEIGHT, DEFAULT_SCENE_WIDTH);
            return scene;
        }

    // Mehtod to create choice boxes that hold the months for seasonal ingredient search.
    public ChoiceBox ingredientsMonth(final APIMessage throwMessage){
        String[] monthsOfTheYear = new String[] {"January", "February", "March", "April", "May", "June", "July", "August"
                , "September", "October", "November", "December"};
        ChoiceBox<String> choiceBox = new ChoiceBox<>();
        choiceBox.getItems().addAll(monthsOfTheYear);
        choiceBox.setValue("January");
        choiceBox.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                // Fire a custom event.
                APIEvent regEvent = new APIEvent(this, throwMessage);
                fireEvent(regEvent);
            }
        });

        return choiceBox;
    }

    /*
         * Helper function for building the farmers market panel. Creates two text fields to get zipcode and marketID input
         * and two buttons and returns a scene to be added to the stage.
         */
        private Scene buildFarmersMarketPanel(){
            zipCodeSearch = this.addTextField2("Enter ZipCode");
            Button btn2 = this.addButton("Submit", new APIMessage(APIMessage.ZIPCODE_SEARCH));

            marketIDSearch = this.addTextField2("Enter MarketID");
            Button btn3 = this.addButton("Submit", new APIMessage(APIMessage.MARKET_ID_SEARCH));

            Button homeButton = this.addButton("Home", new APIMessage(APIMessage.EXIT_PANEL));

            VBox vbox = this.addVBox("Farmers Market Results");
            vbox.getChildren().add(zipCodeSearch);
            vbox.getChildren().add(btn2);
            vbox.getChildren().add(marketIDSearch);
            vbox.getChildren().add(btn3);

            vbox.getChildren().add(homeButton);
            // Create the scene and return.
            Scene scene = new Scene(vbox, DEFAULT_SCENE_HEIGHT, DEFAULT_SCENE_WIDTH);
            return scene;
        }

        /*
         * Builds a button given a title and a message to throw for its event.
         * @param String title the label text for the button
         * @param APIMessage throwMessage the message to send with the event.
         */
        private Button addButton(String title, final APIMessage throwMessage) {
            Button btn = new Button();
            btn.setText(title);
            btn.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    // Fire a custom event.
                    APIEvent regEvent = new APIEvent(this, throwMessage);
                    fireEvent(regEvent);
                }
            });
            return btn;
        }
        // Helper method to create text field with apimessage.
        private TextField addTextField(String title, final APIMessage throwMessage){
            TextField txtField = new TextField();
            txtField.setPromptText(title);
            txtField.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent actionEvent) {
                    //fire a custom event
                    APIEvent APIEvent = new APIEvent(this, throwMessage);
                    fireEvent(APIEvent);
                }
            });
            return txtField;
        }
        //Helper method to create text field.
        private TextField addTextField2(String title){
            TextField txtField2 = new TextField();
            txtField2.setMaxWidth(DEFUALT_TEXTBOX_WIDTH);
            txtField2.setPromptText(title);
            return txtField2;

        }

        /*
         * Creates a vertical box with a header.
         * @param String header the header to add to the top of the VBox.
         */
        private VBox addVBox(String header) {
            VBox vbox = new VBox();
            vbox.setPadding(new Insets(10));
            vbox.setSpacing(8);
            //create canvas to hold backround color
            Canvas canvas = new Canvas(0,0);
            vbox.getChildren().add(canvas);
            vbox.setStyle("-fx-background-color: peachpuff");
            // Menu Title
            Text title = new Text(header);
            title.setFont(Font.font("Arial", FontWeight.BOLD, 14));
            vbox.getChildren().add(title);
            return vbox;
        }

    // Helper method to create title.
    private Label addtitle(){
        Label txtField2 = new Label();
        txtField2.setText("recipes to infinity");
        txtField2.setMaxWidth(200);
        txtField2.setFont(Font.font("Arial", FontWeight.BOLD, 24));
        txtField2.setTranslateX(0);
        txtField2.setTranslateY(-250);
        //txtField2
        return txtField2;
    }



}
