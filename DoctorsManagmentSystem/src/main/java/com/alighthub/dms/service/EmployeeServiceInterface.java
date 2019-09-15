package com.alighthub.dms.service;

import java.util.List;

import com.alighthub.dms.model.Employee;
import com.alighthub.dms.model.Login;

public interface EmployeeServiceInterface {
	public void addEmployee(Employee emp);
	public Employee showEmployee(String loginuname,String loginpassword );
	public Employee editEmployee(int employeeId );
	public Employee updateEmployee(Employee emp);
	public List<Employee> deletEmployee(int employeeId );
	public Login getLogin(String uname,String pass);
	public Employee showEmp(int loginId);

}
