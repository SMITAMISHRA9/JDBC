package co.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateJdbc {
	private static final String ADD_DATA_ = "INSERT INTO Employee VALUES ((89, 'navya', 51000),+(88,'kishore',52000),+(87,'deba',53000);)";
	
	public static void main(String[] args) {
		 try (Connection connection = DriverManager
		            .getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "googlemap");

		            Statement statement = connection.createStatement();){
		            int result = statement.executeUpdate(UpdateJdbc.ADD_DATA_);
		            System.out.println("No. of records affected : " + result);
		        } catch (SQLException e) {


		        	System.err.println("SQLState: " + e.getSQLState());
	                System.err.println("Error Code: " + e.getErrorCode());
	                System.err.println("Message: " + e.getMessage());
		    
		        }

	}

}
