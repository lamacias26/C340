
package gui;

import static gui.RTIUI.scrollResult;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.*;
import java.awt.event.*;
import static gui.RTIUI.HomeButton4;
import static gui.RTIUI.window1;
import static gui.RTIUI.ingredientsWindow;

public class GuiComboBox {
    static int defaultComboBoxX = 120;
    static int defaultComboBoxY = 210;
    static int defaultComboBoxWidth = 100;
    static int defaultComboBoxHeight = 20;
    static int defaultWindowWidth = 500;
    static int defaultWindowHeight = 500;
    static int defaultPanelWidth = 500;
    static int defaultPanelHeight = 500;
    static int defaultLabelX = 80;
    static int defaultLabelY = 0;
    static int defaultLabelWidth = 200;
    static int defaultLabelHeight = 200;
    

    
    
    
    //ingredients for fruit drop down box
    public static JComboBox fruitsIngredientscomboBox(){
         String[] monthsOfTheYear = new String[] {"January", "February", "March", "April", "May", "June", "July", "August"
                , "September", "October", "November", "December"};
         //put seasons in choice box
        JComboBox cb = new JComboBox(monthsOfTheYear);
         ActionListener buttonListener2 = (ActionEvent e) -> {
       //if statement to choose button
       //if statement to choose button
       if(cb.getSelectedItem().equals("January")){
           comboBoxFJanuaryWindow();              
       }
       if(cb.getSelectedItem().equals("February")){
           comboBoxFFebuaryWindow();               
       }
       if(cb.getSelectedItem().equals("March")){
           comboBoxFMarchWindow();              
       }
       if(cb.getSelectedItem().equals("April")){
           comboBoxFAprilWindow();              
       }
       if(cb.getSelectedItem().equals("May")){
           comboBoxFMayWindow();              
       }
       if(cb.getSelectedItem().equals("June")){
           comboBoxFJuneWindow();;              
       }
       if(cb.getSelectedItem().equals("July")){
           comboBoxFJulyWindow();             
       }
       if(cb.getSelectedItem().equals("August")){
           comboBoxFAugustWindow();             
       }
       if(cb.getSelectedItem().equals("September")){
           comboBoxFSeptemberWindow();              
       }
       if(cb.getSelectedItem().equals("October")){
           comboBoxFOctoberWindow();              
       }
       if(cb.getSelectedItem().equals("November")){
           comboBoxFNovemberWindow();              
       }
       if(cb.getSelectedItem().equals("December")){
           comboBoxFDecemberWindow();              
       }
       };
         cb.addActionListener(buttonListener2);
          //set size
        cb.setBounds(200, defaultComboBoxY, defaultComboBoxWidth, 20);
        //set visible
        cb.setVisible(true);
        return cb;
        }
    
    //ingredients for vegetables drop down box
    public static JComboBox vegetablesIngredientscomboBox(){
         String[] monthsOfTheYear = new String[] {"January", "February", "March", "April", "May", "June", "July", "August"
                , "September", "October", "November", "December"};
         //put seasons in choice box
        JComboBox cb = new JComboBox(monthsOfTheYear);
         ActionListener buttonListener2 = (ActionEvent e) -> {
       //if statement to choose button
       if(cb.getSelectedItem().equals("January")){
           comboBoxVJanuaryWindow();              
       }
       if(cb.getSelectedItem().equals("February")){
           comboBoxVFebuaryWindow();               
       }
       if(cb.getSelectedItem().equals("March")){
           comboBoxVMarchWindow();              
       }
       if(cb.getSelectedItem().equals("April")){
           comboBoxVAprilWindow();              
       }
       if(cb.getSelectedItem().equals("May")){
           comboBoxVMayWindow();              
       }
       if(cb.getSelectedItem().equals("June")){
           comboBoxVJuneWindow();;              
       }
       if(cb.getSelectedItem().equals("July")){
           comboBoxVJulyWindow();             
       }
       if(cb.getSelectedItem().equals("August")){
           comboBoxVAugustWindow();             
       }
       if(cb.getSelectedItem().equals("September")){
           comboBoxVSeptemberWindow();              
       }
       if(cb.getSelectedItem().equals("October")){
           comboBoxVOctoberWindow();              
       }
       if(cb.getSelectedItem().equals("November")){
           comboBoxVNovemberWindow();              
       }
       if(cb.getSelectedItem().equals("December")){
           comboBoxVDecemberWindow();              
       }
       };
         cb.addActionListener(buttonListener2);
          //set size
        cb.setBounds(50, defaultComboBoxY, defaultComboBoxWidth, 20);
        //set visible
        cb.setVisible(true);
        return cb;
        }
    
    
    
