package model1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ExampleDAO {
	
	@Autowired
	private DataSource dataSource;
	
	public String selectNow() {
		String currentTime = "Not defined";
		try (Connection connection = dataSource.getConnection();
			 Statement stmt = connection.createStatement();
			 ResultSet rs = stmt.executeQuery("SELECT CURRENT_TIMESTAMP")) {
			if (rs.next()) {
				currentTime = rs.getString(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println( "selectNow() : " + currentTime);
		return currentTime;
	}
	
}
