package com.jsp.controller;

import com.jsp.dao.Student_Dao;

public class TestCreateStudentTable {
public static void main(String[] args) {
	Student_Dao student_Dao =new Student_Dao();
	student_Dao.createStudentTable();
}
}
