<%@ include file="header.html" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Link</title>
    </head>
    <style type="text/css">
        a{ color:white;}
        </style>
    <body>
        <% 
         String cat=request.getParameter("cat");
        %>
        <h1 align="center">Test Links for <%=cat%></h1>
        <%    
         Class.forName("com.mysql.jdbc.Driver");
    java.sql.Connection con =java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","abc123");
    String qr="Select url from test where cat=?";
    
     java.sql.PreparedStatement ps= con.prepareStatement(qr);  
     ps.setString(1, cat);
      java.sql.ResultSet rs ;
      try{
       rs=ps.executeQuery();
       while(rs.next())
       {
           String url=rs.getString(1);
        %>
        <table border="0">
            <tbody>
                <tr>  
                    <td style =" font-size:30px"><b>>></b></td>
                    <td>   <a href="<%=url%> " target="_blank" ><h3><%=url%></h3>   </a> </td>
                </tr>
            </tbody>
        </table>
<%  } }catch(Exception e ){
                
      String s=e.getMessage();
            %>
            
            <h1><%=s%></h1>
            
          <%  
            }

con.close();
         
 %>
    </body>
</html>
