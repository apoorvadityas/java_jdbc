package com.HibernateNew;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;



public class EmployShowAll {
	public static void main(String[] args) {
		Configuration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Query q= s.createQuery("from Employ");
		List<Employ> employList = q.list();
		for (Employ employ : employList) {
			System.out.print("Employ No " +employ.getEmpno());
			System.out.print("Employ Name  " +employ.getName());
			System.out.print("Gender  " +employ.getGender());
			System.out.print("Department  " +employ.getDept());
			System.out.print("Designation  " +employ.getDesig());
			System.out.println("Salary  " +employ.getBasic());
			
		}
		
	}

}
