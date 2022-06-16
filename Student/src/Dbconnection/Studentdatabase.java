package Dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Studentdatabase {
	public static void main(String args[]) {
		String str = "jdbc:postgresql://localhost:5432/Demo_db";
		String username = "postgres";
		String pass = "password";
		try {
			Connection con = DriverManager.getConnection(str, username, pass);
			System.out.println("Connected to PostgreSQL Server");
			String sql = "insert into student (stud_id,stud_name,department,phonenumber)"
					+ "values ('10','Rajesh','EEE','9876765456')";
			Statement statement = con.createStatement();
			int rows = statement.executeUpdate(sql);
			if (rows > 0) {
				System.out.println("A new student details has been inserted ");
				System.out.println("A new student inserted");
				
			}
			con.close();
		} catch (SQLException e) {
			System.out.println("Error in connecting database");
			e.printStackTrace();
		}

	}

}
