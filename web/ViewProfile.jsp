<%@ include file="header.html" %>
<html>
    
    
    <style>
table {
    border-collapse: collapse;
    width: 100%;
}

th, td {
    text-align: left;
    padding: 8px;
}

tr:nth-child(even){background-color: #f2f2f2}
tr:nth-child(odd){background-color: #B2BABB}


</style>
    <body>
<%
    Class.forName("com.mysql.jdbc.Driver");
    java.sql.Connection con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","abc123");
     String qr="select * from student where userid= ? ";
    
          
                String id = ( String )session.getAttribute("userid");
                String name=  (String )session.getAttribute("username");
                String type = ( String )session.getAttribute("type");        
 
  
   if(id == null) {
      response.sendRedirect("index.jsp");
   }


 String s1,s2,s3,s4,s5,s6,s7;
 if(type.equals("student")){
             java.sql.PreparedStatement ps= con.prepareStatement(qr);
            java.sql.ResultSet rs ;
            ps.setString(1,id );
            rs= ps.executeQuery();
            boolean found=rs.next();
            
            if(found==true){
                 s1=rs.getString(1);
              //  s2=rs.getString(2);
                s3=rs.getString(3);
                 s4=rs.getString(4);
                 s5=rs.getString(5); 
                 s6=rs.getString(6); 
                 s7=rs.getString(7); 

%>   

        <h1>Your Profile</h1>
        <table border=".6">
                <tbody>
                <tr>
                    <th>UserId</th>
                    <th><%=s1%></th>
                </tr>
           
                <tr>
                    <td>Name</td>
                    <td><%=s3%></td>
                </tr>
                <tr>
                    <td>Date Of Birth</td>
                    <td><%=s4%></td>
                </tr>
                <tr>
                    <td>CGPA</td>
                    <td><%=s5%></td>
                </tr>
                <tr>
                    <td>Branch</td>
                    <td><%=s6%></td>
                </tr>
 <tr>
                    <td>Email</td>
                    <td><%=s7%></td>
                </tr>
            </tbody>
        </table>
                <a href="ViewImage.jsp">View Image</a>

                <br><br>
            <a href="StudentHome.jsp">
       <img src="home.ico" alt="Home" style=" margin-left: 12cm;width:100px;height:100px;border:0;"> </a>
       
 
    <%  }}
else if(type.equals("company"))

{
qr="select * from company where cid=?";
java.sql.PreparedStatement ps= con.prepareStatement(qr);
            java.sql.ResultSet rs ;
            ps.setString(1,id );
            rs=ps.executeQuery();
            boolean found=rs.next();
            
            if(found==true){
                 s1=rs.getString(1);
              //  s2=rs.getString(2);
                s3=rs.getString(3);
                 s4=rs.getString(4);
                 s5=rs.getString(5); 
                 s6=rs.getString(6); 
%>

        <h1>Your Profile</h1>
        <table border=".6">
                <tbody>
                <tr>
                    <th>Company Id</th>
                    <th><%=s1%></th>
                </tr>
           
                <tr>
                    <td>Name</td>
                    <td><%=s3%></td>
                </tr>
                <tr>
                    <td>H R Name</td>
                    <td><%=s4%></td>
                </tr>
                <tr>
                    <td>Email</td>
                    <td><%=s5%></td>
                </tr>
                 <tr>
                    <td>Phone Number</td>
                    <td><%=s6%></td>
                </tr>

            </tbody>
        </table>
                    
            <a href="CompanyHome.jsp">
       <img src="home.ico" alt="Home" style=" margin-left: 12cm;width:100px;height:100px;border:0;"> </a>
        </form>
<%
}}
else 
{
 name="Tani/Tanu";
id="admin123";
String pno="909090900";


%>

        <h1>Your Profile</h1>
        <table border=".6">
                <tbody>
                <tr>
                    <th>Admin Id</th>
                    <th><%=id%></th>
                </tr>
           
                <tr>
                    <td>Name</td>
                    <td><%=name%></td>
                </tr>
                <tr>
                    <td>phone number</td>
                    <td><%=pno%></td>
 

            </tbody>
        </table>
<% }
// add admin profile here 
        con.close();

%>
    </body>
 
</html>