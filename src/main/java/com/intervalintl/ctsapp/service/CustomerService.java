package com.intervalintl.ctsapp.service;

import java.util.List;

import com.intervalintl.ctsapp.domain.Customer;

public interface CustomerService {

	public void addCustomer(Customer customer);
	public List<Customer> listCustomer();
	public void removeCustomer(Long id);
	
}
