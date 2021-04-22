package gui;


import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Models.MarketID;
import Models.Recipe;
import Models.ZipCode;
import java.util.Scanner;

public class RTIUI implements ActionListener {
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
    private static Component scrollResult;

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
        panel.setBackground(Color.GREEN);
        panel.setBounds(panel1Boundx, panel1Boundy, panel1BoundWidth, panel1BoundHeight);
        panel.add(recipeTitle());
        panel.add(searchbar());
        panel.add(search());
        panel.add(scroll());
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
        panel.setBackground(Color.GREEN);
        panel.setBounds(panel1Boundx, panel1Boundy, panel1BoundWidth, panel1BoundHeight);
        panel.add(ingredientsTitle());
        panel.add(searchbar());
        panel.add(search());
        panel.add(scroll());
        //add to panel
        return panel;
    }
    //panel1 method
    static JPanel farmersButtonPanel(){
        //create Jpanel/add title
        JPanel panel= new JPanel();
        //title size
        panel.setSize(defaultButtonPanelWidth,defaultButtonPanelHeight);
        //set color
        panel.setBackground(Color.GREEN);
        panel.setBounds(panel1Boundx, panel1Boundy, panel1BoundWidth, panel1BoundHeight);
        panel.add(farmersTitle());
        panel.add(searchbar());
        panel.add(search());
        panel.add(scroll());
        //add to panel
        return panel;
    }

    //Ingredient button
    public static JButton ingredientsButton(){
        ActionListener buttonListener2 = (ActionEvent e) -> {
            ingredientsWindow = new JFrame();
            //give window a title
            ingredientsWindow.setTitle("ingredients");
            //set width and length of ingredients button window
            ingredientsWindow.setSize(defaultButtonPanelWidth,defaultButtonPanelHeight);
            ingredientsWindow.add(ingredientsButtonPanel());
            ingredientsWindow.setVisible(true);
            ingredientsWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
            recipesWindow.setSize(defaultButtonPanelWidth,defaultButtonPanelHeight);
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
            farmersMarketWindow.setSize(defaultButtonPanelWidth,defaultButtonPanelHeight);
            farmersMarketWindow.add(farmersButtonPanel());
            farmersMarketWindow.setVisible(true);
            farmersMarketWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            farmersMarketWindow.add(zipCodeMarketIdPanel, BorderLayout.CENTER);
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
        titlePanel.setBackground(Color.GREEN);
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
        buttonsPanel.setBackground(Color.GREEN);
        buttonsPanel.setBounds(pane12Boundx, pane12Boundy, pane12BoundWidth, pane12BoundHeight);
        //add to panel
        buttonsPanel.add(recipeButton());
        buttonsPanel.add(ingredientsButton());
        buttonsPanel.add(farmersButton());
        return buttonsPanel;

    }

    public static JPanel zipCodePane() {
        JTextField zipCodeTextField = new JTextField(10);
        JTextField marketIdTextField = new JTextField(10);

        zipCodeMarketIdPanel = new JPanel();
        zipCodeMarketIdPanel.setLayout(new GridLayout(2, 2));
        zipCodeMarketIdPanel.add(new JLabel("Zip Code"));
        zipCodeMarketIdPanel.add(zipCodeTextField);

        zipCodeMarketIdPanel.add(new JLabel("Market ID"));
        zipCodeMarketIdPanel.add(marketIdTextField);

        //ActionListener zipCodeAndMarketTextFieldListener = (ActionEvent e) -> {

        //}
        //marketIdTextField.addActionListener(zipCodeAndMarketTextFieldListener);
        //zipCodeTextField.addActionListener(zipCodeAndMarketTextFieldListener);
        return zipCodeMarketIdPanel;
    }
    //JFrame method for main window
    public static JFrame Gui(){
        mainWindow = new JFrame();
        //give window a title
        mainWindow.setTitle("Recipes To Infinity");
        //set Jframe to null
        mainWindow.setLayout(null);
        //set width and length of window
        mainWindow.setSize(windowSizewidth,windowSizeHeight);
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

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == farmersMarketButton) {

            }
        }
    }
