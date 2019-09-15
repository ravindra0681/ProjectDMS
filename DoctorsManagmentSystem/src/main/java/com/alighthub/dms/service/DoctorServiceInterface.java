package com.alighthub.dms.service;

import java.util.List;

import com.alighthub.dms.model.Doctor;

public interface DoctorServiceInterface
{
	
	public void addData(Doctor d);
	//Doctor displayAdmin(String loginuname,String loginpassword);
	List<Doctor> displayAdmin();
	Doctor editData(int doctorId);
	List<Doctor> updateData(Doctor d);
	List<Doctor> delete(int doctorId);

}
