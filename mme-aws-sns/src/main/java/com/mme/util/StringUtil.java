package com.mme.util;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

public final class StringUtil {
	
	public static final String REGEX_NOHTML = "<[\\x20-\\x7E]*?>";
	public static final String REGEX_ALLOWEDURL = "((([fF][tT][pP])|([hH][tT][tT][pP])|([hH][tT][tT][pP][sS]))://)?([\\w\\x25\\x2E\\x2F\\x3D\\x3F\\x5F\\x26\\x2D]*)";
	public static final String REGEX_VALIDEMAIL = "(([+\\w\\x2D\\x2E\\x5F]*)@([\\w\\x2D\\x2E\\x5F]*))";
	
    private StringUtil()
    {
    }	
	
    /**
     * Check if expression result is not null otherwise use the default value
     * 
     * @param expression 
     * @param defaultValue - value to use instead 
     * @return
     */
    public static String ifNull(String exp, String defaultValue) {
    	return exp == null ? defaultValue : exp;
    }
    
    /**
     * Check if expression result is not null otherwise use the default value
     * 
     * @param expression 
     * @param defaultValue - value to use instead 
     * @return
     */
    public static String ifEmpty(String exp, String defaultValue) {
    	return isBlank(exp)  ? defaultValue : exp;
    }
    
    /**
     * Check if a String variable is blank or null
     * 
     * @param str the string to check
     * @return true or false
     */
	public static final boolean isBlank(String str) {
		return str == null || str.trim().length() == 0;
	}
	
	/**
     * Check if a String variable is blank or null
     * 
     * @param str the string to check
     * @return true or false
     */
	public static final boolean isNotBlank(String str) {
		return str != null && str.trim().length() > 0;
	}
	
	/**
	 * Converts String formatted string into an actual Java Date object
	 * 
	 * @param date - the string date value
	 * @param format - the format of the string date value
	 * @return java.util.Date object 
	 * @throws ParseException
	 */
	public static final Date strToDate(String date, String format)
			throws ParseException {
		DateFormat dt = new SimpleDateFormat(format);
		return dt.parse(date);
	}
	
	public static final String strToLocalFormat(String date, String dateFormat)
		throws ParseException {
		Date newDate = strToDate(date, dateFormat);
		DateFormat localFormat = DateFormat.getDateInstance();
		return localFormat.format(newDate);
	}
	

	
	/**
	 * Converts Date object to string
	 * 
	 * @param date - date object value
	 * @param format - the target format 
	 * @return date formatted string
	 * @throws ParseException
	 */
	public static final String dateToStr(Date date, String format)
			throws ParseException {
		DateFormat dt = new SimpleDateFormat(format);
		return dt.format(date);
	}

	/**
	 * Generates SHA-512 based Hash String    
	 * 
	 * @param salt - the private encryption key
	 * @param input - the target string to be encrypted 
	 * @return
	 */
	public static final String getHashString(String salt, String input) {
		String md5string = "";
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-512");
			StringBuilder sb = new StringBuilder();
			byte buf[] = (new StringBuilder()).append(salt).append(input)
					.toString().getBytes();
			
			byte md5[] = md.digest(buf);
			for (int i = 0; i < md5.length; i++) {
				String tmpStr = (new StringBuilder()).append("0").append(
						Integer.toHexString(0xff & md5[i])).toString();
				sb.append(tmpStr.substring(tmpStr.length() - 2));
			}

			md5string = sb.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return md5string;
	}
	
	/**
	 * Get the substring of a string    
	 * 
	 * @param value - String to be substring
	 * @param start - start index
	 * @param end - end index 
	 * @return
	 */
	public static final String getSubString(String value, int start, int end) {
		if(value==null){
			return "";
		}
		String newValue = value;
		if(end > value.length()){
			if(start < 0){
				return newValue.substring(0, value.length());
			}else{
				return newValue.substring(start, value.length());
			}
		}else{
			return newValue.substring(start, end);
		}
		
	}
	
