import java.awt.*;
import javax.swing.*;
public class GUI2 extends JFrame
{
    public GUI2(){
        setSize(500,500);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenSize = tk.getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();

        //System.out.println(width);
        //System.out.println(height);
        //setLocation((int)(width/2)-250,((int)(height/2)-250));
        //setLocationRelativeTo(null);
        //setLocation(640,512);

        setVisible(true);
    }

    public static void main(String [] args){

        new GUI2();
    }
}

