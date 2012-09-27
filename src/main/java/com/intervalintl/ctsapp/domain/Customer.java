package com.intervalintl.ctsapp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMER")
public class Customer {
	
	@Id
	@Column(name="ID")
	@GeneratedValue
	private long id;
	
	@Column(name="CUST_FIRSTNAME")
	private String firstname;
	
	@Column(name="CUST_LASTNAME")
	private String lastname;
	
	@Column(name="CUST_ADDRESS1")
	private String address1;
	
	@Column(name="CUST_ADDRESS2")
	private String address2;
	
	@Column(name="CUST_CITY")
	private String city;
	
	@Column(name="CUST_STATE")
	private String state;
	
	@Column(name="CUST_ZIP")
	private String zip;
	
	@Column(name="CUST_STATUS")
	private String status;
	
	@Column(name="CUST_EMAIL")
	private String email;
	
	@Column(name="CUST_MAIN_PHONE")
	private String telephone;

	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	
	
}
