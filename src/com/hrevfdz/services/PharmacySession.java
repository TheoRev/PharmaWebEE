package com.hrevfdz.services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class PharmacySession {
	
	private Session session;

	public PharmacySession() {
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		session = sessionFactory.openSession();
		session.beginTransaction();
	}

	public Session getSession() {
		return session;
	}

//	@Autowired
//	private SessionFactory sessionFactory;
//
//	public Session getSession() {
//		return sessionFactory.getCurrentSession();
//	}

}
