

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="header.html" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Upcoming Events</title>
    </head>
    <style type="text/css">
.button { font-family: Courier New;
          
    background-color: #2471A3; /* Green */
    border: none;
    color: white;
    padding: 15px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    cursor: pointer;
    -webkit-transition-duration: 0.4s; /* Safari */
    transition-duration: 0.4s;
    width: 90px;
}

.button1 {
    box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2), 0 6px 20px 0 rgba(0,0,0,0.19);
}
.button1:hover {
    width: 300px;
}
.dropdown {
    position: relative;
    display: inline-block;
}

.dropdown-content {
    display: none;
    position: absolute;
    background-color: #f9f9f9;
    min-width: 320px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
    z-index: 1;
}

.dropdown-content a {
    color: black;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
}

.dropdown-content a:hover {background-color: #f1f1f1;width: 300px;}

.dropdown:hover .dropdown-content {
    display: block; width: 300px;
}

.dropdown:hover .dropbtn {
    background-color: #3e8e41;
}
</style>
<body>
     <h2 class="button button1"align="center" style =" font-size:50px; background-color:#A2D9CE; width:100%;height:40px ">Upcoming Companies</h2>
     <br>  <br>  <br>  <br> 
     <%
    Class.forName("com.mysql.jdbc.Driver");
    java.sql.Connection con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","abc123");
            java.sql.PreparedStatement ps;
           
            java.sql.ResultSet  rs2,rs1;
           String s1=null;
            String qr1="Select * from criteria ";
            ps= con.prepareStatement(qr1);
          
            rs1=ps.executeQuery();
         boolean   found=rs1.next();
            String cid,cgpa,br;
            try{
                if(found==true)
                {   rs1.previous();
                    while(rs1.next())
            {     
              cid=rs1.getString(1);
              cgpa=rs1.getString(2);
              br=rs1.getString(3);
                 
%>
 
<div class="dropdown">
  
             <%   
    
   String qr2="Select cname,hrname from company where cid=?";
    ps= con.prepareStatement(qr2);
            ps.setString(1,cid);
            rs2=ps.executeQuery();
            String cname=null,hrname=null;
            found=rs2.next();
            if(found)
            {
               cname=rs2.getString(1); 
               hrname=rs2.getString(2); 
          
            }
            
           
    %>
            
            <ul class ="button button1"  type="square">
                <li><%=cname%></li>
            </ul>

  <div class="dropdown-content">
      
    <table border="0"  cellspacing="4" cellpadding="4">
       
        <tbody>
            <tr >
                <td>Company HR name:</td>
                <td><%=hrname%></td>
            </tr>
            <tr>
                <td>CGPA</td>
                <td><%=cgpa%></td>
            </tr>
            <tr>
                <td>Branch:</td>
                <td><%=br%></td>
            </tr>
        </tbody>
    </table>

    
    
    
  </div>
</div>

   
        
        
        
        <% }} 
 }catch(Exception e )
     {}
%>
</body>  
</html>
