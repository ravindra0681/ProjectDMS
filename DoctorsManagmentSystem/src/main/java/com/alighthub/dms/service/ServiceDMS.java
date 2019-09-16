package com.alighthub.dms.service;

import java.util.List;

import com.alighthub.dms.model.Admin;
import com.alighthub.dms.model.Login;

/*
 * 
 * @author Ravindra Sonawane
 * @page Service Interface
 * @time 08/09/2019 - 9.20 PM
 * @purpose To create all abstract methods
 * 
 *
 */

public interface ServiceDMS {
	
	void addData(Admin admin);
	Admin displayAdmin(String loginuname,String loginpassword);
	List<Admin> getData();
	
	List<Admin> delete(int adminId);
	Admin edit(int id);
	
}
