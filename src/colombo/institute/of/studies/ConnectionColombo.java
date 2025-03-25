/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colombo.institute.of.studies;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ASUS Vivobook
 */
public class ConnectionColombo {
    public static Connection getConnection() {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =   (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hrms", "root", "");
            return con;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        Connection connection = getConnection();
        if (connection != null) {
            System.out.println("Done!");
        } else {
            System.out.println("Error.");
        }
    }

    static Connection connection() {
        throw new UnsupportedOperationException("Error."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
    

