package com.ashok.contactrepo;

//import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashok.entity.Contact;

@Repository
public interface ContactRepo extends JpaRepository<Contact, Integer> {

	

}
