package com.ashok.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Contact {
	
	public Contact(Integer contactId, String name, String email, long phno) {
		super();
		this.contactId = contactId;
		this.name = name;
		this.email = email;
		this.phno = phno;
	}

	@Override
	public String toString() {
		return "Contact [contactId=" + contactId + ", name=" + name + ", email=" + email + ", phno=" + phno + "]";
	}

	@Id
	@GeneratedValue
	private Integer contactId;
	private String name;
	private String email;
	private long phno;
	
	public Contact()
	{
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	public Integer getContactId() {
		return contactId;
	}

	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}

	


}
