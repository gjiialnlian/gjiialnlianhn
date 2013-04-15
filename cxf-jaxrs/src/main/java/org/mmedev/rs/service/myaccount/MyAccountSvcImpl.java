package org.mmedev.rs.service.myaccount;

import javax.ws.rs.core.Response;
import javax.xml.namespace.QName;
import javax.xml.ws.WebServiceException;
import org.apache.camel.ProducerTemplate;
import org.mmedev.rs.model.MyAccount;
import org.mmedev.rs.service.GenericSvc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.melbourneit.usermanagement.client.myaccount.MyAccountVO;
import com.melbourneit.usermanagement.service.myaccount.MyAccountService;
import com.melbourneit.usermanagement.service.myaccount.MyAccountServicePortType;
import com.melbourneit.util.WSDL;

public class MyAccountSvcImpl extends GenericSvc<MyAccountVO,MyAccountServicePortType> implements MyAccountSvc{
	
	private static Logger logger = LoggerFactory.getLogger(MyAccountSvcImpl.class);
	
	private ProducerTemplate producer;

	public MyAccountSvcImpl() {
		super(WSDL.MY_ACCOUNT.getLocation(), new QName(MyAccountVO.HTTP_MEL_USERMANAGEMENT_NS, "MyAccountService"));
		connectToWS();
	}
	
	public Response getMyAccountXml(String id) {
		return getMyAccount(id);
	}

	public Response getMyAccountJson(String id) {
		return getMyAccount(id);
	}
	
	public Response getMyAccount(String id) {
		MyAccount account = (MyAccount) producer.requestBody("direct:getMyAccount", id);
		return generateProcessResponse(account, 200); 
	}
	
	
	public MyAccount getMyAccountRoute(String id){
		MyAccount account = new MyAccount();
		int result = 1;
		
		logger.info("###########getMyAccount ROUTER ....");
		
		try{
			MyAccountVO acco = SERVICE_PORT.getMyAccount(id);

	        account.setAddress1(acco.getAddress1().getValue());
	        account.setAddress2(acco.getAddress2().getValue());
	        account.setAddress3(acco.getAddress3().getValue());
	        account.setChannel(acco.getChannel().getValue());
	        account.setCountryCode(acco.getCountryCode().getValue());
	        account.setEmail(acco.getEmail().getValue());
	        account.setFax(acco.getFax().getValue());
	        account.setFirstname(acco.getFirstname().getValue());
	        account.setLastname(acco.getLastname().getValue());
	        account.setLogin(acco.getLogin().getValue());
	        account.setMobile(acco.getMobile().getValue());
	        account.setOrganisation(acco.getOrganisation().getValue());
	        account.setPartyId(acco.getPartyId());
	        account.setPartyType(acco.getPartyType().getValue());
	        account.setPhone(acco.getPassword().getValue());
	        account.setPostcode(acco.getPostcode().getValue());
	        account.setState(acco.getState().getValue());
	        account.setStatus(acco.getStatus().getValue());
	        account.setSuburb(acco.getSuburb().getValue());
	        account.setType(acco.getType().getValue());
	        
	        account.setResponseMessage(acco.getMessage().getValue());
	        account.setResponseResult(acco.getResult().getValue());
	        account.setResponseCode("200");
	        
		}catch (WebServiceException e) {
			account.setResponseResult("failed");
			account.setResponseMessage("Connection Timeout.");
			account.setResponseCode("504");
			logger.error(e.getMessage());
		}catch (Exception e) {
			account.setResponseResult("failed");
			account.setResponseMessage("Server Error : "+e.getMessage());
			account.setResponseCode("500");
			result = 0;
			logger.error(e.getMessage());
		}
		return account;
	}
	
	public Response getMyAccountFromWS(String id){
		MyAccount account = new MyAccount();
		int result = 1;
		
		try{
			MyAccountVO acco = SERVICE_PORT.getMyAccount(id);

	        account.setAddress1(acco.getAddress1().getValue());
	        account.setAddress2(acco.getAddress2().getValue());
	        account.setAddress3(acco.getAddress3().getValue());
	        account.setChannel(acco.getChannel().getValue());
	        account.setCountryCode(acco.getCountryCode().getValue());
	        account.setEmail(acco.getEmail().getValue());
	        account.setFax(acco.getFax().getValue());
	        account.setFirstname(acco.getFirstname().getValue());
	        account.setLastname(acco.getLastname().getValue());
	        account.setLogin(acco.getLogin().getValue());
	        account.setMobile(acco.getMobile().getValue());
	        account.setOrganisation(acco.getOrganisation().getValue());
	        account.setPartyId(acco.getPartyId());
	        account.setPartyType(acco.getPartyType().getValue());
	        account.setPhone(acco.getPassword().getValue());
	        account.setPostcode(acco.getPostcode().getValue());
	        account.setState(acco.getState().getValue());
	        account.setStatus(acco.getStatus().getValue());
	        account.setSuburb(acco.getSuburb().getValue());
	        account.setType(acco.getType().getValue());
	        
	        account.setResponseMessage(acco.getMessage().getValue());
	        account.setResponseResult(acco.getResult().getValue());
	        account.setResponseCode("200");
	        
		}catch (WebServiceException e) {
			account.setResponseResult("failed");
			account.setResponseMessage("Connection Timeout.");
			account.setResponseCode("504");
			logger.error(e.getMessage());
		}catch (Exception e) {
			account.setResponseResult("failed");
			account.setResponseMessage("Server Error : "+e.getMessage());
			account.setResponseCode("500");
			result = 0;
			logger.error(e.getMessage());
		}
        
		return generateProcessResponse(account, result);
	}
	
	public MyAccountServicePortType getHttpPortType(){
		MyAccountService ss = new MyAccountService(wsdlURL, SERVICE_NAME);
		return ss.getServiceHttpPort();
	}

	public ProducerTemplate getProducer() {
		return producer;
	}

	public void setProducer(ProducerTemplate producer) {
		this.producer = producer;
	}
}
