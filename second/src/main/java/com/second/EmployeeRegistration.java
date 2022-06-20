package com.second;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmployeeRegistration extends HttpServlet {

 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        PrintWriter out = response.getWriter();
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String email = request.getParameter("email");
        String gender = request.getParameter("gender");
        String pass = request.getParameter("pass");
        String pno = request.getParameter("pno");
        String course = request.getParameter("course");
        try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			
			e1.printStackTrace();
		}
        try {
        
        	Connection con = DriverManager.getConnection("jdbc:mysql://localhost/institution","root","root");
           
            PreparedStatement ps = con.prepareStatement("insert into employee_register (fname,lname,email,gender,pass,pno,course) values(?,?,?,?,?,?,?)");

            ps.setString(1, fname);
            ps.setString(2, lname);
            ps.setString(3, email);
            ps.setString(4, gender);
            ps.setString(5, pass);
            ps.setString(6, pno);
            ps.setString(7, course);
            
            int i = ps.executeUpdate();
            if(i > 0) {
            	
                response.sendRedirect("./employeelogin.html");
                
            }else {
            	response.sendRedirect("./employeeregistration.html");
            }
           
        }
        catch(Exception se) {
            se.printStackTrace();
        }
	}

}
