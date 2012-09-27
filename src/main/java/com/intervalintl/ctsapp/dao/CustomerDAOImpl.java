package com.intervalintl.ctsapp.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.intervalintl.ctsapp.domain.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void addCustomer(Customer customer) {
		sessionFactory.getCurrentSession().save(customer);
	}

	public List<Customer> listCustomer() {
		return sessionFactory.getCurrentSession().createQuery("from Customer").list();
	}

	public void removeCustomer(Long id) {
		Customer customer = (Customer) sessionFactory.getCurrentSession().load(Customer.class, id);
		if (null!= customer) {
			sessionFactory.getCurrentSession().delete(customer);
		}
	}

}
