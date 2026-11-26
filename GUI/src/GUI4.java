//create form with fname, sname. email,
//buttons and labels
import javax.swing.*;
public class GUI4 extends JFrame
{
    JButton b1 = new JButton("Click here to finish");
    JTextField jf1 = new JTextField(20);
    JLabel jl1 = new JLabel("Enter Name: ");

    JTextField jf2 = new JTextField(30);
    JLabel jl2 = new JLabel("Enter Surname:");

    JTextField jf3 = new JTextField(30);
    JLabel jl3 = new JLabel("Enter Email:");
    public GUI4(){
        setSize(500,500);
        setLayout(null);

        b1.setSize(200,20);
        b1.setLocation(40,400);
        add(b1);

        jf1.setSize(70,20);
        jf1.setLocation(80,30);
        add(jf1);
        jl1.setSize(80,60);
        jl1.setLocation(10,10);
        add(jl1);
        ///////
        jf2.setSize(70,20);
        jf2.setLocation(100,50);
        add(jf2);
        ///
        jl2.setSize(100,50);
        jl2.setLocation(10,35);
        add(jl2);
        ///////
        jf3.setSize(70,20);
        jf3.setLocation(80,70);
        add(jf3);
        /////
        jl3.setSize(70,20);
        jl3.setLocation(10,70);
        add(jl3);
        
        setVisible(true);
    }

    public static void main(String [] args){
        new GUI4();

    }
}
