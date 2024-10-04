package com.student.utils;

public interface SQLQueries {
	
	String INSERT_INTO_STUDENT = "insert into student_entity (STUDENTNAME, COURSE, FIRST_NAME, LAST_NAME, ADD_LINE1, ADD_LINE2, CITY, STATE, PIN, MOBILE_NUMBER, EMAIL_ID) values (?,?,?,?,?,?,?,?,?,?,?)";
	String FIND_ALL_STUDENTS = "select * from student_entity";
	String FIND_BY_ID = "select * from student_entity where STUDENT_ID = ?";
	String DELETE_BY_ID = "delete from student_entity where STUDENT_ID = ?";
}
