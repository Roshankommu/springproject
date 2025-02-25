package com.company.contact.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import com.fasterxml.jackson.annotation.JsonProperty;

@Document(collection = "contact") // MongoDB Collection Name
@Data
public class Contact {
		@JsonProperty("firstName")
	 	private String firstname;
		@JsonProperty("lastName")
	    private String lastname;
	    private String phoneAreaCode;
	    private String phoneNumber;
	    private String email;
	    private String companyName;
	    private String description;
	    
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
		public String getPhoneAreaCode() {
			return phoneAreaCode;
		}
		public void setPhoneAreaCode(String phoneAreaCode) {
			this.phoneAreaCode = phoneAreaCode;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getCompanyName() {
			return companyName;
		}
		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
	
	   
	    
	}
