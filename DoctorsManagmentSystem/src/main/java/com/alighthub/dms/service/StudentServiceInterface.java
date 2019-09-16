package com.alighthub.dms.service;

import java.util.List;

import com.alighthub.dms.model.Student;

public interface StudentServiceInterface {
	
	void addStudent(Student student);

	List<Student> getStudentData();

}
