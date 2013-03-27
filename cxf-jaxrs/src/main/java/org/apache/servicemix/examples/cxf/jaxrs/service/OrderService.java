package org.apache.servicemix.examples.cxf.jaxrs.service;

import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import org.apache.servicemix.examples.cxf.jaxrs.model.Order;
import org.apache.camel.ProducerTemplate;

@Path("/orderservice/")
public class OrderService {
    long currentId = 123;
    Map<Long, Order> orders = new HashMap<Long, Order>();
    private ProducerTemplate template;

    public OrderService() {
        init();
    }

    @Path("/orders/{orderId}/")
    public Order getOrder(@PathParam("orderId") String orderId) {
        System.out.println("----invoking getOrder, Order id is: " + orderId);
        long idNumber = Long.parseLong(orderId);
        Order c = orders.get(idNumber);
        
        Map<String, Object> header = new HashMap<String, Object>();
		header.put("To", "harrism@nwsol.com");
		header.put("Subject", "Testing Email");
		header.put("Cc", "");
		header.put("From", "harrism@nwsol.com");
		template.sendBodyAndHeaders("direct:processorder", "test", header);
        return c;
    }
    
    public void processOrder(String test){
    	System.out.println("PROCESSING ORDERS....");
    }

    final void init() {
        Order o = new Order();
        o.setDescription("order 223");
        o.setId(223);
        orders.put(o.getId(), o);
    }

	public void setTemplate(ProducerTemplate template) {
		this.template = template;
	}
}
