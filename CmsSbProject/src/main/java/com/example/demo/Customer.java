package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {

	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(int cusId, String cusName, String cusPhnno, String cusUsername, String cusPassword,
			String cusEmail) {
		this.cusId = cusId;
		this.cusName = cusName;
		this.cusPhnno = cusPhnno;
		this.cusUsername = cusUsername;
		this.cusPassword = cusPassword;
		this.cusEmail = cusEmail;
	}
	@Id
	private int cusId;
	private String cusName;
	private String cusPhnno;
	private String cusUsername;
	public String getCusUsername() {
		return cusUsername;
	}
	public void setCusUsername(String cusUsername) {
		this.cusUsername = cusUsername;
	}
	private String cusPassword;
	private String cusEmail;
	public int getCusId() {
		return cusId;
	}
	public void setCusId(int cusId) {
		this.cusId = cusId;
	}
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public String getCusPhnno() {
		return cusPhnno;
	}
	public void setCusPhnno(String cusPhnno) {
		this.cusPhnno = cusPhnno;
	}
	
	public String getCusPassword() {
		return cusPassword;
	}
	public void setCusPassword(String cusPassword) {
		this.cusPassword = cusPassword;
	}
	public String getCusEmail() {
		return cusEmail;
	}
	public void setCusEmail(String cusEmail) {
		this.cusEmail = cusEmail;
	}
	
	
}
