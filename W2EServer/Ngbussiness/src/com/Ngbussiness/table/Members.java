package com.Ngbussiness.table;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Members entity. @author MyEclipse Persistence Tools
 */

public class Members implements java.io.Serializable {

	// Fields

	private int id;
	private int role;
	//private String name;
	private String password;
	private Date logintime;
	private String uPhone;

	public Members() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Members(int id, int roleId, 
			String password, String uPhone, Date logintime) {
		super();
		this.id = id;
		this.role = roleId;
		this.password = password;
		this.logintime = logintime;
		this.uPhone = uPhone;
	}

	public String getuPhone() {
		return uPhone;
	}

	public void setuPhone(String uPhone) {
		this.uPhone = uPhone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int roleId) {
		role = roleId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getLogintime() {
		return logintime;
	}

	public void setLogintime(Date logintime) {
		this.logintime = logintime;
	}

	@Override
	public String toString() {
		return "Members [ id=" + id+", uPhone="+uPhone +", password="+ password + 
				",  logintime=" + logintime + ", role="+ role +  "]";
	}
	
}