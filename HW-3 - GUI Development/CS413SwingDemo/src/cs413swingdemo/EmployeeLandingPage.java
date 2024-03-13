
package cs413swingdemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import cs413swingdemo.UserLogin;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/*
 * @author karunmehta
 */
public class EmployeeLandingPage extends javax.swing.JFrame implements ActionListener {
    
    EmployeeLandingPage() {
        
        //Create the basic frame
        
        //this.initComponents();
        //Set main display paramaeters for pane
        getContentPane().setBackground(Color.GRAY);
        setLayout(null);
        setResizable(true);
        //getContentPane().setSize(400, 400);
        setTitle("Employee Management");
        //setPreferredSize(new Dimension(1200, 800));
        
        //Define the window label
        JLabel windowHeading = new JLabel("Employee Managment System");
        windowHeading.setBounds(80, 50, 1200, 60);
        windowHeading.setFont(new Font("Calibri", Font.PLAIN, 60));
        windowHeading.setForeground(Color.LIGHT_GRAY);
        add(windowHeading);
        
        //create icon you want on the frame
        ImageIcon iIcon = new ImageIcon(ClassLoader.getSystemResource("icons/SplashImage.jpg"));
        Image anImage = iIcon.getImage().getScaledInstance(1100, 700, Image.SCALE_DEFAULT);
        ImageIcon iIcon2 = new ImageIcon(anImage);
        JLabel theLabel = new JLabel(iIcon2);
        theLabel.setBounds(50, 130, 1000,600);
        add(theLabel); 
        
        //add a new button to get to login pane
        JButton openAppButton = new javax.swing.JButton("Start Application");
        openAppButton.setBounds(400, 550, 200, 50);
        openAppButton.addActionListener(this);
        theLabel.add(openAppButton);

        
        setSize(1200, 800);
        setLocation(100, 100);        
        setVisible(true);

    }
    
    public static void main(String[] args) {
        
        new EmployeeLandingPage();
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        //Action that will be invoked when button on the frame is clicked
        setVisible(false);
        UserLogin userLogin = new UserLogin();
        
    }
    
}
