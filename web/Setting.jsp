
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <%  
       Class.forName("com.mysql.jdbc.Driver");
    java.sql.Connection con =java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","abc123");
    String qr="insert into criteria values(?,?,?)";
     java.sql.PreparedStatement ps= con.prepareStatement(qr);  
      java.sql.ResultSet rs ;
      
        String cgpa=request.getParameter("cgpa");
        String br=request.getParameter("branch");
        String userid =(String)session.getAttribute("userid");
       // response.sendRedirect("CompanyHome.jsp");
        try{
          
           ps.setString(1,userid);
            ps.setString(2, cgpa);
             ps.setString(3,br);
             ps.executeUpdate();
            response.sendRedirect("CompanyHome.jsp"); }catch(Exception e ){
                
      String s=e.getMessage();
            %>
            
            <h1><%=s%></h1>
            
          <%  
            }

con.close();
         
 %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
    </head>
    <body>
        <h1></h1>
    </body>
</html>
