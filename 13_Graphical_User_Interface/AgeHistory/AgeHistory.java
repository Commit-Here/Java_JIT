import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;

/* Report the age history of a person.
    Current date and person details are entered through text fields.
    The result is displayed in a text area.
    A ''new'' button enables multiple displays.
*/

public class AgeHistory extends JFrame implements ActionListener{
    // JTextFields for the present date.
    private final JTextField presentDayJTextField = new JTextField(2);
    private final JTextField presentMonthJTextField = new JTextField(2);
    private final JTextField presentYearJTextField = new JTextField(4);

    // JTextFields for the naem and birthday.
    private final JTextField nameJTextField = new JTextField(15);
    private final JTextField birthDayJTextField = new JTextField(2);
    private final JTextField birthMonthJTextField = new JTextField(2);
    private final JTextField birthYearJTextField = new JTextField(4);

    // JTextArea for the result.
    private final JTextArea ageHistoryJTextArea = new JTextArea(15, 20);

    // The age history display button
    private final JButton displayJButton = new JButton("Display");

    // The new window button
    private final JButton newJButton = new JButton("New");

    // The number of instances created: each has its number in the title.
    private static int instanceCountSoFar = 0;

    // Constructor 
    public AgeHistory(){
        instanceCountSoFar++;
        setTitle("AgeHistory (" + instanceCountSoFar + ")" );
        
        Container contents = getContentPane();
        contents.setLayout(new BorderLayout());

        // The top panel is for the inputs.
        // It will be a grid of 3 by 2.
        JPanel inputDataJPanel = new JPanel();
        contents.add(inputDataJPanel, BorderLayout.NORTH);
        inputDataJPanel.setLayout(new GridLayout(0, 2));

        // Top left of inputDataJPanel.
        inputDataJPanel.add(new JLabel("Present date"));

        // Top right inputDataJPanel
        // A JPanel with left aligned FlowLayout.
        // For today's date components.
        JPanel presentDayJPanel = new JPanel();
        inputDataJPanel.add(presentDayJPanel);
        presentDayJPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

        // JTextFields for present date components, with JLabels.
        presentDayJPanel.add(presentDayJTextField);
        presentDayJPanel.add(new JLabel("/"));
        presentDayJPanel.add(presentMonthJTextField);
        presentDayJPanel.add(new JLabel("/"));
        presentDayJPanel.add(presentYearJTextField);

        // Middle left of inputDataJPanel.
        inputDataJPanel.add(new JLabel("Person name"));

        // Middle right of inputDataJPanel.
        // Use a JPanel so that alignment matches rows above and below.
        JPanel nameJPanel = new JPanel();
        inputDataJPanel.add(nameJPanel);
        nameJPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        nameJPanel.add(nameJTextField);

        // Bottom left of inputDataJPanel
        inputDataJPanel.add(new JLabel("Birthday"));

        // Bottom right inputDataJPanel
        // A JPanel with left aligned FlowLayout.
        // For birthday  components.
        JPanel birthdayJPanel = new JPanel();
        inputDataJPanel.add(birthdayJPanel);
        birthdayJPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

        // JTextFields for birthday components, with JLabels.
        birthdayJPanel.add(birthDayJTextField);
        birthdayJPanel.add(new JLabel("/"));
        birthdayJPanel.add(birthMonthJTextField);
        birthdayJPanel.add(new JLabel("/"));
        birthdayJPanel.add(birthYearJTextField);

        // The result JTextArea goes in the centre.
        contents.add(new JScrollPane(ageHistoryJTextArea), BorderLayout.CENTER);

        // The buttons go at the bottom, in a JPanel with a FlowLayout.
        JPanel buttonJPanel = new JPanel();
        contents.add(buttonJPanel, BorderLayout.SOUTH);
        buttonJPanel.setLayout(new FlowLayout());
        buttonJPanel.add(displayJButton);
        displayJButton.addActionListener(this);
        buttonJPanel.add(newJButton);
        newJButton.addActionListener(this);

        // Allow for the posibility that the present date has already been set.
        Date presentDate = Date.getPresentDate();
        if (presentDate != null) {
            presentDayJTextField.setText("" + presentDate.getDay());
            presentMonthJTextField.setText("" + presentDate.getMonth());
            presentYearJTextField.setText("" + presentDate.getYear());
            presentDayJTextField.setEnabled(false);
            presentMonthJTextField.setEnabled(false);
            presentYearJTextField.setEnabled(false);
        } // if

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        pack();
    } // AgeHistory

    // Act upon the button being pressed.
    public void actionPerformed(ActionEvent event){
        if (event.getSource() == newJButton) 
            new AgeHistory().setVisible(true);

        else if(event.getSource() == displayJButton) {
            // Set the present day only if it has not already been set.
            if (Date.getPresentDate() == null) {
                Date presentDay = 
                    new Date(Integer.parseInt(presentDayJTextField.getText()), 
                            Integer.parseInt(presentMonthJTextField.getText()),
                            Integer.parseInt(presentYearJTextField.getText()));
                Date.setPresentDate(presentDay);
                // Date should be set only once: disable further date setting.
                presentDayJTextField.setEnabled(false);
                presentMonthJTextField.setEnabled(false);
                presentYearJTextField.setEnabled(false);
            } // if
            // Compute and display the age history.
            String name = nameJTextField.getText();
            Date birthday = 
                new Date(Integer.parseInt(birthDayJTextField.getText()), 
                        Integer.parseInt(birthMonthJTextField.getText()),
                        Integer.parseInt(birthYearJTextField.getText()));

            Person person  = new Person(name, birthday);
            ageHistoryJTextArea.append("" + person.ageHistory());

        } // else if
    } // actionPerformed

    // Create an AgeHistory and make it appear on screen.
    public static void main(String[] args){
        Person.setLineSeparator("\n");
        new AgeHistory().setVisible(true);
    } // main 
} // class AgeHistory