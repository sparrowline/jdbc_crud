package com.jsp.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jsp.dao.Student_Dao;
import com.jsp.dto.Student;
import com.jsp.util.ConnectionObj;

public class TestUpdateStudent {
	public static void main(String[] args) {
		
	
	Student student = new Student();
	student.setId(10);
	student.setName("Raniiii");
	student.setAge(21);
	student.setPhone(9876543210l);
	
	Student_Dao dao = new Student_Dao();
	
	Student student2 = dao.updateStudent(student);
	if(student2 != null) {
		System.out.println("Data is Updated");
	}else {
		System.out.println("Plz check the Object once");
	}
	
}
}


