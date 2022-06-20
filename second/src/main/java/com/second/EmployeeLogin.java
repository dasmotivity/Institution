package com.second;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class EmployeeLogin extends HttpServlet {

 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        PrintWriter out = response.getWriter();
        String eid = request.getParameter("eid");
        String pass = request.getParameter("pass");
        
        try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			
			e1.printStackTrace();
		}
        try {
        
        	Connection con = DriverManager.getConnection("jdbc:mysql://localhost/institution","root","root");
        	
            PreparedStatement ps = con.prepareStatement("select * from employee_register where eid=? and pass=?");
            HttpSession hs=request.getSession();
            ps.setString(1, eid);
            ps.setString(2, pass);
            
            ResultSet rs= ps.executeQuery();
            if(rs.next()) {
            	
            	hs.setAttribute("eid", eid);
            	hs.setAttribute("name", rs.getString(2));
            	hs.setAttribute("email", rs.getString("email"));
            	hs.setAttribute("course", rs.getString("course"));
            	response.sendRedirect("./employeehome.jsp");
            	
            }
            else {
            	response.sendRedirect("./employeelogin.html");
            }
        }
        catch(Exception se) {
            se.printStackTrace();
        }
	}

}
