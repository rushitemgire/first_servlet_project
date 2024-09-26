package com.Adv_Java.student;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Drive extends HttpServlet {
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet res = null;
	String url = "jdbc:mysql://localhost:3306/jdbc1"; // Database name
	String un = "root";
	String pwd = "rushitemgire";

	@Override
	public void init(ServletConfig config) throws ServletException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, un, pwd);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		
		try {
			String query2 = "select * from company";
			java.sql.Statement stmt = con.createStatement();
			ResultSet res2 = stmt.executeQuery(query2);
			
			writer.println("<h3>The drives which should be conducted in your college:</h3>");
			
			writer.println("<table border='1'>\r\n"
					+ "        <tr>\r\n"
					+ "            <th>ID</th>\r\n"
					+ "            <th>Name</th>\r\n"
					+ "            <th>Profile</th>\r\n"
					+ "            <th>Package</th>\r\n"
					+ "            <th>Skill</th>\r\n"
					+ "        </tr>");
			
			while(res2.next()==true)
			{
				int id = res2.getInt(1);
				String cname = res2.getString(2);
				String profile = res2.getString(3);
				String packag = res2.getString(4);
				String skill = res2.getString(5);
				
				writer.println("<tr>\r\n"
						+ "            <td>"+id+"</td>\r\n"
						+ "            <td>"+cname+"</td>\r\n"
						+ "            <td>"+profile+"</td>\r\n"
						+ "            <td>"+packag+"</td>\r\n"
						+ "            <td>"+skill+"</td>\r\n"
						+ "        </tr>");
			}
			writer.println("</table>");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
