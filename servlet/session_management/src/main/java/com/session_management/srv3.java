package com.session_management;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class srv3
 */
public class srv3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public srv3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String city = request.getParameter("city");
		String contact = request.getParameter("contact");
		PrintWriter out = response.getWriter();
		
		HttpSession session=request.getSession(false);  
        session.setAttribute("sehar",city);
        session.setAttribute("num",contact);
        String n1 = (String)session.getAttribute("firstname");
		String n2 = (String)session.getAttribute("lastname");
		String n3 = (String)session.getAttribute("eemail");
		Integer n4 = (Integer)session.getAttribute("umar");
		
		
		out.println("<b>First Name: </b><br>" + n1);
		out.println("<b>Last Name: </b><br>" + n2);
		out.println("<b>Email: </b><br>" + n3);
		out.println("<b>Age: </b><br>" + n4);
		out.println("<b>City: </b><br>" + city);
		out.println("<b>Contact: </b><br>" + contact);
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
