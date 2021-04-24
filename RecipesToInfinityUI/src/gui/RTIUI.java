package gui;
import static gui.GuiComboBox.farmersMarketcomboBox;
import static gui.GuiComboBox.ingregientscomboBox;
import static gui.GuiComboBox.recipecomboBox;
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

public class RTIUI extends GuiComboBox{
   static int windowSizewidth = 800;
   static int windowSizeHeight = 600;
   static int panel1Sizewidth = 800;
   static int panel1SizeHeight = 600;
   static int titleBoundx = 100;
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
   static int defaultButtonPanelWidth = 400;
   static int defaultButtonPanelHeight = 400;
   static int defaultSearchLabelBoundX = 100;
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
   static JButton button;
   static Component scrollResult;
   
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
       JLabel title = new JLabel("Search for Ingregients");
        //set font
        title.setFont(new Font("Arial",titleFont1,defaultSearchLabelTitleFont));
        //set bounds
        title.setBounds(defaultSearchLabelBoundX, defaultSearchLabelBoundY, ingredientsSearchLabelWidth, defaultSearchLabelBoundHeight);
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
        panel.setBackground(Color.GREEN);
        panel.setBounds(panel1Boundx, panel1Boundy, panel1BoundWidth, panel1BoundHeight);
        panel.add(recipeTitle());
        panel.add(recipeSearchLabel());
        panel.add(recipecomboBox());
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
       panel.setBackground(Color.GREEN);
       panel.setBounds(panel1Boundx, panel1Boundy, panel1BoundWidth, panel1BoundHeight);
       panel.add(ingredientsTitle());
       panel.add(ingredientsSearchLabel());
       panel.add(ingregientscomboBox());
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
       panel.setBackground(Color.GREEN);
       panel.setBounds(panel1Boundx, panel1Boundy, panel1BoundWidth, panel1BoundHeight);
        //add to panel
       panel.add(farmersTitle());
       panel.add(farmersMarketSearchLabel());
       panel.add(farmersMarketcomboBox());
       return panel;
   }

   //Ingredient button
   public static JButton ingredientsButton(){
       ActionListener buttonListener2 = (ActionEvent e) -> {
       JFrame window = new JFrame();
       //give window a title
       window.setTitle("ingredients");
       //set width and length of ingredients button window
       window.setSize(defaultButtonPanelWidth,defaultButtonPanelHeight);
       window.add(ingredientsButtonPanel());
       window.setVisible(true);
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
       JFrame window = new JFrame();
       //give window a title
       window.setTitle("Recipes");
       //set width and length of recipe button window
       window.setSize(defaultButtonPanelWidth,defaultButtonPanelHeight);
       window.add(recipeButtonPanel());
       window.setVisible(true);
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
        JFrame window = new JFrame();
        //give window a title
        window.setTitle("farmer's Market");
        //set width and length of window
        window.setSize(defaultButtonPanelWidth,defaultButtonPanelHeight);
        window.add(farmersButtonPanel());
        window.setVisible(true);
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
        panel1.setBackground(Color.GREEN);
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
        panel2.setBackground(Color.GREEN);
        panel2.setBounds(pane12Boundx, pane12Boundy, pane12BoundWidth, pane12BoundHeight);
        //add to panel
        panel2.add(recipeButton());
        panel2.add(ingredientsButton());
        panel2.add(farmersButton());
        return panel2;
   }
    
    //JFrame method for main window
    public static JFrame Gui(){
         JFrame window = new JFrame();
        //give window a title
        window.setTitle("Recipes To Infinity");
        //set Jframe to null
        window.setLayout(null);
        //set width and length of window
        window.setSize(windowSizewidth,windowSizeHeight);
        //set close window
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //stop resize
        window.setResizable(false);
        //set in middle of the screen
        window.setLocationRelativeTo(null);
         //add panel to jframe
        window.add(panel1());
        window.add(panel2());
        //make window visible
        window.setVisible(true);
        return window;
    }
}