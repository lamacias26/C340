import javax.swing.*;
import java.awt.*;

/**
 * SeasonalIngredientsWindow is a child class or subclass.
 */
public class SeasonalIngredientsWindow {

    private static final int marchIngredientsXAndY = 100;
    private static final int marchIngredientsWidthAndHeight = 400;
    private static final int marchIngredientsSize = 20;
    private static final int ingredientBroccoliXAndY = 100;
    private static final int ingredientBroccoliWidthAndHeight = 500;
    private static final int ingredientBroccoliSize = 20;
    private static final int ingredientLettuceXAndY = 100;
    private static final int ingredientLettuceWidthAndHeight = 550;
    private static final int ingredientLettuceSize = 20;
    private static final int ingredientMushroomsXAndY = 100;
    private static final int ingredientMushroomsWidthAndHeight = 600;
    private static final int ingredientMushroomsSize = 20;
    private static final int theMarchIngredientsXAndY = 100;
    private static final int theMarchIngredientsWidthAndHeight = 330;
    private static final int theMarchIngredientsSize = 20;
    private static final int seasonalPageWidthAndHeight = 420;
    private static final int seasonalPageSetBackgroundColorRB = 144;
    private static final int seasonalPageSetBackgroundColorG = 238;

    // These are our global instances that our SeasonalIngredientsWindow constructor has access to.
    JFrame seasonalPage = new JFrame();
    JLabel theMarchIngredientsAre = new JLabel("March");
    JLabel marchIngredients = new JLabel("Ingredients in Season.");
    JLabel ingredientBroccoli = new JLabel("- Broccoli");
    JLabel ingredientLettuce = new JLabel("- Lettuce");
    JLabel ingredientMushrooms = new JLabel("- Mushrooms");

    SeasonalIngredientsWindow() {
        // Setting bounds = where you want the labels to be placed
        marchIngredients.setBounds(marchIngredientsXAndY,marchIngredientsXAndY,marchIngredientsWidthAndHeight,marchIngredientsWidthAndHeight);
        // Setting font = type of font and size
        marchIngredients.setFont(new Font("Times New Roman",Font.BOLD, marchIngredientsSize));
        ingredientBroccoli.setBounds(ingredientBroccoliXAndY,ingredientBroccoliXAndY, ingredientBroccoliWidthAndHeight,ingredientBroccoliWidthAndHeight);
        ingredientBroccoli.setFont(new Font("Times New Roman", Font.BOLD,ingredientBroccoliSize));
        ingredientLettuce.setBounds(ingredientLettuceXAndY,ingredientLettuceXAndY,ingredientLettuceWidthAndHeight,ingredientLettuceWidthAndHeight);
        ingredientLettuce.setFont(new Font("Times New Roman", Font.BOLD,ingredientLettuceSize));
        ingredientMushrooms.setBounds(ingredientMushroomsXAndY,ingredientMushroomsXAndY,ingredientMushroomsWidthAndHeight,ingredientMushroomsWidthAndHeight);
        ingredientMushrooms.setFont(new Font("Times New Roman", Font.BOLD,ingredientMushroomsSize));
        theMarchIngredientsAre.setBounds(theMarchIngredientsXAndY,theMarchIngredientsXAndY,theMarchIngredientsWidthAndHeight,theMarchIngredientsWidthAndHeight);
        theMarchIngredientsAre.setFont(new Font("Times New Roman", Font.BOLD,theMarchIngredientsSize));

        // adding labels to seasonalPage frame
        seasonalPage.add(marchIngredients);
        seasonalPage.add(ingredientBroccoli);
        seasonalPage.add(ingredientLettuce);
        seasonalPage.add(ingredientMushrooms);
        seasonalPage.add(theMarchIngredientsAre);
        seasonalPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        seasonalPage.setSize(seasonalPageWidthAndHeight,seasonalPageWidthAndHeight);
        seasonalPage.setLayout(null);
        seasonalPage.setVisible(true);
        // Setting background of frame to light green for consistency.
        seasonalPage.getContentPane().setBackground(new Color(seasonalPageSetBackgroundColorRB,seasonalPageSetBackgroundColorG,seasonalPageSetBackgroundColorRB));

        // Changing the Java icon to an image of French fries
        ImageIcon recipesToInfinityLogo = new ImageIcon("RecipesToInfinityPlainLogo");
        seasonalPage.setIconImage(recipesToInfinityLogo.getImage());
    }
}
