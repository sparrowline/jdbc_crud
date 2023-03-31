package com.jsp.controller;

import com.jsp.dao.Student_Dao;
import com.jsp.dto.Student;

public class TestSaveStudent {
	public static void main(String[] args) {
		
	
	Student student = new Student();
	student.setId(11);
	student.setName("Rakul");
	student.setAge(22);
	student.setPhone(98765438890l);
	
	
	
	
	
	Student_Dao dao = new Student_Dao();
	Student student2 = dao.saveStudent(student);
	if(student2 != null) {
		System.out.println("Data is saved");
	}else {
		System.out.println("Plz check the Object once");
	}

}
}


