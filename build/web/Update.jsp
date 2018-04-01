

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       
    </head>
    <body>
       <%   Class.forName("com.mysql.jdbc.Driver");
    java.sql.Connection con =java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","abc123");  
    java.sql.PreparedStatement ps;
        try  {
          String id= (String)  session.getAttribute("userid");
         String type= (String)  session.getAttribute("type");
       String s1,s2,s3,s4,s5,s6;
        if( "student".equals(type))
        { 
             String qr1="update student set psw=? , name=? , dob=? , cgpa=? , email=? where userid=?";
            ps=con.prepareStatement(qr1);
          //http://localhost:8080/a_1/Update?psw=abc123&nm=+Ayushi+gupta&dob=1995-12-03&cgpa=9&em=ayushi%40gmail.com
        s1=request.getParameter("psw");
        s2=request.getParameter("nm");
        s3=request.getParameter("dob");
        s4=request.getParameter("cgpa");
        s5=request.getParameter("em");
                
            ps.setString(1, s1); ps.setString(4,s4);
            ps.setString(2, s2); ps.setString(5,s5);
            ps.setString(3, s3); ps.setString(6,id);
            ps.executeUpdate();
           
       response.sendRedirect("ViewProfile.jsp");
        }
        else if ("company".equals(type)) {
         
             String qr1="update company set psw=? , cname=? , hrname=? , email=?  , phone=? where cid=?";
            ps=con.prepareStatement(qr1);
          // cid psw cname hrname email phone
        s1=request.getParameter("psw");
        s2=request.getParameter("name");
        s3=request.getParameter("hname");
        s4=request.getParameter("em");
        s5=request.getParameter("pno");
               
            ps.setString(1, s1); ps.setString(4,s4);
            ps.setString(2, s2); ps.setString(5,s5);
            ps.setString(3, s3); ps.setString(6,id);
            ps.executeUpdate();
     
             response.sendRedirect("ViewProfile.jsp");
        
        }
        else{
        
        }
        }catch(Exception e)
        {    
            String err=e.getMessage();
            out.println("<html>");
            out.println("<h2>");
            out.println(err);
            out.println("<h2>");
            out.println("</html>");
        }    
  %>
    </body>
</html>
