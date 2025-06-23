package com.dbms.mysql_gradle_pro1;

import java.sql.*;

public class App2 {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// insertion();

		// read the data
		// read();

		// update

		update();
		
		//delete 
		
		//delete();

	}
	
	private static void delete() throws SQLException, ClassNotFoundException {
		System.out.println("Start the deleting the data!");
		Connection con = DatabaseConnection.getCon();
		String sql="DELETE FROM EMPLOYEE WHERE EMP_ID=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, 3);
		
		int count = ps.executeUpdate();

		if (count > 0) {
			System.out.println("Data deleted successfully!");
		} else {
			System.out.println("Data deleted Un-successfully!");
		}
		ps.close();
	}

	private static void update() throws SQLException, ClassNotFoundException {
		System.out.println("Start the updating the data!");
		Connection con = DatabaseConnection.getCon();
		String sql = "UPDATE EMP SET ADDRESS=? WHERE EMP_ID=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, "Mumbai");
		ps.setInt(2, 2);

		int count = ps.executeUpdate();

		if (count > 0) {
			System.out.println("Data updated successfully!");
		} else {
			System.out.println("Data updated Un-successfully!");
		}

		ps.close();

	}

	private static void read() throws SQLException, ClassNotFoundException {

		System.out.println("Start the reading the data!");
		Connection con = DatabaseConnection.getCon();

		// String sql="SELECT * FROM EMPLOYEE WHERE EMP_ID=?";
		String sql = "SELECT * FROM EMPLOYEE";
		PreparedStatement ps = con.prepareStatement(sql);
		// ps.setInt(1, 4);

		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			System.out.println("EMP ID:" + rs.getInt(1));
			System.out.println("EMP FirstName:" + rs.getString(2));
			System.out.println("EMP LastName:" + rs.getString(3));
			System.out.println("EMP Email:" + rs.getString(4));
			System.out.println("EMP Mobile:" + rs.getString(5));
			System.out.println("EMP Address:" + rs.getString(6));
			System.out.println("....................................................");
		}
		ps.close();
	}

	private static void insertion() {
		try {

			// crtical code

			Connection con = DatabaseConnection.getCon();

			// Create Statement for insertion
			String query = "INSERT INTO EMPLOYEE VALUES(?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, 4);
			ps.setString(2, "Amol");
			ps.setString(3, "J");
			ps.setString(4, "a@gmail.com");
			ps.setString(5, "989047167");
			ps.setString(6, "Pune");

			int count = ps.executeUpdate();

			if (count > 0) {
				System.out.println("Data added successfully!");
			} else {
				System.out.println("Data added Un-successfully!");
			}

			ps.close();

		} catch (Exception e) {

			// cought exception
			e.printStackTrace();
		}
	}
}