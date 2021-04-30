package GUI;
import Events.APIEvent;
import Events.APIMessage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import Models.APIBase;

    public class ApiGUI extends APIBase {
        // Track the primary stage so we can add scenes to it.
        private final Stage primaryStage;
        public TextField searchTxt;
        public TextField zipCodeSearch;
        public TextField marketIDSearch;
        private int DEFUALT_TEXTBOX_WIDTH = 130;
        private int DEFAULT_RECIPE_BUTTON_XCOORD = 335;
        private int DEFAULT_RECIPE_BUTTON_YCOORD = 100;
        private int DEFAULT_FARMERS_BUTTON_XCOORD = 300;
        private int DEFAULT_FARMERS_BUTTON_YCOORD = 200;
        private int DEFAULT_SCENE_HEIGHT = 800;
        private int DEFAULT_SCENE_WIDTH = 600;



        public ApiGUI(Stage _primaryStage){
            this.primaryStage = _primaryStage;
            // Build the main panel.
            this.loadMainPanel();
        }

        /*
         * Loads the main menu panel.
         */
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

        /*
         * Helper function for building the main panel. Creates two buttons and returns
         * a scene to be added to the stage.
         */
        private Scene buildMainPanel() {
            Button btnFarmersSearch = this.addButton("Search For Farmers Markets", new APIMessage(APIMessage.FARMERS_MARKET_PANEL));
            btnFarmersSearch.setTranslateX(DEFAULT_FARMERS_BUTTON_XCOORD);
            btnFarmersSearch.setTranslateY(DEFAULT_FARMERS_BUTTON_YCOORD);
            Button btnTxtSearch = this.addButton("Recipe Search", new APIMessage(APIMessage.RECIPE_SEARCH_PANEL));
            btnTxtSearch.setTranslateX(DEFAULT_RECIPE_BUTTON_XCOORD);
            btnTxtSearch.setTranslateY(DEFAULT_FARMERS_BUTTON_YCOORD);
            VBox vbox = this.addVBox("Recipes To Infinity");
            vbox.getChildren().add(btnFarmersSearch);
            vbox.getChildren().add(btnTxtSearch);
            // Create the scene and return.
            Scene scene = new Scene(vbox, DEFAULT_SCENE_HEIGHT, DEFAULT_SCENE_WIDTH);
            return scene;

        }

        /*
         * Helper function for building the recipe panel. Creates a text field to get ingredient input and two buttons
         * and returns a scene to be added to the stage.
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
            // Menu Title
            Text title = new Text(header);
            title.setFont(Font.font("Arial", FontWeight.BOLD, 14));
            vbox.getChildren().add(title);
            return vbox;
        }

    }
