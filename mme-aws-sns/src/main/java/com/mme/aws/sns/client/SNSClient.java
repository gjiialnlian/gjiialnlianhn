package com.mme.aws.sns.client;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.cloudsearch.model.BaseException;
import com.amazonaws.services.sns.AmazonSNS;
import com.amazonaws.services.sns.AmazonSNSClient;
import com.mme.aws.AWSAuth;

public class SNSClient {
	
	private static SNSClient SNSClient;
	private AmazonSNS sns;
	
	public SNSClient() {
		AWSCredentials credentials = new BasicAWSCredentials(AWSAuth.getInstance().getACCESS_KEY(), AWSAuth.getInstance().getSECRET_KEY());
		this.sns = new AmazonSNSClient(credentials);
		
		if(this.sns == null)
			throw new BaseException("AmazonSNS is null. It can't be. Check configuration.");
		
		if(SNSClient == null)
			SNSClient = this;
	}
	
	/**
     * Get new instance of SNSClient
     * 
     * @param expression 
     * @param defaultValue - value to use instead 
     * @return
     */
	public static SNSClient getNewInstance(){
		return new SNSClient();
	}
	
	/**
     * Get single instance of SNSClient
     * 
     * @param expression 
     * @param defaultValue - value to use instead 
     * @return
     */
	public static SNSClient getInstance(){
		if(SNSClient != null)
			return SNSClient;
		else
			return new SNSClient();
	}

	/**
     * Get Amazon SNS client
     * 
     * @param expression 
     * @param defaultValue - value to use instead 
     * @return
     */
	public AmazonSNS getSns() {
		return sns;
	}
}
