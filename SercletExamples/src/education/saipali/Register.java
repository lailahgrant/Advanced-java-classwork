package education.saipali;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")

public class Register extends HttpServlet {
	//make default database connections
	 public static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
		public static final String DB_URL = "jdbc:mysql://localhost:3306/saipali?useSSL=false";
		public static final String USER="root";
		public static final String PASSWORD="";
		
		Connection con = null;
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
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
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String n = request.getParameter("userName");
		String p = request.getParameter("userPass");
		String e = request.getParameter("userEmail");
		String c = request.getParameter("userCountry");
		
		try {
			//register the driver
			Class.forName(JDBC_DRIVER);
			//pass /create the connections
			con = DriverManager.getConnection(DB_URL,USER,PASSWORD);
			//prepared statements
			
		if(p !="" && n!="" && e!="" && c!="") {
			String sql= "insert into regist(name,pass,email,country) values(?,?,?,?)";
			String sql2 = "SELECT name FROM regist WHERE name =? ";					
			PreparedStatement pss = 	con.prepareStatement(sql2);
			pss.setString(1, n);
			ResultSet rs = pss.executeQuery();
			//while(rs.next()) {
				//if(rs.getString("name") != "") {
					//out.println("Username "+n+" already exists");
				//}else {
					
				//}
			//}
			if(rs.isBeforeFirst()) {
				out.println("user "+n+" already exist ");
			}else {
				out.println("user "+n+"  allowed");
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, n);  ps.setString(2, p);  ps.setString(3, e);  ps.setString(4, c);
						
				
				//execute the statement
				int i = ps.executeUpdate();
				if(i>0)
					out.print("You are successfully registered...............");
				//redirect after 2 seconds
				response.setHeader("Refresh", "2; URL=http://localhost:8080/SercletExamples/login.html");

				/*
				//refresh page after 5 seconds
				String go = new String("login.html");
				
				response.setStatus(response.SC_MOVED_TEMPORARILY);
				response.setHeader("Location", go);
				*/
			}
		}else {
			out.println("please fill all the fields");
		}
			
			
		}catch(Exception ex) {
			System.out.println(ex);
			
			out.close();
		}
		
		//doGet(request, response);
	}

}
