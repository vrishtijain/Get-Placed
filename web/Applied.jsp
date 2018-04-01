
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>nothing</title>
    </head>
    <body>
        
        <%
       String s[]=request.getParameterValues("select");
       Class.forName("com.mysql.jdbc.Driver");
    java.sql.Connection con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","abc123");
     String qr="insert into applied values (?,?)";
      String id = ( String )session.getAttribute("userid");
      java.sql.PreparedStatement ps= con.prepareStatement(qr);
       java.sql.ResultSet rs;
       int len=s.length;
      int i=0;
           try{
               while(i<len)
            {
                ps.setString(1, id);
                ps.setString(2, s[i]);
                ps.executeUpdate();
                ++i;
            }
           }catch(Exception e ){}
            %>
            <h2>Successfully Applied</h2>
           <a href="StudentHome.jsp">Click here for home page </a>
            
      

      
    </body>
</html>
