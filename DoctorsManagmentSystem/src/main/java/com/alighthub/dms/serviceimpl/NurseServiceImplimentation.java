package com.alighthub.dms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alighthub.dms.dao.NurseDao;
import com.alighthub.dms.model.Nurse;
import com.alighthub.dms.service.NurseServiceInterface;

@Service
public class NurseServiceImplimentation implements NurseServiceInterface {

	@Autowired
	NurseDao nd;
	
	@Override
	public void addData(Nurse n) {
		
		nd.save(n);	
	}

	@Override
	public List<Nurse> displayNurse() {
		
		return nd.findAll();
	}

	@Override
	public Nurse editData(int nurseId) {
		
		return nd.findById(nurseId).get();
	}

	@Override
	public List<Nurse> updateData(Nurse n) {
		
		nd.save(n);
		return nd.findAll();
	}

	@Override
	public List<Nurse> deleteData(int nurseId) {
	 nd.deleteById(nurseId);
		return nd.findAll();
	}

}