    //method for scroll panel
    public static JScrollPane scroll(){
        //scroll bar
        JScrollPane scroll = new JScrollPane(scrollResult);
        return scroll;
    }
    //method for text Search bar
    public static JTextField search(){
        //create text field for search bar
        JTextField search = new JTextField(15);
        search.setBounds(220, 220, 80, 20);
        search.setVisible(true);
        return search;
    }
    
    //search bar method
    public static JButton searchbar(){
        //button to search
        JButton searchButton = new JButton("Search");
        searchButton.setBounds(135, 220, 75, 20);
        return searchButton;
    }
   
    //window for vegetable january drop down button
    public static JFrame comboBoxVJanuaryWindow(){
           window1 = new JFrame();
          window1.setLayout(null);
          JPanel panel = new JPanel();
          panel.setLayout(null);
          panel.setBackground(new Color(144, 238, 144));
          window1.setSize(defaultWindowWidth, defaultWindowHeight);
          panel.setSize(defaultPanelWidth,defaultPanelHeight); 
          window1.add(panel);
          panel.add(HomeButton4());
          ingredientsWindow.setVisible(false);
          ingredientsWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          window1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          window1.setVisible(true);
          return window1;
    }
    //window for vegetable Febuary drop down button
    public static JFrame comboBoxVFebuaryWindow(){
           window1 = new JFrame();
          window1.setLayout(null);
          JPanel panel = new JPanel();
          panel.setLayout(null);
          panel.setBackground(new Color(144, 238, 144));
          window1.setSize(defaultWindowWidth, defaultWindowHeight);
          panel.setSize(defaultPanelWidth,defaultPanelHeight); 
          window1.add(panel);
          panel.add(HomeButton4());
          ingredientsWindow.setVisible(false);
          ingredientsWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          window1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          window1.setVisible(true);
          return window1;
    }
    //window for vegetable march drop down button
    public static JFrame comboBoxVMarchWindow(){
           window1 = new JFrame();
          window1.setLayout(null);
          JPanel panel = new JPanel();
          panel.setLayout(null);
          panel.setBackground(new Color(144, 238, 144));
          window1.setSize(defaultWindowWidth, defaultWindowHeight);
          panel.setSize(defaultPanelWidth,defaultPanelHeight); 
          window1.add(panel);
          panel.add(HomeButton4());
          ingredientsWindow.setVisible(false);
          ingredientsWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          window1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          window1.setVisible(true);
          return window1;
    }
    //window for vegetable april drop down button
    public static JFrame comboBoxVAprilWindow(){
          window1 = new JFrame();
          window1.setLayout(null);
          JPanel panel = new JPanel();
          panel.setLayout(null);
          panel.setBackground(new Color(144, 238, 144));
          window1.setSize(defaultWindowWidth, defaultWindowHeight);
          panel.setSize(defaultPanelWidth,defaultPanelHeight); 
          window1.add(panel);
          panel.add(HomeButton4());
          ingredientsWindow.setVisible(false);
          ingredientsWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          window1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          window1.setVisible(true);
          return window1;
    }
    //window for vegetable may drop down button
    public static JFrame comboBoxVMayWindow(){
          window1 = new JFrame();
          window1.setLayout(null);
          JPanel panel = new JPanel();
          panel.setLayout(null);
          panel.setBackground(new Color(144, 238, 144));
          window1.setSize(defaultWindowWidth, defaultWindowHeight);
          panel.setSize(defaultPanelWidth,defaultPanelHeight); 
          window1.add(panel);
          panel.add(HomeButton4());
          ingredientsWindow.setVisible(false);
          ingredientsWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          window1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          window1.setVisible(true);
          return window1;
    }
    //window for vegetable june drop down button
    public static JFrame comboBoxVJuneWindow(){
          window1 = new JFrame();
          window1.setLayout(null);
          JPanel panel = new JPanel();
          panel.setLayout(null);
          panel.setBackground(new Color(144, 238, 144));
          window1.setSize(defaultWindowWidth, defaultWindowHeight);
          panel.setSize(defaultPanelWidth,defaultPanelHeight); 
          window1.add(panel);
          panel.add(HomeButton4());
          ingredientsWindow.setVisible(false);
          ingredientsWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          window1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          window1.setVisible(true);
          return window1;
    }
   
