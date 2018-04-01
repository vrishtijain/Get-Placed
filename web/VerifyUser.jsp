<html>
       <body>
<%
    Class.forName("com.mysql.jdbc.Driver");
    java.sql.Connection con =java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","abc123");
     String qr="select name from student where userid=? and psw=?";
     java.sql.PreparedStatement ps= con.prepareStatement(qr);  
      java.sql.ResultSet rs ;
        String s2=request.getParameter("uid");
        String s3=request.getParameter("psw");
        String s1=request.getParameter("type");
        
       
        
        if(s1.equals("student")){
            
            ps.setString(1, s2);     
            ps.setString(2, s3);
            //ps.setString(3, s3);
            rs=ps.executeQuery();
            boolean found=rs.next();
            if(found==true){
                String name=rs.getString(1);
             
                session.setAttribute("username", name);
                session.setAttribute("userid", s2);
                session.setAttribute("type",s1);
               
                response.sendRedirect("StudentHome.jsp");
            }
            else{
               
                
            


%>


    
        <h1> <%out.println("Invalid Student Account<br>");%></h1>
        <h1> <%out.println("<a href=index.jsp>TryAgain</a>");%></h1>



<%
    }}
      if(s1.equals("company")){
              qr="select cname from company where cid=? and psw=?";
      ps= con.prepareStatement(qr);  
     
            ps.setString(1, s2);     
            ps.setString(2, s3);
            //ps.setString(3, s3);
            rs=ps.executeQuery();
            boolean found=rs.next();
            if(found==true){
                String name=rs.getString(1);
             
                session.setAttribute("username", name);
                session.setAttribute("userid", s2);
                session.setAttribute("type",s1);
               
                response.sendRedirect("CompanyHome.jsp");
            }
            else{
%>
                  


        <h1> <%out.println("Invalid Company Account<br>");%></h1>
        <h1> <%out.println("<a href=index.jsp>TryAgain</a>");%></h1>


<%
                  }
                 }

       if(s1.equals("admin")){
            
            if(s2.equals("admin123") &&s3.equals("abc123"))
{
              String  name ="tanu/tani";
                session.setAttribute("username", name);
                session.setAttribute("userid", s2);
                session.setAttribute("type",s1);
               
                response.sendRedirect("AdminHome.jsp");
            }
            else{


%>

        <h1> <%out.println("invalid user name or password <br>");%></h1>
        <h1> <%out.println("<a href=index.jsp>TryAgain</a>");%></h1>

        <%    }
}
con.close();
%>
    </body>
</html>