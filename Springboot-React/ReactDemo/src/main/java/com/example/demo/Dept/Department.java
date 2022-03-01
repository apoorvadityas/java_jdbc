package com.example.demo.Dept;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Dept")
public class Department {
	private int Deptid;
	private String Dept;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getDeptid() {
		return Deptid;
	}
	public void setDeptid(int deptid) {
		Deptid = deptid;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	@Override
	public String toString() {
		return "Department [Deptid=" + Deptid + ", Dept=" + Dept + "]";
	}
	public Department(int deptid, String dept) {
		Deptid = deptid;
		Dept = dept;
	}
	public Department() {
		
		// TODO Auto-generated constructor stub
	}
	 
	
    

}
