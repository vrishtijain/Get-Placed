

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

.c{
  height:0.5cm;  
}
  
        .Button { margin-left: 16cm;
                  margin-top: 6cm;
    background-color: #4CAF50;
    color: white;
    padding: 16px;
    font-size: 16px;
    font-color: white;
    border: none;
    border-radius: 15px 15px 15px 15px;
    cursor: pointer;
    width:160px;
    background-image: linear-gradient(#04433F,#297F7B);
}
.Button:hover{
	background: linear-gradient(#073,#0fa);
}           


    </style> <body>
        <h1 align="center">Apply Now </h1>
             <form method ="GET" action ="Applied.jsp">      
     <%
    Class.forName("com.mysql.jdbc.Driver");
    java.sql.Connection con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","abc123");
     String qr="select cgpa,branch from student where userid= ? ";
     String id = ( String )session.getAttribute("userid");
                String name=  (String )session.getAttribute("username");       
            java.sql.PreparedStatement ps= con.prepareStatement(qr);
            java.sql.ResultSet rs, rs1, rs2 ;
            ps.setString(1,id );
            rs=ps.executeQuery();
            boolean found=rs.next();
            String s1,s2;
            if(found==true){
                s1=rs.getString(1); 
                s2=rs.getString(2);
            }
            else s1=s2=null ;
            String qr1="Select * from criteria  where cgpa<=? and branch=? ";
            ps= con.prepareStatement(qr1);
            ps.setString(1,s1 );
            ps.setString(2, s2);
            rs1=ps.executeQuery();
            found=rs1.next();
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
           
            <ul align="center" class="button button1">
                <li><%=cname%></li>
            </ul>
            

            
            
            <input type="checkbox" class="c" name="select" value=<%=cid%>  />
            
            <br><br><br>
            
  <div class="dropdown-content">
      
    <table align="center" border="0" width="3" cellspacing="4" cellpadding="4">
       
        <tbody>
            <tr>
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

        
        
        
        
        <% }%>
        
        <input type="submit" class="Button"value="Submit" />
             </form>
<%}  
 else { %>
   
   <h4>Sorry!! You are not eligible for any Company!</h4>
<%
}}catch(Exception e )
     {}
%>

</body>
</html>
