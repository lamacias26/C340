import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * MyFrame is the child class or subclass.
 * JFrame is the parent class or the superclass.
 */
public class MyFrame extends JFrame implements ActionListener{
    /**
     * Creating a constructor for MyFrame
     * MyFrame() constructor is going to be called when we create an instance of it in the main class
     * This is a reference to the object whose constructor is being called
     */

    private static final int setColor = 0;
    private static final int setBackgroundColorRB = 144;
    private static final int setBackgroundColorG = 238;
    private static final int welcomeFont = 35;
    private static final int borderThickness = 5;
    private static final int frameDimensions = 650;

    JButton startButton = new JButton();

    MyFrame() {

        // Create an ImageIcon of an image with different varieties of food appear on the welcome page
        ImageIcon foodVariety = new ImageIcon("foodVariety.jpg");
        // Creating a green border that outlines the whole welcome frame
        Border border01 = BorderFactory.createLineBorder(Color.GREEN,borderThickness);

        // JLabel = a GUI display area for a string of text, an image, or both
        // Instance of a label.
        JLabel label = new JLabel(); // create a label
        label.setText("Welcome to Recipes to Infinity"); // set text of label
        label.setIcon(foodVariety);
        //label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, CENTER, RIGHT of imageicon
        label.setVerticalTextPosition(JLabel.TOP); // set text TOP, CENTER, BOTTOM of imageIcon
        // Set the color of the text by putting in Decimal code, R,G,B
        label.setForeground(new Color(setColor,setColor,setColor));
        // Sets the background color
        label.setBackground(new Color(setBackgroundColorRB,setBackgroundColorG,setBackgroundColorRB));
        // Displays the background color.
        label.setOpaque(true);
        label.setBorder(border01);
        // Sets the font of the text to font name, bold, plain, or italicized, and size
        label.setFont(new Font("Times New Roman", Font.BOLD, welcomeFont));

        JButton startButton = new JButton();
        startButton.setBounds(50,50,30,30);
        startButton.setSize(500,500);
        startButton.setText("Start");
        startButton.addActionListener(this);

        JPanel titlePanel = new JPanel();
        titlePanel.setBackground(new Color(144,238,144));
        titlePanel.setBounds(300,300,300,300);
        titlePanel.add(startButton);
        titlePanel.add(label);

        // Creates an instance of a frame
        //JFrame frame = new JFrame();
        // Setting properties of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Sets the title of the frame which appears at the top
        this.setTitle("Recipes to Infinity");
        // Sets the x-dimension and the y-dimension of the frame.
        this.setSize(frameDimensions,frameDimensions);
        // This makes the frame visible.
        this.setVisible(true);
        // Adds the label to the frame
        //this.add(label);
        ImageIcon recipesToInfinityLogo = new ImageIcon("RecipesToInfinityPlainLogo.PNG"); // Create an ImageIcon of French Fries
        this.setIconImage(recipesToInfinityLogo.getImage()); // change Java icon of frame to French Fries
        // Change color of background to light green by putting in Decimal Code R,G,B
        this.getContentPane().setBackground(new Color(setBackgroundColorRB,setBackgroundColorG,setBackgroundColorRB));
        this.add(titlePanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
            LaunchSeasonalIngredientsPage startWindow = new LaunchSeasonalIngredientsPage();
        }
    }
}
