package com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class servlet2
 */
public class servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public servlet1() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			String Email = request.getParameter("email");
			String Password = request.getParameter("password");

			RequestDispatcher id = null;
			if (Email.equalsIgnoreCase("kshubhankar2000@gmail.com") && Password.equals("12345")) {
				out.print("<!DOCTYPE html>");
				out.print("<html>");
				out.println("<head>");
				out.println("<title>Librarian Section</title>");
				out.println("<link rel='stylesheet' href='bootstrap.min.css'/>");
				out.println("</head>");
				out.println("<body>");

				HttpSession session = request.getSession();
				session.setAttribute("email", id);
//				id = request.getRequestDispatcher("servlet3");
				request.getRequestDispatcher("navadmin.html").include(request, response);
				request.getRequestDispatcher("admincarousel.html").include(request, response);
				request.getRequestDispatcher("footer.html").include(request, response);
			} else {
				out.print("<h3 style=\"color:crimson\">Sorry UserName or Password Error!  Try Again.....</h3>");
				id = request.getRequestDispatcher("index.html");
				id.include(request, response);

			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
