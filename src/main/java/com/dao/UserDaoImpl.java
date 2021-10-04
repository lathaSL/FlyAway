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

import com.dto.User;

public class UserDaoImpl implements UserDao {
	
	private SessionFactory factory;
	
	public UserDaoImpl() {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
		factory = meta.getSessionFactoryBuilder().build();
	}

	@Override

	public boolean validateUser(User user) {
		// TODO Auto-generated method stub
		
		String uName=user.getUserName();
		String pwd=user.getPwd();
		try {		
		Session session  = factory.openSession();
		Transaction txn = session.beginTransaction();
		String hql = "FROM User user where user.userName= :uName and user.pwd=:pwd";
		TypedQuery<User> query = session.createQuery(hql);
		query.setParameter("uName", uName);
		query.setParameter("pwd", pwd);
		 query.getSingleResult();
		}
	catch(Exception e){
		return false;
	}
		
		//DB chk
		
		return true;
		}
	@Override

	public int insertUser(User user) {
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
	@Override
	public boolean changePwd(User user, String newPwd) {
		// TODO Auto-generated method stub
		
		String uName=user.getUserName();
		String pwd=user.getPwd();
		try {		
		Session session  = factory.openSession();
		Transaction txn = session.beginTransaction();
//		String hql = "SELECT user.userid FROM User user where user.userName=:uName and user.pwd=:pwd";
		String hql = "update User user set user.pwd=:newPwd where user.userName=:uName and user.pwd=:pwd";
		TypedQuery<String> query = session.createQuery(hql);
		query.setParameter("uName", uName);
		query.setParameter("pwd", pwd);
		query.setParameter("newPwd", newPwd);
//		System.out.println(query.getSingleResult().toString());
//		System.out.println(query.getSingleResult().toString());
//		System.out.println(query.getSingleResult().toString());
		int i =query.executeUpdate();
//		int i=((Long)(Object)ids.get(0)).intValue();
//		User user1 = session.get(User.class,1);
//		user1.setPwd(newPwd);
//		session.update(user1);
		txn.commit();
		session.close();
//		String hql = "Update User user set user.password= "+newPwd+" where user.username= "+uName +" and user.password= "+pwd;
//		TypedQuery<User> query = session.createQuery(hql);
//		 query.getSingleResult();
		 
		}
	catch(Exception e){
		e.printStackTrace();
		return false;
	}
		return true;
	}
		}
