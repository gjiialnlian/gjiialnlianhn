package com.mme.model.manager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class DBTWOPersistenceManager extends PersistenceManager{

	private static final String PERSISTENCE_UNIT = "DEMOSYSTEM";
	private static EntityManagerFactory factory = null;     /* FOR SINGLETON */
    
	static{
        if(factory == null){
            factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        }
    }
	
	public static EntityManager getPersistenceManager() {
		return factory.createEntityManager();
	}
}
