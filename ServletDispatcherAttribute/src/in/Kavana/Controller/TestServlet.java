package in.Kavana.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/test")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Control in Servlet1");
		request.setAttribute("HTML", "CSS");
		request.setAttribute("Java", "Spring");
		request.setAttribute("Python", "Django");
		
		RequestDispatcher reqDisp=request.getRequestDispatcher("/TestServlet2");
		reqDisp.forward(request, response);
	}

}
