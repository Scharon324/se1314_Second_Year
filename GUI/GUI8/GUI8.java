// Make two new classes which inherit from JPanel
// the first class must have a textfield and button
// the second class a textarea
//  add action listener to the first class for the button
// make a JFrame and add both the panels
import javax.swing.*;
import java.awt.*;

public class GUI8 extends JFrame
{
    MyPanel p1 = new MyPanel();
    MyPanel2 p2 = new MyPanel2();
    MyPanel3 p3 = new MyPanel3();
    public GUI8(){
        setSize(800,800);
        setLayout(null);

        p1.setLocation(20,20);
        add(p1);

        p2.setLocation(300,500);
        add(p2);
        
        p3.setLocation(100,100);
        add(p3);

        
        
        setVisible(true);

    }

    public static void main (String [] args){
        new GUI8();  

    }
}
