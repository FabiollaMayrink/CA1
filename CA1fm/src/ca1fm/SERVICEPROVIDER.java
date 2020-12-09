/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca1fm;


/**
 *
 * @author Fabiolla/Farley
 */
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.BorderFactory;

import javax.swing.JButton; 
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
/**
 *
 * @author farleyreis
 */
public class SERVICEPROVIDER extends JFrame implements ActionListener {
    
    JPanel panel;
    JLabel user_label, password_label, jobService, location, password_label2, message, email, phoneNumber;
    JTextField userName_text, emailText, phoneNumberText;
    JPasswordField password_text, password_text2;
    JButton submit, cancel;
    JButton newUser;
    private ActionListener eventHandler;
     
    public SERVICEPROVIDER()
    {//Full name

        user_label = new JLabel();
        user_label.setText("Full Name:");
        userName_text = new JTextField();

        // email
        email = new JLabel();
        email.setText("Email :");
        emailText = new JTextField();
        
        // Job service
        jobService = new JLabel();
        jobService.setText("Job Service:");
        //box with the options

        //phone Number
        phoneNumber = new JLabel();
        phoneNumber.setText("Phone Number :");
        phoneNumberText = new JTextField();
        
        //Location
        location = new JLabel();
        location.setText("Location:");
        //box with options

        password_label = new JLabel();
        password_label.setText("Password :");
        password_text = new JPasswordField();

        password_label2 = new JLabel();
        password_label2.setText("Confirm Password :");
        password_text2 = new JPasswordField();

        // Submit
        submit = new JButton("SUBMIT");
        //newUser = new JButton("NEW USER");

        submit.addActionListener(eventHandler);
        //newUser.addActionListener(eventHandler);

        // Submit

        submit = new JButton("SUBMIT");
        //newUser = new JButton("NEW USER");
        
        submit.addActionListener(eventHandler);
        //newUser.addActionListener(eventHandler);

        panel = new JPanel(new GridLayout(10, 10));
        

        panel.add(user_label);
        panel.add(userName_text);
        panel.add(email);
        panel.add(emailText);
        panel.add(phoneNumber);
        panel.add(phoneNumberText);
        panel.add(password_label);
        panel.add(password_text);
        panel.add(password_label2);
        panel.add(password_text2);

        message = new JLabel();
        panel.add(message);
        panel.add(submit);
        //panel.add(newUser);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Adding the listeners to components..
        submit.addActionListener(this);
        add(panel, BorderLayout.CENTER);
        setTitle("Please Login Here !");
        setSize(500, 400);
        setVisible(true);
        
        
        panel.setBorder(BorderFactory.createTitledBorder("SOS Beauty - Service Provider login"));

    }

   
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    }
    

