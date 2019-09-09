package com.alighthub.dms.serviceimpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alighthub.dms.dao.AdminDao;
import com.alighthub.dms.model.Admin;
import com.alighthub.dms.service.ServiceDMS;

/*
 * 
 * @author Ravindra Sonawane
 * @page Service Implimentation
 * @time 08/09/2019 - 9.20 PM
 * @purpose To impliment all Service methods
 * 
 *
 */
@Service
public class ServiceImplimentation implements ServiceDMS{
	
	@Autowired
	AdminDao admindao;

	@Override
	public void addData(Admin admin) {
		// TODO Auto-generated method stub
		admindao.save(admin);
		
	}

}
