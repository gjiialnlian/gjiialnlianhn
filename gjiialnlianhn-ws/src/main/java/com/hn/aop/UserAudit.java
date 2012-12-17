package com.hn.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class UserAudit extends GenericAudit{

	private static final Logger logger = Logger.getLogger(UserAudit.class);
	private static final String AOP_SERVICE = "UserService";
	private static final String AOP_DAONAME = "UserDao";
	private static final String AOP_GET_ALL_SERVICE = "execution(* com.hn.service.user.UserService.getAll(..))";
	private static final String AOP_GET_ALL_DAO = "execution(* com.hn.dao.user.UserDao.getAll(..))";
	private static final String AOP_ADD_SERVICE = "execution(* com.hn.service.user.UserService.add(..))";
	private static final String AOP_INSERT_DAO = "execution(* com.hn.dao.user.UserDao.insert(..))";
	private static final String AOP_EDIT_SERVICE = "execution(* com.hn.service.user.UserService.edit(..))";
	private static final String AOP_UPDATE_DAO = "execution(* com.hn.dao.user.UserDao.update(..))";
	private static final String AOP_DELETE_SERVICE = "execution(* com.hn.service.user.UserService.delete(..))";
	private static final String AOP_DELETE_DAO = "execution(* com.hn.dao.user.UserDao.delete(..))";
	private static final String AOP_RESULT = "result";
	private static final String AOP_ERROR = "error";

	public UserAudit() {
		super(logger,AOP_SERVICE,AOP_DAONAME);
	}
	
	// SERVICE LOGGING 
	// GET_ALL 
	@Before(AOP_GET_ALL_SERVICE)
	@Override
	public void logGetAllServiceBefore(JoinPoint joinPoint) {
		super.logGetAllDaoBefore(joinPoint);
	}
	
	@AfterReturning(
		      pointcut = AOP_GET_ALL_SERVICE,
		      returning= AOP_RESULT)
	@Override
	public void logGetAllServiceAfter(JoinPoint joinPoint, Object result) {
		super.logGetAllServiceAfter(joinPoint, result);
	}
	
	@AfterThrowing(
		      pointcut = AOP_GET_ALL_SERVICE,
		      throwing= AOP_ERROR)
	@Override
	public void logGetAllServiceError(JoinPoint joinPoint, Throwable error) {
		super.logGetAllServiceError(joinPoint, error);
	}
	
	// ADD
	@Before(AOP_ADD_SERVICE)
	@Override
	public void logAddServiceBefore(JoinPoint joinPoint) {
		super.logAddServiceBefore(joinPoint);
	}
	
	@AfterReturning(
		      pointcut = AOP_ADD_SERVICE,
		      returning= AOP_RESULT)
	@Override
	public void logAddServiceAfter(JoinPoint joinPoint, Object result) {
		super.logAddServiceAfter(joinPoint, result);
	}
	
	@AfterThrowing(
		      pointcut = AOP_ADD_SERVICE,
		      throwing= AOP_ERROR)
	@Override
	public void logAddServiceError(JoinPoint joinPoint, Throwable error) {
		super.logAddServiceError(joinPoint, error);
	}
	
	// EDIT
	@Before(AOP_EDIT_SERVICE)
	@Override
	public void logEditServiceBefore(JoinPoint joinPoint) {
		super.logEditServiceBefore(joinPoint);
	}
	
	@AfterReturning(
		      pointcut = AOP_EDIT_SERVICE,
		      returning= AOP_RESULT)
	@Override
	public void logEditServiceAfter(JoinPoint joinPoint, Object result) {
		super.logEditServiceAfter(joinPoint, result);
	}
	
	@AfterThrowing(
		      pointcut = AOP_EDIT_SERVICE,
		      throwing= AOP_ERROR)
	@Override
	public void logEditServiceError(JoinPoint joinPoint, Throwable error) {
		super.logEditServiceError(joinPoint, error);
	}
	
	// DELETE
	@Before(AOP_DELETE_SERVICE)
	@Override
	public void logDeleteServiceBefore(JoinPoint joinPoint) {
		super.logDeleteServiceBefore(joinPoint);
	}
	
	@AfterReturning(
		      pointcut = AOP_DELETE_SERVICE,
		      returning= AOP_RESULT)
	@Override
	public void logDeleteServiceAfter(JoinPoint joinPoint, Object result) {
		super.logDeleteServiceAfter(joinPoint, result);
	}
	
	@AfterThrowing(
		      pointcut = AOP_DELETE_SERVICE,
		      throwing= AOP_ERROR)
	@Override
	public void logDeleteServiceError(JoinPoint joinPoint, Throwable error) {
		super.logDeleteServiceError(joinPoint, error);
	}
	
	// DAO LOGGING
	// GET_ALL 
	@Before(AOP_GET_ALL_DAO)
	@Override
	public void logGetAllDaoBefore(JoinPoint joinPoint) {
		super.logGetAllDaoBefore(joinPoint);
	}
	
	@AfterReturning(
		      pointcut = AOP_GET_ALL_DAO,
		      returning= AOP_RESULT)
	@Override
	public void logGetAllDaoAfter(JoinPoint joinPoint, Object result) {
		super.logGetAllServiceAfter(joinPoint, result);
	}
	
	@AfterThrowing(
		      pointcut = AOP_GET_ALL_DAO,
		      throwing= AOP_ERROR)
	@Override
	public void logGetAllDaoError(JoinPoint joinPoint, Throwable error) {
		super.logGetAllServiceError(joinPoint, error);
	}
	
	// ADD
	@Before(AOP_INSERT_DAO)
	@Override
	public void logInsertDaoBefore(JoinPoint joinPoint) {
		super.logInsertDaoBefore(joinPoint);
	}
	
	@AfterReturning(
		      pointcut = AOP_INSERT_DAO,
		      returning= AOP_RESULT)
	@Override
	public void logInsertDaoAfter(JoinPoint joinPoint, Object result) {
		super.logInsertDaoAfter(joinPoint, result);
	}
	
	@AfterThrowing(
		      pointcut = AOP_INSERT_DAO,
		      throwing= AOP_ERROR)
	@Override
	public void logInsertDaoError(JoinPoint joinPoint, Throwable error) {
		super.logInsertDaoError(joinPoint, error);
	}
	
	// UPDATE
	@Before(AOP_UPDATE_DAO)
	@Override
	public void logUpdateDaoBefore(JoinPoint joinPoint) {
		super.logUpdateDaoBefore(joinPoint);
	}
	
	@AfterReturning(
		      pointcut = AOP_UPDATE_DAO,
		      returning= AOP_RESULT)
	@Override
	public void logUpdateDaoAfter(JoinPoint joinPoint, Object result) {
		super.logUpdateDaoAfter(joinPoint, result);
	}
	
	@AfterThrowing(
		      pointcut = AOP_UPDATE_DAO,
		      throwing= AOP_ERROR)
	@Override
	public void logUpdateDaoError(JoinPoint joinPoint, Throwable error) {
		super.logUpdateDaoError(joinPoint, error);
	}
	
	// DELETE
	@Before(AOP_DELETE_DAO)
	@Override
	public void logDeleteDaoBefore(JoinPoint joinPoint) {
		super.logDeleteDaoBefore(joinPoint);
	}
	
	@AfterReturning(
		      pointcut = AOP_DELETE_DAO,
		      returning= AOP_RESULT)
	@Override
	public void logDeleteDaoAfter(JoinPoint joinPoint, Object result) {
		super.logDeleteDaoAfter(joinPoint, result);
	}
	
	@AfterThrowing(
		      pointcut = AOP_DELETE_DAO,
		      throwing= AOP_ERROR)
	@Override
	public void logDeleteDaoError(JoinPoint joinPoint, Throwable error) {
		super.logDeleteDaoError(joinPoint, error);
	}
}

