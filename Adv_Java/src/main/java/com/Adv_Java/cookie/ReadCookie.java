package com.Adv_Java.cookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class ReadCookie extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		Cookie[] cookies= request.getCookies();
		
		for(int i=0;i<cookies.length;i++)
		{
			String name = cookies[i].getName();
			String value = cookies[i].getValue();
			writer.println("<h3>Name: "+name+"</h3>");
			writer.println("<h3>Value: "+value+"</h3>");
		}
		
	}


}
