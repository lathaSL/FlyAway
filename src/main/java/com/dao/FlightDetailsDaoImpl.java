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
import com.dto.FlightDetails;
import com.dto.Location;

public class FlightDetailsDaoImpl implements FlightDetailsDao {
	private SessionFactory factory;

public FlightDetailsDaoImpl() {
	StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
    Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
	factory = meta.getSessionFactoryBuilder().build();
	
}
	@Override
	public int AddFlightDetails(FlightDetails flightDtls) {
	
			Integer flightDtlsId = null;
			Session session = factory.openSession();
			Transaction txn = session.beginTransaction();
			// save methods adds new row into database table
			flightDtlsId = (Integer) session.save(flightDtls);
			txn.commit();
			session.close();
		
		return flightDtlsId;
	}

	@Override
	public boolean RemoveFlightDetails(FlightDetails flightDtls) {
		// TODO Auto-generated method stub
		return false;
	}
	public List<FlightDetails> getFlightDetailsList() {
		try {		
			Session session  = factory.openSession();
			Transaction txn = session.beginTransaction();
			String hql = "FROM FlightDetails flightDtls";
			TypedQuery<FlightDetails> query = session.createQuery(hql);
		
			 return query.getResultList();
			}
		catch(Exception e){
			return null;
		}
		
	}
	
	public List<Flight> getFlightCodesList() {
		try {		
			Session session  = factory.openSession();
			Transaction txn = session.beginTransaction();
			String hql = "FROM Flight flight";
			TypedQuery<Flight> query = session.createQuery(hql);
		
			 return query.getResultList();
			}
		catch(Exception e){
			return null;
		}
		
	}
	
	public List<Location> getLocCodesList() {
		try {		
			Session session  = factory.openSession();
			Transaction txn = session.beginTransaction();
			String hql = "FROM Location loc";
			TypedQuery<Location> query = session.createQuery(hql);
		
			 return query.getResultList();
			}
		catch(Exception e){
			return null;
		}
		
	}
}