	/**
	 * Pad characters to the left    
	 * 
	 * @param value - String value to pad
	 * @param pad - String pad
	 * @param numberOfPad - number of padding 
	 * @return
	 */
	public static final String padLeft(String value, String pad, int numberOfPad){		
		
		while(value.length() < numberOfPad){
			value = pad + value; 
		}
		
		return value;
	}
	
	/**
	 * Translates a string into application/x-www-form-urlencoded format for URL Links     
	 * 
	 * @param param - String URL to encode
	 * @return
	 */
	public static final String encodeURL(String param){		
		try {
			param = URLEncoder.encode(param, "UTF-8");
		} catch (UnsupportedEncodingException e) {

		}
		return param;
	}	
	
	/**
	 * Translates a string into application/x-www-form-urlencoded format for URL Links     
	 * 
	 * @param param - String URL to decode
	 * @return
	 */
	public static final String decodeURL(String param){		
		try {
			param = URLDecoder.decode(param, "UTF-8");
		} catch (UnsupportedEncodingException e) {

		}
		return param;
	}
	
	/**
	 * Check if string has html tags
	 * 
	 * @param input
	 * @return true if String has TAGS
	 */
	public static final boolean hasHTMLTag(String input) {
		if (isBlank(input)) return false; 
		return Pattern.compile(REGEX_NOHTML).matcher(input).find();
	}	
	
	/**
	 * Check if string is a valid URL 
	 * 
	 * @param input
	 * @return true if string is valid url
	 */
	public static final boolean isValidEmail(String input) {
		if (isBlank(input)) return false;
		
		if (Pattern.matches(REGEX_VALIDEMAIL, input)) {
			return true;
		}
		
		return false;
	}	
	
	public static final String removeInvalidCharFileName(String fileName) {
		String retStr = fileName.replace('/', ' ');
		retStr = retStr.replace('\n', ' ');
		retStr = retStr.replace('\r', ' ');
		retStr = retStr.replace('\t', ' ');
		retStr = retStr.replace('\0', ' ');
		retStr = retStr.replace('\f', ' ');
		retStr = retStr.replace('`', ' ');
		retStr = retStr.replace('?', ' ');
		retStr = retStr.replace('*', ' ');
		retStr = retStr.replace('\\', ' ');
		retStr = retStr.replace('<', ' ');
		retStr = retStr.replace('>', ' ');
		retStr = retStr.replace('|', ' ');
		retStr = retStr.replace('*', ' ');
		retStr = retStr.replace(':', ' ');
		
		return retStr;
	}
	
	public static final String emptyNullString(String str) {
		if(str==null) return "";
		else return str;
	}
	
	public static final String emptyNullObject(Object obj) {
		if(obj==null) return "";
		else return obj.toString();
	}
	
	public static final boolean isEmpty(String str) {
		str = emptyNullString(str).trim();
		return str.isEmpty();
	}
	
	public static final boolean isEmptyOrZeroValue(String str) {
		str = emptyNullString(str).trim();
		return str.isEmpty() || "0".equals(str);
	}

	/**
	 * @param address1
	 * @param address2
	 * @param city
	 * @param state
	 * @param zip
	 * @param country
	 * @return consolidated address
	 */
	public static final String consolidateAddress(String address1, String address2, 
			String city, String stateDesc, String zipCode, String country) {
		StringBuilder addressInfo = new StringBuilder();
		boolean flag=false;
		if(address1!=null && address1.trim().length()>0) {
			addressInfo.append(address1.trim());
			flag=true;
		}
		
		if(address2!=null && address2.trim().length()>0) {
			addressInfo.append(flag?" ":"");
			addressInfo.append(address2.trim());
		}

		if(city!=null && city.trim().length()>0) {
			addressInfo.append(flag?" ":"");
			addressInfo.append(city.trim());
		}
		
		if(stateDesc!=null && stateDesc.trim().length()>0) {
			addressInfo.append(flag?", ":"");
			addressInfo.append(stateDesc.trim());
		}
		
		if(zipCode!=null && zipCode.trim().length()>0) {
			addressInfo.append(flag?" ":"");
			addressInfo.append(zipCode.trim());
		}

		return addressInfo.toString();
	}	
	
