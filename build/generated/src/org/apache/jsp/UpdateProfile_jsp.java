package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UpdateProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.html");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <style>\n");
      out.write("        \n");
      out.write("        body\n");
      out.write("        {   background-size:  cover;\n");
      out.write("           position:  relative;\n");
      out.write("               \n");
      out.write("               \n");
      out.write("            background-image: url(\"qw.jpg\");\n");
      out.write("        }\n");
      out.write("        marquee\n");
      out.write("        {\n");
      out.write("            font-size: 50px;\n");
      out.write("            font-family:  cursive;\n");
      out.write("          \n");
      out.write("        }\n");
      out.write("        .sidenav {\n");
      out.write("    height: 100%;\n");
      out.write("    width: 0;\n");
      out.write("    position: fixed;\n");
      out.write("    z-index: 1;\n");
      out.write("    top: 0;\n");
      out.write("    left: 0;\n");
      out.write("    background-color: #111;\n");
      out.write("    overflow-x: hidden;\n");
      out.write("    transition: 0.5s;\n");
      out.write("    padding-top: 60px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".sidenav a {\n");
      out.write("    padding: 8px 8px 8px 32px;\n");
      out.write("    text-decoration: none;\n");
      out.write("    font-size: 25px;\n");
      out.write("    color: #818181;\n");
      out.write("    display: block;\n");
      out.write("    transition: 0.3s;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".sidenav a:hover {\n");
      out.write("    color: #f1f1f1;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".sidenav .closebtn {\n");
      out.write("    position: absolute;\n");
      out.write("    top: 0;\n");
      out.write("    right: 25px;\n");
      out.write("    font-size: 36px;\n");
      out.write("    margin-left: 50px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("@media screen and (max-height: 450px) {\n");
      out.write("  .sidenav {padding-top: 15px;}\n");
      out.write("  .sidenav a {font-size: 18px;}\n");
      out.write("\n");
      out.write(".sidenav {\n");
      out.write("  left: 0;\n");
      out.write("}\n");
      out.write("    </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <marquee>TRAINING AND PLACEMENT CELL</marquee>\n");
      out.write("     <div id=\"mySidenav\" class=\"sidenav\">\n");
      out.write("  <a href=\"javascript:void(0)\" class=\"closebtn\" onclick=\"closeNav()\">&times;</a>\n");
      out.write("  <a href=\"StudentHome.jsp\">Home</a>\n");
      out.write("  <a href=\"#\">About us</a>\n");
      out.write("  <a href=\"#\">Contact</a>\n");
      out.write("  <a href=\"#\">Logout</a>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<span style=\"font-size:30px;cursor:pointer\" onclick=\"openNav()\">&#9776;</span>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("function openNav() {\n");
      out.write("    document.getElementById(\"mySidenav\").style.width = \"250px\";\n");
      out.write("}\n");
      out.write("\n");
      out.write("function closeNav() {\n");
      out.write("    document.getElementById(\"mySidenav\").style.width = \"0\";\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("    <footer>Contact us:</footer>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <body>\n");

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


      out.write("   \n");
      out.write("\n");
      out.write("        <h1>Your Profile</h1>\n");
      out.write("        \n");
      out.write("        <form action=\"StudentHome.jsp\" method=\"GET\">\n");
      out.write("            <table border=\"0\">\n");
      out.write("                \n");
      out.write("                <tbody>\n");
      out.write("                     <tr>\n");
      out.write("                        <th>Student Id</th>\n");
      out.write("                        <th>");
      out.print(s1);
      out.write("</th>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Password</td>\n");
      out.write("                        <td><input type=\"text\" name=\"psw\" value=\"");
      out.print(s2);
      out.write("\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Name</td>\n");
      out.write("                        <td><input type=\"text\" name=\"nm\" value=\"");
      out.print(s3);
      out.write("\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Date Of Birth</td>\n");
      out.write("                        <td><input type=\"text\" name=\"dob\" value=\"");
      out.print(s4);
      out.write("\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>CGPA</td>\n");
      out.write("                        <td><input type=\"text\" name=\"cgpa\" value=\"");
      out.print(s5);
      out.write("\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Email</td>\n");
      out.write("                        <td><input type=\"text\" name=\"em\" value=\"");
      out.print(s7);
      out.write("\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td><input type=\"submit\" value=\"Submit\" onclick=\"show_alert()\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                <script>\n");
      out.write("                   function show_alert()\n");
      out.write("                   {\n");
      out.write("                     ");
 
        String qr1="update student set psw=? and name=? and dob=? and cgpa=? and em=? where userid=?)";
            ps=con.prepareStatement(qr1);
        s1=request.getParameter("uid");    
        s2=request.getParameter("psw");
        s3=request.getParameter("nm");
        s4=request.getParameter("dob");
        s5=request.getParameter("cgpa");
        s6=request.getParameter("em");
                try{
            ps.setString(6, s1); ps.setString(2,s2);
            ps.setString(3, s3); ps.setString(4,s4);
            ps.setString(5, s5); ps.setString(1,s6);
            ps.executeUpdate();
        }catch(Exception e){
            out.println(e);
        }

      out.write("               \n");
      out.write("                     alert('Successfully Updated...!!');\n");
      out.write("                   }\n");
      out.write("                    Window.location.assign('ViewProfile.jsp');\n");
      out.write("                </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("\n");
      out.write(" \n");
      out.write("    ");
  }}
else if(type=="company")

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

      out.write("\n");
      out.write("\n");
      out.write("        <h1>Your Profile</h1>\n");
      out.write("        <table border=\".6\">\n");
      out.write("                <tbody>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Company Id</th>\n");
      out.write("                    <th><input type=\"text\" name=\"id\" value=\"");
      out.print(s1);
      out.write("\" /></th>\n");
      out.write("                </tr>\n");
      out.write("           <tr>\n");
      out.write("                    <td>Password</td>\n");
      out.write("                    <td><input type=\"text\" name=\"name\" value=\"");
      out.print(s2);
      out.write("\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Name</td>\n");
      out.write("                    <td><input type=\"text\" name=\"name\" value=\"");
      out.print(s3);
      out.write("\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>H R Name</td>\n");
      out.write("                    <td><input type=\"text\" name=\"cgpa\" value=\"");
      out.print(s4);
      out.write("\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Email</td>\n");
      out.write("                    <td><input type=\"text\" name=\"em\" value=\"");
      out.print(s5);
      out.write("\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td>Phone Number</td>\n");
      out.write("                    <td><input type=\"text\" name=\"pno\" value=\"");
      out.print(s6);
      out.write("\" /></td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");

}}
else 
{
 name="Tani/Tanu";
id="admin123";
String pno="909090900";



      out.write("\n");
      out.write("\n");
      out.write("        <h1>Your Profile</h1>\n");
      out.write("        <table border=\".6\">\n");
      out.write("                <tbody>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Admin Id</th>\n");
      out.write("                    <th>");
      out.print(id);
      out.write("</th>\n");
      out.write("                </tr>\n");
      out.write("           \n");
      out.write("                <tr>\n");
      out.write("                    <td>Name</td>\n");
      out.write("                    <td>");
      out.print(name);
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>phone number</td>\n");
      out.write("                    <td>");
      out.print(pno);
      out.write("</td>\n");
      out.write(" \n");
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
 }
// add admin profile here 
        con.close();


      out.write("\n");
      out.write("    </body>\n");
      out.write(" \n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
