package com.mme.aws.sns.client;

import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;

import com.mme.aws.sns.constant.Protocol;

public class SNSSubscriptionTest extends CamelTestSupport{
	
	private static final String topicArn = "arn:aws:sns:us-east-1:223870957216:Topic101";
	
	@Test
	public void testSubscribe(){
		String protocol = Protocol.EMAIL.toString();
		String endpoint = "harrism@nwsol.com";
		assertNotNull(new SNSSubscription().subscribe(topicArn, protocol, endpoint));
	}
	
	@Test
	public void testSubscribeByEmail(){
		String endpoint = "harrism@nwsol.com";
		assertNotNull(new SNSSubscription().subscribeByEmail(topicArn, endpoint));
	}
	
	public void testSubscribeByHTTP(){
		String topicArn = "";
		String endpoint = "";
		//assertNotNull(new SNSSubscription().subscribeByHTTP(topicArn, endpoint));
	}
	
	public void testSubscribeBySMS(){
		String topicArn = "";
		String endpoint = "";
		//assertNotNull(new SNSSubscription().subscribeBySMS(topicArn, endpoint));
	}
	
	public void testSubscribeBySQS(){
		String endpoint = "";
		//assertNotNull(new SNSSubscription().subscribeBySQS(topicArn, endpoint));
	}
	
	public void testGetList(){
		assertNotNull(new SNSSubscription().getList());
	}
	
	public void testGetListByTopic(){
		String topicArn = "";
		assertNotNull(new SNSSubscription().getListByTopic(topicArn));
	}
}
