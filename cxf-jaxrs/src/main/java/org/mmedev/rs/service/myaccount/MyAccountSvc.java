package org.mmedev.rs.service.myaccount;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/myaccountsvc/")
public interface MyAccountSvc{
    
	@GET
    @Path("/getMyAccountXml/{id}/")
    @Produces("application/xml")
    public Response getMyAccountXml(@PathParam("id") String id);
	
    @GET
    @Path("/getMyAccountJson/{id}/")
    @Produces("application/json")
    public Response getMyAccountJson(@PathParam("id") String id);
    
    @GET
    @Path("/updateMyAccount/{id}/")
    @Produces("application/json")
    public Response updateMyAccount(@PathParam("id") String id);

}
