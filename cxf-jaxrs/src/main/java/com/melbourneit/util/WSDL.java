package com.melbourneit.util;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public enum WSDL {
	MY_ACCOUNT("myaccount","MyAccountService.wsdl");
	
	private static final String WSDL_RESOURCE_MAP  	= "com.nws.resources.environment";
    private static ResourceBundle wsdlLoc = null;
    private static Map<String,URL> WSDL_CNTR = new HashMap<String,URL>();
    private static Logger logger = LoggerFactory.getLogger(WSDL.class);
    
	static {
		try{
			wsdlLoc = ResourceBundle.getBundle(WSDL_RESOURCE_MAP);
			String resourceMap = wsdlLoc.getString("wsdl.dir");
			File file = new File(resourceMap);
			
			for (WSDL table : WSDL.values()) {
				WSDL_CNTR.put(table.id, new URL(file.toURI().toURL()+File.separator+table.wsdl));
		    }
		}catch(MalformedURLException e) {
			logger.error(e.toString(),e);
		}catch(Exception e){
			logger.error(e.toString(),e);
		}
	}
	
	private String id;
	private String wsdl;
	
	private WSDL(String id, String wsdl) {
		this.id=id;
		this.wsdl = wsdl;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getWsdl() {
		return wsdl;
	}

	public void setWsdl(String wsdl) {
		this.wsdl = wsdl;
	}
	
	public URL getLocation(){
		return WSDL_CNTR.get(this.getId());
	}
	
	public static WSDL find(String id) {
	    for (WSDL table : WSDL.values()) {
	    	 if (id.equalsIgnoreCase(table.id)) 
	            return table;
	    }
	    return null;
	}
}
