package com.dbms.mysql_gradle_pro1;

import java.sql.*;

public class DatabaseConnection 
{
    private static final String url = "jdbc:mysql://localhost:3306/myfirstdb";
    private static final String user = "root";
    private static final String pass = "admin";
    public static Connection getCon() throws ClassNotFoundException, SQLException {
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection(url, user, pass);
        return con;
    }
}
