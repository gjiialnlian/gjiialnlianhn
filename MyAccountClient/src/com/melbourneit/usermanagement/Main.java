package com.melbourneit.usermanagement;

import java.rmi.RemoteException;

import org.apache.axis.client.Stub;

import com.melbourneit.usermanagement.client.MyAccountVO;
import com.melbourneit.usermanagement.service.MyAccountServicePortType;
import com.melbourneit.usermanagement.service.MyAccountServicePortTypeProxy;

public class Main {
	
	private static final String WS_CLIENT = "http://mit-jboss-uat.mmeapi.net:8380/UserManagement/services/MyAccountService";
	
	public static void main(String[] args) {
		
		MyAccountServicePortTypeProxy proxy = new MyAccountServicePortTypeProxy();
		Stub stub = (Stub) proxy.getMyAccountServicePortType();		
		stub._setProperty(javax.xml.rpc.Stub.ENDPOINT_ADDRESS_PROPERTY, WS_CLIENT);
		MyAccountServicePortType myAccount = (MyAccountServicePortType) stub;
		
		try {
			MyAccountVO account = myAccount.getMyAccount("THOBBINS");
			
			System.out.println(account.getAddress1());
			System.out.println(account.getAddress2());
			System.out.println(account.getAddress3());
			System.out.println(account.getFirstname());
			System.out.println(account.getLastname());
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
