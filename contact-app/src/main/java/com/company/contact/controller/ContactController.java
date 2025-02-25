package com.company.contact.controller;

import java.util.List;
import jakarta.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.contact.model.Contact;
import com.company.contact.repository.ContactRepository;
import com.company.contact.service.ContactService;

@RestController
@RequestMapping("/api/contacts")
@CrossOrigin(origins = {"http://localhost:5173", "http://localhost:5174", "http://localhost:5175"})
public class ContactController {

	@Autowired
	private ContactService contactService;
	
	@PostMapping
   public Contact createContact(@RequestBody Contact contact)
   {
		return contactService.saveContact(contact);
    }

    // Retrieve all contacts
    @GetMapping
    public List<Contact> getAllContacts() {
        return contactService.getAllContacts();
    }
}
