package gui;
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


public class RTIUI {
   static int windowSizewidth = 800;
   static int windowSizeHeight = 600;
   static int panel1Sizewidth = 800;
   static int panel1SizeHeight = 600;
   static int titleBoundx = 300;
   static int titleBoundy = 150;
   static int titleBoundWidth = 20;
   static int titleBoundHeight = 20;
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
   static int titleFont1 = 1;
   static int titleFont2 = 20;
   static int defaultButtonPanelWidth = 400;
   static int defaultButtonPanelHeight = 400;
   static JButton button;
   static Component scrollResult;

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
       button.setBounds(buttonDefaultBoundx,buttonDefaultBoundx,buttonDefaultBoundy,buttonDefaultBoundHeight);
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

   //create label for title
   public static JLabel title(){
        //create frame for title
        JLabel title = new JLabel("Recipes To Infinity");
        //set font
        title.setFont(new Font("Verdana",titleFont1,titleFont2));
        //set color
        title.setBorder(new LineBorder(Color.BLACK));
        //set bounds
        title.setBounds(titleBoundx,titleBoundy,titleBoundWidth,titleBoundHeight);
        title.setSize(titleBoundWidth, titleBoundHeight);
        return title;
    }


    //Jpanel method for main window
    static JPanel panel1(){
        //create Jpanel/add title
        JPanel panel1= new JPanel();
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
        //make widow visible
        window.setVisible(true);
        return window;
    }
}