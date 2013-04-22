package com.mme.test;

import java.util.List;

import org.apache.log4j.Logger;
import com.mme.model.dao.DaoFactory;
import com.mme.model.entity.Contact;

public class TestContact{	
	
	private static final Logger logger = Logger.getLogger(TestContact.class);

	public static void main(String[] args){
		logger.info("Test Contact demo begins...");
		
		// ADD Contact
		Contact contact = new Contact();
		contact.setPartyId("Contact1");
		contact.setLogin("MyLoginId");
		contact.setPartyType("test");
		contact.setEmail("testEmail");
		contact.setFirstname("testFname");
		contact.setLastname("testLAst");
		contact.setMobile("testMobile");
		contact.setPhone("testPhone");
		contact.setOrganisation("testORg");
		contact.setFax("testFax");
		contact.setAddress1("testAdd1");
		contact.setAddress2("testAdd2");
		contact.setAddress3("testAdd3");
		contact.setPostcode("4234");
		contact.setChannel("test");
		contact.setCountryCode("US");
		contact.setState("CA");
		contact.setStatus("ACTIVE");
		contact.setSuburb("Comp");
		contact.setType("Business");
		
		boolean ADD = DaoFactory.getContactDao().save(contact);
		System.out.println("======== ADD ======= ");
		System.out.println("ADDED - "+ADD);
		System.out.println("PartyId - "+contact.getPartyId());
	
		// FIND BY ID
		contact = DaoFactory.getContactDao().findById(contact.getPartyId());
		System.out.println("======== FIND BY ID ========= ");
		System.out.println("PartyId - "+contact.getPartyId());

		// FIND ALL BY SQL QUERY
		 String sql = "SELECT c FROM Contact c ORDER BY firstname";
		List<Contact> list = DaoFactory.getContactDao().findAll(sql);
		
		System.out.println("======== FIND ALL BY SQL QUERY ========= ");
		for(Contact c : list){
			System.out.println("PartyId - "+c.getPartyId());
		}
		
		// UPDATE Contact
		contact.setFirstname("UpdatedFNAME");
		contact.setLastname("UpdatedLNAME");
		boolean UPDATED = DaoFactory.getContactDao().update(contact);
		System.out.println("UPDATED - "+UPDATED);
		System.out.println("PartyId - "+contact.getPartyId());
		
		// DELETE Contact
		boolean DELETED = DaoFactory.getContactDao().delete(contact);
		System.out.println("DELETED - "+DELETED);
		System.out.println("PartyId - "+contact.getPartyId());  
	}

}