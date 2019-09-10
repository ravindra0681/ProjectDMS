package com.alighthub.dms.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;
/*
 * 
 * @author Ravindra Sonawane
 * @page Doctor
 * @time 08/09/2019 - 9.05 PM
 * @purpose We have created doctor pojo here to manage nurse and students
 * 
 *
 */
@Entity
@Table(name="Doctor")
public class Doctor {
public int getDoctorId() {
		return doctorId;
	}

	public String getDoctorFname() {
		return doctorFname;
	}

	public String getDoctorLname() {
		return doctorLname;
	}

	public String getDoctorEmail() {
		return doctorEmail;
	}

	public int getDoctorMobileNo() {
		return doctorMobileNo;
	}

	public String getDoctorRole() {
		return doctorRole;
	}

	

	public String getDoctorGender() {
		return doctorGender;
	}

	public String getDoctorSpecialization() {
		return doctorSpecialization;
	}

	

	public String getDoctorlicencesNo() {
		return doctorlicencesNo;
	}

	public void setDoctorlicencesNo(String doctorlicencesNo) {
		this.doctorlicencesNo = doctorlicencesNo;
	}

	public Address getAddress() {
		return address;
	}

	public Login getLogin() {
		return login;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public void setDoctorFname(String doctorFname) {
		this.doctorFname = doctorFname;
	}

	public void setDoctorLname(String doctorLname) {
		this.doctorLname = doctorLname;
	}

	public void setDoctorEmail(String doctorEmail) {
		this.doctorEmail = doctorEmail;
	}

	public void setDoctorMobileNo(int doctorMobileNo) {
		this.doctorMobileNo = doctorMobileNo;
	}

	public void setDoctorRole(String doctorRole) {
		this.doctorRole = doctorRole;
	}

	

	public void setDoctorGender(String doctorGender) {
		this.doctorGender = doctorGender;
	}

	public void setDoctorSpecialization(String doctorSpecialization) {
		this.doctorSpecialization = doctorSpecialization;
	}

	

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getDoctorQualification() {
		return doctorQualification;
	}

	public void setDoctorQualification(String doctorQualification) {
		this.doctorQualification = doctorQualification;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	

	

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

@Column(name="Doctor_Id")
private int doctorId;

@Column(name="Doctor_Fname")
private String doctorFname;

@Column(name="Doctor_Lname")
private String doctorLname;

@Column(name="Doctor_Email")
private String doctorEmail;

@Column(name="Doctor_MobileNo")
private int doctorMobileNo;

@Column(name="Doctor_Role")
private String doctorRole;

@Column(name="Licences_No")
private String doctorlicencesNo;
@Column(name="Doctor_Gender")
private String doctorGender;
@Column(name="Doctor_Specialization")
private String doctorSpecialization;


@Column(name="Doctor_Qualification")
private String doctorQualification;


@OneToOne(cascade=CascadeType.ALL)
/*@Column(name="Address_Details")*/
private Address address;
@OneToOne(cascade=CascadeType.ALL)
/*@Column(name="Login_Details")*/
private Login login;

/*@ManyToOne(cascade=CascadeType.ALL)
private Admin admin;*/

/*@ManyToOne(cascade=CascadeType.ALL)
private Employee employee;*/

/*@OneToMany(cascade=CascadeType.ALL)
private List<Nurse> nurseList=new ArrayList<>();

@OneToMany(cascade=CascadeType.ALL)
private List<Student> studentList=new ArrayList<>();*/


}
