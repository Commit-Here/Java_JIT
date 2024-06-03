import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

// Program to show a times table for a multiplier chosen by the user.
public class TimesTable extends JFrame implements ActionListener {
    // A text field for the user to enter the multiplier.
    private final JTextField multiplierJTextField = new JTextField(5);

    // A text area for the resulting times table, 15 lines of 20 characters.
    private final JTextArea displayJTextArea = new JTextArea(15, 20);

    // Constructor
    public TimesTable() {
        setTitle("Times Table");

        Container contents = getContentPane();
        contents.setLayout(new BorderLayout());

        contents.add(multiplierJTextField, BorderLayout.NORTH);
        contents.add(displayJTextArea, BorderLayout.CENTER);

        JButton displayJButton = new JButton("Display");
        contents.add(displayJButton, BorderLayout.SOUTH);
        displayJButton.addActionListener(this);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    } // TimesTable

    public void actionPerformed(ActionEvent event){
        try {
            // Empty the text area to remove any previous result.
            displayJTextArea.setText("");

            int multiplier = Integer.parseInt(multiplierJTextField.getText());
            
            displayJTextArea.append("--------------------------------\n");
            displayJTextArea.append("| Times table for " + multiplier + "\n");
            displayJTextArea.append("--------------------------------\n");
            for (int thisNumber = 1; thisNumber <= 10; thisNumber++) 
                displayJTextArea.append("| " + thisNumber + " x " + multiplier
                                        + " = " + thisNumber * multiplier + "\n");
            displayJTextArea.append("--------------------------------\n");
        } // try
        catch (NumberFormatException exception){
            displayJTextArea.setText("Error parsing multiplier '" 
                                     + multiplierJTextField.getText() + "'");
        } // catch
    } // actionPerformed
    
    // Create  a TimesTable instance and make it appear on the screen.
    public static void main(String args[]){
        TimesTable theTimesTable = new TimesTable();
        theTimesTable.setVisible(true);
    }// main
} // class TimesTable