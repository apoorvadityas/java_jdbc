package com.userEmp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="users")
public class users {
	@Id
	@Column(name="id")
	 int id;
	@Column(name="name")
	String name;
	
	@Column(name="email")
	String email;
	
	@Column(name="password")
	String password;
	    
	@Column(name="gender")
	String gender;
	    
	  
	@Column(name="address")
	String address;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public  String getName() {
			return name;
		}
		public void setName(String name) {
		this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public  String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
	  
}