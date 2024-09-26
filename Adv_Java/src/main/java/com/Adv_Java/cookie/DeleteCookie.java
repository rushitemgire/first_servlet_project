package com.Adv_Java.cookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class DeleteCookie extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		
		Cookie ck1 = new Cookie("browser","");
		ck1.setMaxAge(0);
		resp.addCookie(ck1);
		
		Cookie ck2 = new Cookie("OS","");
		ck2.setMaxAge(0);
		resp.addCookie(ck2);
		
		writer.println("<h3>Cookies has been deleted</h3>");
	}
}
