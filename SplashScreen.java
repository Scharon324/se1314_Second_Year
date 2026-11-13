import java.awt.*;
import javax.swing.*;
public class SplashScreen extends JWindow 
{
    private static final long serialVersionUID = 1L;
    
    private int duration;
    public SplashScreen(int d){
            duration = d;
    }
    
 
    public void showSplash(){
        JPanel content = (JPanel)getContentPane();
        content.setBackground(Color.white);
        
        
        int width = 600;
        int height =425;
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width-width)/2;
        int y = (screen.height-height)/2;
        setBounds(x,y,width,height);
        
        Color col = new Color(30, 144, 255);
        
         
        JLabel label = new JLabel(new ImageIcon("se1314_Second_Year\\java-img.gif"));
        JLabel copyrt = new JLabel("Copyright 2017 - SplashScreen by Andres Ipits", JLabel.CENTER);
        copyrt.setFont(new Font("Tahoma", Font.PLAIN, 11));
        copyrt.setForeground(Color.gray);
        content.add(label, BorderLayout.CENTER);
        content.add(copyrt, BorderLayout.SOUTH);
        
        content.setBorder(BorderFactory.createLineBorder(col, 2));
        
         
        setVisible(true);
        
         
        try {
             Thread.sleep(duration); 
        }
        catch (Exception e) {}
        
        setVisible(false);
    }
    
    public void showSplashAndExit() {
        showSplash();
        System.exit(0);
    }
    
    public static void main(String[] args) {
        
         
        SplashScreen splash = new SplashScreen(5000);
        
        splash.showSplashAndExit();
    }
}