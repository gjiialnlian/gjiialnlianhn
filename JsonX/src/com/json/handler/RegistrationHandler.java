package com.json.handler;

import net.sf.json.JSONObject;

import com.bean.WbdReqResBean;
import com.constant.OPERATION;

public class RegistrationHandler extends JsonHandler{

	@Override
	public JSONObject getJson(WbdReqResBean bean) {
		
		String opType = bean.getRequest().getParameter("opType");
		
		if(opType != null && OPERATION.ADD.getOp().equalsIgnoreCase(opType.trim()))
			return register(bean);
		
		JSONObject json = new JSONObject();
		json.put("responseMessage", "999"); // failed
		return json;
	}
	
	public JSONObject register(WbdReqResBean bean){
		JSONObject json = new JSONObject();
		json.put("responseMessage", "200"); // passed
		return json;
	}
	
	
}
