package com.alighthub.dms.service;

import java.util.List;

import com.alighthub.dms.model.Nurse;

public interface NurseServiceInterface {
	public void addData(Nurse n);
    List<Nurse> displayNurse();
    Nurse editData(int nurseId);
	List<Nurse> updateData(Nurse n);
	List<Nurse> deleteData(int nurseId);

}
