package org.mmedev.rs.service.notification;

import javax.ws.rs.core.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.mme.aws.sns.client.SNSTopic;
public class NotificationSvcImpl implements NotificationSvc{
	
	private static Logger logger = LoggerFactory.getLogger(NotificationSvcImpl.class);

	@Override
	public Response testNotification() {
		logger.info("######### Notification Testing ...");
		
		SNSTopic topic = new SNSTopic();
		String topicArn = topic.create("TestTopic102");
		//topic.delete(topicArn);
		
		return Response.ok().build();
	}
	
	
}
