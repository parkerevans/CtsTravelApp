package com.intervalintl.ctsapp.dao;

import java.util.List;

import com.intervalintl.ctsapp.domain.Customer;

public interface CustomerDAO {

	public void addCustomer(Customer customer);
	public List<Customer> listCustomer();
	public void removeCustomer(Long id);
	
}
