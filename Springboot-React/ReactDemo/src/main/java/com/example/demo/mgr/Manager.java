package com.example.demo.mgr;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.example.demo.emp.Gender;

@Entity
public class Manager {

	private int Mgrid;
	private int id;
	private String Mgrname;
	private String name;
	private Gender gender;
	private String dept;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getMgrid() {
		return Mgrid;
	}
	public void setMgrid(int mgrid) {
		Mgrid = mgrid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMgrname() {
		return Mgrname;
	}
	public void setMgrname(String mgrname) {
		Mgrname = mgrname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Enumerated(EnumType.STRING)
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Manager [Mgrid=" + Mgrid + ", id=" + id + ", Mgrname=" + Mgrname + ", name=" + name + ", gender="
				+ gender + ", dept=" + dept + "]";
	}
	public Manager(int mgrid, int id, String mgrname, String name, Gender gender, String dept) {
		super();
		Mgrid = mgrid;
		this.id = id;
		Mgrname = mgrname;
		this.name = name;
		this.gender = gender;
		this.dept = dept;
	}
	public Manager() {
		
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

	
	
}
