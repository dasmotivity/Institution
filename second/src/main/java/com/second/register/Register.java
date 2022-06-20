package com.second.register;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Register extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String email=request.getParameter("email");
			String psw=request.getParameter("psw");
			String fname=request.getParameter("fname");
			String lname=request.getParameter("lname");
			String designation=request.getParameter("designation");
			
	}

}
