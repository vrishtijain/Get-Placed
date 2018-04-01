<%-- 
    Document   : LinkSaved
    Created on : Oct 11, 2017, 7:27:25 PM
    Author     : vrishti-jain
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <%   Class.forName("com.mysql.jdbc.Driver");
    java.sql.Connection con =java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","abc123");  
    java.sql.PreparedStatement ps;
    String qr="insert into test values(?,?)";
     ps=con.prepareStatement(qr);
     
     String cat = request.getParameter("cat"); 
     String url = request.getParameter("url");  
     
     ps.setString(2,cat);  ps.setString(1,url); 

      ps.executeUpdate();
      %>
      
      
      <h2>Updated</h2>
      <a href=AdminHome.jsp>Click here to redirect to home page </a>
    </body>
</html>