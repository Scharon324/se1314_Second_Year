import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class GUI5 extends JFrame implements 
ActionListener
{
    JButton b1 = new JButton("Student info");
    JButton b2 = new JButton("Info");
    JButton b3 = new JButton("Click me");
    JButton b4 = new JButton("Set Text");
    JButton b5 = new JButton("Get Text");
    JTextField tf1 = new JTextField(10);
    JTextField tf2 = new JTextField(10);
    public GUI5(){

        setSize(500,500);
        setLayout(null);
        setLayout(new FlowLayout());

        b1.setSize(200,10);
        b1.setLocation(40,400);
        b1.addActionListener(this); 
        add(b1);

        b2.setSize(200,60);
        b2.setLocation(40,400);
        b2.addActionListener(this); 
        add(b2);

        b3.setSize(200,10);
        b3.setLocation(40,400);
        b3.addActionListener(this); 
        add(b3);

        b4.setSize(200,10);
        b4.setLocation(40,400);
        b4.addActionListener(this); 
        add(b4);

        b5.setSize(200,10);
        b5.setLocation(40,400);
        b5.addActionListener(this); 
        add(b5);

        tf1.setSize(200,50);
        tf1.setLocation(40,400);
        add(tf1);

        tf2.setSize(200,50);
        tf2.setLocation(40,400);
        add(tf2);

        setVisible(true);

    }

    public static void main (String [] args){
        new GUI5();

    }

    public void actionPerformed(ActionEvent e)  {

        //Object source = e.getSource();

        if(e.getSource() == b1)
        {           
            String farmertext = "Names of Students:" +"\r\n" +"\r\n" + "Majid" + "\r\n" + "Andres" + "\r\n" + " Ali" + "\r\n" + "Helvijs" + "\r\n" + "Asna" + "\r\n" + "Test Object" + "\r\n" + "Testing 2" + "\r\n" + "Testing 3";  
            JOptionPane.showMessageDialog(b1,farmertext,"The Class", JOptionPane.PLAIN_MESSAGE);
        }

        if(e.getSource() == b2){
            JOptionPane.showMessageDialog(b2,"Press the Student info to find more info");
            return;
        }

        if(e.getSource() == b3){
            while(true){
                int r = (int)(Math.random() * 255); // Random Color's           
                int g = (int)(Math.random() * 255);
                int b = (int)(Math.random() * 255);
                int x = (int)(Math.random() * 800);
                int y = (int)(Math.random() * 600);
                setLocation(x,y);
                getContentPane().setBackground(new Color(r,g,b));
                setVisible(true);
                try{
                    Thread.sleep(50); // 50 milliseconds
                }catch(Exception a){
                }
            }
        }

        if(e.getSource() == b4){
            tf1.setText("What?");

        }

        if(e.getSource() == b5){
            System.out.println(tf2.getText());

        }


        
        if(e.getSource() == b5){

        }
    }
}

