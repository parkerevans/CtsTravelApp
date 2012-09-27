package com.intervalintl.ctsapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.intervalintl.ctsapp.domain.Contact;

@Controller
@SessionAttributes
public class ContactController {
	
	private static final Logger logger = LoggerFactory.getLogger(ContactController.class);
	
	@RequestMapping(value = "/addContact", method = RequestMethod.GET)
	public String addContact(@ModelAttribute("contact")	Contact contact, BindingResult result) {
		logger.info("Welcome Contacts! First Name: " + contact.getFirstname() + " Last Name: " + contact.getLastname());
		
		// return "redirect:contacts.html";
		return "contact_tl";
	}

	@RequestMapping("/contacts")
	public ModelAndView showContacts() {
		
		return new ModelAndView("contact", "command", new Contact());
	}
}
