package com.intervalintl.ctsapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.intervalintl.ctsapp.dao.CustomerDAO;
import com.intervalintl.ctsapp.domain.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO customerDAO;
	
	@Transactional
	public void addCustomer(Customer customer) {
		customerDAO.addCustomer(customer);
		
	}

	@Transactional
	public List<Customer> listCustomer() {

		return customerDAO.listCustomer();
	}

	@Transactional
	public void removeCustomer(Long id) {
		customerDAO.removeCustomer(id);
		
	}

}
