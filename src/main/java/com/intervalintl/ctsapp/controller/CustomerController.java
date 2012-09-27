package com.intervalintl.ctsapp.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.intervalintl.ctsapp.domain.Customer;
import com.intervalintl.ctsapp.service.CustomerService;

@Controller
@SessionAttributes
public class CustomerController {
	
	private CustomerService customerService;
	private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);
	
	@RequestMapping(value="/customer")
	public String listCustomers(Map<String, Object> map) {
		map.put("customer", new Customer());
		map.put("customerList", customerService.listCustomer());
		return "customer";
	}
	
	@RequestMapping(value = "/addCustomer", method = RequestMethod.POST)
	public String addCustomer(@ModelAttribute("customer") Customer customer, BindingResult result) {
		
		customerService.addCustomer(customer);
		
		logger.info("Welcome Customers! First Name: " + customer.getFirstname() + " Last Name: " + customer.getLastname());
		
		return "redirect:/index";
	}

	@RequestMapping("/delete/{customerId}")
	public String deleteCustomer(@PathVariable("customerId") Long customerId) {
		
		customerService.removeCustomer(customerId);
		
		return "redirect:/index";
	}
}
