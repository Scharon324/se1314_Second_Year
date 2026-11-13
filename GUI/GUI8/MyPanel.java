//  add action listener to the first class for the button
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class MyPanel extends JPanel implements 
ActionListener
{
    JTextField t1 = new JTextField();
    JTextField t2 = new JTextField();
    JButton b1 = new JButton("Press");
    //Constructor
    public MyPanel(){
        setBackground(Color.RED);
        setSize(400,400);
        setLayout(null);

        t1.setSize(80,30);
        t1.setLocation(20,20);
        add(t1);
        
        t2.setSize(80,30);
        t2.setLocation(20,60);
        add(t2);
        
        b1.setSize(80,30);
        b1.setLocation(20,100);
        add(b1);

    }
    public void actionPerformed(ActionEvent e){
        System.out.println("Hello world");
    }
}

