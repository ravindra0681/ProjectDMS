package com.alighthub.dms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;

import com.alighthub.dms.dao.EmployeeDao;
import com.alighthub.dms.dao.LoginDao;
import com.alighthub.dms.model.Employee;
import com.alighthub.dms.model.Login;
import com.alighthub.dms.service.EmployeeServiceInterface;

@Service
public class EmployeeServiceImplimentation implements EmployeeServiceInterface{
	
	@Autowired
	private EmployeeDao empdao;
	@Autowired
	 LoginDao logdao;

	public void addEmployee(Employee emp) {
		
		// TODO Auto-generated method stub
		empdao.save(emp);
		
	}

	@Override
	public Employee showEmployee(String loginuname, String loginpassword) {
		// TODO Auto-generated method stub
	     System.out.println("serv Imp");
		Login l=logdao.findByLoginunameAndLoginpassword(loginuname, loginpassword);
		System.out.println(l.getLoginType());
		return empdao.findByLogin(l.getLoginType());
	}

	@Override
	public Employee editEmployee(int employeeId) {
		// TODO Auto-generated method stub
		return empdao.findById(employeeId).get();
	}

	@Override
	@PutMapping("/update")
	public Employee updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return empdao.save(emp);
	}

	@Override
	public List<Employee> deletEmployee(int employeeId) {
		// TODO Auto-generated method stub
		empdao.deleteById(employeeId);
		return empdao.findAll();
	}

	@Override
	public Login getLogin(String uname, String pass) {
		// TODO Auto-generated method stub
		return logdao.findByLoginunameAndLoginpassword(uname, pass);
	}

	@Override
	public Employee showEmp(int loginId) {
		// TODO Auto-generated method stub
		return empdao.findByLoginId(loginId);
	

	
	
	}
	
	
	

}
