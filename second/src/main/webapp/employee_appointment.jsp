<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head >
<meta charset="ISO-8859-1">
<h1 align="center" > APPOINTMENT</h1>
<h4 align="center">
 <a href="employeehome.jsp">home</a>
 <a href="employeeprofile.jsp">profile</a>
  <a href="employee_appointment.jsp">appointment</a>
 <a href="index.html">logout</a>
 
</head>
<body>
 <%@ page import="java.sql.*" %>
<%@ page import="com.second.*" %>
<table border="1" align="center">
 <tr><td>a id</td><td>name</td><td>Phone</td><td>Date</td><td>time</td><td>Courses</td><td>Trainee Name</td><td>status</td><td>Action</td></tr>
 <%
 Connection con=DbConnection.getConnection();
 HttpSession hs=request.getSession();
 PreparedStatement ps=con.prepareStatement("select * from appointment where course=?");
 
 ps.setString(1, (String)hs.getAttribute("course"));
 ResultSet rs=ps.executeQuery();
 while(rs.next()){
 %>
 <tr>
 <td><%= rs.getInt(1) %> </td><td><%= rs.getString(2) %></td><td><%= rs.getString(3) %></td><td><%= rs.getString(4) %></td><td><%= rs.getString(5) %></td><td><%= rs.getString(6) %></td>
 <td><%= rs.getString(8) %> </td><td><%= rs.getString(9) %> </td>

 <td><a href="accept.jsp?aid=<%= rs.getInt(1) %> ">accept</a></td>
  </tr>
 <% } %>
 

</table>
</body>
</html>