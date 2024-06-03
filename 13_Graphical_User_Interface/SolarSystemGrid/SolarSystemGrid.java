import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

// A Program to display solar system using grid layout, in a window.
public class SolarSystemGrid extends JFrame
{
    public SolarSystemGrid()
    {
        setTitle("HelloSolarSystem");
        Container contents = getContentPane();

        // Set layout to be a grid of 3 columns.
        // This will also give 3 rows, as there are 9 items.
        contents.setLayout(new GridLayout(0, 3, 20, 10));
        contents.add(new JLabel("Hello Mercury!"));
        contents.add(new JLabel("Hello Venus!"));
        contents.add(new JLabel("Hello Earth!"));
        contents.add(new JLabel("Hello Mars!"));
        contents.add(new JLabel("Hello Jupiter!"));
        contents.add(new JLabel("Hello Saturn!"));
        contents.add(new JLabel("Hello Uranus!"));
        contents.add(new JLabel("Hello Neptune!"));
        contents.add(new JLabel("GoodBye Pluto!"));

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    } // SolarSystemGrid
    public static void main(String[] args)
    {
        new SolarSystemGrid().setVisible(true);
    } // main
} // class SolarSystemGrid