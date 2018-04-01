<%@page import="java.sql.DriverManager"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Records</title>
    </head>
    <style>
        body{
                background-image: url('home.jpg');
            }
        table {
            width:50%;
  border-collapse: separate;
  border-spacing: 0;
  color: #4a4a4d;
  font-size: 0.5cm;
}
thead {
  background: #395870;
  background: linear-gradient(#49708f, #293f50);
  color: #fff;
  font-size: 14px;
  text-transform: uppercase;
}
        th:first-child {
  border-top-left-radius: 10px;
  
}
th:last-child {
  border-top-right-radius: 10px;
}
    </style>
    <body>
        <h1 align="center" style=""><b>PLACEMENT RECORDS</b></h1>
        <table align="center" border="0" cellpadding="10" cellspacing="10">
            <tbody>
            <thead>
            <th>Company</th>
            <th>No. of Students hired</th>
            </thead>
        <%
    Class.forName("com.mysql.jdbc.Driver");
    java.sql.Connection con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","abc123");
    java.sql.PreparedStatement ps;
    java.sql.ResultSet rs;
        //String b1=request.getParameter("b1"); 
        //String b2=request.getParameter("b2"); 
         
        if(request.getParameter("submit")!=null){
            try{ 
        
           String qr="Select cname, num from records where branch=?";
            ps= con.prepareStatement(qr);
            ps.setString(1,request.getParameter("br"));
          
            rs=ps.executeQuery();
            boolean found=rs.next();
           String record;
           int number;
            try{
                if(found==true)
                {   rs.previous();
                    while(rs.next())
                { record=rs.getString(1);
                  number=rs.getInt(2);
                
                %>   
            
                <tr>  
                    <td><%=record%></td>
                    <td align="center"><%=number%></td>
                </tr>
           
         <%  }
             %> </tbody>
           </table>
             
       <% }}catch(Exception e ){
                
           String s=e.getMessage();
            %>
            
            <h1><%=s%></h1>
            
          <%  
            }}catch(Exception e ){
                
           String s=e.getMessage();
            %>
            
            <h1><%=s%></h1>
            
          <%  
            }
}
      else if(request.getParameter("submit1")!=null){
           try{ 
           String qr="Select cname,num from records where year=?";

           
            ps= con.prepareStatement(qr);
            ps.setString(1,request.getParameter("year"));
          
            rs=ps.executeQuery();
            boolean found=rs.next();
           String record;
           int number;
            try{
                if(found==true)
                {   rs.previous();
                    while(rs.next())
                { record=rs.getString(1);
                   number=rs.getInt(2);
                  
                %>   
            
                <tr>  
                    <td><%=record%></td>
                    <td align="center"><%=number%></td>
                </tr>
            
         <%  }
          %>
          </tbody>
           </table>
          <%
        }
        }catch(Exception e ){
                
           String s=e.getMessage();
            %>
            
            <h1><%=s%></h1>
            
          <%  
            }
}catch(Exception e ){
                
           String s=e.getMessage();
            %>
            
            <h1><%=s%></h1>
            
          <%  
            }}
else{}

%>
    
    </body>
</html>
