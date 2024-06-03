import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

// Program to display family members using grid layout, in a window.
public class FamilyGrid extends JFrame{
    public FamilyGrid(){
        setTitle("Hello Family");
        Container contents = getContentPane();

        contents.setLayout(new GridLayout(0, 2, 20, 30));

        contents.add(new JLabel("Hey Mama!"));
        contents.add(new JLabel("Hey Momo!"));
        contents.add(new JLabel("Hey Aam Bhai!"));
        contents.add(new JLabel("Hey Afii!"));

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    } // FamilyGrid
    public static void main(String args[]){
        new FamilyGrid().setVisible(true);
    } // main
} // class FamilyGrid
