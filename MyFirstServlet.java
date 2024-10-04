package com.first.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyFirstServlet")
public class MyFirstServlet extends HttpServlet {

	@Override
	protected void service(final HttpServletRequest request, final HttpServletResponse response)
			throws ServletException, IOException {

		String name = "suhas";
		
		request.setAttribute("name", name);
		
		RequestDispatcher requestDispacther = request.getRequestDispatcher("MyFirst.jsp");
		
		requestDispacther.forward(request, response);
		
	}	

}
