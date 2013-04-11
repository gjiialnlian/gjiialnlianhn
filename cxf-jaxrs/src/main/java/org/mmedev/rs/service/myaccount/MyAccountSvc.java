package org.mmedev.rs.service.myaccount;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/myaccountsvc/")
public interface MyAccountSvc{
    
	@GET
    @Path("/getMyAccount/{id}/")
    @Produces("application/xml")
    public Response getMyAccount(@PathParam("id") String id);
	
    @GET
    @Path("/getMyAccountJson/{id}/")
    @Produces("application/json")
    public Response getMyAccountJson(@PathParam("id") String id);
}
