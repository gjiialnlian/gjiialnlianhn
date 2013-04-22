package com.mme.model.dao.impl;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import com.mme.model.dao.GenericDao;
import com.mme.model.manager.PersistenceManager;

public abstract class GenericDaoImpl<T> implements GenericDao<T>{

    private EntityManager entityManager = null;
    private Class<T>  entityClass = null;

    public GenericDaoImpl(Class<T> c) {
    	entityClass = c;
    }

    /** 
    * Searches an Entity using the <code>id</code> passed.
    * @param Long id
    * @return Object if found, otherwise <code>null</code>
    */
    @Override
    public T findById(String id) {
        T o = null;
        
        try {
            setEntityManager(PersistenceManager.getEntityManager(entityClass));
            o = getEntityManager().find(entityClass, id);
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            closeEntityManager();
        }
        return o;
    }

    /** 
    * Searches a list of Entities using the <code>sql</code> passed.
    * @param String sql
    * @return <code>List<Object></code> if found, otherwise <code>null</code>
    */
    @Override
    @SuppressWarnings("unchecked")
	public List<T> findAll(String sql) {
        List<T> list = null;
        Query query = null;
        
        try {
            setEntityManager(PersistenceManager.getEntityManager(entityClass));
            query = getEntityManager().createQuery(sql);
            list = query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            closeEntityManager();
        }
        return list;
    }

    /** 
    * Persists the entity passed.
    * @param Object o
    * @return <code>true</code> if saving succeed, otherwise <code>false</code>
    */
    @Override
    public boolean save(T o) {
        boolean result = false;
        try {
        	setEntityManager(PersistenceManager.getEntityManager(entityClass));
            getEntityManager().getTransaction().begin();
            getEntityManager().persist(o);
            getEntityManager().flush();
            getEntityManager().getTransaction().commit();
           
            result = true;
        } catch (Exception e) {
            getEntityManager().getTransaction().rollback();
            e.printStackTrace();
        }finally{
            closeEntityManager();
        }
        return result;
    }

    /** 
    * Updates the entity passed.
    * @param Object o
    * @return <code>true</code> if saving succeed, otherwise <code>false</code>
    */
    @Override
    public boolean update(T o) {
        boolean result = false;
        try {
        	setEntityManager(PersistenceManager.getEntityManager(entityClass));
            getEntityManager().getTransaction().begin();
            getEntityManager().merge(o);
            getEntityManager().flush();
            getEntityManager().getTransaction().commit();
            
            result = true;
        } catch (Exception e) {
            getEntityManager().getTransaction().rollback();
            e.printStackTrace();
        }finally{
            closeEntityManager();
        }
        return result;
    }
    
    /** 
    * Deletes the entity passed.
    * @param Object o
    * @return <code>true</code> if deleting succeed, otherwise <code>false</code>
    */
    @Override
    public boolean delete(T o) {
        boolean result = false;
        try {
        	setEntityManager(PersistenceManager.getEntityManager(entityClass));
            getEntityManager().getTransaction().begin();
            getEntityManager().remove(getEntityManager().merge(o));
            getEntityManager().flush();
            getEntityManager().getTransaction().commit();
            
            result = true;
        } catch (Exception e) {
            getEntityManager().getTransaction().rollback();
            e.printStackTrace();
        }finally{
            closeEntityManager();
        }
        return result;
    }

    protected  EntityManager getEntityManager() {
        return entityManager;
    }

    protected void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    protected void closeEntityManager(){
        if(this.entityManager != null){
            this.entityManager.close();
        }
    }
}