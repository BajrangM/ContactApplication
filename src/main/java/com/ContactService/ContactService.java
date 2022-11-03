package com.ContactService;

import java.util.List;

import com.ContactEntity.Contact;

public interface ContactService {
	String upsert (Contact contact);  

	List<Contact> getAllContacts( );

	Contact getContact (int cid);

	String deleteContact (int cid);

}
