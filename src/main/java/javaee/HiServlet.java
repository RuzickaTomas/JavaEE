package javaee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HiServlet
 */
@WebServlet( name="HiServlet", urlPatterns="/HiServlet")
public class HiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Výpis ze serveru");
		PrintWriter pw = response.getWriter();
		response.getWriter().append("Served at: ").append(request.getContextPath());
		pw.println("<h1>Hello World from HiServlet!</h1>");
	}

}
