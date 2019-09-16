package com.alighthub.dms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.alighthub.dms.dao.StudentDao;
import com.alighthub.dms.model.Student;
import com.alighthub.dms.service.StudentServiceInterface;
@Service
public class StudentServiceImplimentation implements StudentServiceInterface{
	
	@Autowired
	StudentDao studentRepository;
	
	@Override
	public void addStudent(Student student) {
	
		studentRepository.save(student);	
		
	}
	@Override
	public List<Student> getStudentData() {
		// TODO Auto-generated method stub
	
		return studentRepository.findAll();
	}

}