	public static final String formatPhoneNumber(String area, String phone) {
		if(phone==null || phone.trim().length()<=0)  
			return null;
		if(area == null || area.trim().length()<=0) 
			return formatPhoneNumber(phone);
		
		return formatPhoneNumber(area + phone);
	}
	
	public static final String formatPhoneNumber(String phone) {
		if(phone==null || phone.trim().length()<=0) return phone;
		
		try {
			StringBuilder str = new StringBuilder();
			if(phone!=null && phone.length()>=3)
				str.append("(" + phone.substring(0,3) + ")");
			if(phone!=null && phone.length()>=6)
				str.append(" " + phone.substring(3,6));
			if(phone!=null && phone.length()>=10)
				str.append("-" + phone.substring(6));
			return str.toString();
		}catch(Exception e){
			return phone;
		}
		
	}
	public static final String shortenText(String str, int length ) {
		if(str!=null && str.length()>length)
			return str.substring(0, length) + "...";
		else
			return str;
	}
	
	public static final String toHtmlText(String str) {
		if(str==null) return str;
		
		//.replaceAll(String.valueOf(String.valueOf((char)34)), "&quot;")
		return encodeHtml(str)
					.replaceAll("\n", "<br/>")
					.replaceAll("\r", "<br/>")
					.replaceAll("\t", "&nbsp;")
					.replaceAll("<br/> ", "<br/>&nbsp;");
	}
	
	public static final String encodeQuote(String str) {
		if(str==null) return str;
		
		return encodeHtml(str)
					.replaceAll(String.valueOf(String.valueOf((char)34)), "&quot;");
	}
	
	public static final String encodeHtml(String str) {
		if(str==null) return str;
		
		//.replaceAll(String.valueOf(String.valueOf((char)34)), "&quot;")
		return str.replaceAll(String.valueOf(String.valueOf((char)38)), "&amp;")
					.replaceAll(String.valueOf(String.valueOf((char)60)), "&lt;")
					.replaceAll(String.valueOf(String.valueOf((char)62)), "&gt;")
					.replaceAll(String.valueOf(String.valueOf((char)8216)), "&lsquo;")
					.replaceAll(String.valueOf(String.valueOf((char)8217)), "&rsquo;")
					.replaceAll(String.valueOf(String.valueOf((char)8220)), "&ldquo;")
					.replaceAll(String.valueOf(String.valueOf((char)8221)), "&rdquo;")
					.replaceAll(String.valueOf(String.valueOf((char)8218)), "&sbquo;")
					.replaceAll(String.valueOf(String.valueOf((char)8222)), "&bdquo;")
					.replaceAll(String.valueOf(String.valueOf((char)8242)), "&prime;")
					.replaceAll(String.valueOf(String.valueOf((char)8243)), "&Prime;")
					.replaceAll(String.valueOf(String.valueOf((char)160)), "&nbsp;")
					.replaceAll(String.valueOf(String.valueOf((char)8208)), "-")
					.replaceAll(String.valueOf(String.valueOf((char)8211)), "&ndash;")
					.replaceAll(String.valueOf(String.valueOf((char)8212)), "&mdash;")
					.replaceAll(String.valueOf(String.valueOf((char)8194)), "&ensp;")
					.replaceAll(String.valueOf(String.valueOf((char)8195)), "&emsp;")
					.replaceAll(String.valueOf(String.valueOf((char)8201)), "&thinsp;")
					.replaceAll(String.valueOf(String.valueOf((char)166)), "&brvbar;")
					.replaceAll(String.valueOf(String.valueOf((char)8226)), "&bull;")
					.replaceAll(String.valueOf(String.valueOf((char)8227)), "-")
					.replaceAll(String.valueOf(String.valueOf((char)8230)), "&hellip;")
					.replaceAll(String.valueOf(String.valueOf((char)710)), "&circ;")
					.replaceAll(String.valueOf(String.valueOf((char)168)), "&uml;")
					.replaceAll(String.valueOf(String.valueOf((char)732)), "&tilde;")
					.replaceAll(String.valueOf(String.valueOf((char)8249)), "&lsaquo;")
					.replaceAll(String.valueOf(String.valueOf((char)8250)), "&rsaquo;")
					.replaceAll(String.valueOf(String.valueOf((char)171)), "&laquo;")
					.replaceAll(String.valueOf(String.valueOf((char)187)), "&raquo;")
					.replaceAll(String.valueOf(String.valueOf((char)8254)), "&oline;")
					.replaceAll(String.valueOf(String.valueOf((char)191)), "&iquest;")
					.replaceAll(String.valueOf(String.valueOf((char)161)), "&iexcl;")
					.replaceAll(String.valueOf(String.valueOf((char)8253)), "-");
	}	
	
