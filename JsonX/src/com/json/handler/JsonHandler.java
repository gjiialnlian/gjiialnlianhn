package com.json.handler;

import net.sf.json.JSONObject;

import com.bean.WbdReqResBean;

public abstract class JsonHandler {
	public abstract JSONObject getJson(WbdReqResBean bean);
}
