import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

// Program to greet family member in a window.
public class FamilyGrid extends JFrame
{
    public FamilyGrid()
    {
        setTitle("Hey Family");
        Container contents = getContentPane();
        contents.setLayout(new GridLayout(0, 3, 30, 20));
        contents.add(new JLabel("Hey x!"));
        contents.add(new JLabel("Hey y!"));
        contents.add(new JLabel("Hey z!"));
        contents.add(new JLabel("Hey i!"));
        contents.add(new JLabel("Hey j!"));
        contents.add(new JLabel("Hey k!"));
        contents.add(new JLabel("Hey l!"));
        contents.add(new JLabel("Hey m!"));
        contents.add(new JLabel("Hey n!"));

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    } // FamilyGrid
    public static void main(String[] args)
    {
        new FamilyGrid().setVisible(true);
    } // main
} // class FamilyGrid
