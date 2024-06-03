import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

// A program to display times table of 3 in a window.
public class TimesTable extends JFrame
{
    public TimesTable(int multiplies, int multiplier)
    {
        setTitle("Times Table");
        Container contents = getContentPane();
        contents.setLayout(new GridLayout(0, 5, 30, 5));

        for (int index = 1; index <= multiplier; index++)
        {
            contents.add(new JLabel("" + index));
            contents.add(new JLabel("X"));
            contents.add(new JLabel("" + multiplies));
            contents.add(new JLabel("="));
            contents.add(new JLabel("" + index * multiplies));
        } // for

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    } // TimesTable

    public static void main(String[] args)
    {
        int m, n;
        m = Integer.parseInt(args[0]);
        n = Integer.parseInt(args[1]);
        new TimesTable(m, n).setVisible(true);
    } // main
} // class TimesTable