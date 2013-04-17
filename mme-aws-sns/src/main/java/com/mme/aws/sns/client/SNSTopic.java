package com.mme.aws.sns.client;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.amazonaws.services.sns.AmazonSNS;
import com.amazonaws.services.sns.model.CreateTopicRequest;
import com.amazonaws.services.sns.model.CreateTopicResult;
import com.amazonaws.services.sns.model.DeleteTopicRequest;
import com.amazonaws.services.sns.model.GetTopicAttributesRequest;
import com.amazonaws.services.sns.model.GetTopicAttributesResult;
import com.amazonaws.services.sns.model.ListTopicsResult;
import com.amazonaws.services.sns.model.PublishRequest;
import com.amazonaws.services.sns.model.Topic;
import com.mme.aws.sns.client.SNSClient;

public class SNSTopic {
	
	private AmazonSNS sns;
	
	public SNSTopic() {
		this.sns = SNSClient.getInstance().getSns();
	}
	
	/**
     * Create new Topic
     * 
     * @param topic name 
     * @return AWS Topic Arn
     */
	public String create(String name){
		CreateTopicResult result = getSns().createTopic(new CreateTopicRequest(name));
		return result.getTopicArn();
	}
	
	/**
     * Delete Topic
     * 
     * @param topic arn 
     * @return
     */
	public void delete(String topicArn){
		DeleteTopicRequest req = new DeleteTopicRequest(topicArn);
		getSns().deleteTopic(req);
	}
	
	/**
     * Check if topic exist
     * 
     * @param topic arn 
     * @return boolean
     */
	public boolean isExist(String topicArn){
		Topic topic = new Topic();
		topic.setTopicArn(topicArn);
		return getList().contains(topic);
	}
		
	/**
     * Get all topics
     * 
     * @param
     * @return List of Topic
     */
	public List<Topic> getList(){
		ListTopicsResult result = getSns().listTopics();
		if(result != null)
			return result.getTopics();
		else
			return Collections.emptyList();
	}
	
	/**
     * Publish topic
     * 
     * @param topicarn, message
     * @return 
     */
	public void publish(String topicArn, String message){
		PublishRequest req = new PublishRequest(topicArn, message);
		getSns().publish(req);
	}
	
	/**
     * Publish topic
     * 
     * @param topicarn, message, subject
     * @return 
     */
	public void publish(String topicArn, String message, String subject){
		PublishRequest req = new PublishRequest(topicArn, message, subject);
		getSns().publish(req);
	}
	
	/**
     * Get Topic attributes
     * 
     * @param topicarn
     * @return Map<String,String>
     */
	public Map<String,String> getAttributes(String topicArn){
		GetTopicAttributesRequest  req = new GetTopicAttributesRequest(topicArn);
		GetTopicAttributesResult  result = getSns().getTopicAttributes(req);
		return result.getAttributes();
	}
	
	private AmazonSNS getSns() {
		return sns;
	}
}
