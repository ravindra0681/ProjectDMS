package com.alighthub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alighthub.dms.model.Doctor;
import com.alighthub.dms.model.Employee;
import com.alighthub.dms.model.Login;
import com.alighthub.dms.service.DoctorServiceInterface;
import com.alighthub.dms.service.EmployeeServiceInterface;

/*
 * 
 * @author Ravindra Sonawane
 * @page User Controller
 * @time 08/09/2019 - 9.05 PM
 * @purpose User Controller
 * 
 *
 */

@RestController
@CrossOrigin("*")
@RequestMapping("/doc")
public class UserController
{
	@Autowired
	private EmployeeServiceInterface serve;
	
	@Autowired
	private DoctorServiceInterface dr;
	
	@PostMapping("/adddoc")
	public String addData(@RequestBody Doctor d)
	{
		dr.addData(d);
		return "Data Inserted----";
		
	}
	
//	@GetMapping("/get/{loginuname}/{loginpassword}")
//	public Doctor getData(@PathVariable String loginuname,@PathVariable String loginpassword)
//	{
//		
//		Doctor l = dr.displayAdmin(loginuname, loginpassword);
//		return l;
//		
//	}
	@GetMapping("/getdoc")
	public List<Doctor> getData()
	{
		
		List<Doctor> l = dr.displayAdmin();
		return l;
		
	}
	
	
		
	@GetMapping("/editdoc/{doctorId}")
	public Doctor editData(@PathVariable int doctorId)
	{
		Doctor d = dr.editData(doctorId);
		return d;
		
	}
	@PutMapping("/updatedoc")
	public List<Doctor> update(@RequestBody Doctor d)
	{
		
		List<Doctor> l = dr.updateData(d);
		return l;
	}
	@DeleteMapping("/deletedoc/{doctorId}")
	public List<Doctor> delete(@PathVariable int doctorId)
	{
		List<Doctor> l = dr.delete(doctorId);
		return l;
	}
	

	
	
	@PostMapping("/addemp")
	public String addEmployee( @RequestBody Employee emp)
	{
		
		serve.addEmployee(emp);
		return "Inserted Successfully";
		
	}
@GetMapping("/showEmp/{loginuname}/{loginpassword}")
public Employee LoginEmployee(@PathVariable String loginuname,@PathVariable String loginpassword)
{
	System.out.println(loginuname +""+loginpassword);
	return serve.showEmployee(loginuname, loginpassword);
	
}

@GetMapping("/edit/{employeeId}")
public Employee editEmployee(@PathVariable int employeeId )
{
	return serve.editEmployee(employeeId);
	}


@PutMapping("/updateemp")
public Employee updateEmployee(@RequestBody Employee emp)
{
	return serve.updateEmployee(emp);
	
}

@DeleteMapping("/deleteemp/{employeeId}")	
public  List<Employee> deleteEmployee(@PathVariable int employeeId){
	return serve.deletEmployee(employeeId);
	
	
}
@GetMapping(value="/getemp/{loginuname}/{loginpassword}")
public Login getLogin(@PathVariable String loginuname,@PathVariable String loginpassword)
{
	return serve.getLogin(loginuname, loginpassword);
	
}
@GetMapping(value="/loginemp/{loginId}")
public Employee showEmp(@PathVariable int loginId) 
{
	return serve.showEmp(loginId);
}
	
	

}
