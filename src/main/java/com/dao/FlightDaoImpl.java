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

public class FlightDaoImpl implements FlightDao {
	private SessionFactory factory;

public FlightDaoImpl() {
	StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
    Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
	factory = meta.getSessionFactoryBuilder().build();
	
}
	@Override
	public int AddFlight(Flight flight) {
	
			Integer flightId = null;
			Session session = factory.openSession();
			Transaction txn = session.beginTransaction();
			// save methods adds new row into database table
			flightId = (Integer) session.save(flight);
			txn.commit();
			session.close();
		
		return flightId;
	}

	@Override
	public boolean RemoveFlight(Flight flight) {
		// TODO Auto-generated method stub
		return false;
	}
	public List<Flight> getFlightList() {
		try {		
			Session session  = factory.openSession();
			Transaction txn = session.beginTransaction();
			String hql = "FROM Flight flight";
			TypedQuery<Flight> query = session.createQuery(hql);
			List<Flight> resultSet= query.getResultList();
			 session.close();
			 return resultSet;
				}
		catch(Exception e){
			
			return null;
			
		}
	}
	public String getFlightName(int flightId) {
		try {		
			Session session  = factory.openSession();
			Transaction txn = session.beginTransaction();
			String hql = "Select flight.flightName FROM Flight flight where flightId=:fltId";
			TypedQuery<String> query = session.createQuery(hql);
		query.setParameter("fltId", flightId);
			 String result= query.getSingleResult();
			 session.close();
			 return result;
			
			}
		catch(Exception e){
			return null;
		}
			
	}
	
	public String getFlightCode(int flightId) {
		try {		
			Session session  = factory.openSession();
			Transaction txn = session.beginTransaction();
			String hql = "Select flight.flightCode FROM Flight flight where flightId=:fltId";
			TypedQuery<String> query = session.createQuery(hql);
		query.setParameter("fltId", flightId);
			 String result= query.getSingleResult();
			 session.close();
			 return result;
			
			}
		catch(Exception e){
			return null;
		}
	}
		
		public Flight getFlight(int flightId) {
			try {		
				Session session  = factory.openSession();
				Transaction txn = session.beginTransaction();
				String hql = "FROM Flight flight where flightId=:fltId";
				TypedQuery<Flight> query = session.createQuery(hql);
			query.setParameter("fltId", flightId);
				Flight result= query.getSingleResult();
				 session.close();
				 return result;
				
				}
			catch(Exception e){
				return null;
			}
			
	}
}
