package gui;
//import static gui.GuiComboBox.farmersMarketcomboBox;
//import static gui.GuiComboBox.recipecomboBox;
import static gui.GuiComboBox.vegetablesIngredientscomboBox;
import static gui.GuiComboBox.search;
import static gui.GuiComboBox.scroll;
import static gui.GuiComboBox.searchbar;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.event.*;
import static gui.GuiComboBox.fruitsIngredientscomboBox;


public class RTIUI implements ActionListener {
   static int windowSizewidth = 800;
   static int windowSizeHeight = 600;
   static int panel1Sizewidth = 800;
   static int panel1SizeHeight = 600;
   static int titleBoundx = 150;
   static int titleBoundy = 0;
   static int titleBoundWidth = 200;
   static int titleBoundHeight = 60;
   static int buttonDefaultBoundx = 40;
   static int buttonDefaultBoundy = 40;
   static int buttonDefaultBoundWidth = 40;
   static int buttonDefaultBoundHeight = 40;
   static int panel1Boundx = 0;
   static int panel1Boundy = 0;
   static int panel1BoundWidth = 800;
   static int panel1BoundHeight = 400;
   static int pane12Boundx = 0;
   static int pane12Boundy = 400;
   static int pane12BoundWidth = 800;
   static int pane12BoundHeight = 400;
   static int titleFont1 = 3;
   static int mainTitleFont2 = 40;
   static int defaultButtonPanelWidth = 500;
   static int defaultButtonPanelHeight = 500;
   static int defaultSearchLabelBoundX = 150;
   static int defaultSearchLabelBoundY = 150;
   static int defaultSearchLabelBoundHeight = 50;
   static int defaultSearchLabelTitleFont = 16;
   static int recipeSearchLabelWidth = 150;
   static int ingredientsSearchLabelWidth = 170;
   static int farmersMarketSearchLabel = 210;
   static int recipeTitleFontSize = 23;
   static int ingredientsTitleFontSize = 21;
   static int farmersTitleFontSize = 18;
   static int recipeTitleBoundHeight = 110;
   static int ingredientsTitleBoundHeight = 120;
   static int farmersTitleBoundHeight = 150;
   static int mainTitleBoundX = 190;
   static int mainTitleBoundY = 100;
   static int mainTitleBoundWidth = 360;
   static int mainTitleBoundHeight = 50;
   static JFrame mainWindow = new JFrame();
   static JButton button;
   static JButton HomeButton1;
   static JButton HomeButton2;
   static JButton HomeButton3;
   private static JFrame recipesWindow;
    private static JFrame farmersMarketWindow;
    public static JFrame ingredientsWindow;
   static Component scrollResult;
   static JFrame window1 = new JFrame();
   
   
 //Jlabel for recipe title
   public static JLabel recipeTitle(){
        //create frame for title
        JLabel title = new JLabel("Recipes");
        //set font
        title.setFont(new Font("Arial",titleFont1,recipeTitleFontSize));
        //set color
        title.setBorder(new LineBorder(Color.BLACK));
        //set bounds
        title.setBounds(titleBoundx,titleBoundy,recipeTitleBoundHeight,titleBoundHeight);
        return title;
    }
   
   //Farmers market search label
   public static JLabel recipeSearchLabel(){
       JLabel title = new JLabel("Search for Recipe");
        //set font
        title.setFont(new Font("Arial",titleFont1,defaultSearchLabelTitleFont));
        //set bounds
        title.setBounds(defaultSearchLabelBoundX, defaultSearchLabelBoundY, recipeSearchLabelWidth, defaultSearchLabelBoundHeight);
        return title;
   }

   //Jlabel for recipe title
   public static JLabel ingredientsTitle(){
        //create frame for title
        JLabel title = new JLabel("Ingredients");
        //set font
        title.setFont(new Font("Arial",titleFont1,ingredientsTitleFontSize));
        //set color
        title.setBorder(new LineBorder(Color.BLACK));
        //set bounds
        title.setBounds(titleBoundx,titleBoundy,ingredientsTitleBoundHeight,titleBoundHeight);
        
        return title;
    }
   
