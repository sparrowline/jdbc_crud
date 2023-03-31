package com.jsp.controller;

import com.jsp.dao.Student_Dao;

public class TestDeleteStudent {
	
public static void main(String[] args) {
	Student_Dao dao= new Student_Dao();
	String res = dao.deleteStudent(9);
	
	
}
}
