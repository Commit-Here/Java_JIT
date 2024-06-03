import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

// Program to display all nine planets, in a window.
public class HelloSolarSystem extends JFrame
{
    public HelloSolarSystem()
    {
        setTitle("Hello Solar System");
        Container contents = getContentPane();
        contents.setLayout(new FlowLayout());
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
    } // HelloSolarSystem
    public static void main(String[] args)
    {
        new HelloSolarSystem().setVisible(true);
    } // main
} // class HelloSolarSystem