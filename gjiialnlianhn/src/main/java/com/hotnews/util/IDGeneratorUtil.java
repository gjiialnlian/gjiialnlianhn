package com.hotnews.util;

import java.util.Random;

import com.hotnews.constant.CategoryTable;

public class IDGeneratorUtil {
	
	public static String getDBGeneratedId(CategoryTable catTable){
		return catTable.getPrefix()+getMemberGeneratedId();
	}
	
	public static String getMemberGeneratedId(){
		int bit = 4;
		String memberId = generateId(bit);
		
		while(!(memberId != null && memberId.length() == (2*bit))){
			memberId = generateId(bit);	
		}

		return memberId;
	}
	
	public static String getMediaGeneratedId(){
		int bit = 8;
		String memberId = generateId(bit);
		
		while(!(memberId != null && memberId.length() == (2*bit))){
			memberId = generateId(bit);	
		}

		return memberId;
	}

	public static String generateId(int bit){
		byte random[] = new byte[bit];
		 Random randomGenerator = new Random();
		 StringBuilder buffer = new StringBuilder();
		 randomGenerator.nextBytes(random);

		 for (int j = 0; j < random.length; j++){
		        byte b1 = (byte) ((random[j] & 0xf0) >> 4);
		        byte b2 = (byte) (random[j] & 0x0f);
		        if (b1 < 10)
		            buffer.append((char) ('0' + b1));
		        else
		            buffer.append((char) ('A' + (b1 - 10)));
		        if (b2 < 10)
		            buffer.append((char) ('0' + b2));
		        else
		            buffer.append((char) ('A' + (b2 - 10)));
		 }
		 return buffer.toString();
	}
}
