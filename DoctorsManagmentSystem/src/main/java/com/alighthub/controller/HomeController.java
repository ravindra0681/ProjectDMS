package com.alighthub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alighthub.dms.model.Admin;
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

}
