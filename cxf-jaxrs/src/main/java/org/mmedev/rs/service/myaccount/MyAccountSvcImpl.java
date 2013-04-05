package org.mmedev.rs.service.myaccount;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBIntrospector;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;

import org.mmedev.rs.model.MyAccount;
import org.mmedev.rs.model.User;

import com.melbourneit.usermanagement.client.MyAccountVO;
import com.melbourneit.usermanagement.service.MyAccountService;
import com.melbourneit.usermanagement.service.MyAccountServicePortType;

public class MyAccountSvcImpl implements MyAccountSvc{
	
	 private static final QName SERVICE_NAME = new QName("http://service.usermanagement.melbourneit.com", "MyAccountService");
	
	public Object getElementValue(JAXBElement element) {
		Object obj = null;
		
		try{
	         // Create JAXBContext
	         JAXBContext jc = JAXBContext.newInstance();
	         JAXBIntrospector introspector = jc.createJAXBIntrospector();
	         
	         // create unmarshaller
	         Unmarshaller u = jc.createUnmarshaller();
      
	         // get value
	         obj = introspector.getValue(element);
	         
	      }catch(Exception e){
	         e.printStackTrace();
	      }
		return obj;
	}
	
	@Override
	public MyAccount getMyAccount(String id) {
		
		URL wsdlURL = MyAccountService.WSDL_LOCATION;

        MyAccountService ss = new MyAccountService(wsdlURL, SERVICE_NAME);
        MyAccountServicePortType port = ss.getMyAccountServiceHttpPort();
       
       
        
        
        MyAccountVO acco = port.getMyAccount(id);
        
        
        {
        System.out.println("Invoking isMyAccountOptedIn...");
      //  boolean _isMyAccountOptedIn__return = port.isMyAccountOptedIn(id);
       // System.out.println("isMyAccountOptedIn.result=" + _isMyAccountOptedIn__return);
        }
		
		
//		MyAccountService service = new MyAccountService();
//		MyAccountServicePortType  port = service.getMyAccountServiceHttpPort();
//		MyAccountVO accountVO = port.getMyAccount(id);
//		
//		MyAccount account =	new MyAccount();
//		
//		
//		getElementValue(accountVO.getAddress1());
//		

		
		return null;
		
		
		
	}
}
