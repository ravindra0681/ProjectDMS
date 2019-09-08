package com.alighthub.dms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


import com.alighthub.dms.model.Admin;

/*
 * 
 * @author Ravindra Sonawane
 * @page Admin Dao
 * @time 08/09/2019 - 9.05 PM
 * @purpose To controll admin dao
 * 
 *
 */
@Repository
public interface AdminDao extends JpaRepository<Admin, Integer>{

}
