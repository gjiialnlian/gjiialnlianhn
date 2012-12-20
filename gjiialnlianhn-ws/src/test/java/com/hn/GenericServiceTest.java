package com.hn;

import static org.junit.Assert.assertEquals;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.client.WebClient;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.MappingJsonFactory;
import org.junit.Test;
import com.hn.bean.CategoryBean;
import com.hn.bean.GenericBean;
import com.hn.constant.ResponseStatus;

public abstract class GenericServiceTest<T> {

	public static String WEB_APP = "http://localhost:8080/hotnews-ws/";
	public String endpointUrl;
	public T bean;
	
	public GenericServiceTest(String service, T bean) {
		this.endpointUrl=WEB_APP+service;
		this.bean=bean;
	}
	
	@Test
	public void testAdd() throws Exception {
		List<Object> providers = new ArrayList<Object>();
	    providers.add(new org.codehaus.jackson.jaxrs.JacksonJsonProvider());
	   
		WebClient client = WebClient.create(endpointUrl + "/add", providers);
		Response r = client.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON).post(bean);
		assertEquals(Response.Status.OK.getStatusCode(), r.getStatus());
		MappingJsonFactory factory = new MappingJsonFactory();
		JsonParser parser = factory.createJsonParser((InputStream)r.getEntity());
		CategoryBean output = parser.readValueAs(CategoryBean.class);
		assertEquals(ResponseStatus.PASSED, output.getStatus());
	}
	
	@Test
	public void testEdit() throws Exception {
		List<Object> providers = new ArrayList<Object>();
	    providers.add(new org.codehaus.jackson.jaxrs.JacksonJsonProvider());

		WebClient client = WebClient.create(endpointUrl + "/edit", providers);
		Response r = client.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON).post(bean);
		assertEquals(Response.Status.OK.getStatusCode(), r.getStatus());
		MappingJsonFactory factory = new MappingJsonFactory();
		JsonParser parser = factory.createJsonParser((InputStream)r.getEntity());
		CategoryBean output = parser.readValueAs(CategoryBean.class);
		assertEquals(ResponseStatus.PASSED, output.getStatus());
	}
	
	@Test
	public void testGetAll() throws Exception {
		WebClient client = WebClient.create(endpointUrl + "/getAll");
		Response r = client.accept("application/json").get();
		assertEquals(Response.Status.OK.getStatusCode(), r.getStatus());
	}
	
	@Test
	public void testGetById() throws Exception {
		List<Object> providers = new ArrayList<Object>();
	    providers.add(new org.codehaus.jackson.jaxrs.JacksonJsonProvider());
		WebClient client = WebClient.create(endpointUrl + "/getById/"+((GenericBean) bean).getId(), providers);
		Response r = client.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON).get();
		assertEquals(Response.Status.OK.getStatusCode(), r.getStatus());
	}
	
	@Test
	public void testDelete() throws Exception {
		List<Object> providers = new ArrayList<Object>();
	    providers.add(new org.codehaus.jackson.jaxrs.JacksonJsonProvider());
		WebClient client = WebClient.create(endpointUrl + "/delete", providers);
		Response r = client.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON).post(bean);
		assertEquals(Response.Status.OK.getStatusCode(), r.getStatus());
		MappingJsonFactory factory = new MappingJsonFactory();
		JsonParser parser = factory.createJsonParser((InputStream)r.getEntity());
		CategoryBean output = parser.readValueAs(CategoryBean.class);
		assertEquals(ResponseStatus.PASSED, output.getStatus());
	}

	public static String getWEB_APP() {
		return WEB_APP;
	}

	public static void setWEB_APP(String wEB_APP) {
		WEB_APP = wEB_APP;
	}

	public String getEndpointUrl() {
		return endpointUrl;
	}

	public void setEndpointUrl(String endpointUrl) {
		this.endpointUrl = endpointUrl;
	}

	public T getBean() {
		return bean;
	}

	public void setBean(T bean) {
		this.bean = bean;
	}
}
