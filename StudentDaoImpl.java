package com.student.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//import org.springframework.jdbc.core.BeanPropertyRowMapper;

//import com.car.entity.Car;
//import com.example.Statement;
import com.student.dao.entity.StudentEntity;
import com.student.utils.DbConnectionUtil;
import com.student.utils.SQLQueries;

public class StudentDaoImpl implements StudentDao {
    private static String driver = "com.mysql.cj.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3306/organizationdatabase";
    private static String username = "root";
    private static String password = "LocalHost@123";

	public Collection<String> queryDatabase(String query, String filter) throws SQLException {
		Connection conn = DriverManager.getConnection(url, "user", "pass");

		// query the data
		java.sql.Statement stmt = conn.createStatement();
		ResultSet data = stmt.executeQuery(query);

		// get the data out of the ResultSet and put it into the collection
		Collection<String> results = Collections.emptyList();
		if (data != null) {
			results.add(data.getString(0));
			data.next();
		}

		// print out each result that contains the filter in the value
		results.stream().filter(s -> s.contains(filter)).forEach(s -> System.out.println("Result : " + s));

		return results;
	}

	@Override
	public String save(StudentEntity entity) {
		int rowCount = 0;

		try (Connection con = DbConnectionUtil.getConnection();
				PreparedStatement stmt = con.prepareStatement(SQLQueries.INSERT_INTO_STUDENT);) {
			stmt.setNull(5, java.sql.Types.INTEGER);
			stmt.setString(1, entity.getStudent_name());
			stmt.setString(2, entity.getCourse());
			stmt.setString(3, entity.getFirst_name());
			stmt.setString(4, entity.getLast_name());
			stmt.setString(5, entity.getAdd_line1());
			stmt.setString(6, entity.getAdd_line2());
			stmt.setString(7, entity.getCity());
			stmt.setString(8, entity.getState());
			stmt.setInt(9, entity.getPin());
			stmt.setLong(10, entity.getMobile_number());
			stmt.setString(11, entity.getEmail_id());
			rowCount = stmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowCount > 0 ? "Insert sucessfull" : "Insert sucessfull";
	}

	@Override
	public List<StudentEntity> findAll() {
		List<StudentEntity> allstudents = new ArrayList<StudentEntity>();
		try (Connection con = DbConnectionUtil.getConnection();
				PreparedStatement stmt = con.prepareStatement(SQLQueries.FIND_ALL_STUDENTS);
				ResultSet rs = stmt.executeQuery();) {

			while (rs.next()) {
				StudentEntity student = new StudentEntity(rs.getInt(1), rs.getString(2), rs.getString(3),
						rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8),
						rs.getString(9), rs.getInt(10), rs.getLong(11), rs.getString(12));
				allstudents.add(student);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return allstudents;
	}// List<Car> cars = jdbcTemplate.query("select * from student", new
		// BeanPropertyRowMapper(Car.class));

	@Override
	public StudentEntity findById(int student_id) {
		StudentEntity student = null;
		try (Connection con = DbConnectionUtil.getConnection();
				PreparedStatement stmt = con.prepareStatement(SQLQueries.FIND_BY_ID);) {
			stmt.setInt(1, student_id);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				String lastName= rs.getString(5);
				lastName.length();
				student = new StudentEntity(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9),
						rs.getInt(10), rs.getLong(11), rs.getString(12));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return student;
	}// jdbcTemplate.queryForObject("select * from car where id=?", new Object[id],
		// new BeanPropertyRowMapper(Car.class));

	@Override
	public boolean deleteById(int student_id) {
		boolean sucess = false;
		int rowCount = 0;
		try (Connection con = DbConnectionUtil.getConnection();
				PreparedStatement stmt = con.prepareStatement(SQLQueries.DELETE_BY_ID);) {
			stmt.setInt(1, student_id);
			rowCount = stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowCount > 0 ? sucess = true : sucess;
	}

	@Override
	public String update(StudentEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentEntity findByName(String student_name) {
		// TODO Auto-generated method stub
		return null;
	}

}