   //Farmers market search label
   public static JLabel farmersMarketSearchLabel(){
       JLabel title = new JLabel("Search for Farmer's Market");
        //set font
        title.setFont(new Font("Arial",titleFont1,defaultSearchLabelTitleFont));
        //set bounds
        title.setBounds(defaultSearchLabelBoundX, defaultSearchLabelBoundY, farmersMarketSearchLabel, defaultSearchLabelBoundHeight);
        return title;
   }
   
   //Farmers market search label
   public static JLabel ingredientsSearchLabel(){
       JLabel title = new JLabel("Search for Ingregients By Vegetables or Fruit");
        //set font
        title.setFont(new Font("Arial",titleFont1,defaultSearchLabelTitleFont));
        //set bounds
        title.setBounds(50, defaultSearchLabelBoundY, 360, defaultSearchLabelBoundHeight);
        return title;
   }
   
   //Jlabel for farmer's market title
   public static JLabel farmersTitle(){
        //create frame for title
        JLabel title = new JLabel("Farmer's Market");
        //set font
        title.setFont(new Font("Arial",titleFont1,farmersTitleFontSize));
        //set color
        title.setBorder(new LineBorder(Color.BLACK));
        //set bounds
        title.setBounds(titleBoundx,titleBoundy,farmersTitleBoundHeight,titleBoundHeight);
        return title;
    }
   
   // recipe button panel method
   static JPanel recipeButtonPanel(){
        //create Jpanel/add title
        JPanel panel= new JPanel();
        panel.setLayout(null);
        //title size
        panel.setSize(defaultButtonPanelWidth,defaultButtonPanelHeight);
        //set color
        panel.setBackground(new Color(144, 238, 144));
        panel.setBounds(panel1Boundx, panel1Boundy, panel1BoundWidth, panel1BoundHeight);
        panel.add(recipeTitle());
        panel.add(recipeSearchLabel());
        panel.add(HomeButton3());
        //panel.add(recipecomboBox());
         panel.add(searchbar());
        panel.add(search());
        //add to panel
        return panel;
   }

   //ingredients button panel1 method
   static JPanel ingredientsButtonPanel(){
       //create Jpanel/add title
       JPanel panel= new JPanel();
       panel.setLayout(null);
       //title size
       panel.setSize(defaultButtonPanelWidth,defaultButtonPanelHeight);
       //set color
       panel.setBackground(new Color(144, 238, 144));
       panel.setBounds(panel1Boundx, panel1Boundy, panel1BoundWidth, panel1BoundHeight);
       panel.add(ingredientsTitle());
       panel.add(ingredientsSearchLabel());
       panel.add(fruitsIngredientscomboBox());
       panel.add(vegetablesIngredientscomboBox());
       panel.add(HomeButton1());
       //add to panel
       return panel;
   }
   
   //farmer's button panel1 method
   static JPanel farmersButtonPanel(){
       //create Jpanel/add title
       JPanel panel= new JPanel();
       panel.setLayout(null);
       //title size
       panel.setSize(defaultButtonPanelWidth,defaultButtonPanelHeight);
       //set color
       panel.setBackground(new Color(144, 238, 144));
       panel.setBounds(panel1Boundx, panel1Boundy, panel1BoundWidth, panel1BoundHeight);
        //add to panel
       panel.add(farmersTitle());
       panel.add(farmersMarketSearchLabel());
       //panel.add(farmersMarketcomboBox());
       panel.add(HomeButton2());
        panel.add(searchbar());
        panel.add(search());
       return panel;
   }

