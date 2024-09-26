package com.Adv_Java.cookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CreateCookie extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter(); 
		
		Cookie ck1 = new Cookie("OS","Linus");
		ck1.setMaxAge(90);
		response.addCookie(ck1);
		writer.println("<h3>Cookie has been created<h3>");
		
		Cookie ck2 = new Cookie("browser","chrome");
		ck2.setMaxAge(90);
		response.addCookie(ck2);
		
		writer.println("<h3>Cookie has been created<h3>");
		
		
	}

	
}
