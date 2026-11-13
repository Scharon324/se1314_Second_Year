import javax.swing.*;
import java.awt.*;

import java.awt.event.*;
public class InfoPanel extends JPanel implements
ActionListener
{
    JList studentList;
    DefaultListModel listModel = new DefaultListModel();

    JScrollPane scrollPane = new JScrollPane();

    JList selectedList;
    DefaultListModel selectedModel = new DefaultListModel();

    JScrollPane selectedScrollPane = new JScrollPane();

    JButton acceptButton = new JButton("Select Product's");
    public InfoPanel(){
        setSize(500,500);
        setLayout(null);
        listModel.addElement("Andres");
        listModel.addElement("Marko");
        listModel.addElement("Asko");
        listModel.addElement("Ahto");
        listModel.addElement("Tunndmatu");
        listModel.addElement("Nancy");
        listModel.addElement("Ergo");
        listModel.addElement("kivikangur");
        studentList = new JList(listModel);
        
        scrollPane.setViewportView(studentList);
        scrollPane.setSize(100,100);
        scrollPane.setLocation(50,50);
        add(scrollPane);
        
        acceptButton.setSize(95,40);
        acceptButton.setLocation(50,150);
        acceptButton.addActionListener(this);
        add(acceptButton);
        
        selectedList = new JList(selectedModel);
        selectedScrollPane.setSize(100,100);
        selectedScrollPane.setLocation(200,50);
        selectedScrollPane.setViewportView(selectedList);
        add(selectedScrollPane);
        
        setVisible(true);
        setBackground(Color.cyan);
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == acceptButton){
            String sel = studentList.getSelectedValue().toString();
            selectedModel.addElement(sel);
        }
    }
}

