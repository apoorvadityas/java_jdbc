package com.SpringAgentJDBC.model;

import java.sql.Date;



public class Agent {
	private int AgentID;
	private String FirstName;
	private String MI;
	private String LastName;
	private Gender Gender;
	private Date DOB;
	private String SSN;
	private int MaritalStatus;
	private String Address1;
	private String Address2;
	private String City;
	private String STATE;
	private int ZipCode;
	private String Country;
	public int getAgentID() {
		return AgentID;
	}
	public void setAgentID(int agentID) {
		AgentID = agentID;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getMI() {
		return MI;
	}
	public void setMI(String mI) {
		MI = mI;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public Gender getGender() {
		return Gender;
	}
	public void setGender(Gender gender) {
		Gender = gender;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String sSN) {
		SSN = sSN;
	}
	public int getMaritalStatus() {
		return MaritalStatus;
	}
	public void setMaritalStatus(int maritalStatus) {
		this.MaritalStatus = maritalStatus;
	}
	public String getAddress1() {
		return Address1;
	}
	public void setAddress1(String address1) {
		Address1 = address1;
	}
	public String getAddress2() {
		return Address2;
	}
	public void setAddress2(String address2) {
		Address2 = address2;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getSTATE() {
		return STATE;
	}
	public void setSTATE(String sTATE) {
		STATE = sTATE;
	}
	public int getZipCode() {
		return ZipCode;
	}
	public void setZipCode(int zipCode) {
		ZipCode = zipCode;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	@Override
	public String toString() {
		return "Agent [AgentID=" + AgentID + ", FirstName=" + FirstName + ", MI=" + MI + ", LastName=" + LastName
				+ ", Gender=" + Gender + ", DOB=" + DOB + ", SSN=" + SSN + ", MaritalStatus=" + MaritalStatus
				+ ", Address1=" + Address1 + ", Address2=" + Address2 + ", City=" + City + ", STATE=" + STATE
				+ ", ZipCode=" + ZipCode + ", Country=" + Country + "]";
	}

}
