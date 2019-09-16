package com.alighthub.dms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alighthub.dms.dao.DoctorDao;
import com.alighthub.dms.model.Doctor;
import com.alighthub.dms.service.DoctorServiceInterface;

@Service
public class DoctorServiceImplements implements DoctorServiceInterface
{
	
	@Autowired
	public DoctorDao ds;

	@Override
	public void addData(Doctor d)
	{
		ds.save(d);
		
	}

//	@Override
//	public Doctor displayAdmin(String loginuname, String loginpassword) {
//		
//		Doctor d = 	  ds.findByLoginunameANDLoginpassword(loginuname, loginpassword);
//		
//		return d;
//	}

	@Override
	public Doctor editData(int doctorId) {
		// TODO Auto-generated method stub
		
		return ds.findById(doctorId).get();
	}

	@Override
	public List<Doctor> updateData(Doctor d) {
		
		ds.save(d);
		return ds.findAll();
	}

	@Override
	public List<Doctor> delete(int doctorId) {
		ds.deleteById(doctorId);
		return ds.findAll();
	}

	@Override
	public List<Doctor> displayAdmin() {
		
		return ds.findAll();
	}

	

}
