package org.mmedev.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyAccountLogger {
	
	private static Logger logger = LoggerFactory.getLogger(MyAccountLogger.class);
	
	public void log(){
		logger.info("################# Country code is AU! ###############");
	}
}
