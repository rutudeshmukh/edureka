package web_demo_servlet2;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet1
 */
@WebServlet("/MyServlet1")
public class MyServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
//     */
//    public MyServlet1() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("test/html");
		PrintWriter out = response.getWriter();
		
		String n = request.getParameter("val1");
		String u = request.getParameter("val2");
		String p = request.getParameter("val3");
		
		if(p.equals("abc")) {
			RequestDispatcher rd = request.getRequestDispatcher("display1");
			rd.forward(request, response);
		}else {
			out.print("Incorrect userId or Password");
			RequestDispatcher rd= request.getRequestDispatcher("/info.html");
			rd.include(request,response);
		}
	}

}
