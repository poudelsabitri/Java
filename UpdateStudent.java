package com.first.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.first.util.DbConnectionUtil;

@WebServlet("/updateStudent")
public class UpdateStudent extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			/* on url pass ?id=2 */
//			int id = Integer.parseInt(req.getParameter("id"));
			
			//get connection
			Connection con = DbConnectionUtil.getConnection();
			
			//prepare query
			PreparedStatement stmt = con.prepareStatement("UPDATE student SET COURSE=? WHERE STUDENT_ID=?");
			stmt.setString(1,"SQL");
			stmt.setInt(2,2);
//			stmt.setInt(2,id);
			
			//run query
			int row =  stmt.executeUpdate();
			System.out.println("rowcount----"+row);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		req.setAttribute("message", "congrats you have updated student");
		req.getRequestDispatcher("studentOperation.jsp").forward(req, resp);
	}

}
