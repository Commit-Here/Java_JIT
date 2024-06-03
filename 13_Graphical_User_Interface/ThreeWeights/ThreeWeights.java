import java.awt.Container;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;

// Program to displays the possible ways weighs can be arranged on the scale.
public class ThreeWeights extends JFrame implements ActionListener{
    // A text field for each weight.
    private final JTextField wieght1JTextField = new JTextField(10);
    private final JTextField wieght2JTextField = new JTextField(10);
    private final JTextField wieght3JTextField = new JTextField(10);

    // A text area for displaying result.
    private final JTextArea displayJTextArea = new JTextArea(15, 30);
    
    public ThreeWeights(){
        setTitle("Three Weights");

        Container contents = getContentPane();
        contents.setLayout(new BorderLayout());

        // A JPanel for the three text fields
        // It will be a Grid Layout of two times two.
        // at the top of the JFrame contents.
        JPanel numbersPanel = new JPanel();
        contents.add(numbersPanel, BorderLayout.NORTH);
        numbersPanel.setLayout(new GridLayout(0, 3));

        // Add 3 JLabels, and 3 JTextFields to the numbersPanel.
        numbersPanel.add(new JLabel("Weight1:"));
        numbersPanel.add(new JLabel("Weight2:"));
        numbersPanel.add(new JLabel("Weight3:"));
        numbersPanel.add(wieght1JTextField);
        numbersPanel.add(wieght2JTextField);
        numbersPanel.add(wieght3JTextField);

         // The result JScrollPane/JTextArea goes in the center.
        displayJTextArea.setEnabled(false);
        contents.add(new JScrollPane(displayJTextArea), BorderLayout.CENTER);

        // The JButton goes at the bottom
        JButton displayJButton = new JButton("Display");
        contents.add(displayJButton, BorderLayout.SOUTH);
        displayJButton.addActionListener(this);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        
    } // ThreeWeights

    public void actionPerformed(ActionEvent event){
        // Empty the text area to remove any previous result.
        displayJTextArea.setText("");

        int weight1 = Integer.parseInt(wieght1JTextField.getText());
        int weight2 = Integer.parseInt(wieght2JTextField.getText());
        int weight3 = Integer.parseInt(wieght3JTextField.getText());

        // Start off with all three multipliers being true.
        int multiplier1 = -1, multiplier2 = -1, multiplier3 = -1;

 
        displayJTextArea.append("Ways of putting weights onto the scale \n\n");

        displayJTextArea.append("| Weight1 | Weight2 | Weight3 |\n");
        displayJTextArea.append("-------------------------------\n");
        
        for (int indexI = 1; indexI <= 3; indexI++, multiplier1+=1, multiplier2 = -1 , multiplier3 = -1){
            displayJTextArea.append("\n");
            for (int indexJ = 1; indexJ <= 3; indexJ++, multiplier2+=1, multiplier3 = -1){
                for (int indexK = 1; indexK <= 3; indexK++, multiplier3+=1){
                    if (indexI == 1)
                        displayJTextArea.append("|  Left   ");
                    else if (indexI == 2)
                        displayJTextArea.append("|   Off   ");
                    else
                        displayJTextArea.append("|  Right ");
                    
                    if (indexJ == 1)
                        displayJTextArea.append("|  Left   ");
                    else if (indexJ == 2)
                        displayJTextArea.append("|   Off   ");
                    else
                        displayJTextArea.append("|  Right ");

                    if (indexK == 1)
                    displayJTextArea.append("|  Left   ");
                    else if (indexK == 2)
                        displayJTextArea.append("|   Off   ");
                    else
                        displayJTextArea.append("|  Right ");
                    displayJTextArea.append("| => ");
                    displayJTextArea.append("" + (multiplier1 * weight1 + multiplier2 * weight2 + multiplier3 * weight3) + "\n");
                } // for
            } // for
            displayJTextArea.append("--------------------------------\n");
        } // for
        pack();
    } // actionPerformed

    public static void main(String args[]) {
        new ThreeWeights().setVisible(true);

        // int weight1 = Integer.parseInt(args[0]);
        // int weight2 = Integer.parseInt(args[1]);
        // int weight3 = Integer.parseInt(args[2]);
        
        // // Each weight can be written in 3 ways 
        // // 3 x 3 x 3 = 27 number of ways.
        // System.out.println("" + (-weight1 - weight2 - weight3));
        // System.out.println("" + (-weight1 - weight2 + 0));        
        // System.out.println("" + (-weight1 - weight2 + weight3));
        // System.out.println("" + (-weight1 + 0  - weight3));
        // System.out.println("" + (-weight1 + 0  + 0));
        // System.out.println("" + (-weight1 + 0  + weight3));
        // System.out.println("" + (-weight1 + weight2 - weight3));
        // System.out.println("" + (-weight1 + weight2 + 0));
        // System.out.println("" + (-weight1 + weight2 + weight3));


        // System.out.println("" + (0 - weight2 - weight3));
        // System.out.println("" + (0 - weight2 + 0));
        // System.out.println("" + (0 - weight2 + weight3));
        // System.out.println("" + (0 + 0  - weight3));
        // System.out.println("" + (0 + 0  + 0));
        // System.out.println("" + (0 + 0  + weight3));
        // System.out.println("" + (0 + weight2 - weight3));
        // System.out.println("" + (0 + weight2 + 0));
        // System.out.println("" + (0 + weight2 + weight3));

        // System.out.println("" + (weight1 - weight2 - weight3));
        // System.out.println("" + (weight1 - weight2 + 0));
        // System.out.println("" + (weight1 - weight2 + weight3));
        // System.out.println("" + (weight1 + 0 - weight3));
        // System.out.println("" + (weight1 + 0 + 0));
        // System.out.println("" + (weight1 + 0 + weight3));
        // System.out.println("" + (weight1 + weight2 - weight3));
        // System.out.println("" + (weight1 + weight2 + 0));
        // System.out.println("" + (weight1 + weight2 + weight3));
    }
}