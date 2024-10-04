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

@WebServlet("/createNewStudent")
public class CreateSTudent extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Student st = null;
		try {
			//get connection
			Connection con = DbConnectionUtil.getConnection();
			//prepare query
			PreparedStatement stmt = con.prepareStatement("INSERT INTO student (STUDENT_ID, STUDENT_NAME, COURSE, FIRST_NAME, LAST_NAME, ADD_LINE1, ADD_LINE2, CITY, STATE, PIN, MOBILE_NUMBER, EMAIL_ID) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
			
			stmt.setInt(1, 3);
			stmt.setString(2, "test3");
			stmt.setString(3, "js");
			stmt.setString(4, "test3");
			stmt.setString(5, "user");
			stmt.setString(6, "1234");
			stmt.setString(7, "land");
			stmt.setString(8, "tampa");
			stmt.setString(9, "fl");
			stmt.setInt(10, 23322);
			stmt.setLong(11, 123222122);
			stmt.setString(12, "test3.user@gmail.com");
			//run query
			int row =  stmt.executeUpdate();
			System.out.println("rowcount----"+row);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		req.setAttribute("message", "congrats you have inserted student");
		req.getRequestDispatcher("studentOperation.jsp").forward(req, resp);
	}

}
