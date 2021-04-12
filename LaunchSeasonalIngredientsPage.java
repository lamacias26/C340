import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;


/**
 * LaunchSeasonalIngredientsPage is the child class or subclass.
 * It implements the ActionListener interface so that the submitButton opens the SeasonalIngredientsWindow when it is clicked.
 * This code adheres to Depend on abstraction, not on concretions principle which is the definition of D in SOLID
 * This code establishes that both the high-level and low-level modules depend on abstraction.
 */
public class LaunchSeasonalIngredientsPage implements ActionListener {

    private static final int submitButtonXAndWidth = 100;
    private static final int submitButtonY = 160;
    private static final int submitButtonHeight = 10;
    private static final int dropDownMenuLabelXAndWidth = 100;
    private static final int dropDownMenuLabelY = 160;
    private static final int dropDownMenuLabelHeight = 30;
    private static final int dropDownMenuX = 100;
    private static final int dropDownMenuY = 160;
    private static final int dropDownMenuWidth = 90;
    private static final int dropDownMenuHeight = 5;
    private static final int startPageWidthAndHeight = 420;
    private static final int startPageSetColorRB = 144;
    private static final int startPageSetColorG = 238;
    private static final int startPageHgapVgap = 30;
    private static final int startPageRows = 3;
    private static final int startPageCols = 1;

    // Global instances so the actionPerformed method has access to the button. So now the LaunchSeasonalIngredientsPage constructor and the
    // actionPerformed method both have access to these global instances.
    JFrame startPage = new JFrame();
    JButton submitButton = new JButton("Submit");
    JComboBox getDropDownMenuMonths;
    JMenuBar seasonalRecipesMenuBar;
    JMenu homeMenu;
    JMenu ingredientSearchMenu;
    JMenu farmersMarketsMenu;
    JMenuItem goBackItem;
    JMenuItem exitItem;
    JMenuItem startPageItem;
    JMenuItem findFarmersMarketItem;
    JMenuItem changeLocationItem;
    JMenuItem selectIngredientsItem;
    JMenuItem selectMonthItem;
    JMenuItem searchIngredientsItem;
    JMenuItem saveItem;

    //JLabel dropDownMenuLabel = new JLabel("Select Month");
    //JLabel dropDownMenu = new JLabel("Drop down menu with months");


    LaunchSeasonalIngredientsPage() {

        submitButton.setBounds(submitButtonXAndWidth,submitButtonY,submitButtonXAndWidth,submitButtonHeight);
        submitButton.setFocusable(false);
        submitButton.addActionListener(this);
        //dropDownMenuLabel.setBounds(dropDownMenuLabelXAndWidth,dropDownMenuLabelY,dropDownMenuLabelXAndWidth,dropDownMenuLabelHeight);
        //dropDownMenu.setBounds(dropDownMenuX,dropDownMenuY,dropDownMenuWidth,dropDownMenuHeight);

        startPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        startPage.setSize(startPageWidthAndHeight,startPageWidthAndHeight);
        startPage.setLayout(null);
        startPage.setVisible(true);
        startPage.add(submitButton);
        startPage.getContentPane().setBackground(new Color(startPageSetColorRB,startPageSetColorG,startPageSetColorRB));
        //startPage.add(dropDownMenuLabel);
        //startPage.add(dropDownMenu);
        startPage.setLayout(new GridLayout(startPageRows,startPageCols,startPageHgapVgap,startPageHgapVgap));
        ImageIcon recipesToInfinityLogo = new ImageIcon("RecipesToInfinityPlainLogo.PNG");
        startPage.setIconImage(recipesToInfinityLogo.getImage());


        String[] monthsOfTheYear = {"January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December"};
        getDropDownMenuMonths = new JComboBox(monthsOfTheYear);
        getDropDownMenuMonths.addActionListener(this);
        startPage.add(getDropDownMenuMonths);

        seasonalRecipesMenuBar = new JMenuBar();
        startPage.setJMenuBar(seasonalRecipesMenuBar);
        homeMenu = new JMenu("Home");
        ingredientSearchMenu = new JMenu("Ingredient Search");
        farmersMarketsMenu = new JMenu("Farmers Markets");
        seasonalRecipesMenuBar.add(homeMenu);
        seasonalRecipesMenuBar.add(ingredientSearchMenu);
        seasonalRecipesMenuBar.add(farmersMarketsMenu);
        goBackItem = new JMenuItem("Previous Page");
        exitItem = new JMenuItem("Exit");
        startPageItem = new JMenuItem("Go to Start Page");
        findFarmersMarketItem = new JMenuItem("Find Farmers Markets");
        changeLocationItem = new JMenuItem("Change location");
        selectIngredientsItem = new JMenuItem("Select ingredients");
        selectMonthItem = new JMenuItem("Select month");
        searchIngredientsItem = new JMenuItem("Search ingredients");
        saveItem = new JMenuItem("Save");
        changeLocationItem.addActionListener(this);
        goBackItem.addActionListener(this);
        startPageItem.addActionListener(this);
        findFarmersMarketItem.addActionListener(this);
        changeLocationItem.addActionListener(this);
        selectIngredientsItem.addActionListener(this);
        selectMonthItem.addActionListener(this);
        searchIngredientsItem.addActionListener(this);
        saveItem.addActionListener(this);
        // adding items to appear on menu
        homeMenu.add(goBackItem);
        homeMenu.add(exitItem);
        homeMenu.add(startPageItem);
        homeMenu.add(saveItem);
        ingredientSearchMenu.add(selectIngredientsItem);
        ingredientSearchMenu.add(selectMonthItem);
        ingredientSearchMenu.add(searchIngredientsItem);
        farmersMarketsMenu.add(findFarmersMarketItem);
        farmersMarketsMenu.add(changeLocationItem);
        // Shortcut "s for save"
        saveItem.setMnemonic(KeyEvent.VK_S);
        // Shortcut "e for exit"
        exitItem.setMnemonic(KeyEvent.VK_E);
        // Shortcut "p for returning to previous page"
        goBackItem.setMnemonic(KeyEvent.VK_P);
        // Shortcut "for going to search ingredients page"
        searchIngredientsItem.setMnemonic(KeyEvent.VK_I);

    }

    /**
     * Allows the startPage frame to listen for events.
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        // If the actionPerformed is equal to the submitButton
        // then the SeasonalIngredientsWindow is going to be launched with the list of ingredients that are links.
        if(e.getSource() == submitButton) {
            SeasonalIngredientsWindow window01 = new SeasonalIngredientsWindow();
        }
        if (e.getSource() == getDropDownMenuMonths) {
            System.out.println("green onion, potato, carrots");
        }
        // If the actionPerformed is equal to the goBackItem
        // then this message is going to appear
        if (e.getSource() == goBackItem) {
            System.out.println("Going to previous page");
        }
        if (e.getSource() == exitItem) {
            System.exit(0);
        }
        if (e.getSource() == startPageItem) {
            System.out.println("Going to start page");
        }
        if (e.getSource() == findFarmersMarketItem) {
            System.out.println("Finding a farmers market.   .   .");
        }
        if (e.getSource() == saveItem) {
            System.out.println("Saving searches for future reference");
        }
        if (e.getSource() == changeLocationItem) {
            System.out.println("Changing Location .     .   .");
        }
        if (e.getSource() == selectIngredientsItem) {
            System.out.println("Selecting ingredients");
        }
        if (e.getSource() == selectMonthItem) {
            System.out.println("Selecting months");
        }
        if (e.getSource() == searchIngredientsItem) {
            System.out.println("Searching for ingredients");
        }

    }
}
