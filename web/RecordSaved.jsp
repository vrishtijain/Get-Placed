<%-- 
    Document   : RecordSaved
    Created on : Oct 11, 2017, 7:08:39 PM
    Author     : vrishti-jain
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       
    </head>
    <body>
       <%   Class.forName("com.mysql.jdbc.Driver");
    java.sql.Connection con =java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","abc123");  
    java.sql.PreparedStatement ps;
    String qr="insert into records values(?,?,?,?)";
     ps=con.prepareStatement(qr);
     
     String name = request.getParameter("nm"); 
     String br = request.getParameter("br");  String yr = request.getParameter("yr");
     String num = request.getParameter("num");
     
     ps.setString(1,name);  ps.setString(2,yr);  ps.setString(3,br);  ps.setString(4,num); 

      ps.executeUpdate();
      %>
      
      
      <h2>Updated</h2>
      <a href=AdminHome.jsp>Click here to redirect to home page </a>
          
          
    </body>
</html>
