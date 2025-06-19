package com.dbms.mysql_gradle_pro1;

import java.lang.Thread.State;
import java.sql.*;
import java.util.*;

@SuppressWarnings("unused")
public class App
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        try {
            insertionSQL();
        } catch (Exception e) {
            System.out.println("Connection failed");
            e.printStackTrace();
        }
    }

    private static void insertionSQL() throws ClassNotFoundException, SQLException {
        Connection con = DatabaseConnection.getCon();

        String insertsql = "INSERT INTO emp VALUES(?,?,?,?,?,?)";

        PreparedStatement stmt = con.prepareStatement(insertsql);

        System.out.print("Enter empid = ");
        int empid = sc.nextInt();
        stmt.setInt(1,empid);

        System.out.print("Enter firstname = ");
        String fname = sc.next();
        stmt.setString(2,fname);

        System.out.print("Enter lastname = ");
        String lname = sc.next();
        stmt.setString(3,lname);

        System.out.print("Enter email = ");
        String email = sc.next();
        stmt.setString(4,email);

        System.out.print("Enter phone = ");
        String phone = sc.next();
        stmt.setString(5,phone);

        System.out.print("Enter city = ");
        String city = sc.next();
        stmt.setString(6,city);
        
        int c=stmt.executeUpdate();
        if(c > 0) {
            System.out.println("Record inserted successfully");
        } else {
            System.out.println("Record insertion failed");
        }
        stmt.close();
        con.close();
    }

    
}
