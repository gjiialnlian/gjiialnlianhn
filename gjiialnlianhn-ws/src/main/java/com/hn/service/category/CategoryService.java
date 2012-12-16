package com.hn.service.category;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.hn.bean.CategoryBean;
import com.hn.service.GenericService;

public interface CategoryService extends GenericService<CategoryBean>{
	
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
	public Response add(CategoryBean bean);
	
	@POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path(EDIT)
	@Override
	public Response edit(CategoryBean bean);
	
	@POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path(DELETE)
	@Override
	public Response delete(CategoryBean bean);
	
	@GET
    @Path(GET_BY_ID)
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
	@Override
	public Response getById(@PathParam("id") String id);
}

