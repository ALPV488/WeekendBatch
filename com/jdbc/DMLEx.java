package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DMLEx {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		(1)Loading driver classes
		Class.forName("oracle.jdbc.driver.OracleDriver");
//		(2)Create the Connection
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","weekend","weekend");
//		(3)Create the statement
		Statement stmt = conn.createStatement();
//		(4)Excute the 	Query	:-DML
	
//		stmt.executeUpdate("insert into Product values(12,'apple','mobile',1000)");
		
		stmt.addBatch("insert into Product values(13,'nokia','mobile',1056)");
		stmt.addBatch("insert into Product values(14,'sams','tv',167)");
		stmt.addBatch("insert into Product values(15,'lg','washing',1675)");
		stmt.addBatch("insert into Product values(16,'daikin','ac',1333)");
		
		stmt.executeBatch();
		
//		(5)Close the connections.
		
		conn.close();
		
		System.out.println("Data is inserted into the table...");
	}

}
