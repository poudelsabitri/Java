package com.first.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.first.util.DbConnectionUtil;
import com.first.entity.Student;

@WebServlet("/deleteStudent")
public class DeleteStudentServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		/* on url pass ?id=2 */
//		int id= Integer.parseInt(req.getParameter("id"));
//		System.out.println("student id----"+id);
		
		Student st = null;
		try {
			//get connection
			Connection con = DbConnectionUtil.getConnection();
			
			//prepare query
			PreparedStatement stmt = con.prepareStatement("delete FROM student where STUDENT_ID=?");
//			stmt.setInt(1, id);
			stmt.setInt(1, 2);
			
			//run query
			int row =  stmt.executeUpdate();
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		req.setAttribute("message", "congrats you have deleted student");
		req.getRequestDispatcher("studentOperation.jsp").forward(req, resp);
	}

}
