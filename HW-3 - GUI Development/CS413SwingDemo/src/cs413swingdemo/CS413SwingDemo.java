/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cs413swingdemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CS413SwingDemo extends JFrame {
    
    private JTextField empID, empName, empPhone, empEmail;

    public CS413SwingDemo() {
        setTitle("Employee Create Form");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(10, 2));

        JLabel empNameLabel = new JLabel("Employee Name:");
        empName = new JTextField();
        JLabel empEmailLabel = new JLabel("Employee Email:");
        empEmail = new JTextField();
        JLabel empPhoneLabel = new JLabel("Employee Phone:");
        empPhone = new JTextField();
        JLabel empIDLabel = new JLabel("Employee ID:");
        empID = new JTextField();        

        panel.add(empIDLabel);
        panel.add(empID);
        panel.add(empNameLabel);
        panel.add(empName);
        panel.add(empEmailLabel);
        panel.add(empEmail);
        panel.add(empPhoneLabel);
        panel.add(empPhone);

        JButton submitButton = new JButton("Submit");

        //Using Lambda fundtion for the ActionEvent. This creates a new employee based on the 
        // data provided in the textfields of the panel 
        submitButton.addActionListener((ActionEvent e) -> {
            int id = Integer.parseInt(empID.getText());
            String name = empName.getText();
            String ph = empPhone.getText();
            String em = empEmail.getText();
            
            // Create an Employee object
            
            Employee anEmployee = new Employee(id, name, em, ph);
            // Print or do something with the BankAccount object
            System.out.println("Details of the Employee: " + anEmployee);
        });
        panel.add(submitButton);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        
        createDemoEmployeeObjects();
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CS413SwingDemo();
            }
        });
    }
    
    private static void createDemoEmployeeObjects() {
        
    }
    
    public void createDempEmployeeObjects() {
        
        Employee emp1 = new Employee(44, "John Doe", "johndoe@sfsu.edu", "615.555.1212");
        Employee emp2 = new Employee(71,"Jane Deo", "janedoe@sfsu.edu","615.555.1212");
        Employee emp3 = new Employee(88,"Sam Doe", "johndoe@sfsu.edu", "615.555.1212");
        Employee emp4 = new Employee(22,"April Doe", "janedoe@sfsu.edu", "615.555.1212");
        
    }
}

