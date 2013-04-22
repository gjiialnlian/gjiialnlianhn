package com.mme.model.dao;

import com.mme.model.dao.impl.ContactDaoImpl;


public final class DaoFactory {

	private DaoFactory(){}
   
    public static ContactDao getContactDao(){
        return new ContactDaoImpl();
    }
}