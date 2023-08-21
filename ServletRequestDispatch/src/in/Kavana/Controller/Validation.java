package in.Kavana.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Validation
 */
@WebServlet("/valid")
public class Validation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Control in Sevlet1");
		String userName=request.getParameter("userName");
		String userPassword=request.getParameter("userPassword");
		System.out.println(userName +" "+userPassword);
		if(userName.equals("kavana") && userPassword.equals("kavu")) {
			RequestDispatcher reqDisp=request.getRequestDispatcher("/home.jsp");
			reqDisp.forward(request, response);
		}
		else {
			ServletContext servContext=request.getServletContext();
			RequestDispatcher reqDisp=servContext.getRequestDispatcher("/error.jsp");
			reqDisp.forward(request, response);
		}
	}

}
