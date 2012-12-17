package com.hn.aop;

import java.util.Arrays;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

public abstract class GenericAudit {

	private Logger logger = Logger.getLogger(GenericAudit.class);
	private String service;
	private String daoname;
	
	public GenericAudit() {}
	
	public GenericAudit(Logger logger, String service, String daoname) {
		this.logger=logger;
		this.service=service;
		this.daoname=daoname;
	}
	
	// GET_ALL
	public void logGetAllServiceBefore(JoinPoint joinPoint){
		logger.info("******************* "+service+" @Before ******************");
		logger.info("Method : "+joinPoint.getSignature().getName());
		logger.info("Parameters : " + Arrays.toString(joinPoint.getArgs()));
	}
	public void logGetAllServiceAfter(JoinPoint joinPoint, Object result){
		logger.info("******************* "+service+" @AfterReturning ******************");
		logger.info("Method : "+joinPoint.getSignature().getName());
		logger.info("Result : " + result);
	}
	public void logGetAllServiceError(JoinPoint joinPoint, Throwable error){
		logger.info("******************* "+service+" @AfterThrowing ******************");
		logger.info("Method : "+joinPoint.getSignature().getName());
		logger.info("Exception : " + error);
	}
	
	public void logGetAllDaoBefore(JoinPoint joinPoint){
		logger.info("******************* "+daoname+" @Before ******************");
		logger.info("Method : "+joinPoint.getSignature().getName());
		logger.info("Parameters : " + Arrays.toString(joinPoint.getArgs()));
	}
	
	public void logGetAllDaoAfter(JoinPoint joinPoint, Object result){
		logger.info("******************* "+daoname+" @AfterReturning ******************");
		logger.info("Method : "+joinPoint.getSignature().getName());
		logger.info("Result : " + result);
	}
	
	public void logGetAllDaoError(JoinPoint joinPoint, Throwable error){
		logger.info("******************* "+daoname+" @AfterThrowing ******************");
		logger.info("Method : "+joinPoint.getSignature().getName());
		logger.info("Exception : " + error);
	}
	
	// ADD or INSERT
	public void logAddServiceBefore(JoinPoint joinPoint){
		logger.info("******************* "+service+" @Before ******************");
		logger.info("Method : "+joinPoint.getSignature().getName());
		logger.info("Parameters : " + Arrays.toString(joinPoint.getArgs()));
	}
	public void logAddServiceAfter(JoinPoint joinPoint, Object result){
		logger.info("******************* "+service+" @AfterReturning ******************");
		logger.info("Method : "+joinPoint.getSignature().getName());
		logger.info("Result : " + result);
	}
	public void logAddServiceError(JoinPoint joinPoint, Throwable error){
		logger.info("******************* "+service+" @AfterThrowing ******************");
		logger.info("Method : "+joinPoint.getSignature().getName());
		logger.info("Exception : " + error);
	}
	
	public void logInsertDaoBefore(JoinPoint joinPoint){
		logger.info("******************* "+daoname+" @Before ******************");
		logger.info("Method : "+joinPoint.getSignature().getName());
		logger.info("Parameters : " + Arrays.toString(joinPoint.getArgs()));
	}
	
	public void logInsertDaoAfter(JoinPoint joinPoint, Object result){
		logger.info("******************* "+daoname+" @AfterReturning ******************");
		logger.info("Method : "+joinPoint.getSignature().getName());
		logger.info("Result : " + result);
	}
	
	public void logInsertDaoError(JoinPoint joinPoint, Throwable error){
		logger.info("******************* "+daoname+" @AfterThrowing ******************");
		logger.info("Method : "+joinPoint.getSignature().getName());
		logger.info("Exception : " + error);
	}
	
	// EDIT or UPDATE
	public void logEditServiceBefore(JoinPoint joinPoint){
		logger.info("******************* "+service+" @Before ******************");
		logger.info("Method : "+joinPoint.getSignature().getName());
		logger.info("Parameters : " + Arrays.toString(joinPoint.getArgs()));
	}
	public void logEditServiceAfter(JoinPoint joinPoint, Object result){
		logger.info("******************* "+service+" @AfterReturning ******************");
		logger.info("Method : "+joinPoint.getSignature().getName());
		logger.info("Result : " + result);
	}
	public void logEditServiceError(JoinPoint joinPoint, Throwable error){
		logger.info("******************* "+service+" @AfterThrowing ******************");
		logger.info("Method : "+joinPoint.getSignature().getName());
		logger.info("Exception : " + error);
	}
	
	public void logUpdateDaoBefore(JoinPoint joinPoint){
		logger.info("******************* "+daoname+" @Before ******************");
		logger.info("Method : "+joinPoint.getSignature().getName());
		logger.info("Parameters : " + Arrays.toString(joinPoint.getArgs()));
	}
	
	public void logUpdateDaoAfter(JoinPoint joinPoint, Object result){
		logger.info("******************* "+daoname+" @AfterReturning ******************");
		logger.info("Method : "+joinPoint.getSignature().getName());
		logger.info("Result : " + result);
	}
	
	public void logUpdateDaoError(JoinPoint joinPoint, Throwable error){
		logger.info("******************* "+daoname+" @AfterThrowing ******************");
		logger.info("Method : "+joinPoint.getSignature().getName());
		logger.info("Exception : " + error);
	}
	
	// DELETE
	public void logDeleteServiceBefore(JoinPoint joinPoint){
		logger.info("******************* "+service+" @Before ******************");
		logger.info("Method : "+joinPoint.getSignature().getName());
		logger.info("Parameters : " + Arrays.toString(joinPoint.getArgs()));
	}
	public void logDeleteServiceAfter(JoinPoint joinPoint, Object result){
		logger.info("******************* "+service+" @AfterReturning ******************");
		logger.info("Method : "+joinPoint.getSignature().getName());
		logger.info("Result : " + result);
	}
	public void logDeleteServiceError(JoinPoint joinPoint, Throwable error){
		logger.info("******************* "+service+" @AfterThrowing ******************");
		logger.info("Method : "+joinPoint.getSignature().getName());
		logger.info("Exception : " + error);
	}
	
	public void logDeleteDaoBefore(JoinPoint joinPoint){
		logger.info("******************* "+daoname+" @Before ******************");
		logger.info("Method : "+joinPoint.getSignature().getName());
		logger.info("Parameters : " + Arrays.toString(joinPoint.getArgs()));
	}
	
	public void logDeleteDaoAfter(JoinPoint joinPoint, Object result){
		logger.info("******************* "+daoname+" @AfterReturning ******************");
		logger.info("Method : "+joinPoint.getSignature().getName());
		logger.info("Result : " + result);
	}
	
	public void logDeleteDaoError(JoinPoint joinPoint, Throwable error){
		logger.info("******************* "+daoname+" @AfterThrowing ******************");
		logger.info("Method : "+joinPoint.getSignature().getName());
		logger.info("Exception : " + error);
	}
}
