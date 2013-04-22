package com.mme.model.dao.impl;

import com.mme.model.dao.ContactDao;
import com.mme.model.entity.Contact;

public class ContactDaoImpl extends GenericDaoImpl<Contact> implements ContactDao{

    public ContactDaoImpl(){
        super(Contact.class);
    }
}	
	

