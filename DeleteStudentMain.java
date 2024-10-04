package com.student.main;

import java.util.Scanner;

import com.student.dao.StudentDao;
import com.student.dao.StudentDaoImpl;
import com.student.dao.entity.StudentEntity;

public class DeleteStudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter student id");
		int student_id = sc.nextInt();
		sc.close();
		
		StudentDao dao = new StudentDaoImpl();
		System.out.println("Deleting data start******");
		Boolean result = dao.deleteById(student_id);
		System.out.println("Deleting data end******"+result);
	}

}
