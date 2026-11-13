import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class GUI6 extends JFrame implements 
ActionListener, MouseListener, MouseMotionListener
{
    private Random d = new Random();
    JButton b1 = new JButton("Try to touch me");
    public GUI6(){
        setSize(500,500);
        setLayout(null);
        setLayout(new FlowLayout());

        b1.setSize(200,10);
        b1.setLocation(40,400);
        b1.addMouseListener(this);
        b1.addActionListener(this);
        add(b1);

        addMouseListener(this);
        addMouseMotionListener(this);
        // Mouse listener added to the whole JFrame
        setVisible(true);

    }

    public static void main(String [] args){
        new GUI6();

    }

    public void actionPerformed(ActionEvent e){

    }

    public void mouseExited(MouseEvent a){

    }

    public void mouseEntered(MouseEvent b){
       if(b.getSource() == b1){
            b1.setLocation(300,300);
        }
        if(b.getSource() == this){
            System.out.println("c");
        }
    }


    public void mouseReleased(MouseEvent c){
   
    }

    public void mousePressed(MouseEvent d){
        //System.out.println("Heelo World");
    }

    public void mouseClicked(MouseEvent f){

    }

    public void mouseMoved(MouseEvent f){


        
        //int X=f.getX() + b1.getX();
        // int Y=f.getY() + b1.getY();
        // b1.setBounds(X,Y,150,40);
    }

    public void mouseDragged(MouseEvent f){

    }
}
