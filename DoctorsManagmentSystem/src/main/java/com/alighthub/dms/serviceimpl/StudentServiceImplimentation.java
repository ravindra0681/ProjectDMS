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
	StudentDao studentDao;
	
	@Override
	public void addStudentData(Student student) {
        System.out.println("SERVICE IMPLIMENTATION ");
		studentDao.save(student);
		
	}
	@Override
	public Student getStudentData(String un, String ps) {
		// TODO Auto-generated method stub
		
		return studentDao.findByUnameAndPass(un, ps);
	}
	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		System.out.println("fiend by id service implimentation..YYYYYYYYYYYYOOOOOOOOOOOOOOOOO...");
		return studentDao.findByStudentsId(id);   // this is create Query Custom in StudentDao
		
		//return studentDao.findById(id).get();
	}
	@Override
	public void deleteStudent(int id) {
	studentDao.deleteById(id);
		
	}
}
