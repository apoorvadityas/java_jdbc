package com.example.demo.emp;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employ")
public class Employee {

	private int id;
	private String name;
	private Gender gender;
	private String dept;
	private String desig;
	private int basic;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public int getBasic() {
		return basic;
	}
	public void setBasic(int basic) {
		this.basic = basic;
	}
	public Employee(int id, String name, Gender gender, String dept, String desig, int basic) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.dept = dept;
		this.desig = desig;
		this.basic = basic;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	
}
