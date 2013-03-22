package com.servlet;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.sf.json.JSONObject;
import com.bean.WbdReqResBean;

public class JsonServlet extends HttpServlet {

	private static final long serialVersionUID = 8095902270711417737L;
	private static String JSON_METHOD = "getJson";
	private static String JSON_MIME = "application/json";
	private static ConcurrentHashMap<String, String> servletMapping = new ConcurrentHashMap<String, String>();

	public JsonServlet() {
        super();
    }
	
	@Override
	public void init() throws ServletException {
		String configPath = getInitParameter("config");
		
		if(configPath != null && !"".equals(configPath)){
			
			 Properties props = new Properties();

	         try {
	             props.load(new FileInputStream(configPath));
	           
	             for(Object key : props.keySet()){
	            	try {
						Class.forName(props.get(key).toString().trim());
					} catch (ClassNotFoundException e) {
						throw new ServletException("Error on config path for JsonServlet.class - "+e);
					}
	            	 
	            	servletMapping.put(key.toString().trim(), props.get(key).toString().trim()); 
	             }
	         }catch(IOException e){
	        	 throw new ServletException("Error on config path for JsonServlet.class - "+e);
	         }
		}else
			throw new ServletException("Missing config path for JsonServlet.class");	
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        Class handler;
        Method method;
		try {	
			StringBuffer url = request.getRequestURL();
			String urlStr = "";

			if(url != null){	
				for(String map : servletMapping.keySet()){
					if(url.toString().indexOf(map) > 0){
						urlStr = map;
						break;
					}
				}
			}
		
			if(urlStr != null && !"".equals(urlStr)){
				handler = Class.forName(servletMapping.get(urlStr));
				method = handler.getMethod(JSON_METHOD, WbdReqResBean.class);
				WbdReqResBean bean = new WbdReqResBean(request, response); 
				JSONObject result = (JSONObject) method.invoke(handler.newInstance(), bean);      
		        response.setContentType(JSON_MIME);
		        PrintWriter out = response.getWriter();
		        out.print(result);
		        out.flush();
		        out.close();	
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		}	
	}
}
