import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegisterPanel extends JPanel 
implements ActionListener
{
    JTextField nameTF = new JTextField();
    JTextField emailTF = new JTextField();
    JTextField passwordTF = new JTextField();
    JButton submit = new JButton("Submit");

    public RegisterPanel(){
        setBackground(Color.GREEN);
        setLayout(null);

        nameTF.setSize(100,20);
        nameTF.setLocation(50,50);
        add(nameTF);

        emailTF.setSize(100,20);
        emailTF.setLocation(50,80);
        add(emailTF);

        passwordTF.setSize(100,20);
        passwordTF.setLocation(50,110);
        add(passwordTF);

        submit.setSize(100,20);
        submit.setLocation(50,140);
        submit.addActionListener(this);
        add(submit);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == submit){
            String name = nameTF.getText();
            String email = emailTF.getText();
            String password = passwordTF.getText();
            // Saves users details into objects

            //System.out.println(name+ ":"+ email + ":" +password+ ":");
            //Person p = new Person(name,email,password);

            GUI9.personList[GUI9.noOfPersons] = new Person(name,email,password);
            GUI9.noOfPersons++;

            
            
            //Clear the textfield screen

            nameTF.setText("");
            emailTF.setText("");
            passwordTF.setText("");
        }
    }

}

