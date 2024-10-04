package com.first.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/calculation")
public class CalculationServlet extends HttpServlet {

	
	
	@Override
	protected void	doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//param1
		//param2
		//param3
		
		String param1 = req.getParameter("param1");
		
		int num1 = Integer.parseInt(param1);  //string to integer conversion
		
		
		String param2 = req.getParameter("param2");
		
		int num2 = Integer.parseInt(param2);  //string to integer conversion
		
		String param3 = req.getParameter("param3"); //action //multiple, diveide , add 
		
		int result = calculation(num1,num2,param3);
		
		req.setAttribute("result", result);
		req.setAttribute("param1", num1);
		req.setAttribute("param2", num2);
		
		req.getRequestDispatcher("calculation.jsp").forward(req, resp);

		
	}
	
	public int calculation(int n1, int n2, String action) {
		
		int result = 0;
		
		if(action.equals("multiply")) {
			result = n1*n2;
		} else if(action.equals("add")) {
			result = n1+n2;
		}else if(action.equals("substract")) {
			result = n1-n2;
		}
		else if(action.equals("divide")) {
			result = n1/n2;
		}
		
		return result;
		
	}
	
	
}
