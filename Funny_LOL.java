import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Funny_LOL
{
   public static void main(String [] args){
       
    
    

            while(true){
                int r = (int)(Math.random() * 255); // Random Color's           
                int g = (int)(Math.random() * 255);
                int b = (int)(Math.random() * 255);
                int x = (int)(Math.random() * 800);
                int y = (int)(Math.random() * 600);
                //setLocation(x,y);
                //getContentPane().setBackground(new Color(r,g,b));
                setVisible(true);
                try{
                    Thread.sleep(50); // 50 milliseconds
                }catch(Exception a){
                }
            }
        }
    }

