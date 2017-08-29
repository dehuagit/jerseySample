package com.javatpoint.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/HelloService")
public class HelloService {

	@GET
	@Path("/{param}") 
	public Response getMsg(@PathParam("param")String msg) {

		
		System.out.println("HelloService");
		String output = "Jesey say: " + msg;
		return Response.status(200).entity(output).build();
	}
	
}
