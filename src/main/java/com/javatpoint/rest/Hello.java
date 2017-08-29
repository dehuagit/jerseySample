package com.javatpoint.rest;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class Hello {

	public Hello(){
		System.out.println("CONT");
	}
	
	@GET 
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainHello() {
		System.out.println("CONT");
		return "Hell Jersy plain";
	}
	
	// This method is called if XML is requested  
	  @GET  
	  @Produces(MediaType.TEXT_HTML)
	  public String sayXMLHello() {
		  return "<?xml version=\"1.0\"?>" + "<hello>Helloy jersey</hello>";
	  }
	 
	
}
