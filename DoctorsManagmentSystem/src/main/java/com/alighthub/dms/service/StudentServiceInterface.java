package com.alighthub.dms.service;



import com.alighthub.dms.model.Student;

public interface StudentServiceInterface {
	
	void addStudentData(Student student);

	Student getStudentData(String un, String ps);

	Student getStudentById(int id);

	void deleteStudent(int id);

}
