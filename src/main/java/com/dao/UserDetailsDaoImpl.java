package com.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.dto.UserDetails;


public class UserDetailsDaoImpl implements UserDetailsDao {
	
	private SessionFactory factory;
	
	public UserDetailsDaoImpl() {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
		factory = meta.getSessionFactoryBuilder().build();
	}

	@Override
	public int addUser(UserDetails user) {
		// TODO Auto-generated method stub
		
		Integer userId = null;
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		// save methods adds new row into database table
		userId = (Integer) session.save(user);
		txn.commit();
		session.close();
		return userId;
		}
}