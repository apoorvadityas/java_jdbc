package com.java.jsf;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="password") 
public class Password {

	private String passwordField1;    
	private String passwordField2;
	public String getPasswordField1() {
		return passwordField1;
	}
	public void setPasswordField1(String passwordField1) {
		this.passwordField1 = passwordField1;
	}
	public String getPasswordField2() {
		return passwordField2;
	}
	public void setPasswordField2(String passwordField2) {
		this.passwordField2 = passwordField2;
	}    

	
}
