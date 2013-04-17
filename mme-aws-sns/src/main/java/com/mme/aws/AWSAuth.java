package com.mme.aws;

import java.util.ResourceBundle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.amazonaws.services.cloudsearch.model.BaseException;
import com.mme.util.StringUtil;

public class AWSAuth {
	private static final String RESOURCE_MAP  	= "com.mme.resources.aws";
    private static ResourceBundle loc = null;
    private static Logger logger = LoggerFactory.getLogger(AWSAuth.class);
    
    private static String SECRET_KEY;
    private static String ACCESS_KEY;
    
    private static AWSAuth AWS_AUTH;
    
	static {
		try{
			loc = ResourceBundle.getBundle(RESOURCE_MAP);
			SECRET_KEY = loc.getString("secretKey");
			ACCESS_KEY = loc.getString("accessKey");

			if(loc == null)
				throw new BaseException("No resource map found. "+RESOURCE_MAP+" is Missing.");
			
			if(StringUtil.isEmpty(SECRET_KEY))
				throw new BaseException("SECRET_KEY is empty. Check configuration in "+RESOURCE_MAP);
			else if(StringUtil.isEmpty(ACCESS_KEY))
				throw new BaseException("ACCESS_KEY is empty. Check configuration in "+RESOURCE_MAP);
			
		}catch(BaseException e){
			logger.error(e.toString(),e);
		}
	}
	
	public AWSAuth() {
		if(AWS_AUTH == null)
			AWS_AUTH = this;
	}
	
	/**
     * Get single AWSAuth instance
     * 
     * @param expression 
     * @param defaultValue - value to use instead 
     * @return
     */
	public static AWSAuth getInstance(){
		if(AWS_AUTH != null)
			return AWS_AUTH;
		else
			return new AWSAuth();
	}

	/**
     * Get single AWS secret key
     * 
     * @param expression 
     * @param defaultValue - value to use instead 
     * @return
     */
	public String getSECRET_KEY() {
		return SECRET_KEY;
	}

	/**
     * Get single AWS access key
     * 
     * @param expression 
     * @param defaultValue - value to use instead 
     * @return
     */
	public String getACCESS_KEY() {
		return ACCESS_KEY;
	}
}
