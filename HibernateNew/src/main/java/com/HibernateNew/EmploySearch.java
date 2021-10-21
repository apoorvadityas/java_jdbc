package com.HibernateNew;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class EmploySearch {
public static void main(String[] args) {
	Configuration cfg = new AnnotationConfiguration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory sf = cfg.buildSessionFactory();
	Session s = sf.openSession();
	int empno;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Employ No   ");
	empno = sc.nextInt();
	Query q = s.createQuery("from Employ where empno="+empno);
	List<Employ> employList = q.list();
	if (employList.size() == 1) {
		Employ employ = employList.get(0);
		System.out.print("Employ No " +employ.getEmpno());
		System.out.print("Employ Name  " +employ.getName());
		System.out.print("Gender  " +employ.getGender());
		System.out.print("Department  " +employ.getDept());
		System.out.print("Designation  " +employ.getDesig());
		System.out.println("Salary  " +employ.getBasic());
	} else {
		System.out.println("Record Not Found...");
	}
}
}
