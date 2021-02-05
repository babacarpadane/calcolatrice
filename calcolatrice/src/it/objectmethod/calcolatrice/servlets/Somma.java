package it.objectmethod.calcolatrice.servlets;

import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Somma extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());

		double primoNum = Double.parseDouble(request.getParameter("num_uno"));
		double secondoNum = Double.parseDouble(request.getParameter("num_due"));

		//PrintWriter out = response.getWriter();
		//out.write("<html><body>Risultato: " + somma + "</body></html>");
		request.setAttribute("result", (primoNum + secondoNum));
		request.getRequestDispatcher("htmlCalcolatrice.jsp").forward(request, response);

		/**
		 * CREIAMO LA SERVLET CON SOLO IL METODO DOGET protected void
		 * doPost(HttpServletRequest request, HttpServletResponse response) throws
		 * ServletException, IOException { // TODO Auto-generated method stub
		 * doGet(request, response); }
		 */

	}
}
