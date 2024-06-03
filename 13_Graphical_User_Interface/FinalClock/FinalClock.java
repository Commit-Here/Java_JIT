import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

// A simple stop clock program. The button stops and starts the clock.
// The clock records the start time, stop time and shows elapsed time.
// Also now we have split time button which when pressed while running clock 
// will show elapsed time as the split time.
public class FinalClock extends JFrame implements ActionListener{
    // True if and only if the clock is running.
    private boolean isRunning = false;

    // The time when the clock is started
    // as the milliseconds since midnight, January 1, 1970
    private long startTime = 0;

    // The time when the clock is stopped
    // as the milliseconds since midnight, January 1, 1970.
    private long stopTime = 0;

    // A label for showing the start time.
    private final JTextField startTimeJTextField = new JTextField("Not started");

    // A label for showing the stop time.
    private final JTextField stopTimeJTextField = new JTextField("Not started");

    // A label for showing the split time.
    private final JTextField splitTimeJTextField = new JTextField("Not started");

    // A label for showing the elapsed time.
    private final JTextField elapsedTimeJTextField = new JTextField("Not started");

    // A button for start/stop function of clock.
    private final JButton startStopJButton = new JButton("Start");

    // A button for split time function of clock.
    private final JButton splitJButton = new JButton("Split");

    public FinalClock(){
        setTitle("Stop Clock");

        Container contents = getContentPane();
        // Use a grid layout with 1 column
        contents.setLayout(new GridLayout(0, 1));

        contents.add(new JLabel("Started at:"));
        startTimeJTextField.setEnabled(false);
        contents.add(startTimeJTextField);

        contents.add(new JLabel("Stopped at:"));
        stopTimeJTextField.setEnabled(false);
        contents.add(stopTimeJTextField);

        contents.add(new JLabel("Splited at:"));
        splitTimeJTextField.setEnabled(false);
        contents.add(splitTimeJTextField);

        contents.add(new JLabel("Elapsed time (seconds) :"));
        elapsedTimeJTextField.setEnabled(false);
        contents.add(elapsedTimeJTextField);

        startStopJButton.addActionListener(this);
        contents.add(startStopJButton);

        splitJButton.addActionListener(this);
        splitJButton.setEnabled(false);
        contents.add(splitJButton);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    } // FinalClock

    // Perform action when the button is pressed.
    public void actionPerformed(ActionEvent event)
    {
        if ((event.getSource() == startStopJButton) && (!isRunning)) {
            // Start the clock.
            startStopJButton.setText("Stop");
            splitJButton.setEnabled(true);
            startTime = System.currentTimeMillis();
            startTimeJTextField.setText("" + startTime);
            splitTimeJTextField.setText("not yet...");
            splitTimeJTextField.setText("Running...");
            elapsedTimeJTextField.setText("Running...");
            isRunning = true;
        } // if
        else if (isRunning){
            // Stop or split the clock.
            splitJButton.setEnabled(false);
            stopTime = System.currentTimeMillis();
            long elapsedMilliSeconds = stopTime - startTime ;
            if (event.getSource() != startStopJButton){
                splitTimeJTextField.setText("" + elapsedMilliSeconds / 1000.0);
                splitJButton.setEnabled(true);
            } // else if
            else {
                startStopJButton.setText("Start");
                stopTimeJTextField.setText("" + stopTime);
                elapsedTimeJTextField.setText("" + elapsedMilliSeconds / 1000.0);
                splitJButton.setEnabled(false);
                isRunning = false;
            } // else
        } // else if

        // It is a good idea to pack again.
        // because the size of the labels may have changed.
        pack();
    } // actionPerformed.
    
    // Create a StopClock and make it appear on screen.
    public static void main(String args[]){
        new FinalClock().setVisible(true);
    } // main
} // class SplitClock