    //window for vegetable july drop down button
    public static JFrame comboBoxVJulyWindow(){
          window1 = new JFrame();
          window1.setLayout(null);
          JPanel panel = new JPanel();
          panel.setLayout(null);
          panel.setBackground(new Color(144, 238, 144));
          window1.setSize(defaultWindowWidth, defaultWindowHeight);
          panel.setSize(defaultPanelWidth,defaultPanelHeight); 
          window1.add(panel);
          panel.add(HomeButton4());
          ingredientsWindow.setVisible(false);
          ingredientsWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          window1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          window1.setVisible(true);
          return window1;
    }
    //window for vegetable august drop down button
    public static JFrame comboBoxVAugustWindow(){
          window1 = new JFrame();
          window1.setLayout(null);
          JPanel panel = new JPanel();
          panel.setLayout(null);
          panel.setBackground(new Color(144, 238, 144));
          window1.setSize(defaultWindowWidth, defaultWindowHeight);
          panel.setSize(defaultPanelWidth,defaultPanelHeight); 
          window1.add(panel);
          panel.add(HomeButton4());
          ingredientsWindow.setVisible(false);
          ingredientsWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          window1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          window1.setVisible(true);
          return window1;
    }
    //window for vegetable september drop down button
    public static JFrame comboBoxVSeptemberWindow(){
          window1 = new JFrame();
          window1.setLayout(null);
          JPanel panel = new JPanel();
          panel.setLayout(null);
          panel.setBackground(new Color(144, 238, 144));
          window1.setSize(defaultWindowWidth, defaultWindowHeight);
          panel.setSize(defaultPanelWidth,defaultPanelHeight); 
          window1.add(panel);
          panel.add(HomeButton4());
          ingredientsWindow.setVisible(false);
          ingredientsWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          window1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          window1.setVisible(true);
          return window1;
    }
    //window for vegetable october drop down button
    public static JFrame comboBoxVOctoberWindow(){
          window1 = new JFrame();
          window1.setLayout(null);
          JPanel panel = new JPanel();
          panel.setLayout(null);
          panel.setBackground(new Color(144, 238, 144));
          window1.setSize(defaultWindowWidth, defaultWindowHeight);
          panel.setSize(defaultPanelWidth,defaultPanelHeight); 
          window1.add(panel);
          panel.add(HomeButton4());
          ingredientsWindow.setVisible(false);
          ingredientsWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          window1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          window1.setVisible(true);
          return window1;
    }
    //window for vegetable november drop down button
    public static JFrame comboBoxVNovemberWindow(){
          window1 = new JFrame();
          window1.setLayout(null);
          JPanel panel = new JPanel();
          panel.setLayout(null);
          panel.setBackground(new Color(144, 238, 144));
          window1.setSize(defaultWindowWidth, defaultWindowHeight);
          panel.setSize(defaultPanelWidth,defaultPanelHeight); 
          window1.add(panel);
          panel.add(HomeButton4());
          ingredientsWindow.setVisible(false);
          ingredientsWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          window1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          window1.setVisible(true);
          return window1;
    }
    //window for vegetable december drop down button
    public static JFrame comboBoxVDecemberWindow(){
          window1 = new JFrame();
          window1.setLayout(null);
          JPanel panel = new JPanel();
          panel.setLayout(null);
          panel.setBackground(new Color(144, 238, 144));
          window1.setSize(defaultWindowWidth, defaultWindowHeight);
          panel.setSize(defaultPanelWidth,defaultPanelHeight); 
          window1.add(panel);
          panel.add(HomeButton4());
          ingredientsWindow.setVisible(false);
          ingredientsWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          window1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          window1.setVisible(true);
          return window1;
    }
    
