import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

// A Program to display family members, in a window.
public class HelloFamily extends JFrame
{
    public HelloFamily()
    {
        setTitle("Hello Family");
        Container contents = getContentPane();
        contents.setLayout(new FlowLayout());
        contents.add(new JLabel("Hey x!"));
        contents.add(new JLabel("Hey y!"));
        contents.add(new JLabel("Hey z!"));
        contents.add(new JLabel("Hey j!"));

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    } // HelloFamily
    public static void main(String[] args)
    {
        new HelloFamily().setVisible(true);
    } // main
} // class HelloFamily
