package it.objectmethod.calcolatrice.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Moltiplicazione extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet (HttpServletRequest request, HttpServletResponse response) 
	        throws ServletException, IOException{
		double primoNum = Double.parseDouble(request.getParameter("num_uno"));
		double secondoNum = Double.parseDouble(request.getParameter("num_due"));
		
		request.setAttribute("result", (primoNum*secondoNum));
		request.getRequestDispatcher("htmlCalcolatrice.jsp").forward(request, response);
		
	}

}

