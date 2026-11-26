// Make a frame with:
// JTextField
// Jbutton
// JPanel
// add backround color to the JPanel
// put JTextfield & JBUtton into JPanel

// jp set layout as null
// change the location and size of the textfield and button in the jpanel
import javax.swing.*;
import java.awt.*;

public class GUI7 extends JFrame
{
    JTextField t1 = new JTextField(10);
    JButton b1 = new JButton("HE");
    JPanel p1 = new JPanel();
    public GUI7(){
        setSize(500,500);
        setLayout(null);
        //setLayout(new FlowLayout());

        t1.setSize(200,40);
        t1.setLocation(50,50);
        add(t1);

        b1.setSize(100,40);
        b1.setLocation(50,150);
        add(b1);
        
        p1.add(t1);
        p1.add(b1);

        p1.setSize(200,100);
        p1.setBackground(Color.WHITE);
        p1.setLocation(50,100);
        b1.setSize(100,40);
        b1.setLocation(10,10);
        this.setLayout(null);

        
        add(p1);


        setVisible(true);
    }
    public static void main(String [] args){
        new GUI7();

    }
}
