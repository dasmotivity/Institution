<%@ page import="java.sql.*" %>
<%@ page import="com.second.*" %>
<%
 Connection con=DbConnection.getConnection();
 int id=Integer.parseInt(request.getParameter("aid"));
 String name=(String)session.getAttribute("name");
 
 PreparedStatement ps=con.prepareStatement("update appointment set employee_name=?,status=? where aid=?");
 
 ps.setString(1,name);
 ps.setString(2,"Accepted");
 ps.setInt(3,id);
 int x=ps.executeUpdate();
 if(x!=0)
 	response.sendRedirect("./employee_appointment.jsp");
 %>