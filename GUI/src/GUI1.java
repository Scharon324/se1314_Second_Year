import java.awt.*;
import javax.swing.*;
public class GUI1 extends JFrame
{
    public static void main (String [] args){
        new GUI1();

    }

    public GUI1(){
        setSize(500,500);
        getContentPane().setBackground(new Color(255,228,181));
        setLocation(50,200);
        
        int g = 0;
        while(g <= 255){
            getContentPane().setBackground(new Color(g,0,0));
            setVisible(true);
            try{
                Thread.sleep(20); // makes program to lsow down  
            }catch (Exception e){

            }
            g++;
        
            //getContentPane().setBackground(Color.black);
            setVisible(true);
        }
    }
}
