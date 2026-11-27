package util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
private static final String URL="jdbc:oracle:thin:@localhost:1521:orcl";
private static final String USERNAME="EDUMANAGE";
private static final String PASSWORD="EDU123";
public static Connection getConnection() throws SQLException{
	Connection con=DriverManager.getConnection(URL,USERNAME,PASSWORD);
	return con;
}

}
