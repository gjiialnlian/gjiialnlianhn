package org.mmedev.rs.service.notification;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/notificationsvc/")
public interface NotificationSvc{
    
	@GET
    @Path("/testNotification/")
    @Produces("application/xml")
    public Response testNotification();
	
}
