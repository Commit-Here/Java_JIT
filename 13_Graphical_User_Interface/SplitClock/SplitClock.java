import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

// A simple stop clock program. The button stops and starts the clock.
// The clock records the start time, stop time and shows elapsed time.
// Also now we have split time button which when pressed while running clock 
// will show elapsed time as the split time.
public class SplitClock extends JFrame implements ActionListener{
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

    // A label for showing the split time.
    private final JLabel splitTimeJLabel = new JLabel("Not started");

    // A label for showing the elapsed time.
    private final JLabel elapsedTimeJLabel = new JLabel("Not started");

    // A button for start/stop function of clock.
    private final JButton startStopJButton = new JButton("Start / Stop");

    // A button for split time function of clock.
    private final JButton splitJButton = new JButton("Split");

    public SplitClock(){
        setTitle("Stop Clock");

        Container contents = getContentPane();
        // Use a grid layout with 1 column
        contents.setLayout(new GridLayout(0, 1));

        contents.add(new JLabel("Started at:"));
        contents.add(startTimeJLabel);

        contents.add(new JLabel("Stopped at:"));
        contents.add(stopTimeJLabel);

        contents.add(new JLabel("Splited at:"));
        contents.add(splitTimeJLabel);

        contents.add(new JLabel("Elapsed time (seconds) :"));
        contents.add(elapsedTimeJLabel);

        startStopJButton.addActionListener(this);
        contents.add(startStopJButton);

        splitJButton.addActionListener(this);
        contents.add(splitJButton);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    } // SplitClock

    // Perform action when the button is pressed.
    public void actionPerformed(ActionEvent event)
    {
        if ((event.getSource() == startStopJButton) && (!isRunning)) {
            // Start the clock.
            startTime = System.currentTimeMillis();
            startTimeJLabel.setText("" + startTime);
            splitTimeJLabel.setText("not yet...");
            stopTimeJLabel.setText("Running...");
            elapsedTimeJLabel.setText("Running...");
            isRunning = true;
        } // if
        else if (isRunning){
            // Stop or split the clock.
            stopTime = System.currentTimeMillis();
            long elapsedMilliSeconds = stopTime - startTime ;
            if (event.getSource() != startStopJButton)
                splitTimeJLabel.setText("" + elapsedMilliSeconds / 1000.0);
            else {
                stopTimeJLabel.setText("" + stopTime);
                elapsedTimeJLabel.setText("" + elapsedMilliSeconds / 1000.0);
                isRunning = false;
            } // else
        } // else if

        // It is a good idea to pack again.
        // because the size of the labels may have changed.
        pack();
    } // actionPerformed.
    
    // Create a StopClock and make it appear on screen.
    public static void main(String args[]){
        new SplitClock().setVisible(true);
    } // main
} // class SplitClock