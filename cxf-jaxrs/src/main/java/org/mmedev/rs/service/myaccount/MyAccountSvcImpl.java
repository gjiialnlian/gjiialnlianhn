package org.mmedev.rs.service.myaccount;

import java.util.logging.Logger;
import javax.ws.rs.core.Response;
import javax.xml.namespace.QName;
import org.mmedev.rs.model.MyAccount;
import org.mmedev.rs.service.GenericSvc;
import com.melbourneit.usermanagement.client.myaccount.MyAccountVO;
import com.melbourneit.usermanagement.service.myaccount.MyAccountService;
import com.melbourneit.usermanagement.service.myaccount.MyAccountServicePortType;
import com.melbourneit.util.WSDL;

public class MyAccountSvcImpl extends GenericSvc<MyAccountVO,MyAccountServicePortType> implements MyAccountSvc{
	
	private static Logger logger = Logger.getLogger(MyAccountSvcImpl.class.toString());

	public MyAccountSvcImpl() {
		super(WSDL.MY_ACCOUNT.getLocation(), new QName(MyAccountVO.HTTP_MEL_USERMANAGEMENT_NS, "MyAccountService"));
		connectToWS();
	}
	
	public Response getMyAccount(String id) {
		return getMyAccountFromWS(id);
	}

	public Response getMyAccountJson(String id) {
		return getMyAccountFromWS(id);
	}
	
	private Response getMyAccountFromWS(String id){
		MyAccount account = new MyAccount();
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
	        account.setMessage(acco.getMessage().getValue());
	        account.setMobile(acco.getMobile().getValue());
	        account.setOrganisation(acco.getOrganisation().getValue());
	        account.setPartyId(acco.getPartyId());
	        account.setPartyType(acco.getPartyType().getValue());
	        account.setPhone(acco.getPassword().getValue());
	        account.setPostcode(acco.getPostcode().getValue());
	        account.setResult(acco.getResult().getValue());
	        account.setState(acco.getState().getValue());
	        account.setStatus(acco.getStatus().getValue());
	        account.setSuburb(acco.getSuburb().getValue());
	        account.setType(acco.getType().getValue());
		}catch (Exception e) {
			logger.info(e.getMessage());
			this.message = e.getMessage();
			this.result = 0;
		}
        
		return generateProcessResponse(account, result, message);
	}
	
	public MyAccountServicePortType getHttpPortType(){
		MyAccountService ss = new MyAccountService(wsdlURL, SERVICE_NAME);
		return ss.getServiceHttpPort();
	}
}
