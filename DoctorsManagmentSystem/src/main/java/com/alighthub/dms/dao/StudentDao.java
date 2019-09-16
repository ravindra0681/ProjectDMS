package com.alighthub.dms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.alighthub.dms.model.Student;

/*
 * 
 * @author Ravindra Sonawane
 * @page Student Dao
 * @time 08/09/2019 - 9.20 PM
 * @purpose To controll student dao
 * 
 *
 */
@Repository
public interface StudentDao extends JpaRepository<Student,Integer>{
	
	@Query("from Student s left outer join Login l on s.login=l.loginId where l.loginuname=:uname AND l.loginpassword=:pass ")
	public Student findByUnameAndPass(String uname,String pass);



	@Query("from Student s where s.login.loginId=:id")
	public Student findByStudentsId(int id);

}
