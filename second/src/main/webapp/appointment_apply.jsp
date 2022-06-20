<%@ page import="java.sql.*" %>
<%@ page import="com.second.*" %>
<%
Connection con=DbConnection.getConnection();
String name=request.getParameter("name");
int mobile=Integer.parseInt(request.getParameter("mobile"));
String doa=request.getParameter("doa");
String toa =request.getParameter("toa");
String courses=request.getParameter("courses");
int sid=(Integer)session.getAttribute("sid");
String sql="insert into appointment(name,mobile,doa,toa,course,sid,employee_name,status) values(?,?,?,?,?,?,?,?);";
PreparedStatement ps=con.prepareStatement(sql);
ps.setString(1,name);
ps.setInt(2,mobile);
ps.setString(3,doa);
ps.setString(4,toa);
ps.setString(5,courses);
ps.setInt(6,sid);
ps.setString(7,"none");
ps.setString(8,"pending");
int x=ps.executeUpdate();
	if(x!=0)
		response.sendRedirect("./student_appointment.jsp");
%>