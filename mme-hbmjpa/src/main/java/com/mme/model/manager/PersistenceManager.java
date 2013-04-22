package com.mme.model.manager;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.persistence.EntityManager;
import javax.transaction.UserTransaction;
import com.mme.model.constant.Persistence;

public abstract class PersistenceManager {

    public static final String USER_TRANSACTION = "java:comp/UserTransaction";
    
    public static UserTransaction getTransaction(){
        UserTransaction utx = null;
        try{
            Context jndiCntx = new InitialContext( );
            utx = (UserTransaction) jndiCntx.lookup(USER_TRANSACTION);
        }catch (Exception e){
            e.printStackTrace();
        }
        return utx;
    }
    
    public static EntityManager getEntityManager(Class<?> ent){
    	return Persistence.getPersistenceManager(ent);
    }
}
