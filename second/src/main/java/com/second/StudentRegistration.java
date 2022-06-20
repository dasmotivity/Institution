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

public class StudentRegistration extends HttpServlet {

 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        PrintWriter out = response.getWriter();
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String email = request.getParameter("email");
        String gender = request.getParameter("gender");
        String pass = request.getParameter("pass");
        String pno = request.getParameter("pno");
        try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			
			e1.printStackTrace();
		}
        try {
        
        	Connection con = DriverManager.getConnection("jdbc:mysql://localhost/institution","root","root");
           
            PreparedStatement ps = con.prepareStatement("insert into student_register (fname,lname,email,gender,pass,pno) values(?,?,?,?,?,?)");

            ps.setString(1, fname);
            ps.setString(2, lname);
            ps.setString(3, email);
            ps.setString(4, gender);
            ps.setString(5, pass);
            ps.setString(6, pno);
            int i = ps.executeUpdate();
            if(i > 0) {
            	out.println("<head bgcolor='wheat' align='center'><a href='index.html'>home&nbsp;&nbsp;</a><a href='employeeregistration.html'>employee registration&nbsp;&nbsp;</a><a href='employeelogin.html'>employee login&nbsp;&nbsp;</a><a href='studentregistration.html'>Student Registration&nbsp;&nbsp;</a><br><a href='studentlogin.html'>Student Login&nbsp;&nbsp;</a></head>\r\n"
            			+ "");
                out.println("<h1 align='center'>You are sucessfully registered as student</h1>");
                response.sendRedirect("./studentlogin.html");
            }else {
            	response.sendRedirect("./studentregistration.html");
            }
          
        }
        catch(Exception se) {
            se.printStackTrace();
        }
        
	}

}
