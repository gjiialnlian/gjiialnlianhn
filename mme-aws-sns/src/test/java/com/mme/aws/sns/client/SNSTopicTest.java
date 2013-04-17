package com.mme.aws.sns.client;

import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;

public class SNSTopicTest extends CamelTestSupport{
	
	@Test
	public void testTopic(){
		String name = "TopicTest101";
		String message = "TestOnly";
		String subject = "TestOnly";
		SNSTopic snsTopic = new SNSTopic();
		String topicArn = snsTopic.create(name);
		assertNotNull(topicArn);
		assertTrue(snsTopic.isExist(topicArn));
		assertNotNull(snsTopic.getList());
		assertNotNull(snsTopic.getAttributes(topicArn));
		snsTopic.publish(topicArn, message);
		snsTopic.publish(topicArn, message, subject);
		new SNSTopic().delete(topicArn);
		assertTrue(true);
	}
}
