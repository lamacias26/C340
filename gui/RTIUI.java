package gui;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Models.MarketID;
import Models.Recipe;
import Models.ZipCode;


public class RTIUI extends GuiComboBox {
    private static final int windowSizewidth = 800;
    private static final int windowSizeHeight = 600;
    private static final int panel1Sizewidth = 800;
    private static final int panel1SizeHeight = 600;
    private static final int titleBoundx = 300;
    private static final int titleBoundy = 150;
    private static final int titleBoundWidth = 20;
    private static final int titleBoundHeight = 20;
    private static final int buttonDefaultBoundx = 40;
    private static final int buttonDefaultBoundy = 40;
    private static final int buttonDefaultBoundWidth = 40;
    private static final int buttonDefaultBoundHeight = 40;
    private static final int panel1Boundx = 0;
    private static final int panel1Boundy = 0;
    private static final int panel1BoundWidth = 800;
    private static final int panel1BoundHeight = 400;
    private static final int pane12Boundx = 0;
    private static final int pane12Boundy = 400;
    private static final int pane12BoundWidth = 800;
    private static final int pane12BoundHeight = 400;
    private static final int titleFont1 = 1;
    private static final int titleFont2 = 20;
    private static final int defaultButtonPanelWidth = 400;
    private static final int defaultButtonPanelHeight = 400;
    private static final int marketIdLabelRGB = 0;
    private static final int zipCodeLabelRGB = 0;
    private static final int marketIdLabelFontSize = 20;
    private static final int zipCodeLabelFontSize = 20;
    private static final int zipCodeMarketIdPanelX = 60;
    private static final int zipCodeMarketIdPanelY = 50;
    private static final int zipCodeMarketIdPanelBoundHeight = 75;
    private static final int zipCodeMarketIdPanelBoundWidth = 50;
    private static final int zipCodeMarketIdPanelSizeHeight = 50;
    private static final int zipCodeMarketIdPanelSizeWidth = 50;
    private static final int lightGreenRB = 144;
    private static final int lightGreenG = 238;
    private static final int zipCodeTextFieldColumn = 8;
    private static final int marketIdTextFieldColumn = 8;
    private static final int foundFarmersMarketTextFieldColumn = 8;
    private static final int submitFarmersMarketButtonWidth = 100;
    private static final int submitFarmersMarketButtonHeight = 100;
    private static final int farmersMarketSubmitPanelBoundX = 60;
    private static final int farmersMarketSubmitPanelBoundY = 50;
    private static final int farmersMarketSubmitPanelBoundWidth = 50;
    private static final int farmersMarketSubmitPanelBoundHeight = 50;
    private static final int farmersMarketSubmitPanelSizeWidth = 50;
    private static final int farmersMarketSubmitPanelSizeHeight = 50;
    private static final int zipCodeMarketIdPanelRows = 2;
    private static final int zipCodeMarketIdPanelCols = 2;
    private static final int findingFarmersMarketPanelRows = 1;
    private static final int findingFarmersMarketPanelCols = 2;
    private static final int findingFarmersMarketPanelBoundX = 50;
    private static final int findingFarmersMarketPanelBoundY = 50;
    private static final int findingFarmersMarketPanelBoundWidth = 100;
    private static final int findingFarmersMarketPanelBoundHeight = 100;
    private static final int findingFarmersMarketPanelSizeWidth = 50;
    private static final int findingFarmersMarketPanelSizeHeight = 50;
    private static final int selectSeasonalIngredientsSizeWidth = 200;
    private static final int selectSeasonalIngredientsSizeHeight = 200;
    private static final int seasonalIngredientsPanelSizeWidth = 200;
    private static final int seasonalIngredientsPanelSizeHeight = 200;
    private static final int seasonalIngredientsPanelBounds = 100;

