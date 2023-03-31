package com.jsp.controller;

import java.util.List;

import com.jsp.dao.Student_Dao;
import com.jsp.dto.Student;

public class TestGetAllStudent {
	public static void main(String[] args) {
		Student_Dao dao = new Student_Dao();
		
		List<Student> list = dao.getAllStudent();
		

		for(Student student : list) {
			System.out.println("Student Id :"+student.getId());
			System.out.println("Student Name :"+student.getName());
			System.out.println("Student Age :"+student.getAge());
			System.out.println("Student Phone :"+student.getPhone());
			System.out.println("------------------------------------------");
			

		}

	}
}