   //Ingredient button
   public static JButton ingredientsButton(){
       ActionListener buttonListener2 = (ActionEvent e) -> {
       ingredientsWindow = new JFrame();
       //ingredientsWindow.setLayout(null);
       //give window a title
       ingredientsWindow.setTitle("ingredients");
       //set width and length of ingredients button window
       ingredientsWindow.setSize(defaultButtonPanelWidth,defaultButtonPanelHeight);
       ingredientsWindow.add(ingredientsButtonPanel());
       //ingredientsWindow.add(HomeButton1());
       ingredientsWindow.setVisible(true);
       ingredientsWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mainWindow.setVisible(false);
       };
       //create button for
       button = new JButton("Ingredient search");
       button.setBounds(buttonDefaultBoundx,buttonDefaultBoundy,buttonDefaultBoundWidth,buttonDefaultBoundHeight);
       button.addActionListener(buttonListener2);
       button.setVisible(true);
       return button;
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
       };
       //create button for
       button = new JButton("Recipe Search");
       button.setBounds(buttonDefaultBoundx,buttonDefaultBoundy,buttonDefaultBoundWidth,buttonDefaultBoundHeight);
       button.addActionListener(buttonListener);
       button.setVisible(true);
       return button;
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
            mainWindow.setVisible(false);
        };
        //create button for
        button = new JButton("Farmer's Market");
        button.setBounds(buttonDefaultBoundx,buttonDefaultBoundx,buttonDefaultBoundy,buttonDefaultBoundHeight);
        button.addActionListener(buttonListener3);
        button.setVisible(true);
        return button;
    }

   //create label for main title page
   public static JLabel title(){
        //create frame for title
        JLabel title = new JLabel("Recipes To Infinity");
        //set font
        title.setFont(new Font("Arial",titleFont1,mainTitleFont2));
        //set color
        title.setBorder(new LineBorder(Color.BLACK));
        //set bounds
        title.setBounds(mainTitleBoundX,mainTitleBoundY,mainTitleBoundWidth,mainTitleBoundHeight);
        return title;
    }
   
    //Jpanel method for main window
    static JPanel panel1(){
        //create Jpanel/add title
        JPanel panel1= new JPanel();
        panel1.setLayout(null);
        //title size
        panel1.setSize(panel1Sizewidth,panel1SizeHeight);
        //set color
        panel1.setBackground(new Color(144, 238, 144));
        panel1.setBounds(panel1Boundx, panel1Boundy, panel1BoundWidth, panel1BoundHeight);
        //add to panel
        panel1.add(title());
        return panel1;
   }

    //Jpanel method for main window
    static JPanel panel2(){
       //create Jpanel/add title
        JPanel panel2= new JPanel();
        //set color
        panel2.setBackground(new Color(144, 238, 144));
        panel2.setBounds(pane12Boundx, pane12Boundy, pane12BoundWidth, pane12BoundHeight);
        //add to panel
        panel2.add(recipeButton());
        panel2.add(ingredientsButton());
        panel2.add(farmersButton());
        return panel2;
   }
    
    //Recipe home button
    public static JButton HomeButton3(){
        ActionListener buttonListener = (ActionEvent e) -> {
           
            
            recipesWindow.setVisible(false);
            recipesWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mainWindow.setVisible(true);

        };
        //create button for
        HomeButton3 = new JButton("Home");
        HomeButton3.setBounds(400,0,80,buttonDefaultBoundHeight);
        HomeButton3.addActionListener(buttonListener);
        HomeButton3.setVisible(true);
        return HomeButton3;
    }

    //ingredients home button
    public static JButton HomeButton1(){
        ActionListener buttonListener = (ActionEvent e) -> {
           
           
            
            ingredientsWindow.setVisible(false);
            ingredientsWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mainWindow.setVisible(true);

        };
        //create button for
        HomeButton1 = new JButton("Home");
        HomeButton1.setBounds(400,0,80,buttonDefaultBoundHeight);
        HomeButton1.addActionListener(buttonListener);
        HomeButton1.setVisible(true);
        return HomeButton1;
    }
    
    //farmers home button
    public static JButton HomeButton2(){
        ActionListener buttonListener = (ActionEvent e) -> {
          
            farmersMarketWindow.setVisible(false);
            farmersMarketWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mainWindow.setVisible(true);

        };
        //create button for
        HomeButton2 = new JButton("Home");
        HomeButton2.setBounds(400,0,80,buttonDefaultBoundHeight);
        HomeButton2.addActionListener(buttonListener);
        HomeButton2.setVisible(true);
        return HomeButton2;
    }
    
    //ingredients home button
    public static JButton HomeButton4(){
        ActionListener buttonListener = (ActionEvent e) -> {
           
           
            ingredientsWindow.setVisible(false);
            ingredientsWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window1.setVisible(false);
            window1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mainWindow.setVisible(true);

        };
        //create button for
        HomeButton1 = new JButton("Home");
        HomeButton1.setBounds(400,0,80,buttonDefaultBoundHeight);
        HomeButton1.addActionListener(buttonListener);
        HomeButton1.setVisible(true);
        return HomeButton1;
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
        //make window visible
        mainWindow.setVisible(true);
        return mainWindow;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}