    private static ActionListener zipCodeAndMarketTextFieldListener;
    private static JButton ingredientSearchButton;
    private static JButton recipeSearchButton;
    private static JButton farmersMarketButton;
    private static JFrame mainWindow;
    private static JPanel titlePanel;
    private static JPanel buttonsPanel;
    private static JLabel applicationName;
    private static JFrame recipesWindow;
    private static JFrame farmersMarketWindow;
    private static JFrame ingredientsWindow;
    private static ImageIcon recipesToInfinityLogo;
    private static JPanel zipCodeMarketIdPanel;
    private static JTextField zipCodeTextField;
    private static JTextField marketIdTextField;
    private static JTextField foundFarmersMarketTextField;
    private static JPanel farmersMarketSubmitPanel;
    private static JButton submitFarmersMarketButton;
    private static JPanel findingFarmersMarketPanel;
    private static JLabel zipCodeLabel;
    private static JLabel marketIdLabel;
    private static Component scrollResult;

    private static Controller viewController;

    //method for text Search bar
    public static JTextField search(){
        //create text field for search bar
        JTextField search = new JTextField(10);
        return search;
    }
    //method for scroll panel
    public static JScrollPane scroll(){
        //scroll bar
        JScrollPane scroll = new JScrollPane(scrollResult);
        return scroll;
    }
    //search bar method
    public static JButton searchbar(){
        //button to search
        JButton searchButton = new JButton("Search");
        return searchButton;
    }

    public static JLabel recipeTitle(){
        //create frame for title
        JLabel title = new JLabel("Recipes");
        //set font
        title.setFont(new Font("Verdana",titleFont1,titleFont2));
        //set color
        title.setBorder(new LineBorder(Color.BLACK));
        //set bounds
        title.setBounds(titleBoundx,titleBoundy,titleBoundWidth,titleBoundHeight);
        title.setSize(titleBoundWidth, titleBoundHeight);
        return title;
    }

    public static JLabel ingredientsTitle(){
        //create frame for title
        JLabel title = new JLabel("Ingredients");
        //set font
        title.setFont(new Font("Verdana",titleFont1,titleFont2));
        //set color
        title.setBorder(new LineBorder(Color.BLACK));
        //set bounds
        title.setBounds(titleBoundx,titleBoundy,titleBoundWidth,titleBoundHeight);
        title.setSize(titleBoundWidth, titleBoundHeight);
        return title;
    }
    public static JLabel farmersTitle(){
        //create frame for title
        JLabel title = new JLabel("Farmer's Market");
        //set font
        title.setFont(new Font("Verdana",titleFont1,titleFont2));
        //set color
        title.setBorder(new LineBorder(Color.BLACK));
        //set bounds
        title.setBounds(titleBoundx,titleBoundy,titleBoundWidth,titleBoundHeight);
        title.setSize(titleBoundWidth, titleBoundHeight);
        return title;
    }
    //panel1 method
    static JPanel recipeButtonPanel(){
        //create Jpanel/add title
        JPanel panel= new JPanel();
        //title size
        panel.setSize(defaultButtonPanelWidth,defaultButtonPanelHeight);
        //set color
        panel.setBackground(new Color(lightGreenRB, lightGreenG, lightGreenRB));
        panel.setBounds(panel1Boundx, panel1Boundy, panel1BoundWidth, panel1BoundHeight);
        panel.add(recipeTitle());
        panel.add(searchbar());
        panel.add(search());
        panel.add(scroll());
        panel.add(recipecomboBox());
        //add to panel
        return panel;
    }

