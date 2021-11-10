package education.saipali;

import java.io.IOException;
import java.sql.*;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	
	public static final  String JDBC_DRIVER="com.mysql.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/saipali?useSSL=false";
	public static final String USER="root";
	public static final String PASSWORD="";
	
	Connection con = null;
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		//out.println("me");
		
		String u = request.getParameter("user");
		String p = request.getParameter("pass");
		
		try {
			//register driver
			Class.forName(JDBC_DRIVER);
			//create connection
			con = DriverManager.getConnection(DB_URL,USER,PASSWORD);
			//prepared statements
			PreparedStatement ps = con.prepareStatement("select * from regist where name=? and pass=?");
			ps.setString(1, u);
			ps.setString(2,	p);
			
			ResultSet rs =ps.executeQuery();
			
		//	u=rs.getString(1); p=rs.getString(2);
			
			//String errorMessage  = "";
			if(rs.isBeforeFirst()) {
				out.println("user allowed");
			}  else{
				out.println("invalid username or password");
			}
		
			//while(rs.next()) {
				
				//if(rs.getString("username") == "" && rs.getString("password") == "") {
					//out.println("invalid username"+u+" or password");
					//errorMessage = "invalid username or password";
					//out.println("Congratulations,, you just logged in..");
				//}
				//else if(rs.getString("username") != "" && rs.getString("password") != "") {
					//out.println("Congratulations,,"+u+" you just logged in..");
			//	}
				//else {
					
					//out.println("invalid username or password");
					//errorMessage = "invalid username or password";
				//}
				//out.println(errorMessage);
				
			//}
			/*if(j>0) {
				
			}else {
				out.print("user doesnt exit.. Cant log in");
			}*/
			
		}catch(Exception ex) {
			System.out.println(ex);
			out.close();
		}
	}

}
