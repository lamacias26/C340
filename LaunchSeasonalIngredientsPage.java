import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


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
    JLabel dropDownMenuLabel = new JLabel("Select Month");
    JLabel dropDownMenu = new JLabel("Drop down menu with months");

    LaunchSeasonalIngredientsPage() {

        submitButton.setBounds(submitButtonXAndWidth,submitButtonY,submitButtonXAndWidth,submitButtonHeight);
        submitButton.setFocusable(false);
        submitButton.addActionListener(this);
        dropDownMenuLabel.setBounds(dropDownMenuLabelXAndWidth,dropDownMenuLabelY,dropDownMenuLabelXAndWidth,dropDownMenuLabelHeight);
        dropDownMenu.setBounds(dropDownMenuX,dropDownMenuY,dropDownMenuWidth,dropDownMenuHeight);

        startPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        startPage.setSize(startPageWidthAndHeight,startPageWidthAndHeight);
        startPage.setLayout(null);
        startPage.setVisible(true);
        startPage.add(submitButton);
        startPage.getContentPane().setBackground(new Color(startPageSetColorRB,startPageSetColorG,startPageSetColorRB));
        startPage.add(dropDownMenuLabel);
        startPage.add(dropDownMenu);
        startPage.setLayout(new GridLayout(startPageRows,startPageCols,startPageHgapVgap,startPageHgapVgap));
        ImageIcon recipesToInfinityLogo = new ImageIcon("RecipesToInfinityPlainLogo.PNG");
        startPage.setIconImage(recipesToInfinityLogo.getImage());

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
    }
}
