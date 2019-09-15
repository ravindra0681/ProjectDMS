package com.alighthub.dms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.alighthub.dms.model.Employee;

/*
 * 
 * @author Ravindra Sonawane
 * @page Employee Dao
 * @time 08/09/2019 - 9.20 PM
 * @purpose To controll employee dao
 * 
 *
 */
@Repository
public interface EmployeeDao extends JpaRepository<Employee,Integer>{
	
	@Query(name="findByLoginId")
	public Employee findByLogin(String id);

	@Query("from Employee e where e.login.loginId=:id")
   public Employee findByLoginId(int id); 


}