    //panel1 method
    static JPanel ingredientsButtonPanel(){
        //create Jpanel/add title
        JPanel panel= new JPanel();
        //title size
        panel.setSize(defaultButtonPanelWidth,defaultButtonPanelHeight);
        //set color
        panel.setBackground(new Color(lightGreenRB, lightGreenG, lightGreenRB));
        panel.setBounds(panel1Boundx, panel1Boundy, panel1BoundWidth, panel1BoundHeight);
        panel.add(ingredientsTitle());
        panel.add(searchbar());
        panel.add(search());
        panel.add(scroll());
        panel.add(ingregientscomboBox());
        //add to panel
        return panel;
    }
    //panel1 method
    static JPanel farmersButtonPanel(){
        //create Jpanel/add title
        JPanel farmersMarketSearchPanel = new JPanel();
        //title size
        farmersMarketSearchPanel.setSize(defaultButtonPanelWidth,defaultButtonPanelHeight);
        //set color
        farmersMarketSearchPanel.setBackground(new Color(lightGreenRB, lightGreenG, lightGreenRB));
        farmersMarketSearchPanel.setBounds(panel1Boundx, panel1Boundy, panel1BoundWidth, panel1BoundHeight);
        farmersMarketSearchPanel.add(farmersTitle());
        farmersMarketSearchPanel.add(searchbar());
        farmersMarketSearchPanel.add(search());
        farmersMarketSearchPanel.add(scroll());
        farmersMarketSearchPanel.add(farmersMarketcomboBox());
        //add to panel
        return farmersMarketSearchPanel;
    }

    public static JComboBox seasonalIngredients() {
        String[] monthsOfTheYear = new String[] {"January", "February", "March", "April", "May", "June", "July", "August"
                , "September", "October", "November", "December"};
        JComboBox selectSeasonalIngredients = new JComboBox(monthsOfTheYear);
        selectSeasonalIngredients.setSize(selectSeasonalIngredientsSizeWidth, selectSeasonalIngredientsSizeHeight);
        return selectSeasonalIngredients;
    }

    public static JPanel seasonalIngredientsPane() {
        JPanel seasonalIngredientsPanel = new JPanel();
        seasonalIngredientsPanel.add(seasonalIngredients());
        seasonalIngredientsPanel.setBackground(new Color(lightGreenRB, lightGreenG, lightGreenRB));
        seasonalIngredientsPanel.setSize(seasonalIngredientsPanelSizeWidth, seasonalIngredientsPanelSizeHeight);
        seasonalIngredientsPanel.setBounds(seasonalIngredientsPanelBounds,seasonalIngredientsPanelBounds,seasonalIngredientsPanelBounds,seasonalIngredientsPanelBounds);
        return seasonalIngredientsPanel;
    }

    //Ingredient button
    public static JButton ingredientsButton(){
        ActionListener buttonListener2 = (ActionEvent e) -> {
            ingredientsWindow = new JFrame();
            //give window a title
            ingredientsWindow.setTitle("ingredients");
            //set width and length of ingredients button window
            ingredientsWindow.setSize(windowSizewidth, windowSizeHeight);
            ingredientsWindow.add(ingredientsButtonPanel());
            ingredientsWindow.setVisible(true);
            ingredientsWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ingredientsWindow.add(seasonalIngredientsPane());
            mainWindow.setVisible(false);

            recipesToInfinityLogo = new ImageIcon("RecipesLogo.PNG");
            ingredientsWindow.setIconImage(recipesToInfinityLogo.getImage());
        };
        //create button for
        ingredientSearchButton = new JButton("Ingredient search");
        ingredientSearchButton.setBounds(buttonDefaultBoundx,buttonDefaultBoundy,buttonDefaultBoundWidth,buttonDefaultBoundHeight);
        ingredientSearchButton.addActionListener(buttonListener2);
        ingredientSearchButton.setVisible(true);
        return ingredientSearchButton;
    }

