package org.mmedev.rs.service.myaccount;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import org.mmedev.rs.model.MyAccount;

@Path("/myaccountsvc/")
public interface MyAccountSvc {
    
    @GET
    @Path("/getMyAccount/{id}/")
    @Produces("application/xml")
    public MyAccount getMyAccount(@PathParam("id") String id);
}
