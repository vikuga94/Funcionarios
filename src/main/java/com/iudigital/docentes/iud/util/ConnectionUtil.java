package com.iudigital.docentes.iud.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Victor Guzman Castañeda
 */
public class ConnectionUtil {
    private static final String URL = "jdbc:mysql://localhost:3306/docentesiud";
    private static final String USER = "root";
    private static final String PASSWORD = "123456";
    
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
