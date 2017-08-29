package com.javatpoint.rest;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/product")
public class ProductService {

	@GET 
	@Path("/test")
	public String sayPlainHello() {
		System.out.println("product");
		return "Hell product plain";
	}
	
	
	@POST
	@Path("/add")
	public Response addUser(
			@FormParam("id") int id,
			@FormParam("name") String name,
			@FormParam("price") float price) {
		
		System.out.println("addUser");
		return Response.status(200).entity("Pordut add successfuly<br>"
				+ "id " + id 
				+ "Name: " + name + "<br>"
				+ "price: " + price).build();
	}
		
	
	
}
