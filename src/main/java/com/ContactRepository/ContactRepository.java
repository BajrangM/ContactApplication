package com.ContactRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ContactEntity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
