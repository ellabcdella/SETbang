package com.setbang.domain;

import java.sql.Date;

public class InsertMemberVO {
	
	private int mem_code;
	private int ind_code;
	private String name;
	private String tel;
	private String id;
	private String pw;
	private String business_no;
	private String addr;
	private String email;
	private String mem_plan;
	private Date signup_date;
	private String profile;
	
	public int getMem_code() {
		return mem_code;
	}
	public void setMem_code(int mem_code) {
		this.mem_code = mem_code;
	}
	public int getInd_code() {
		return ind_code;
	}
	public void setInd_code(int ind_code) {
		this.ind_code = ind_code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getBusiness_no() {
		return business_no;
	}
	public void setBusiness_no(String business_no) {
		this.business_no = business_no;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMem_plan() {
		return mem_plan;
	}
	public void setMem_plan(String mem_plan) {
		this.mem_plan = mem_plan;
	}
	public Date getSignup_date() {
		return signup_date;
	}
	public void setSignup_date(Date signup_date) {
		this.signup_date = signup_date;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	
	public InsertMemberVO() {
		
	}
	
}

