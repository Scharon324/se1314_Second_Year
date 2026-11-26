import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
public class CardLayoutExample {
 
  public static void main(String[] args) {
 
    // main window
    //JFrame.setDefaultLookAndFeelDecorated(true);
    JFrame window = new JFrame("CardLayout Example");
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setSize(300,300); 
    window.setLayout(new BorderLayout());
 
 
    final CardLayout cardLayout = new CardLayout(); 
    final JPanel cardPanel = new JPanel(cardLayout);
 
    // create two dummy panels (the "cards") to show
    JPanel card1 = new JPanel();
    card1.setBackground(Color.red);
 
    JPanel card2 = new JPanel();
    card2.setBackground(Color.blue);
 
    cardPanel.add(card1,"RedCard");
    cardPanel.add(card2,"BlueCard");
 
 
    // create two buttons 
    JPanel buttonPanel = new JPanel();
    JButton b1 = new JButton("Red");
    JButton b2 = new JButton("Blue");
    buttonPanel.add(b1);
    buttonPanel.add(b2);
 
    // create action listeners for buttons
    b1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        cardLayout.show(cardPanel, "RedCard");
      }
    });
 
    b2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        cardLayout.show(cardPanel, "BlueCard");
      }
    });
 
    // add card & button panels to the main window
    window.add(cardPanel,BorderLayout.CENTER);
    window.add(buttonPanel,BorderLayout.SOUTH);
    window.setVisible(true);
  }
}
 