import javax.swing.*;
import java.awt.*;
public class GUI3 extends JFrame
{
    JButton b2 = new JButton("Goodbye");
    JButton b1 = new JButton("Hello");
    JTextField tf1 = new JTextField(20);
    JCheckBox cb1 = new JCheckBox();
    JRadioButton rb1 = new JRadioButton("Button");
    JPasswordField pf1 = new JPasswordField(10);
    JLabel jl1 = new JLabel("Enter the password: ");
    JTextArea ta1 = new JTextArea("Type here");
    public GUI3(){
        setSize(500,500);
        setLocation(400,400);
        add(b1);
        add(b2);
        add(tf1);
        add(cb1);
        add(rb1);
        add(jl1);
        add(pf1);
        add(ta1);
        setLayout(new FlowLayout());

        setVisible(true);
    }

    public static void main(String [] args){
        new GUI3();

    }
}
