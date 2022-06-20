<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head >
<meta charset="ISO-8859-1">
<h1 align="center" > WELCOME TO STUDENT HOME</h1>
<h4 align="center">
 <a href="studenthome.jsp">home</a>
 <a href="apply_appointment.jsp">apply appointment</a>
 <a href="student_appointment.jsp">appointment details</a>
 <a href="studentprofile.jsp">profile</a>
 <a href="#">logout</a>
 
 <br><br><br><br>
  <form method="get" action="./appointment_apply.jsp">
          
          <input type="text" placeholder="name"     name="name" /><br>
          <input type="text" placeholder="mobile" name="mobile" /><br>
          <input type="date" placeholder="select date" name="doa" /><br>
          <input type="text" placeholder="toa" name="toa">
           <select name="courses">
           	<option value="java">java</option>
           	<option value="python">python</option>
           	<option value="c++">c++</option>
           	
           
           </select>
           <input type="submit"  value="Apply">
     </form>
</head>
<body>

</body>
</html>