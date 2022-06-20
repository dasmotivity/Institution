<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

</head>
<body bgcolor="wheat">
<h1 align="center" > WELCOME TO STUDENT HOME</h1>
<h4 align="center">
 <a href="index.html">home</a>&nbsp;&nbsp;
 <a href="studentprofile.jsp">profile</a>&nbsp;&nbsp;
 <a href="student_appointment.jsp">appointment</a>&nbsp;&nbsp;
 <a href="index.html">logout</a>&nbsp;&nbsp;
</h4>
<br><br><br><br>
<%@page import="java.sql.*" %>
<%@page import="com.second.*" %>

<table border="1" align="center">
 <tr><td>student id</td><td>first name</td><td>last name</td><td>email</td><td>gender</td><td>phone number</td></tr>
 <%
 Connection con=DbConnection.getConnection();
 HttpSession hs=request.getSession();
 PreparedStatement ps=con.prepareStatement("select * from student_register where eid=?");
 
ps.setInt(1, (Integer)hs.getAttribute("sid"));
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