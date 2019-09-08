package com.alighthub.dms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/*
 * 
 * @author Ravindra Sonawane
 * @page Login
 * @time 08/09/2019 - 9.05 PM
 * @purpose Save user_Id and Password of all users admin/student/doctor/nurse/employee
 * 
 *
 */
@Entity
@Table(name="Login")
public class Login {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="Login_Id")
private int loginId;
@Column(name="Login_Uname")
private String loginUname;
@Column(name="Login_Password")
private String loginPassword;

@Column(name="Login_Type")
private String loginType;

public int getLoginId() {
	return loginId;
}

public String getLoginUname() {
	return loginUname;
}

public String getLoginPassword() {
	return loginPassword;
}

public String getLoginType() {
	return loginType;
}

public void setLoginId(int loginId) {
	this.loginId = loginId;
}

public void setLoginUname(String loginUname) {
	this.loginUname = loginUname;
}

public void setLoginPassword(String loginPassword) {
	this.loginPassword = loginPassword;
}

public void setLoginType(String loginType) {
	this.loginType = loginType;
}


}
