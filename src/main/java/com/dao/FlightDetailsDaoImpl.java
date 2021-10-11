package com.dao;

import java.util.Date;
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
import com.dto.FlightSearchResult;
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
			 List<FlightDetails> resultSet= query.getResultList();
			 session.close();
			 return resultSet;
			}
		catch(Exception e){
			return null;
		}
		
	}
	public List<FlightDetails> getFlightDetailsList(String flightDtlsId) {
		try {		
			Session session  = factory.openSession();
			Transaction txn = session.beginTransaction();
			String hql = "select distinct flightDtls FROM FlightDetails flightDtls\n"
					+ "	 join Flight flight  on  flightDtls.flight = flight.flightId\n"
					+ "	 join Location depLoc  on flightDtls.deploc=depLoc.locId \n"
					+ "	 join Location arrLoc  on flightDtls.arrloc=arrLoc.locId \n"
					+ "	 where flightDtls.flightDtlsId= :id";
			TypedQuery<FlightDetails> query = session.createQuery(hql);
			query.setParameter("id", Integer.parseInt(flightDtlsId));

			 List<FlightDetails> resultSet= query.getResultList();
			 session.close();
			 return resultSet;
			}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		
	}

	public  List<FlightDetails>  getFlightDetailsList (String flgtCode,String depLoc, String arrLoc,String depDate){
	try {		
		Session session  = factory.openSession();
		Transaction txn = session.beginTransaction();
		String whrClause = " where ";
		if (!flgtCode.isEmpty()) {
			whrClause=whrClause + " flight.flightId=  '" +flgtCode +"' and ";
			
		}
			
		if (!depLoc.isEmpty()) {
			whrClause=whrClause + " depLoc.locId=  '" +depLoc+"' and ";
			
		}
			
		if (!arrLoc.isEmpty()) {
			whrClause=whrClause + " arrLoc.locId= '" +arrLoc+"' and ";
			
		}
			
//		if (depDate.equals(null)) {
//			depDate=new Date();
//		}
		
//		whrClause=whrClause + " flightDtls.depLocCode =depLoc.locCode and " ;
//		whrClause=whrClause + " flightDtls.arrLocCode =arrLoc.locCode and " ;
//		whrClause=whrClause + " flightDtls.flightCode =flght.flightCode and " ;

			whrClause=whrClause + " flightDtls.depTime>=  str_to_date('" +depDate +"','%d/%m/%Y')";
			Flight fl=new Flight();
			fl=fl.getFlight(Integer.parseInt(flgtCode))	;
			
			String hql = "select distinct flightDtls FROM FlightDetails flightDtls"
					+ " join Flight flight  on  flightDtls.flight = flight.flightId"
					+ " join Location depLoc  on flightDtls.deploc=depLoc.locId "
					+ " join Location arrLoc  on flightDtls.arrloc=arrLoc.locId"
					 + whrClause;
		TypedQuery<FlightDetails> query = session.createQuery(hql);
		 List<FlightDetails> resultSet= query.getResultList();
		 session.close();
		 return resultSet;
		}
	catch(Exception e){
		e.printStackTrace();
		return null;
	}
	}
	public List<Flight> getFlightCodesList() {
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
	
	public List<Location> getLocCodesList() {
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
}
