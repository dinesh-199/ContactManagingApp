package com.ashok.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashok.contactrepo.ContactRepo;
import com.ashok.entity.Contact;
import com.ashok.service.ContactService;

@Service
public class ContactImpl implements ContactService {
	
	
	@Autowired
	private ContactRepo conReop;

	@Override
	public String SaveContact(Contact contact) {
		
		contact= conReop.save(contact);
		
		if(contact.getContactId() !=null)
		{
		return "Contact Saved";
		}
		else {
			return "Contact Failed To Saved";
			
		}		
	}

	@Override
	public List<Contact> getContact() {
		
		return conReop.findAll();
	}

	@Override
	public Contact getContactById(int contactId) {
		
		Optional<Contact> findById = conReop.findById(contactId);
		
		if(findById.isPresent())
		{
			return findById.get();
		}
		
		return null;
	}

	@Override
	public String updateContact(Contact contact) {
		
		if(conReop.existsById(contact.getContactId()))
		{
			conReop.save(contact);
			
		return "Update Success";
		}
		else
		{
			return "No Record Found";
		}
		
	}

	@Override
	public String deleteContact(int contactId) {
		
		if(conReop.existsById(contactId))
		{
			conReop.deleteById(contactId);
			
			return "Record Deleted";
		}
		else
		{
			return "Record Not Found";

		}
			}
	
	
	
	

	/*
	 * public void saveContactdetails(Contact con) {
	 * 
	 * conReop.save(con); }
	 * 
	 * public List<Contact> getContactDetails() {
	 * 
	 * List<Contact> findl = conReop.findAll();
	 * 
	 * return findl;
	 * 
	 * }
	 */

}