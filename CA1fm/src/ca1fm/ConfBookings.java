

   package ca1fm;


/**
 *DFGV
 * @author Fabiolla/Farley
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
   
public class ConfBookings extends JFrame implements ActionListener {

    Container container = getContentPane();

    
    JButton menu = new JButton("MENU");

    ConfBookings() {
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();

    }

    public void setLayoutManager() {
        container.setLayout(null);
        
    }

    public void setLocationAndSize() {
        
        menu.setBounds(220, 300, 200, 32);

        setSize(700, 550);
    }

    public void addComponentsToContainer() {
        
        container.add(menu);
        
        menu.setForeground(Color.red);
        menu.setOpaque(true);

    }

    public void addActionEvent() {
        
        menu.addActionListener(this);
        
        menu.setForeground(Color.red);
        menu.setOpaque(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        if (e.getSource() == menu) {
           MenuSP nc = new MenuSP();
            nc.setVisible(true);
            dispose();
        }
        
        else {
        }
    }
}
    



