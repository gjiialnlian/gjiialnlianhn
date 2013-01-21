package com.hn.util;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import org.safehaus.uuid.UUIDGenerator;

public class IDGeneratorUtil {
	
	private static int idGenerationStrategy			= 1;
	private static UUIDGenerator jugGenerator		= null;
	
	private static Random generator					= null;
	private static Integer INT_CUST_LOWER_BOUND		= 200000000; // (200,000,000) = 200 M
	private static Integer INT_CUST_UPPER_BOUND		= 999999999; // (999,999,990) = 999 M

	public static String generateID(String randomKey, String applicationCode) {
		StringBuilder genID = new StringBuilder("");
		jugGenerator = UUIDGenerator.getInstance();
		
		String procUUID = null;
		switch(idGenerationStrategy) {
			case -999:
			case 0:
				break;
			case 1:
				org.safehaus.uuid.UUID jugUUID = jugGenerator.generateTimeBasedUUID();
				procUUID = sanitizeUUID(jugUUID.toString().hashCode());
				jugUUID = null;
				break;
			case 2:
				Calendar cal = GregorianCalendar.getInstance();
				long millis = cal.getTimeInMillis();
				org.safehaus.uuid.UUID tempUUID = jugGenerator.generateTimeBasedUUID();
				StringBuilder joinUUID = new StringBuilder("");
				joinUUID.append(millis).append(tempUUID.toString());
				procUUID = sanitizeUUID(joinUUID.toString().hashCode());
				break;
		}
		String split1 = procUUID.substring(0,6);
		genID.append(randomKey);
		genID.append(split1);
		
		return genID.toString();
	}
	
	private static String sanitizeUUID(int hashedUUID) {
		StringBuilder sUID = new StringBuilder();
		
		// Convert to String.
		String theUID = String.valueOf(hashedUUID);
		// Replace all '-' instances.
		theUID = theUID.replaceAll("-", "");
		// Pad with zero prefixes
		theUID = padTruncateValue(10, theUID);
		// append to StringBuilder
		sUID.append(theUID);
		
		return sUID.toString();
	}
	
	private static String padTruncateValue(int target, String value) {
		StringBuilder retValue = new StringBuilder("");

		int len = value.length();
		if (len == target) {
			retValue.append(value);
		} else if (len < target) {
			int diff = target - len;
			for (int i = 0; i < diff; i++)
				retValue.append("0");
			retValue.append(value);
		} else {
			int diff = len - target;
			retValue.append(value.substring(diff));
		}
		
		return retValue.toString();
	}
	
	public static Integer generateRandomIntegerID() {
		Integer result = generator.nextInt(INT_CUST_UPPER_BOUND - INT_CUST_LOWER_BOUND);
		result += INT_CUST_LOWER_BOUND;
		
		return result;
	}
}
