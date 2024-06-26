import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

// Program to show a times table for a multiplier chosen by the user.
// The user also chosses the size of the table.
public class FinalTimesTable extends JFrame implements ActionListener {
    // A text field for the user to enter the multiplier.
    private final JTextField multiplierJTextField = new JTextField(5);

    // A text field for the user to enter the table size, intital value is 10.
    private final JTextField tableSizeJTextField = new JTextField("10");

    // A text area for the resulting times table, 15 lines of 20 characters.
    private final JTextArea displayJTextArea = new JTextArea(15, 20);

    // Constructor
    public FinalTimesTable() {
        setTitle("Times Table");

        Container contents = getContentPane();
        contents.setLayout(new BorderLayout());
        
        // A JPanel for the two text fields
        // It will be a Grid Layour of two times two.
        // at the top of the JFrame contents.
        JPanel numbersPanel = new JPanel();
        contents.add(numbersPanel, BorderLayout.NORTH);
        numbersPanel.setLayout(new GridLayout(2, 0));

        // Add two JLabels, and two JTextFields to the numbersPanel.
        numbersPanel.add(new JLabel("Multiplier:"));
        numbersPanel.add(multiplierJTextField);
        numbersPanel.add(new JLabel("Table size:"));
        numbersPanel.add(tableSizeJTextField);

        // The result JScrollPane/JTextArea goes in the center.
        contents.add(new JScrollPane(displayJTextArea), BorderLayout.CENTER);

        // The JButton goes at the bottom
        JButton displayJButton = new JButton("Display");
        contents.add(displayJButton, BorderLayout.SOUTH);
        displayJButton.addActionListener(this);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    } // NewTimesTable

    public void actionPerformed(ActionEvent event){
        // Empty the text area to remove any previous result.
        displayJTextArea.setText("");

        int multiplier = Integer.parseInt(multiplierJTextField.getText());
        int tableSize = Integer.parseInt(tableSizeJTextField.getText());

        displayJTextArea.append("--------------------------------\n");
        displayJTextArea.append("| Times table for " + multiplier + "\n");
        displayJTextArea.append("--------------------------------\n");
        for (int thisNumber = 1; thisNumber <= tableSize; thisNumber++) 
            displayJTextArea.append("| " + thisNumber + " x " + multiplier
                                     + " = " + thisNumber * multiplier + "\n");
        displayJTextArea.append("--------------------------------\n");
    } // actionPerformed
    
    // Create  a TimesTable instance and make it appear on the screen.
    public static void main(String args[]){
        FinalTimesTable theTimesTable = new FinalTimesTable();
        theTimesTable.setVisible(true);
    }// main
} // class NewTimesTable