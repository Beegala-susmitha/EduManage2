package controller;
import java.sql.Connection;
import util.DBConnection;

public class ConnectionTest {

	public ConnectionTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            Connection con = DBConnection.getConnection();

            if (con != null) {
                System.out.println("Database Connected Successfully!");
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

	}

}
