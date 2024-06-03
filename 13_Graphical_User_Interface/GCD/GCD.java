import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

// Calculates the GCD of two numbers.
public class GCD extends JFrame implements ActionListener{
    // A JTextField for each number.
    private final JTextField number1JTextField = new JTextField(20);
    private final JTextField number2JTextField = new JTextField(20);

    // A JTextField for the result.
    private final JTextField resultJTextField = new JTextField(20);

    // Constructor
    public GCD(){
        setTitle("GCD");

        Container contents = getContentPane();
        contents.setLayout(new GridLayout(0, 1)); // Single column

        contents.add(new JLabel("Number 1"));
        contents.add(number1JTextField);
        contents.add(new JLabel("Number 2"));
        contents.add(number2JTextField);

        JButton computeJButton = new JButton("Compute");
        contents.add(computeJButton);
        computeJButton.addActionListener(this);

        contents.add(new JLabel("GCD of Number 1 and Number 2"));
        contents.add(resultJTextField);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    } // GCD

    // Act upon the button being pressed.
    public void actionPerformed(ActionEvent event){
        int number1 = Integer.parseInt(number1JTextField.getText());
        int number2 = Integer.parseInt(number2JTextField.getText());
        int theGCD = MyMath.greatestCommonDivisor(number1, number2);
        resultJTextField.setText("" + theGCD);
    } // actionPerformed

    // Create a GCD and make it appear on screen.
    public static void main(String args[]){
        new GCD().setVisible(true);
    } // main
} // class GCD