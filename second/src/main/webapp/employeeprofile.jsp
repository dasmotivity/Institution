<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

</head>
<body bgcolor="wheat">
<h1 align="center" > WELCOME TO EMPLOYEE HOME</h1>
<h4 align="center">
 <a href="employeehome.jsp">home&nbsp;&nbsp;</a>
 <a href="employeeprofile.jsp">profile&nbsp;&nbsp;</a>
 <a href="employee_appointment.jsp">appointment&nbsp;&nbsp;</a>
 <a href="index.html">logout&nbsp;&nbsp;</a>
</h4>
<br><br><br><br>
<%@ page import="java.sql.*" %>
<%@ page import="com.second.*" %>
<table border="1" align="center">
 <tr><td>employee id</td><td>first name</td><td>last name</td><td>email</td><td>gender</td><td>phone number</td></tr>
 <%
 Connection con=DbConnection.getConnection();
 HttpSession hs=request.getSession();
 PreparedStatement ps=con.prepareStatement("select * from employee_register where eid=?");
 
 ps.setString(1,(String) hs.getAttribute("eid"));
 ResultSet rs=ps.executeQuery();
 while(rs.next()){
 %>
 <tr>
 <td><%= rs.getInt(1) %> </td><td><%= rs.getString(2) %></td><td><%= rs.getString(3) %></td><td><%= rs.getString(4) %></td><td><%= rs.getString(5) %></td><td><%= rs.getString(7) %></td>
 </tr>
 <% } %>
 

</table>
</body>
</html>