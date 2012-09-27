package com.intervalintl.ctsapp.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.intervalintl.ctsapp.domain.Customer;


public class SampleCustomer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Sample
		insertCustomer();
	}

	public static void insertCustomer() {

		Session session = null;
		
		try {
			// This step will read hibernate.cfg.xml and prepare hibernate for use
			SessionFactory sessionFactory = new Configuration().configure()
					.buildSessionFactory();
			session = sessionFactory.openSession();
			// Create new instance of Contact and set values in it by reading them from form object
			System.out.println("Inserting Record");
			Customer customer = new Customer();
			customer.setId(10);
			customer.setFirstname("Deepak");
			customer.setLastname("Kumar");
			customer.setAddress1("584 SW 85th Street");
			customer.setAddress2("");
			customer.setCity("Lamier");
			customer.setState("Chicago");
			customer.setZip("99999");
			customer.setTelephone("3334561234");
			customer.setStatus("A");
			customer.setEmail("deepak@yahoo.com");
		} catch (Exception e) {
			// Send exception
			System.out.println(e.getMessage());
			
		} finally {
			// Actual customer insertion will happen at this step
			session.flush();
			session.close();
		}
	}
}
