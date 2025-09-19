/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enrollmentSystem;

import io.github.cdimascio.dotenv.Dotenv;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

//UserLogins class to manage user login information.
public class UserLogins {
    private static final Dotenv dotenv = Dotenv.load();
    
    // Method to establish connection for student login
    public static Connection stud(){
        try {
            String url = String.format(
                "jdbc:sqlserver://%s:%s;instance=%s;databaseName=%s;encrypt=true;trustServerCertificate=true",
                dotenv.get("DB_HOST"),
                dotenv.get("DB_PORT"),
                dotenv.get("DB_INSTANCE"),
                dotenv.get("DB_NAME")
            );

            return DriverManager.getConnection(
                url,
                dotenv.get("DB_USER_STUDENT"),
                dotenv.get("DB_PASS_STUDENT")
            );
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    // Return null if connection fails
    return null;
    }
    // Method to establish connection for staff login
    public static Connection staff(){
        try {
            String url = String.format(
                "jdbc:sqlserver://%s:%s;instance=%s;databaseName=%s;encrypt=true;trustServerCertificate=true",
                dotenv.get("DB_HOST"),
                dotenv.get("DB_PORT"),
                dotenv.get("DB_INSTANCE"),
                dotenv.get("DB_NAME")
            );

            return DriverManager.getConnection(
                url,
                dotenv.get("DB_USER_STAFF"),
                dotenv.get("DB_PASS_STAFF")
            );
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    // Method to establish connection for admin login
    public static Connection admin(){
    try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

        String url = String.format(
            "jdbc:sqlserver://%s:%s;instanceName=%s;databaseName=%s;encrypt=true;trustServerCertificate=true",
            dotenv.get("DB_HOST"),
            dotenv.get("DB_PORT"),
            dotenv.get("DB_INSTANCE"),
            dotenv.get("DB_NAME")
        );

        return DriverManager.getConnection(
            url,
            dotenv.get("DB_USER_ADMIN"),
            dotenv.get("DB_PASS_ADMIN")
        );
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, e);
        return null;
    }
    }
    
    public static void main(String[] args) {
        //User Logins for Microsoft SQL Connection
        
    }
}
}