import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

// A simple stop clock program. The button stops and starts the clock.
// The clock records the start time, stop time and shows elapsed time.
public class StopClock extends JFrame implements ActionListener
{
    // True if and only if the clock is running.
    private boolean isRunning = false;

    // The time when the clock is started
    // as the milliseconds since midnight, January 1, 1970
    private long startTime = 0;

    // The time when the clock is stopped
    // as the milliseconds since midnight, January 1, 1970.
    private long stopTime = 0;

    // A label for showing the start time.
    private final JLabel startTimeJLabel = new JLabel("Not started");

    // A label for showing the stop time.
    private final JLabel stopTimeJLabel = new JLabel("Not started");

    // A label for showing the elapsed time.
    private final JLabel elapsedTimeJLabel = new JLabel("Not started");

    // Constructor
    public StopClock()
    {
        setTitle("Stop Clock");

        Container contents = getContentPane();
        // Use a grid layout with 1 column
        contents.setLayout(new GridLayout(0, 1));

        contents.add(new JLabel("Started at:"));
        contents.add(startTimeJLabel);

        contents.add(new JLabel("Stoped at:"));
        contents.add(stopTimeJLabel);

        contents.add(new JLabel("Elapsed time (seconds) :"));
        contents.add(elapsedTimeJLabel);

        JButton startStopJButton = new JButton("Start / Stop");
        startStopJButton.addActionListener(this);
        contents.add(startStopJButton);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    } // StopClock

    // Perform action when the button is pressed.
    public void actionPerformed(ActionEvent event)
    {
        if (!isRunning) {
            // Start the clock.
            startTime = System.currentTimeMillis();
            startTimeJLabel.setText("" + startTime);
            stopTimeJLabel.setText("Running...");
            elapsedTimeJLabel.setText("Running...");
            isRunning = true;
        } // if
        else {
            // Stop the clock.
            stopTime = System.currentTimeMillis();
            stopTimeJLabel.setText("" + stopTime);
            long elapsedMilliSeconds = stopTime - startTime ;
            elapsedTimeJLabel.setText("" + elapsedMilliSeconds / 1000.0);
            isRunning = false;
        } // else
        // It is a good idea to pack again.
        // because the size of the labels may have changed.
        pack();
    } // actionPerformed.
    
    // Create a StopClock and make it appear on screen.
    public static void main(String args[]){
        new StopClock().setVisible(true);
    } // main
} // class StopClock