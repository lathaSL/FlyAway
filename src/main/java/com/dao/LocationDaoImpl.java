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

import com.dto.Flight;
import com.dto.Location;

public class LocationDaoImpl implements LocationDao {
	private SessionFactory factory;

public LocationDaoImpl() {
	StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
    Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
	factory = meta.getSessionFactoryBuilder().build();
	
}
	@Override
	public int AddLoc(Location loc) {
	
			Integer locId = null;
			Session session = factory.openSession();
			Transaction txn = session.beginTransaction();
			// save methods adds new row into database table
			locId = (Integer) session.save(loc);
			txn.commit();
			session.close();
		
		return locId;
	}

	@Override
	public boolean RemoveLoc(Location loc) {
		// TODO Auto-generated method stub
		return false;
	}
	public List<Location> getLocList() {
		try {		
			Session session  = factory.openSession();
			Transaction txn = session.beginTransaction();
			String hql = "FROM Location loc";
			TypedQuery<Location> query = session.createQuery(hql);
			List<Location> resultSet= query.getResultList();
			 session.close();
			 return resultSet;
				}
		catch(Exception e){
			return null;
		}
		
	}
	public String getLocName(int locId) {
		try {		
			Session session  = factory.openSession();
			Transaction txn = session.beginTransaction();
			String hql = "Select loc.locname FROM Location loc where loccode=:locId";
			TypedQuery<String> query = session.createQuery(hql);
			query.setParameter("locId", locId);
			String result= query.getSingleResult();
			 session.close();
			 return result;
				}
		catch(Exception e){
			return null;
		}
		
	}
	public Location getLocation(int locId) {
		try {		
			Session session  = factory.openSession();
			Transaction txn = session.beginTransaction();
			String hql = "FROM Location loc where locid=:locId";
			TypedQuery<Location> query = session.createQuery(hql);
			query.setParameter("locId", locId);
			Location result= query.getSingleResult();
			 session.close();
			 return result;
				}
		catch(Exception e){
			return null;
		}
		
	}
}
