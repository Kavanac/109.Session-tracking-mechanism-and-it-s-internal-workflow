package in.Kavana.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer=response.getWriter();
		writer.println("<h1>Servlet1 response </h1>");
		
		RequestDispatcher resDisp=request.getRequestDispatcher("/TestServlet2");
		resDisp.include(request, response);
		System.out.println("Dispatch is success");
		writer.println("<h1>Servlet1 response again </h1>");
	}

}