    //window for fruit january drop down button
    public static JFrame comboBoxFJanuaryWindow(){
          window1 = new JFrame();
          window1.setLayout(null);
          JPanel panel = new JPanel();
          panel.setLayout(null);
          panel.setBackground(new Color(144, 238, 144));
          window1.setSize(defaultWindowWidth, defaultWindowHeight);
          panel.setSize(defaultPanelWidth,defaultPanelHeight); 
          window1.add(panel);
          panel.add(HomeButton4());
          ingredientsWindow.setVisible(false);
          ingredientsWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          window1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          window1.setVisible(true);
          return window1;
    }
    //window for fruit Febuary drop down button
    public static JFrame comboBoxFFebuaryWindow(){
          window1 = new JFrame();
          window1.setLayout(null);
          JPanel panel = new JPanel();
          panel.setLayout(null);
          panel.setBackground(new Color(144, 238, 144));
          window1.setSize(defaultWindowWidth, defaultWindowHeight);
          panel.setSize(defaultPanelWidth,defaultPanelHeight); 
          window1.add(panel);
          panel.add(HomeButton4());
          ingredientsWindow.setVisible(false);
          ingredientsWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          window1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          window1.setVisible(true);
          return window1;
    }
    //window for fruit march drop down button
    public static JFrame comboBoxFMarchWindow(){
         window1 = new JFrame();
          window1.setLayout(null);
          JPanel panel = new JPanel();
          panel.setLayout(null);
          panel.setBackground(new Color(144, 238, 144));
          window1.setSize(defaultWindowWidth, defaultWindowHeight);
          panel.setSize(defaultPanelWidth,defaultPanelHeight); 
          window1.add(panel);
          panel.add(HomeButton4());
          ingredientsWindow.setVisible(false);
          ingredientsWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          window1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          window1.setVisible(true);
          return window1;
    }
    //window for fruit april drop down button
    public static JFrame comboBoxFAprilWindow(){
         window1 = new JFrame();
          window1.setLayout(null);
          JPanel panel = new JPanel();
          panel.setLayout(null);
          panel.setBackground(new Color(144, 238, 144));
          window1.setSize(defaultWindowWidth, defaultWindowHeight);
          panel.setSize(defaultPanelWidth,defaultPanelHeight); 
          window1.add(panel);
          panel.add(HomeButton4());
          ingredientsWindow.setVisible(false);
          ingredientsWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          window1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          window1.setVisible(true);
          return window1;
    }
    //window for fruit may drop down button
    public static JFrame comboBoxFMayWindow(){
          window1 = new JFrame();
          window1.setLayout(null);
          JPanel panel = new JPanel();
          panel.setLayout(null);
          panel.setBackground(new Color(144, 238, 144));
          window1.setSize(defaultWindowWidth, defaultWindowHeight);
          panel.setSize(defaultPanelWidth,defaultPanelHeight); 
          window1.add(panel);
          panel.add(HomeButton4());
          ingredientsWindow.setVisible(false);
          ingredientsWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          window1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          window1.setVisible(true);
          return window1;
    }
    //window for fruit june drop down button
    public static JFrame comboBoxFJuneWindow(){
          window1 = new JFrame();
          window1.setLayout(null);
          JPanel panel = new JPanel();
          panel.setLayout(null);
          panel.setBackground(new Color(144, 238, 144));
          window1.setSize(defaultWindowWidth, defaultWindowHeight);
          panel.setSize(defaultPanelWidth,defaultPanelHeight); 
          window1.add(panel);
          panel.add(HomeButton4());
          ingredientsWindow.setVisible(false);
          ingredientsWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          window1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          window1.setVisible(true);
          return window1;
    }
   
