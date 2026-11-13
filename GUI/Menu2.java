import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Menu2 extends JFrame implements ActionListener
{
    static Chair [] chairList = new Chair [100];
    static Table [] tableList = new Table [100];
    DefaultListModel lm = new DefaultListModel();
    JList js;
    JButton b1 = new JButton();
    static int id = 0;
    public static void main(String [] args){
        chairList[0] = new Chair("sofa");
        chairList[0].id = id;
        id++;
        chairList[1] = new Chair("sofa");
        chairList[1].id = id;
        id++;
        chairList[2] = new Chair("bus seat");
        chairList[2].id = id;
        id++;
        tableList[0] = new Table("dinner");
        tableList[0].id = id;
        id++;
        new Menu2();
    }

    public Menu2(){
        setSize(500,500);
        setLayout(new FlowLayout());
        lm.addElement(chairList[0].id + " " + chairList[0].getType());
        lm.addElement(chairList[1].id + " " + chairList[1].getType());
        lm.addElement(chairList[2].id + " " + chairList[2].getType());
        lm.addElement(tableList[0].id + " " + tableList[0].getType());
        js = new JList(lm);
        add(js);
        b1.addActionListener(this);
        add(b1);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        System.out.println(js.getSelectedValue());
    }
}