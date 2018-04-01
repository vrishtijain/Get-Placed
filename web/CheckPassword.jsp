<%-- 
    Document   : CheckPassword
    Created on : Oct 11, 2017, 9:43:14 PM
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
        String userid= request.getParameter("userid");
       String type= request.getParameter("type");
       java.sql.ResultSet rs;
       session.setAttribute("userid", userid);
         session.setAttribute("type", type);
       String data= request.getParameter("data");
       if(type.equals("student"))
       {
           qr="select email from student where userid=? ";
          
           ps=con.prepareStatement(qr);
            ps.setString(1,userid);
           rs= ps.executeQuery(); 
             boolean found=rs.next();
            if(found==true){
                String dta = rs.getString(1);
                  if(data.equals(dta))
                  
               response.sendRedirect("New.jsp");
                  else response.sendRedirect("Fpassword.jsp");
                      
            }
          
           
       }
       else {
           
            qr="select phone from company where cid=? ";
          
           ps=con.prepareStatement(qr);
            ps.setString(1,userid);
           rs= ps.executeQuery(); 
             boolean found=rs.next();
            if(found==true){
                String dta = rs.getString(1);
                  if(data.equals(dta))
               response.sendRedirect("New.jsp");
                   else response.sendRedirect("Fpassword.jsp");
                      
            }
           
           
           
       }
        
       

       
       
       %>
    </body>
</html>
