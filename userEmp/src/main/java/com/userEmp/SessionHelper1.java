package com.userEmp;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class SessionHelper1 {

	public static SessionFactory getFactory() {
		Configuration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate1.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		return sf;
	}
}
