import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;

// Program to display greeting using window.
public class Greetings extends JFrame
{
    public Greetings()
    {
        setTitle("ASLAMU-ALIKUM");
        Container contents = getContentPane();
        contents.add(new JLabel("Meaning: Peace be upon you and God's mercy and blessings"));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    } // Greetings

    public static void main(String[] args)
    {
        new Greetings().setVisible(true);
    } // main
} // class Greetings