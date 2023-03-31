package com.jsp.controller;

import com.jsp.dao.Student_Dao;
import com.jsp.dto.Student;

public class TestGetStudentById {
	
	 public static void main(String[] args) {
		 Student_Dao studentDao = new Student_Dao();
			Student student = studentDao.getStudentByID(11);
			if(student != null) {
				System.out.println("Student Id :"+student.getId());
				System.out.println("Student Name :"+student.getName());
				System.out.println("Student Age :"+student.getAge());
				System.out.println("Student Phone :"+student.getPhone());
			}
	 }}
