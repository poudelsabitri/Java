package com.first.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.first.entity.Student;
import com.first.util.DbConnectionUtil;

@WebServlet("/getAllStudent")
public class GetAllStudents extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		List<Student> students = new ArrayList<Student>();

		try {

			Connection con = DbConnectionUtil.getConnection();

			PreparedStatement stmt = con.prepareStatement("select * from Student");

			ResultSet resultSet = stmt.executeQuery();

			while (resultSet.next()) {
				Student student = new Student(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3),
						resultSet.getString(4), resultSet.getString(5), resultSet.getString(6), resultSet.getString(7),
						resultSet.getString(8), resultSet.getString(9), resultSet.getInt(10), resultSet.getLong(11),
						resultSet.getString(12));
				students.add(student);

			}

		} catch (Exception e) {

			e.printStackTrace();
		}
		
		req.setAttribute("Student", students);
		req.getRequestDispatcher("studentDetail.jsp").forward(req,res);

	}

}
