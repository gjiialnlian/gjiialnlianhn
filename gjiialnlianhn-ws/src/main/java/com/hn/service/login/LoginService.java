package com.hn.service.login;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.hn.bean.LoginBean;
import com.hn.service.GenericService;

public interface LoginService extends GenericService<LoginBean>{
	
	@GET
    @Path(GET_ALL)
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
	@Override
	public Response getAll();
	
	@POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path(ADD)
	@Override
	public Response add(LoginBean bean);
	
	@POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path(EDIT)
	@Override
	public Response edit(LoginBean bean);
	
	@POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path(DELETE)
	@Override
	public Response delete(LoginBean bean);
	
	@GET
    @Path(GET_BY_ID)
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
	@Override
	public Response getById(@PathParam("id") String id);
}

