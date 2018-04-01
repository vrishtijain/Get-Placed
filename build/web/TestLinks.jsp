<%@ include file="header.html" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Test Links</title>
    </head>
    <style type="text/css">
        table {
            width:30%;
  border-collapse: separate;
  border-spacing: 1px;
  color: white;
  font-size: 0.6cm;
}
       
    </style>
    <body>
         <%   Class.forName("com.mysql.jdbc.Driver");
    java.sql.Connection con =java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","abc123");  
    java.sql.PreparedStatement ps;
    String qr="select  distinct cat from test" ;
     ps=con.prepareStatement(qr);    
     java.sql.ResultSet rs= ps.executeQuery();
      String data;
      %><table align="center">
      <form action="Link.jsp">
         <tr>
             <td>Select Category:</td> 
             <td> 
        <select name="cat">
          
      <%
     while(rs.next()){
       data=rs.getString(1);
       %> 
        
       <option><%=data%></option>
           
        <%  }  %>
        </select>
             </td></tr>
         <tr><td></td><td><input type="submit" class="Button" value="Submit" /></td></tr>
      </form>
      </table>
        
    </body>
</html>
