package com.student.dao;

import java.util.List;

import com.student.dao.entity.StudentEntity;

public interface StudentDao {
	
	String save(StudentEntity entity);
	List<StudentEntity> findAll();
	StudentEntity findById(int student_id);
	boolean deleteById(int student_id);
	String update(StudentEntity entity);
	StudentEntity findByName(String student_name);
	
}