    //window for fruit july drop down button
    public static JFrame comboBoxFJulyWindow(){
          window1 = new JFrame();
          window1.setLayout(null);
          JPanel panel = new JPanel();
          panel.setLayout(null);
          panel.setBackground(new Color(144, 238, 144));
          window1.setSize(defaultWindowWidth, defaultWindowHeight);
          panel.setSize(defaultPanelWidth,defaultPanelHeight); 
          window1.add(panel);
          panel.add(HomeButton4());
          ingredientsWindow.setVisible(false);
          ingredientsWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          window1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          window1.setVisible(true);
          return window1;
    }
    //window for fruit august drop down button
    public static JFrame comboBoxFAugustWindow(){
          window1 = new JFrame();
          window1.setLayout(null);
          JPanel panel = new JPanel();
          panel.setLayout(null);
          panel.setBackground(new Color(144, 238, 144));
          window1.setSize(defaultWindowWidth, defaultWindowHeight);
          panel.setSize(defaultPanelWidth,defaultPanelHeight); 
          window1.add(panel);
          panel.add(HomeButton4());
          ingredientsWindow.setVisible(false);
          ingredientsWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          window1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          window1.setVisible(true);
          return window1;
    }
    //window for fruit september drop down button
    public static JFrame comboBoxFSeptemberWindow(){
          window1 = new JFrame();
          window1.setLayout(null);
          JPanel panel = new JPanel();
          panel.setLayout(null);
          panel.setBackground(new Color(144, 238, 144));
          window1.setSize(defaultWindowWidth, defaultWindowHeight);
          panel.setSize(defaultPanelWidth,defaultPanelHeight); 
          window1.add(panel);
          panel.add(HomeButton4());
          ingredientsWindow.setVisible(false);
          ingredientsWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          window1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          window1.setVisible(true);
          return window1;
    }
    //window for fruit october drop down button
    public static JFrame comboBoxFOctoberWindow(){
          window1 = new JFrame();
          window1.setLayout(null);
          JPanel panel = new JPanel();
          panel.setLayout(null);
          panel.setBackground(new Color(144, 238, 144));
          window1.setSize(defaultWindowWidth, defaultWindowHeight);
          panel.setSize(defaultPanelWidth,defaultPanelHeight); 
          window1.add(panel);
          panel.add(HomeButton4());
          ingredientsWindow.setVisible(false);
          ingredientsWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          window1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          window1.setVisible(true);
          return window1;
    }
    //window for fruit november drop down button
    public static JFrame comboBoxFNovemberWindow(){
          window1 = new JFrame();
          window1.setLayout(null);
          JPanel panel = new JPanel();
          panel.setLayout(null);
          panel.setBackground(new Color(144, 238, 144));
          window1.setSize(defaultWindowWidth, defaultWindowHeight);
          panel.setSize(defaultPanelWidth,defaultPanelHeight); 
          window1.add(panel);
          panel.add(HomeButton4());
          ingredientsWindow.setVisible(false);
          ingredientsWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          window1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          window1.setVisible(true);
          return window1;
    }
    //window for fruit december drop down button
    public static JFrame comboBoxFDecemberWindow(){
          window1 = new JFrame();
          window1.setLayout(null);
          JPanel panel = new JPanel();
          panel.setLayout(null);
          panel.setBackground(new Color(144, 238, 144));
          window1.setSize(defaultWindowWidth, defaultWindowHeight);
          panel.setSize(defaultPanelWidth,defaultPanelHeight); 
          window1.add(panel);
          panel.add(HomeButton4());
          ingredientsWindow.setVisible(false);
          ingredientsWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          window1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          window1.setVisible(true);
          return window1;
    }
}
/*
//recipe drop down box
    public static JComboBox recipecomboBox(){
         String seasons[]={"Stew","Salad","Vegetable Pizza"};
         //put seasons in choice box
        JComboBox cb = new JComboBox(seasons);
         ActionListener buttonListener2 = (ActionEvent e) -> {
       //if statement to choose button
       if(cb.getSelectedItem().equals("Stew")){
           comboBoxStewWindow();              
       }
       if(cb.getSelectedItem().equals("Salad")){
           comboBoxSaladWindow();              
       }
       if(cb.getSelectedItem().equals("Vegetable Pizza")){
           comboBoxPizzaWindow();              
       }
       };
         cb.addActionListener(buttonListener2);
          //set size
        cb.setBounds(defaultComboBoxX, defaultComboBoxY, defaultComboBoxWidth, defaultComboBoxHeight);
        //set visible
        cb.setVisible(true);
        return cb;
                 }
    
//farmer's market drop down box
    public static JComboBox farmersMarketcomboBox(){
         String markets[]={"Curb Market","The Green Market","The Corner Market"};
         //put seasons in choice box
        JComboBox cb = new JComboBox(markets);
         ActionListener buttonListener2 = (ActionEvent e) -> {
       //if statement to choose button
       if(cb.getSelectedItem().equals("Curb Market")){
           comboBoxfarmersMarket1Window();              
       }
       if(cb.getSelectedItem().equals("The Green Market")){
           comboBoxfarmersMarket2Window();             
       }
       if(cb.getSelectedItem().equals("The Corner Market")){
           comboBoxfarmersMarket3Window();              
       }
       };
         cb.addActionListener(buttonListener2);
          //set size
        cb.setBounds(defaultComboBoxX, defaultComboBoxY, defaultComboBoxWidth, defaultComboBoxHeight);
        //set visible
        cb.setVisible(true);
        return cb;
                 }

//window for stew drop down button
    public static JFrame comboBoxStewWindow(){
          JFrame window1 = new JFrame();
          window1.setLayout(null);
          JPanel panel = new JPanel();
          panel.setLayout(null);
          panel.setBackground(new Color(144, 238, 144));
          window1.setSize(defaultWindowWidth, defaultWindowHeight);
          panel.setSize(defaultPanelWidth,defaultPanelHeight);
          //create and import image
          JLabel label = new JLabel(new ImageIcon("src//StewPic.PNG"));
          //set nlabel bounds
          label.setBounds(defaultLabelX, defaultLabelY, defaultLabelWidth, defaultLabelHeight);
          panel.add(label);
          //add panel to window
          window1.add(panel);
          window1.setVisible(true);
          return window1;
    }
    
    //window for farmers market 1 drop down button
    public static JFrame comboBoxfarmersMarket1Window(){
          JFrame window1 = new JFrame();
          window1.setLayout(null);
          JPanel panel = new JPanel();
          panel.setLayout(null);
          panel.setBackground(new Color(144, 238, 144));
          window1.setSize(defaultWindowWidth, defaultWindowHeight);
          panel.setSize(defaultPanelWidth,defaultPanelHeight);   
          //create and import image
          JLabel label = new JLabel(new ImageIcon("src//CurbMarket.PNG"));
          label.setBounds(defaultLabelX, defaultLabelY, defaultLabelWidth, defaultLabelHeight);           
          panel.add(label);       
          window1.add(panel);
          window1.setVisible(true);
          return window1;
    }
    
    //window for farmers market 2 drop down button
    public static JFrame comboBoxfarmersMarket2Window(){
          JFrame window1 = new JFrame();
          window1.setLayout(null);
          JPanel panel = new JPanel();
          panel.setLayout(null);
          panel.setBackground(new Color(144, 238, 144));
          window1.setSize(defaultWindowWidth, defaultWindowHeight);
          panel.setSize(defaultPanelWidth,defaultPanelHeight);
          //create and import image
          JLabel label = new JLabel(new ImageIcon("src//GreenValley.PNG"));
          label.setBounds(defaultLabelX, defaultLabelY, defaultLabelWidth, defaultLabelHeight);
          panel.add(label);
          window1.add(panel);
          window1.setVisible(true);
          return window1;
    }
    
    //window for farmers market 3 drop down button
    public static JFrame comboBoxfarmersMarket3Window(){
          JFrame window1 = new JFrame();
          window1.setLayout(null);
          JPanel panel = new JPanel();
          panel.setLayout(null);
          panel.setBackground(new Color(144, 238, 144));
          window1.setSize(defaultWindowWidth, defaultWindowHeight);
          panel.setSize(defaultPanelWidth,defaultPanelHeight);
          //create and import image
          JLabel label = new JLabel(new ImageIcon("src//CornerMarket.PNG"));  
           label.setBounds(defaultLabelX, defaultLabelY, defaultLabelWidth, defaultLabelHeight);
           panel.add(label);
           window1.add(panel);
           window1.setVisible(true);
           return window1;
    }
    
    //window for salad drop down button
    public static JFrame comboBoxSaladWindow(){
          JFrame window1 = new JFrame();
          window1.setLayout(null);
          JPanel panel = new JPanel();
          panel.setLayout(null);
          panel.setBackground(new Color(144, 238, 144));
          window1.setSize(defaultWindowWidth, defaultWindowHeight);
          panel.setSize(defaultPanelWidth,defaultPanelHeight);     
          //create and import image
          JLabel label = new JLabel(new ImageIcon("src//SaladPic.PNG"));
          label.setBounds(defaultLabelX, defaultLabelY, defaultLabelWidth, defaultLabelHeight);
           panel.add(label);
           window1.add(panel);
           window1.setVisible(true);
           return window1;
    }
    
    //window for pizza drop down button
    public static JFrame comboBoxPizzaWindow(){
          JFrame window1 = new JFrame();
          window1.setLayout(null);
          JPanel panel = new JPanel();
          panel.setLayout(null);
          panel.setBackground(new Color(144, 238, 144));
          window1.setSize(defaultWindowWidth, defaultWindowHeight);
          panel.setSize(defaultPanelWidth,defaultPanelHeight);
          //create and import image
          JLabel label = new JLabel(new ImageIcon("src//vegatablePizzaR.PNG"));
          label.setBounds(defaultLabelX, defaultLabelY, defaultLabelWidth, defaultLabelHeight);
          panel.add(label);
          window1.add(panel);
          window1.setVisible(true);
          return window1;
    }
    
    //window for Apple drop down button
    public static JFrame comboBoxAppleWindow(){
          JFrame window1 = new JFrame();
          window1.setLayout(null);
          JPanel panel = new JPanel();
          panel.setLayout(null);
          panel.setBackground(new Color(144, 238, 144));
          window1.setSize(defaultWindowWidth, defaultWindowHeight);
          panel.setSize(defaultPanelWidth,defaultPanelHeight);
          //create and import image
          JLabel label = new JLabel(new ImageIcon("src//Apple.PNG"));        
          label.setBounds(defaultLabelX, defaultLabelY, defaultLabelWidth, defaultLabelHeight); 
          panel.add(label);
          window1.add(panel);
          window1.setVisible(true);
          return window1;
    }
    
    //window for Celery drop down button
    public static JFrame comboBoxCeleryWindow(){
          JFrame window1 = new JFrame();
          window1.setLayout(null);
          JPanel panel = new JPanel();
          panel.setLayout(null);
          panel.setBackground(new Color(144, 238, 144));
          window1.setSize(defaultWindowWidth, defaultWindowHeight);
          panel.setSize(defaultPanelWidth,defaultPanelHeight);
          //create and import image
          JLabel label = new JLabel(new ImageIcon("src//Celery.PNG"));
          label.setBounds(defaultLabelX, defaultLabelY, defaultLabelWidth, defaultLabelHeight);  
          panel.add(label);
          window1.add(panel);
          window1.setVisible(true);
          return window1;
    }
    
    //window for Carrot drop down button
    public static JFrame comboBoxCarrotWindow(){
          JFrame window1 = new JFrame();
          window1.setLayout(null);
          JPanel panel = new JPanel();
          panel.setLayout(null);
          panel.setBackground(new Color(144, 238, 144));
          window1.setSize(defaultWindowWidth, defaultWindowHeight);
          panel.setSize(defaultPanelWidth,defaultPanelHeight);
          //create and import image
          JLabel label = new JLabel(new ImageIcon("src//Carrot.PNG"));
          label.setBounds(defaultLabelX, defaultLabelY, defaultLabelWidth, defaultLabelHeight);
          panel.add(label);
          window1.add(panel);
          window1.setVisible(true);
          return window1;
    }
    
*/