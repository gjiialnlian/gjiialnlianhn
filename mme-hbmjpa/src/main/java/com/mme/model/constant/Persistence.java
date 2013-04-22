package com.mme.model.constant;

import javax.persistence.EntityManager;
import com.mme.model.manager.DBONEPersistenceManager;
import com.mme.model.manager.DBTWOPersistenceManager;
import com.mme.util.StringUtil;

public enum Persistence {
	CONTACT("com.mme.model.entity.Contact", DBSchema.DBONE),
	PARTY("com.mme.model.entity.Party", DBSchema.DBTWO);
	
	private Persistence(String entity, DBSchema schema) {
		this.entity=entity;
		this.schema=schema;
	}
	
	private String entity;
	private DBSchema schema;
	
	public String getEntity() {
		return entity;
	}
	public void setEntity(String entity) {
		this.entity = entity;
	}
	public DBSchema getSchema() {
		return schema;
	}
	public void setSchema(DBSchema schema) {
		this.schema = schema;
	}
	
	public static Persistence find(String name) {
	    for (Persistence per : Persistence.values()) {
	        if (StringUtil.containsIgnoreCase(name, per.entity)) {
	            return per;
	        }
	    }
	    return null;
	}
	
	public static EntityManager getPersistenceManager(Class<?> ent){
		switch (find(ent.toString()).getSchema()) {
		case DBONE:
			
			return DBONEPersistenceManager.getPersistenceManager();
		case DBTWO:
			return DBTWOPersistenceManager.getPersistenceManager();	
		default:
			return DBONEPersistenceManager.getPersistenceManager();
		}
	}
}
