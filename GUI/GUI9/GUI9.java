import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GUI9 extends JFrame implements 
ActionListener{
    JPanel cardWrapper = new JPanel();
    CardLayout c1 = new CardLayout();

    static Person [] personList = new Person [5];
    static int noOfPersons = 0;

    JButton showLogin = new JButton("Login");
    JButton showRegister =  new JButton("Register");

    JButton showInfo = new JButton("Info");
    JButton showLocation =  new JButton("Location");

    LoginPanel loginPanel = new LoginPanel();
    RegisterPanel registerPanel = new RegisterPanel();

    InfoPanel infoPanel = new InfoPanel();
    LocationPanel locationPanel = new LocationPanel();

    JButton profile = new JButton("Show Register");

    public GUI9(){
        setSize(700,700);
        setLayout(null);

        showLogin.setSize(100,25);
        showLogin.setLocation(200,50);
        showLogin.addActionListener(this);
        add(showLogin);

        showRegister.setSize(100,25);
        showRegister.setLocation(350,50);
        showRegister.addActionListener(this);
        add(showRegister);

        showInfo.setSize(100,25);
        showInfo.setLocation(550,50);
        showInfo.addActionListener(this);
        add(showInfo);

        showLocation.setSize(100,25);
        showLocation.setLocation(450,50);
        showLocation.addActionListener(this);
        add(showLocation);

        profile.setSize(100,25);
        profile.setLocation(650,50);
        profile.addActionListener(this);
        add(profile);

        cardWrapper.setSize(400,400);
        cardWrapper.setLocation(175,150);
        cardWrapper.setBackground(Color.yellow);
        cardWrapper.setLayout(c1);
        cardWrapper.add(loginPanel, "loginPanel");
        cardWrapper.add(registerPanel, "registerPanel");
        cardWrapper.add(infoPanel, "infoPanel");
        cardWrapper.add(locationPanel, "locationPanel");

        add(cardWrapper);
        setVisible(true);
    }

    public static void main(String [] args){
        new GUI9();
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == showLogin){
            c1.show(cardWrapper, "loginPanel");
        }
        if(e.getSource() == showRegister){
            c1.show(cardWrapper, "registerPanel");
        }
        if(e.getSource() == showInfo){
            c1.show(cardWrapper, "infoPanel");
        }
        if(e.getSource() == showLocation){
            c1.show(cardWrapper, "locationPanel");
        }
        if(e.getSource() == profile){
            int x = 0;
            while(x < GUI9.noOfPersons){
                String name = personList[x].getName();
                System.out.println(name);

                String email = personList[x].getEmail();
                System.out.println(email);

                String password = personList[x].getPassword();
                System.out.println(password);
                x++;

            }

        }
    }
}
