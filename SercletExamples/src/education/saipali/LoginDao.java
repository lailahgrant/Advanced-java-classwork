package education.saipali;

import java.sql.*;
import education.saipali.*;

public class LoginDao {
	public static boolean validate(LoginBean bean) {
		boolean status=false;
		try {
			Connection con = ConnectionProvider.getCon();
			
			PreparedStatement ps = con.prepareStatement("select email,password from members where email=? and password=?");
			ps.setString(1, bean.getEmail());
			ps.setString(2, bean.getPassword());
			
			ResultSet rs = ps.executeQuery();
			status = rs.next();
			
		}catch(Exception e) {	}
		return status;
	}
}
