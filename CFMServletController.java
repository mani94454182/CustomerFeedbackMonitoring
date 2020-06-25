package org.cfm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CFMServletController extends HttpServlet {

	//Get request and response Handler Method
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) 
			throws IOException,ServletException{
			
		System.out.println("This is get Method");
			response.setContentType("text/html");
			
			PrintWriter out=response.getWriter();
			out.println("This is Get Servlet");
       }


//Post request and Response Handler Method
protected void doPost(HttpServletRequest request,HttpServletResponse response) 
		throws IOException,ServletException{
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("This is Post Servlet");
   }
}
