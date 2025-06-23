package com.dbms.mysql_gradle_pro1;

import java.sql.*;
import java.util.Arrays;
import java.util.List;

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

	public static List<Employee> getEmployee() {

		return Arrays.asList(new Employee(1, "Sagar", "IT", 55000), new Employee(2, "Ramesh", "IT", 60000),
				new Employee(3, "Ganesh", "Finanace", 40000), new Employee(4, "Amol", "Support", 50000),
				new Employee(5, "Omkar", "Support", 80000));
	}

}
