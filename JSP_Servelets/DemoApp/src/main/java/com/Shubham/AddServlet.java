package com.Shubham;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/add")
public class AddServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i+j;
		
		Cookie cookie = new Cookie("k", k + "");
		res.addCookie(cookie);
//		
//		HttpSession session = req.getSession();
//		session.setAttribute("k", k);   		//Session Management
		res.sendRedirect("sq");
//		res.sendRedirect("sq?k="+k);		//URL Reformatting
		
//		req.setAttribute("k", k);
//
////		res.getWriter().println("Added value : " + k);
//		
//		RequestDispatcher rd = req.getRequestDispatcher("sq");		//Request Dispatcher
//		rd.forward(req, res);
	}
}
