import javax.swing.*;
import java.awt.*;
public class GUI1_1 extends JFrame
{   
    public static void main(String [] args){
        new GUI1_1();
    }    
    
    public GUI1_1(){
        setSize(500,500);
        setLocation(50,200);
        setResizable(false);
        
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
            }catch(Exception e){
            }
        }
       
        // pink to yellow  // animate location
    }    
}