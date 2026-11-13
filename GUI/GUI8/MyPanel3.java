// the second class a textarea
import javax.swing.*;
import java.awt.*;
public class MyPanel3 extends JPanel
{
    JTextArea a1 = new JTextArea("This is Text Area");
    public MyPanel3(){

        a1.setSize(80,30);
        a1.setLocation(40,40);
        add(a1);

    }
}