    //Recipe button
    public static JButton recipeButton(){
        ActionListener buttonListener = (ActionEvent e) -> {
            recipesWindow = new JFrame();
            //give window a title
            recipesWindow.setTitle("Recipes");
            //set width and length of recipe button window
            recipesWindow.setSize(windowSizewidth, windowSizeHeight);
            recipesWindow.add(recipeButtonPanel());
            recipesWindow.setVisible(true);
            recipesWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mainWindow.setVisible(false);

            recipesToInfinityLogo = new ImageIcon("RecipesLogo.PNG");
            recipesWindow.setIconImage(recipesToInfinityLogo.getImage());
        };
        //create button for
        recipeSearchButton = new JButton("Recipe Search");
        recipeSearchButton.setBounds(buttonDefaultBoundx,buttonDefaultBoundx,buttonDefaultBoundy,buttonDefaultBoundHeight);
        recipeSearchButton.addActionListener(buttonListener);
        recipeSearchButton.setVisible(true);
        return recipeSearchButton;
    }

    //Farmers Market button
    public static JButton farmersButton(){
        ActionListener buttonListener3 = (ActionEvent e) -> {
            farmersMarketWindow = new JFrame();
            //give window a title
            farmersMarketWindow.setTitle("farmer's Market");
            //set width and length of window
            farmersMarketWindow.setSize(windowSizewidth, windowSizeHeight);
            farmersMarketWindow.add(farmersButtonPanel());
            farmersMarketWindow.setVisible(true);
            farmersMarketWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            // Adding panels with the textfields
            farmersMarketWindow.add(zipCodePane(), BorderLayout.NORTH);
            farmersMarketWindow.add(farmersMarketSubmitPane(), BorderLayout.CENTER);
            farmersMarketWindow.add(findingFarmersMarketPane(), BorderLayout.SOUTH);
            mainWindow.setVisible(false);

            recipesToInfinityLogo = new ImageIcon("RecipesLogo.PNG");
            farmersMarketWindow.setIconImage(recipesToInfinityLogo.getImage());
        };
        //create button for
        farmersMarketButton = new JButton("Farmer's Market");
        farmersMarketButton.setBounds(buttonDefaultBoundx,buttonDefaultBoundx,buttonDefaultBoundy,buttonDefaultBoundHeight);
        farmersMarketButton.addActionListener(buttonListener3);
        farmersMarketButton.setVisible(true);
        return farmersMarketButton;
    }

    //create label for title
    public static JLabel title(){
        //create frame for title
        applicationName = new JLabel("Recipes To Infinity");
        //set font
        applicationName.setFont(new Font("Verdana",titleFont1,titleFont2));
        //set color
        applicationName.setBorder(new LineBorder(Color.BLACK));
        //set bounds
        applicationName.setBounds(titleBoundx,titleBoundy,titleBoundWidth,titleBoundHeight);
        applicationName.setSize(titleBoundWidth, titleBoundHeight);
        return applicationName;
    }


    //Jpanel method for main window
    static JPanel panel1(){
        //create Jpanel/add title
        titlePanel= new JPanel();
        //title size
        titlePanel.setSize(panel1Sizewidth,panel1SizeHeight);
        //set color
        titlePanel.setBackground(new Color(lightGreenRB, lightGreenG, lightGreenRB));
        titlePanel.setBounds(panel1Boundx, panel1Boundy, panel1BoundWidth, panel1BoundHeight);
        //add to panel
        titlePanel.add(title());
        return titlePanel;
    }

    //Jpanel method for main window
    static JPanel panel2(){
        //create Jpanel/add title
        buttonsPanel = new JPanel();
        //set color
        buttonsPanel.setBackground(new Color(lightGreenRB, lightGreenG, lightGreenRB));
        buttonsPanel.setBounds(pane12Boundx, pane12Boundy, pane12BoundWidth, pane12BoundHeight);
        //add to panel
        buttonsPanel.add(recipeButton());
        buttonsPanel.add(ingredientsButton());
        buttonsPanel.add(farmersButton());
        return buttonsPanel;

    }

    public static JTextField zipCodeText() {
        zipCodeTextField = new JTextField(zipCodeTextFieldColumn);
        zipCodeTextField.add(zipCodeLabeling());
        zipCodeTextField.addActionListener(zipCodeAndMarketTextFieldListener);
        return zipCodeTextField;
    }

