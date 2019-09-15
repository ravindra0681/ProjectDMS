package com.alighthub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alighthub.dms.model.Admin;
import com.alighthub.dms.model.Login;
import com.alighthub.dms.service.ServiceDMS;
/*
 * 
 * @author Ravindra Sonawane
 * @page HomeController
 * @time 08/09/2019 - 9.05 PM
 * @purpose To controller all activities
 * 
 *
 */
@RestController

@RequestMapping(value="admin")
@CrossOrigin("*")
public class HomeController {
	@Autowired
	ServiceDMS servicedms;
	
	@PostMapping(value="/add")
	public String addData(@RequestBody Admin admin)
	{
		System.out.println("Admin post maping method");
		servicedms.addData(admin);
		return "Data Inserted";

	}
	
	@GetMapping(value="/log/{loginuname}/{loginpassword}")
	public Admin login(@PathVariable String loginuname,@PathVariable String loginpassword)
	{
		return servicedms.displayAdmin(loginuname, loginpassword);
		
	}
	
	@GetMapping(value="/get")
	public List<Admin> get()
	{
		return servicedms.getData();
		
	}

	@DeleteMapping(value="/del/{adminId}")
	public List<Admin> delete(@PathVariable int adminId)
	{
		return servicedms.delete(adminId);
		
	}
	@GetMapping(value="/getdata/{adminId}")
	public Admin getdata(@PathVariable int adminId)
	{
		return servicedms.edit(adminId);
		
	}
}
