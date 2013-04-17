package com.mme.aws.sns.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.amazonaws.services.sns.AmazonSNS;
import com.amazonaws.services.sns.model.ListSubscriptionsByTopicRequest;
import com.amazonaws.services.sns.model.ListSubscriptionsByTopicResult;
import com.amazonaws.services.sns.model.ListSubscriptionsResult;
import com.amazonaws.services.sns.model.SubscribeRequest;
import com.amazonaws.services.sns.model.SubscribeResult;
import com.amazonaws.services.sns.model.Subscription;
import com.amazonaws.services.sns.model.UnsubscribeRequest;
import com.mme.aws.sns.client.SNSClient;
import com.mme.aws.sns.constant.Protocol;

public class SNSSubscription {
	
	private AmazonSNS sns;
	
	public SNSSubscription() {
		this.sns = SNSClient.getInstance().getSns();
	}
	
	/**
     * Subscribe
     * 
     * @param topicarn, protocol, endpoint
     * @return  subscriptionArn
     */
	public String subscribe(String topicArn, String protocol, String endpoint){
		SubscribeRequest req = new SubscribeRequest(topicArn, protocol, endpoint);
		SubscribeResult result = getSns().subscribe(req);
		return result.getSubscriptionArn();
	}
	
	/**
     * Subscribe by EMAIL
     * 
     * @param topicarn, endpoint
     * @return  subscriptionArn
     */
	public String subscribeByEmail(String topicArn, String endpoint){
		return subscribe(topicArn, Protocol.EMAIL.toString(), endpoint);
	}
	
	/**
     * Subscribe by SQS
     * 
     * @param topicarn, endpoint
     * @return  subscriptionArn
     */
	public String subscribeBySQS(String topicArn, String endpoint){
		return subscribe(topicArn, Protocol.SQS.toString(), endpoint);
	}
	
	/**
     * Subscribe by SMS
     * 
     * @param topicarn, endpoint
     * @return  subscriptionArn
     */
	public String subscribeBySMS(String topicArn, String endpoint){
		return subscribe(topicArn, Protocol.SMS.toString(), endpoint);
	}
	
	/**
     * Subscribe by HTTP
     * 
     * @param topicarn, endpoint
     * @return  subscriptionArn
     */
	public String subscribeByHTTP(String topicArn, String endpoint){
		return subscribe(topicArn, Protocol.HTTP.toString(), endpoint);
	}
	
	/**
     * Subscribe by HTTPS
     * 
     * @param topicarn, endpoint
     * @return  subscriptionArn
     */
	public String subscribeByHTTPS(String topicArn, String endpoint){
		return subscribe(topicArn, Protocol.HTTPS.toString(), endpoint);
	}
	
	/**
     * unsubscribe
     * 
     * @param subscriptionArn
     * @return 
     */
	public void unsubscribe(String subscriptionArn){
		UnsubscribeRequest  req = new UnsubscribeRequest(subscriptionArn);
		getSns().unsubscribe(req);
	}
	
	/**
     * Get all subscription
     * 
     * @param
     * @return List of Subscription
     */
	public List<Subscription> getList(){
		ListSubscriptionsResult result = getSns().listSubscriptions();
		if(result != null)
			return result.getSubscriptions();
		else
			return Collections.emptyList();
	}
	
	/**
     * Get all subscription by topic
     * 
     * @param topicArn
     * @return List of Subscription
     */
	public List<Subscription> getListByTopic(String topicArn){
		ListSubscriptionsByTopicResult result = getSns().listSubscriptionsByTopic(new ListSubscriptionsByTopicRequest(topicArn));
		if(result != null)
			return result.getSubscriptions();
		else
			return Collections.emptyList();
	}
	
	/**
     * Check if subscription exist
     * 
     * @param topicArn,subscriptionArn
     * @return boolean
     */
	public boolean isExist(String topicArn, String subscriptionArn){
		List<Subscription> subList = new ArrayList<Subscription>();
		
		for(Subscription sub: subList){
			if(topicArn.equals(sub.getTopicArn()) && subscriptionArn.equals(sub.getSubscriptionArn()))
				return true;
		}

		return false;
	}

	private AmazonSNS getSns() {
		return sns;
	}
}