    public static JTextField marketIdText() {
        marketIdTextField = new JTextField(marketIdTextFieldColumn);
        marketIdTextField.add(marketIdLabeling());
        marketIdTextField.addActionListener(zipCodeAndMarketTextFieldListener);
        return marketIdTextField;
    }

    public static JTextField foundFarmersMarketText() {
        foundFarmersMarketTextField = new JTextField(foundFarmersMarketTextFieldColumn);
        foundFarmersMarketTextField.setEditable(false);
        foundFarmersMarketTextField.addActionListener(zipCodeAndMarketTextFieldListener);
        return foundFarmersMarketTextField;
    }

    public static JButton submittingFarmersMarketButton() {
        submitFarmersMarketButton = new JButton("Submit");
        submitFarmersMarketButton.setBounds(buttonDefaultBoundx, buttonDefaultBoundy, buttonDefaultBoundWidth, buttonDefaultBoundHeight);
        submitFarmersMarketButton.setSize(submitFarmersMarketButtonWidth, submitFarmersMarketButtonHeight);
        zipCodeAndMarketTextFieldListener = (ActionEvent e) -> {
            if (e.getSource() == submitFarmersMarketButton) {
                /**
                String fullDetails = zipCodeText().getText().trim() + " , " +
                        marketIdText().getText().trim();
                foundFarmersMarketText().setText(fullDetails);
                 **/

                /**
                 * Received help
                 * Gets the text that user inputs into textfield and the controller recognizes it
                 */
                RTIUI.viewController.ingestZipCode(zipCodeText().getText().trim());
                RTIUI.viewController.ingestMarketId(marketIdText().getText().trim());
            }
        };
        submitFarmersMarketButton.addActionListener(zipCodeAndMarketTextFieldListener);
        return submitFarmersMarketButton;
    }

    public static JLabel marketIdLabeling() {
        marketIdLabel = new JLabel();
        marketIdLabel.setText("Market ID: ");
        marketIdLabel.setForeground(new Color(marketIdLabelRGB, marketIdLabelRGB,marketIdLabelRGB));
        marketIdLabel.setFont(new Font("Times New Roman", Font.BOLD, marketIdLabelFontSize));
        return marketIdLabel;
    }

    public static JLabel zipCodeLabeling() {
        zipCodeLabel = new JLabel("Zip Code");
        zipCodeLabel.setText("Zip Code: ");
        zipCodeLabel.setForeground(new Color(zipCodeLabelRGB, zipCodeLabelRGB, zipCodeLabelRGB));
        zipCodeLabel.setFont(new Font("Times New Roman", Font.BOLD, zipCodeLabelFontSize));
        return zipCodeLabel;
    }

    public static JPanel zipCodePane() {
        zipCodeMarketIdPanel = new JPanel();
        zipCodeMarketIdPanel.setLayout(new GridLayout(zipCodeMarketIdPanelRows, zipCodeMarketIdPanelCols));
        zipCodeMarketIdPanel.add(marketIdLabeling());
        zipCodeMarketIdPanel.add(zipCodeText());
        zipCodeMarketIdPanel.add(new JLabel("Zip Code"));

        zipCodeMarketIdPanel.add(zipCodeLabeling());
        zipCodeMarketIdPanel.add(marketIdText());
        zipCodeMarketIdPanel.add(new JLabel("Market ID"));
        zipCodeMarketIdPanel.setBounds(zipCodeMarketIdPanelX, zipCodeMarketIdPanelY, zipCodeMarketIdPanelBoundWidth, zipCodeMarketIdPanelBoundHeight);
        zipCodeMarketIdPanel.setSize(zipCodeMarketIdPanelSizeWidth, zipCodeMarketIdPanelSizeHeight);
        zipCodeMarketIdPanel.setBackground(new Color(lightGreenRB, lightGreenG, lightGreenRB));
        return zipCodeMarketIdPanel;
    }