	public static final String stripXSSChars(String str) {
		if(str==null) return str;
		return str.replaceAll("\\\"", "")
					.replaceAll("'", "")
					.replaceAll("&", "")
					.replaceAll("<", "")
					.replaceAll(">", "");
	}
	
	public static final String encodeUniCode(String str) {
		if(str==null) return str;
		
		StringBuilder strbuilder = new StringBuilder();
		char[] charArray = str.toCharArray();
		int len = charArray.length;

		for(int x=0;x<len;++x) {
			if(charArray[x]>=127)
				strbuilder.append("&#" + (int)charArray[x] + ";");
			else
				strbuilder.append(charArray[x]);
		}
		
		return strbuilder.toString();
	}
	
	public static final String trim(String s) {
		return s != null ? s.trim() : null;
	}
	
	public static final String ucaseFirstChar(String str) {
		StringBuilder sb = new StringBuilder();
		sb.append(Character.toUpperCase(str.charAt(0)));
		sb.append(str.substring(1));
		return sb.toString();
	}
	
	public static final String toString(Object obj) {
		if (obj != null) {
			return obj.toString();
		} else {
			return "";
		}
	}
	
	/**
	 * <p>Converts a stack trace into string for output in Log4j et al</p>
	 * @param e
	 * @return
	 */
	public static String stackToString(Exception e) {
	  try {
		  StringWriter sw = new StringWriter();
		  PrintWriter pw = new PrintWriter(sw);
		  e.printStackTrace(pw);
		  return sw.toString();
	  } catch(Exception ex) {
		  return "stack to string conversion error : " + ex.getMessage();
	  }
	 }
	
	public static final String replaceAllSpaces(String str) {
	    if(str==null) return str;
	    return str.replaceAll(" ", "_");
	}
	
	public static final String replaceAllUnderscore(String str) {
	    if(str==null) return str;
	    return str.replaceAll("_", " "); 
	}
	
	public static final String replaceAllSingleQuote(String str) {
	    if(str==null) return str;
	    return str.replaceAll("'", "");
	}
	
	public static final String replaceDoubleSingleQuote(String str){
		if(str==null) return str;
	    return str.replaceAll("''", "\"");
	}
	
	public static final String replaceAllSpecialCharacters(String str){
		if(str==null) return str;
	    return str.replaceAll("[[^_.a-zA-Z0-9]]", "_");
	}
	
	public static final String insertPrefix(String str,String prefix) {
	    if(str==null) return str;
	    return prefix + str;
	}
	
	public static String nullToString(String str, String replacementStr) {
		return str == null ? replacementStr : str;
	}
	
	public static String emptyToString(String str, String replacementStr) {
		return isBlank(str) ? replacementStr : str;
	}
	
	public static final String convertDateFormat(String date, String fromDateFormat, String toDateFormat) 
	  throws ParseException {
	  Date d = strToDate(date, fromDateFormat);
	  DateFormat localFormat = new SimpleDateFormat(toDateFormat);
	  return localFormat.format(d);
	}
	
