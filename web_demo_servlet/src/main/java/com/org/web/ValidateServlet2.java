package com.org.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ValidateServlet2")
public class ValidateServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
    
		response.setContentType("text/html");  
        PrintWriter out = response.getWriter();
        
          
        HttpSession session=request.getSession(false);  
        String n=(String)session.getAttribute("userName");  
        out.print("Hello "+n);  
  
        out.close();  
	}


}
