package com.userEmp;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;



public class usersDAO {
	static SessionFactory sf;
	static Session session;
	static Query query;
	static {
		sf = SessionHelper1.getFactory();
		session = sf.openSession();
	}
	public int loginCheck(users u) {

		query = session.createQuery("from users where name='" +u.getName() + "' and password='" + u.getPassword() + "'");
		List<users> lst = query.list();
		if (lst.isEmpty())
			return 0;
		else
			return 1;

	}

}
