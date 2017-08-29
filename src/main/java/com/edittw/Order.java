package com.edittw;

import javax.ws.rs.GET;  
import javax.ws.rs.Path;  

@Path("/order")  // ´£¨Ñªº url
public class Order {

	@GET    // Mapping method, GET, POST, PUT ,DELETE
	public String get() {
		System.out.println("Jerry hello");
		return "Hello, Jersey";
	}
	
}
