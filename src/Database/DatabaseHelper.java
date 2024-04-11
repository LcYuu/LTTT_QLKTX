/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author NgoQuangNghia
 */
public class DatabaseHelper {
    public static Connection getJDBCConnection() {
        String url = "jdbc:mysql://localhost:3306/quanlyktx";
        String user = "root";
        String password = "12345";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DatabaseHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null; 
    }

    public static void main(String[] args) {
        Connection conn = getJDBCConnection();
        if (conn != null) {
            System.out.println("ThanhCong");
        } else {
            System.out.println("ThatBai");
        }
    }
}
