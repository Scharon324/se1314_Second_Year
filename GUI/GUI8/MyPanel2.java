// the first class must have a textfield and button
import javax.swing.*;
import java.awt.*;
public class MyPanel2 extends JPanel
{
    JTextField t3 = new JTextField();
    JButton b2 = new JButton("Press2");
    public MyPanel2(){
        setBackground(Color.BLUE);
        setSize(400,400);
        setLayout(null);

        t3.setSize(80,30);
        t3.setLocation(20,20);
        add(t3);
        
        b2.setSize(80,30);
        b2.setLocation(20,100);
        add(b2);
    }
}