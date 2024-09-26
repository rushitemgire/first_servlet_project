package com.Adv_Java.servlets;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
//package com.Adv_java.servlets;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;


public class ServletOne extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		String name = req.getParameter("name");
//		String std = req.getParameter("std");
//		String city = req.getParameter("city");
//		
//		System.out.println("Name = "+name);
//		System.out.println("Standard = "+std);
//		System.out.println("City = "+city);
		
//		Enumeration<String> pN = req.getParameterNames();
//		while(pN.hasMoreElements())
//		{
//			System.out.println(pN.nextElement());
//		}
		
		String name = req.getParameter("name");
		String std = req.getParameter("std");
		String[] ct = req.getParameterValues("city");
		
		System.out.println("Name = "+name);
		System.out.println("Standard = "+std);
		for(String i :ct)
		{
			System.out.print(i+"\t");
		}
		System.out.println();
		
//		static responce from 'staticresp.html' file
//		RequestDispatcher rd = req.getRequestDispatcher("staticresp.html");
//		rd.forward(req, resp);
		
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"UTF-8\">\r\n"
				+ "<title>Insert title here</title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "	<h3>Response saved successfully"+name+"</h3>\r\n"
				+ "</body>\r\n"
				+ "</html>");
		
	}

}
