package com.javatpoint.rest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class Test extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void init() throws ServletException {
		System.out.println("Test");
	}

	public void doGet(HttpServletRequest request,
			HttpServletResponse response)
	        throws ServletException, IOException {
				System.out.println("Test2");
		        // Set response content type
		        response.setContentType("text/html");
		        PrintWriter out = response.getWriter();
		        out.println("<h1> HEELO WORLD servlet </h1>");
	}

}