    public static JPanel farmersMarketSubmitPane() {
        farmersMarketSubmitPanel = new JPanel();
        farmersMarketSubmitPanel.setLayout(new FlowLayout());
        farmersMarketSubmitPanel.add(new JLabel("Press button to find Farmers Market"));
        farmersMarketSubmitPanel.add(submittingFarmersMarketButton());
        farmersMarketSubmitPanel.setBounds(farmersMarketSubmitPanelBoundX, farmersMarketSubmitPanelBoundY, farmersMarketSubmitPanelBoundWidth, farmersMarketSubmitPanelBoundHeight);
        farmersMarketSubmitPanel.setSize(farmersMarketSubmitPanelSizeWidth, farmersMarketSubmitPanelSizeHeight);
        farmersMarketSubmitPanel.setBackground(new Color(lightGreenRB, lightGreenG, lightGreenRB));
        return farmersMarketSubmitPanel;
    }

    public static JPanel findingFarmersMarketPane() {
        findingFarmersMarketPanel = new JPanel();
        findingFarmersMarketPanel.setLayout(new GridLayout(findingFarmersMarketPanelRows, findingFarmersMarketPanelCols));
        findingFarmersMarketPanel.add(new JLabel ("Farmers Market Found"));
        findingFarmersMarketPanel.add(foundFarmersMarketText());
        findingFarmersMarketPanel.setBounds(findingFarmersMarketPanelBoundX, findingFarmersMarketPanelBoundY, findingFarmersMarketPanelBoundWidth, findingFarmersMarketPanelBoundHeight);
        findingFarmersMarketPanel.setSize(findingFarmersMarketPanelSizeWidth, findingFarmersMarketPanelSizeHeight);
        /**
        ActionListener zipCodeAndMarketTextFieldListener = (ActionEvent e) -> {
            // Get text from textfields without spaces and make it appear in a non editable text field
            // Main goal get address of farmers market in non editable textfield once zipcode and market id have been
            // entered
            if (e.getSource() == submittingFarmersMarketButton()) {
                String fullDetails = zipCodeText().getText().trim() + " , " +
                        marketIdText().getText().trim();
                foundFarmersMarketText().setText(fullDetails);
            }
        };
        submittingFarmersMarketButton().addActionListener(zipCodeAndMarketTextFieldListener);
        marketIdText().addActionListener(zipCodeAndMarketTextFieldListener);
        zipCodeText().addActionListener(zipCodeAndMarketTextFieldListener);
        foundFarmersMarketText().addActionListener(zipCodeAndMarketTextFieldListener);
         **/
        return findingFarmersMarketPanel;
    }



    //JFrame method for main window
    public static JFrame Gui() {
        mainWindow = new JFrame();
        //give window a title
        mainWindow.setTitle("Recipes To Infinity");
        //set Jframe to null
        mainWindow.setLayout(null);
        //set width and length of window
        mainWindow.setSize(windowSizewidth, windowSizeHeight);
        //set close window
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //stop resize
        mainWindow.setResizable(false);
        //set in middle of the screen
        mainWindow.setLocationRelativeTo(null);
        //add panel to jframe
        mainWindow.add(panel1());
        mainWindow.add(panel2());
        //make widow visible
        mainWindow.setVisible(true);
        recipesToInfinityLogo = new ImageIcon("RecipesLogo.PNG");
        mainWindow.setIconImage(recipesToInfinityLogo.getImage());
        return mainWindow;
    }

    /**
     * Trying to connect to controller
     * @return
     */
    public static ZipCode sendZipCode() {
        ZipCode zipcode = new ZipCode();
        zipcode.setZipcode("28278");
        return zipcode;
    }

    public static MarketID sendMarketId() {
        MarketID marketid = new MarketID();
        marketid.setId("1019610");
        return marketid;
    }

    public static Recipe sendRecipe() {
        Recipe recipes = new Recipe();
        recipes.setIngredient("apples");
        return recipes;
    }

}
