package com.org.web2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletRequest_Response
 */
@WebServlet("/ServletRequest_Response")
public class ServletRequest_Response extends HttpServlet {

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		try {
			String user = request.getParameter("user");
			out.println("<h2> Welcome "+user +"</h2>");
			
		}finally {
			out.close();
		}

	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String name = request.getParameter("val1");
		String password = request.getParameter("val2");
		PrintWriter out = response.getWriter();
		try {
			
			out.println("Welcome "+name+"!");
			out.println("Username "+name);
			out.println("Password "+password);
			
		}finally {
			out.close();
		}

	}
}
