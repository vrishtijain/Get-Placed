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



 String s1,s2,s3,s4,s5,s6,s7;
 if(type.equals("student")){
             java.sql.PreparedStatement ps= con.prepareStatement(qr);
            java.sql.ResultSet rs ;
            ps.setString(1,id );
            rs=ps.executeQuery();
            boolean found=rs.next();
            
            if(found==true){
                 s1=rs.getString(1);
              s2=rs.getString(2);
                s3=rs.getString(3);
                 s4=rs.getString(4);
                 s5=rs.getString(5); 
                // s6=rs.getString(6); 
                 s7=rs.getString(7); 

%>   

        <h1>Your Profile</h1>
        
        <form action="Update.jsp">
            <table border="0">
                
                <tbody>
                     <tr>
                        <th>Student Id</th>
                        <th><%=s1%></th>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="text" name="psw" value="<%=s2%>" /></td>
                    </tr>
                    <tr>
                        <td>Name</td>
                        <td><input type="text" name="nm" value="<%=s3%>" /></td>
                    </tr>
                    <tr>
                        <td>Date Of Birth</td>
                        <td><input type="text" name="dob" value="<%=s4%>" /></td>
                    </tr>
                    <tr>
                        <td>CGPA</td>
                        <td><input type="text" name="cgpa" value="<%=s5%>" /></td>
                    </tr>

                    <tr>
                        <td>Email</td>
                        <td><input type="text" name="em" value="<%=s7%>" /></td>
                    </tr>
                    <tr>
                    <td><input NAME="file" TYPE="file"></td>
                    <td><input type="submit" value="Upload" onclick="window.location='Upload.jsp'"/></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" value="Submit" onclick="show_alert()"/></td>
                    </tr>
                  
   
                <script>
                   function show_alert()
                   {
                     alert('Successfully Updated...!!');
                   }
                    Window.location.assign('ViewProfile.jsp');
                </script>


                </tbody>
            </table>

            <a href="StudentHome.jsp">
       <img src="home.ico" alt="Home" style=" margin-left: 15cm;width:200px;height:200px;border:0;"> </a>
        </form>

 
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
              s2=rs.getString(2);
                s3=rs.getString(3);
                 s4=rs.getString(4);
                 s5=rs.getString(5); 
                 s6=rs.getString(6); 
%>

        <h1>Your Profile</h1>
        <form>
        <table border=".6">
                <tbody>
                <tr>
                    <th>Company Id</th>
                    <th><input type="text" name="id" value="<%=s1%>" /></th>
                </tr>
           <tr>
                    <td>Password</td>
                    <td><input type="text" name="psw" value="<%=s2%>" /></td>
                </tr>
                <tr>
                    <td>Name</td>
                    <td><input type="text" name="name" value="<%=s3%>" /></td>
                </tr>
                <tr>
                    <td>H R Name</td>
                    <td><input type="text" name="hname" value="<%=s4%>" /></td>
                </tr>
                <tr>
                    <td>Email</td>
                    <td><input type="text" name="em" value="<%=s5%>" /></td>
                </tr>
                 <tr>
                    <td>Phone Number</td>
                    <td><input type="text" name="pno" value="<%=s6%>" /></td>
                </tr>
                <tr>
                        <td></td>
                        <td><input type="submit" value="Submit" onclick="show_alert()"/></td>
                    </tr>

            </tbody>
        </table>
                 <script>
                   function show_alert()
                   {
                     alert('Successfully Updated...!!');
                   }
                    Window.location.assign('ViewProfile.jsp');
                </script>
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
