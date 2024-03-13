/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs413swingdemo;

import java.sql.SQLException;
import java.util.HashMap;

/**
 *
 * @author karunmehta
 */
public class EmployeeDTO {
    
    private int id;
    private String username;
    private String email;
    private String phone;
   
    static EmployeeDAOConcrete ed = new EmployeeDAOConcrete();

    public EmployeeDTO() {
        

    }

    public EmployeeDTO(int empID, String username, String email) {

        this.username = username;
        this.email = email;
        id = empID;
    }

    public EmployeeDTO(String username, String email, String ph) {
        
        this.username = username;
        this.email = email;
        this.phone = ph;
    }    
    
    // Getter and Setter methods
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }    
    
    public String getPhone() {
        return phone;
    }

    public void setPhone(String ph) {
        this.phone = ph;
    }
    
    public int getID() {
        
        return id;
    }

    public void setID(int anID) {
        this.id = anID;
    }  
    
    public static Employee employeeByID(int anId) {
        
        Employee anEmployee = null;
        
        try {
            anEmployee = ed.get(anId);
        } catch(SQLException se) {
            System.out.println(se.getMessage());
        }
        if(anEmployee != null) System.out.println(anEmployee.toString()); 
            
        System.out.println("\nFetched Employee with ID: " + anId + " Employee Details:\n" + anEmployee.toString());        
        return anEmployee;
        
    }
    
    public static int performUpdate(Employee anEmployee) {

        int updateResult = -1;
        
        try {
            updateResult = ed.update(anEmployee);
        } catch(SQLException se) {
            System.out.println(se.getMessage());
        }
        
        if(updateResult != -1) System.out.println("\nUpdate Successful");
         System.out.println("Employee Details:\n" + anEmployee.toString());
        return updateResult;        
    }
    
    public static HashMap validateUser(String id) {
        
        return ed.validateLogin(id);
        
    }

    public static int performCreate(Employee anEmployee) {

        int updateResult = -1;
        
        
        
        try {
            updateResult = ed.save(anEmployee);
        } catch(SQLException se) {
            System.out.println(se.getMessage());
        }
        
        if(updateResult != -1) System.out.println("\nEmployee Create Successful");
         System.out.println("Employee Details:\n" + anEmployee.toString());
        return updateResult;        
    }    
    
}
