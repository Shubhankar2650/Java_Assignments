package LibraryManagementSystem;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Regiser
 */
@WebServlet("/Regiser")
public class Regiser extends HttpServlet {
	private boolean validateInput(String name, String email, String password) {
	    if (name == null || name.trim().isEmpty()) {
	        return false;
	    }

	    if (email == null || email.trim().isEmpty() || !email.matches("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$")) {
	        return false;
	    }

	    if (password == null || password.trim().isEmpty()) {
	        return false;
	    }

	    return true;
	}

	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Regiser() {
        super();
        // TODO Auto-generated constructor stub
    }
    private void saveUser(User user) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:8800/library", "root", "password");
            statement = connection.prepareStatement("INSERT INTO users (name, email, password) VALUES (?, ?, ?)");
            statement.setString(1, user.getName());
            statement.setString(2, user.getEmail());
            statement.setString(3, user.getPassword());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String name = request.getParameter("name");
	    String email = request.getParameter("email");
	    String password = request.getParameter("password");

	    if (!validateInput(name, email, password)) {
	        response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid input");
	        return;
	    }

	    User user = new User(name, email, password);
	    saveUser(user);

	    response.setContentType("text/html");
	    response.getWriter().println("Registration successful!");
	}

}
