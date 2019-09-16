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
import com.alighthub.dms.model.Nurse;
import com.alighthub.dms.model.Student;
import com.alighthub.dms.service.DoctorServiceInterface;
import com.alighthub.dms.service.EmployeeServiceInterface;
import com.alighthub.dms.service.NurseServiceInterface;
import com.alighthub.dms.service.StudentServiceInterface;

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


public class UserController
{
	@Autowired
	private EmployeeServiceInterface serve;
	
	
	/**
	 * Doctors operations prepared by Nilesh
	 */
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
	

	/**
	 * Employee operations prepared by Samarjeet
	 */
	
	
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
	
/**
 * Student operations prepared by Ram
 */

@Autowired

StudentServiceInterface studentService;

@PostMapping("/addstudent")
public String addStudentData(@RequestBody Student student)
{
	studentService.addStudentData(student);
	return "add DATA SUCCESSFULL";
}

@GetMapping("/get/{un}/{ps}")
public Student getStudentData(@PathVariable String un,@PathVariable String ps)
{
	System.out.println("un="+un+"And Ps="+ps);
	return studentService.getStudentData(un,ps);
	
}

@GetMapping("/get/{id}") 
public Student getStudent(@PathVariable int id)
{
	return studentService.getStudentById(id);

}

@DeleteMapping("/delete/{id}")
public String deleteStudent(@PathVariable int id)
{
	studentService.deleteStudent(id);
	return "delete record succesfully................";
}





/**
 * Nurse operations prepared by Pradeep
 */

@Autowired
NurseServiceInterface ni;


@PostMapping("/addnurse")
public String addData(@RequestBody Nurse n1 )
{
	
	ni.addData(n1);
	return "Nurse Data added successfull";
	
}

/*
 * @GetMapping("/get/{loginuname}/{loginpassword}") public List<Nurse>
 * getData(@PathVariable String loginuname, @PathVariable String loginpassword)
 * {
 * 
 * List<Nurse> l=ni.displayNurse(loginuname, loginpassword); return l; }
 */

@GetMapping("/getnurse")
public List<Nurse> getNData()
{
	
	List<Nurse> l=ni.displayNurse();
	return l;	
}

@GetMapping ("/editnurse/{nurseId}")
public Nurse editNData(@PathVariable int nurseId)
{
	
	Nurse n=ni.editData(nurseId);
	return n;
	
}

@PutMapping("/updatenurse")
public List<Nurse> updateData(@RequestBody Nurse n)
{
    List<Nurse>	l=ni.updateData(n);
	return l;
	
}

@DeleteMapping("/deletenurse/{nurseId}")
public List<Nurse> deleteData(@PathVariable int nurseId)
{
	List<Nurse> l=ni.deleteData(nurseId);
	return l;
	
}


}
