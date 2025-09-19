/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enrollmentSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

//UserLogins class to manage user login information.
public class UserLogins {
    
    // Method to establish connection for student login
    public static Connection stud(){
        try{
            // Load the SQL Server JDBC driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // Establish connection using student credentials
            Connection studConnect = DriverManager.getConnection("jdbc:sqlserver://192.168.1.3:1433;=instance=SQLEXPRESS:1433;databaseName=EnrollmentSystem;encrypt=true;trustServerCertificate=true","Student","12345");
            // Return the connection object
            return studConnect;
        // Display error message if connection fails    
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, e);
        }
    // Return null if connection fails
    return null;
    }
    // Method to establish connection for staff login
    public static Connection staff(){
      try{
            // Load the SQL Server JDBC driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             // Establish connection using staff credentials
            Connection studConnect = DriverManager.getConnection("jdbc:sqlserver://192.168.1.3:1433;instance=SQLEXPRESS:1433;databaseName=EnrollmentSystem;encrypt=true;trustServerCertificate=true","Staff","12345");
            // Return the connection object
            return studConnect;
        // Display error message if connection fails    
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    // Return null if connection fails
    return null;  
    }
    // Method to establish connection for admin login
    public static Connection admin(){
        try{
            // Load the SQL Server JDBC driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // Establish connection using admin credentials
            Connection adminConnect = DriverManager.getConnection("jdbc:sqlserver://192.168.1.3:1433;instance=SQLEXPRESS:1433;databaseName=EnrollmentSystemjdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=EnrollmentSystem;encrypt=true;trustServerCertificate=true","admin","12345");
            // Return the connection object
            return adminConnect;
        // Display error message if connection fails
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    // Return null if connection fails
    return null;
    }
    
    public static void main(String[] args) {
        //User Logins for Microsoft SQL Connection
        
    }
}
