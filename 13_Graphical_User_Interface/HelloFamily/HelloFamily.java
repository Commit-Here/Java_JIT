import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

// Program to display family members, in a window.
public class HelloFamily extends JFrame{
    public HelloFamily(){
        setTitle("Hello Family");
        Container contents = getContentPane();

        contents.setLayout(new FlowLayout());

        contents.add(new JLabel("Hello Shahida!"));
        contents.add(new JLabel("Hello Adnan!"));
        contents.add(new JLabel("Hello Burhan!"));

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    } // HelloFamily
    public static void main(String args[]){
        new HelloFamily().setVisible(true);
    } // main
} // class HelloFamily