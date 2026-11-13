import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Moving_Box extends JFrame implements Runnable, KeyListener
{
    public static void main(String [] args){

        (new Thread(new Moving_Box())).start();

    }

    public Moving_Box(){
        setSize(500,500);
        addKeyListener(this);
        setVisible(true);
    }

    int x = 0;
    int y = 50;
    public void run(){
        int i = 0;
        while(i < 500){
            try{
                repaint();
                Thread.sleep(10);
            }catch(Exception e){}
            x++;
            i++;
        }    

    }
    public void paint(Graphics g) {
        g.clearRect(0,0,500,500);
        g.drawRect(x,y,100,100);        
    }

    public void keyReleased(KeyEvent e){
    }

    public void keyPressed(KeyEvent e){        
        int keyCode = e.getKeyCode();
        switch( keyCode ) { 
            case KeyEvent.VK_UP:
            // handle up 
                y--;
            break;
            case KeyEvent.VK_DOWN:
            // handle down 
                y = y + 1;
                
            break;
            case KeyEvent.VK_LEFT:
            // handle left
            break;
            case KeyEvent.VK_RIGHT :
            // handle right
            break;
        }

    }    

    public void keyTyped(KeyEvent e){
    }

}
