package com.java.jsf;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="autoExample")
public class AutoExample {

	private String studentName;
	
	
	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public List<String> students() {
		List<String> studentList = new ArrayList<String>();
		studentList.add("Aishwarya");
		studentList.add("Krishna");
		studentList.add("Manish");
		studentList.add("Murali");
		studentList.add("Ibrahim");
		return studentList;
	}
	
}