	public static String formatPrimaryPhoneNo(String value) {
	  //ex. 800-5556255 x 37373
	  value = nullToString(value, "").trim();
		  
	  StringBuilder phoneNo = new StringBuilder("");
		  
	  if (!StringUtil.isBlank(value)) {
		  try {
			  String areaCode = nullToString(value.substring(0, value.indexOf("-")), "").trim(); // 800
			  phoneNo.append("1-"+areaCode.toString()+"-");
		  } catch (NullPointerException npe) { }
		  catch (Exception e) { }
		  
		  try {
			  String phone1 = nullToString(value.substring(value.indexOf("-") + 1, value.indexOf("-")+4), "").trim(); //555
			  String phone2 = nullToString(value.substring(value.indexOf("-") + 4, value.indexOf("x")-1), "").trim(); //6255
			  phoneNo.append(phone1.toString()+"-"+phone2.toString());
		  } catch (NullPointerException npe) { }
		  catch (Exception e) { }
		  
		  try {
			  String extension = nullToString(value.substring(value.indexOf("x") + 2, value.length()), "").trim(); //6255
			  phoneNo.append(" x "+extension.toString());
		  } catch (NullPointerException npe) { }
		  catch (Exception e) { }
	  }
	  
	  return phoneNo.toString(); //1-800-555-6255 x 37373
	}
	
	public static String formatBillingShippingAddress(String fullName, String companyName, String address1, String address2, String cityStateZip){
		StringBuilder addr = new StringBuilder("");
	  	
	  	fullName = StringUtil.toProperCase(fullName).trim();
		companyName = StringUtil.emptyNullString(companyName).trim();
		address1 = StringUtil.emptyNullString(address1).trim();
		address2 = StringUtil.emptyNullString(address2).trim();
		cityStateZip = StringUtil.emptyNullString(cityStateZip).trim();
		
		if (fullName.length()>0) addr.append(fullName);
		if (companyName.length()>0) addr.append(addr.length()>0?"<br/>":"").append(companyName);
		if (address1.length()>0) addr.append(addr.length()>0?"<br/>":"").append(address1);
		if (address2.length()>0)addr.append(addr.length()>0?"<br/>":"").append(address2);
		if (cityStateZip.length()>0) addr.append(addr.length()>0?"<br/>":"").append(cityStateZip);
		
		return addr.toString();
	}
	
	public static String toProperCase(String str) {
		try {
			str = str.trim();
		} catch (NullPointerException e) {
			return "";
		}
		
		StringBuilder sb = new StringBuilder("");
		if (str.length()>0){
			for (String value : str.split(" ")) {
				// IGNORE EMPTY STRING
				if (isBlank(value)) 
					continue;
				
				// ADD SPACE BETWEEN WORDS
				if (sb.length() > 0)
					sb.append(" ");
				
				if (value.length() > 1) {
					sb.append(value.substring(0, 1).toUpperCase() + value.substring(1, value.length()).toLowerCase());
				} else {
					sb.append(value.toUpperCase());
				}
			}
		}
		return sb.toString();
	}
	
	public static String listToCommaString(ArrayList<?> list) {
		StringBuffer buffStr = new StringBuffer ("");
		for (int i = 0; i < list.size(); i++) {
			buffStr.append(list.get(i));
			if (i+1<list.size()) buffStr.append(",");
		}
		buffStr.append("");
		return buffStr.toString();
	}
	
	public static String listToString(ArrayList list) {
		StringBuffer buffStr = new StringBuffer ("('");
		for (int i = 0; i < list.size(); i++) {
			buffStr.append(list.get(i));
			if (i+1<list.size()) buffStr.append(",");
		}
		buffStr.append("')");
		return buffStr.toString();
	}
	
	public static String convertListToString(List<String> list){
		StringBuilder sb = new StringBuilder("");
		if (list!=null){
			for (String str:list){
				if (sb.toString().length()>0)
					sb.append(",");
				sb.append("'").append(str).append("'");
			}
		}
		return sb.toString();
	}
	
}
