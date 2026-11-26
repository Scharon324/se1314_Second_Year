import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CardLayoutTest extends JFrame implements ActionListener
{
    private CardLayout cardLayout;
    private JPanel cardHolder,card1,card2,card3;
    private JButton button1,button2,button3;
    
    public CardLayoutTest()
    {
        super("Card Layout Test");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createGUI();
        setVisible(true);
    }
    
    
    public void createGUI()
    {
        cardLayout=new CardLayout();
        cardHolder=new JPanel();
        cardHolder.setLayout(cardLayout);
        
        button1=new JButton("Next");
        button2=new JButton("Next");
        button3=new JButton("Next");
        
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        
        card1=new JPanel();
        card1.setBackground(Color.BLUE);
        card1.add(button1);
        
        card2=new JPanel();
        card2.setBackground(Color.GREEN);
        card2.add(button2);    
        
        card3=new JPanel();
        card3.setBackground(Color.YELLOW);
        card3.add(button3); 
        
        cardHolder.add(card1,"card1");
        cardHolder.add(card2,"card2");
        cardHolder.add(card3,"card3");
        
        add(cardHolder);
    }
    
    public void actionPerformed(ActionEvent evt)
    {
        /*
        if(evt.getSource()==button1)
        {
            cardLayout.show(cardHolder,"card2");
        }
        else if(evt.getSource()==button2)
        {
            cardLayout.show(cardHolder,"card3");
        }
        else if(evt.getSource()==button3)
        {
            cardLayout.show(cardHolder,"card1");
        }        
        */
        /*
        if(evt.getSource()==button1)
        {
            cardLayout.next(cardHolder);
        }
        else if(evt.getSource()==button2)
        {
            cardLayout.last(cardHolder);
        }
        else if(evt.getSource()==button3)
        {
            cardLayout.first(cardHolder);
        }
        */
        cardLayout.next(cardHolder);
    }
    
    public static void main(String[] args)
    {
        new CardLayoutTest();
    }
}
