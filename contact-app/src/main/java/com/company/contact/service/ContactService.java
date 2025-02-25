package com.company.contact.service;

import com.company.contact.model.Contact;
import com.company.contact.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;				
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
@Service
public class ContactService {
	@Autowired
	 private ContactRepository contactRepository;
	
	private static final Logger logger = LoggerFactory.getLogger(ContactService.class);
	public String saveDetails(Contact contact) {
	logger.info("Received Contact Details: {}",contact);
	String validationMessage = validationCheck(contact);
	if(!validationMessage.equals("Valid"))
	{
		logger.warn("Validation Failed: {}", validationMessage);
		return validationMessage;
	}
		contactRepository.save(contact);
		  logger.info("Contact Form saved successfully: {}", contact);              
	        return "Your response is saved successfully. Thank you!";
	        
	}
	public String validationCheck(Contact contact) {
        if (!StringUtils.hasText(contact.getFirstname())) {
            return "First Name cannot be empty";
        }
        if (!StringUtils.hasText(contact.getLastname())) {
            return "Last Name cannot be empty";
        }
        if (contact.getPhoneNumber() == null || String.valueOf(contact.getPhoneNumber()).length() != 10) {
            return "Invalid Mobile Number. It should be 10 digits";
        }
        if (!StringUtils.hasText(contact.getEmail()) || !contact.getEmail().matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            return "Invalid Email Format";
        }
        if (!StringUtils.hasText(contact.getCompanyName())) {
            return "Company name should not be null! If fresher, please enter 'N/A'";
        }
        if (contact.getCompanyName() == null || contact.getCompanyName().isEmpty()) {
            return "Message cannot be empty. If nothing, please enter 'NA'";
        }
        if(contact.getDescription()==null) {
        	return "If nothing please enter NA";
        }
        return "Valid";
    }
	   
	
		public Contact saveContact(Contact contact)
		{
			return contactRepository.save(contact);
		}
	    public List<Contact> getAllContacts() {
	        return contactRepository.findAll();
	    }
}
