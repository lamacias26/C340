
package gui;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.*;
import java.awt.event.*;

public class GuiComboBox {
    static int defaultComboBoxX = 120;
    static int defaultComboBoxY = 210;
    static int defaultComboBoxWidth = 100;
    static int defaultComboBoxHeight = 20;
    static int defaultWindowWidth = 400;
    static int defaultWindowHeight = 400;
    static int defaultPanelWidth = 400;
    static int defaultPanelHeight = 400;
    static int defaultLabelX = 80;
    static int defaultLabelY = 0;
    static int defaultLabelWidth = 200;
    static int defaultLabelHeight = 200;

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
    
    //ingredients drop down box
    public static JComboBox ingregientscomboBox(){
         String seasons[]={"celery","apple","carrot"};
         //put seasons in choice box
        JComboBox cb = new JComboBox(seasons);
         ActionListener buttonListener2 = (ActionEvent e) -> {
       //if statement to choose button
       if(cb.getSelectedItem().equals("celery")){
           comboBoxCeleryWindow();              
       }
       if(cb.getSelectedItem().equals("apple")){
           comboBoxAppleWindow();              
       }
       if(cb.getSelectedItem().equals("carrot")){
           comboBoxCarrotWindow();              
       }
       };
         cb.addActionListener(buttonListener2);
          //set size
        cb.setBounds(defaultComboBoxX, defaultComboBoxY, defaultComboBoxWidth, 20);
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
          panel.setBackground(Color.green);
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
          panel.setBackground(Color.green);
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
          panel.setBackground(Color.green);
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
          panel.setBackground(Color.green);
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
          panel.setBackground(Color.green);
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
          panel.setBackground(Color.green);
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
          panel.setBackground(Color.green);
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
          panel.setBackground(Color.green);
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
          panel.setBackground(Color.green);
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
    
    
}
