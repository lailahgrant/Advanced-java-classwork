package education.saipali;
import static education.saipali.Provider.*; //Provider interface This interface contains four constants that may differ from database to database.
import java.sql.*;

public class ConnectionProvider {
	private static Connection con =null;
	static {
		try {
			Class.forName(DRIVER);
			con=DriverManager.getConnection(CONNECTION_URL,USERNAME,PASSWORD);
		}catch(Exception e) {	}
	}
	public static Connection getCon() {
		return con;
	}
}
