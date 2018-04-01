<%-- 
    Document   : UpdarePs
    Created on : Oct 11, 2017, 10:07:35 PM
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
        
      <%
       Class.forName("com.mysql.jdbc.Driver");
    java.sql.Connection con =java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","abc123");  
    java.sql.PreparedStatement ps;
String qr;
        String userid= (String)session.getAttribute("userid");
       String em= (String)session.getAttribute("type");
      
       String data= request.getParameter("ps");
       if(em.equals("student"))
       {
           qr="update  student set psw=? where userid=? ";
          
           ps=con.prepareStatement(qr);
            ps.setString(1,data);
            ps.setString(2,userid);
             ps.executeUpdate(); 
             
             response.sendRedirect("index.jsp");
                      
            
          
           
       }
       else {
           
            qr="update company set psw=? where cid=? ";
          
           ps=con.prepareStatement(qr);
            ps.setString(12,userid);
                 ps.setString(1,data);
            ps.executeUpdate(); 
             
                  response.sendRedirect("index.jsp");
                      
            }
           
           
           
       
        
       

       
       
       %>
    </body>
</html>
