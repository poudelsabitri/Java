package com.first.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.first.util.DbConnectionUtil;

public class StudentServlet extends HttpServlet {

	@Override
	protected void service(final HttpServletRequest request, final HttpServletResponse response)
			throws ServletException, IOException {

		try {
			Connection con =DbConnectionUtil.getConnection();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}	
	
}
