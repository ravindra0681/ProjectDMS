package com.alighthub.dms.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Columns;
/*
 * 
 * @author Ravindra Sonawane
 * @time 9.26 PM
 * @purpose To manage employee and can view any user information activate/deactivate
 *
 */
@Entity
@Table(name="Admin")
public class Admin {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="Admin_Id")
	private int adminId;
	@Column(name="Admin_Fname")
	private String adminFname;
	@Column(name="Admin_Lname")
	private String adminLname;
	@Column(name="Admin_Email")
	private String adminEmail;
	
	@Column(name="Admin_MobileNo")
	private int adminMobileNo;
	
	@Column(name="Status")
	private String status;
	
	@Column(name="Admin_Role")
	private String adminRole;
	
	@Column(name="Admin_Gender")
	private String adminGender;
	@OneToMany(cascade=CascadeType.ALL)
	/*@Column(name="Employee_List")*/
	private List<Employee> employeeList=new ArrayList<Employee>();
	
	@OneToOne(cascade=CascadeType.ALL)
	/*@Column(name="Address_Details")*/
	private Address address;
	@OneToOne(cascade=CascadeType.ALL)
	/*@Column(name="Login_Id")*/
	private Login login;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="admin")
	private List<Doctor> doctorList=new ArrayList<>();
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="admin")
	private List<Employee> employeList=new ArrayList<>();
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="admin")
	private List<Nurse> nurseList=new ArrayList<>();
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="admin")
	private List<Student> studentList=new ArrayList<>();
	
	
}
