package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Events_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
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
      out.write("  <a href=\"KillSession.java\">Logout</a>\n");
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Upcoming Events</title>\n");
      out.write("    </head>\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("\n");
      out.write(".dropdown {\n");
      out.write("    position: relative;\n");
      out.write("    display: inline-block;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content {\n");
      out.write("    display: none;\n");
      out.write("    position: absolute;\n");
      out.write("    background-color: #f9f9f9;\n");
      out.write("    min-width: 160px;\n");
      out.write("    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\n");
      out.write("    z-index: 1;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content a {\n");
      out.write("    color: black;\n");
      out.write("    padding: 12px 16px;\n");
      out.write("    text-decoration: none;\n");
      out.write("    display: block;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content a:hover {background-color: #f1f1f1}\n");
      out.write("\n");
      out.write(".dropdown:hover .dropdown-content {\n");
      out.write("    display: block;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown:hover .dropbtn {\n");
      out.write("    background-color: #3e8e41;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    <body>\n");
      out.write("     ");

    Class.forName("com.mysql.jdbc.Driver");
    java.sql.Connection con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","abc123");
     String qr="select cgpa from student where userid= ? ";
    
          
                String id = ( String )session.getAttribute("userid");
                String name=  (String )session.getAttribute("username");       
            java.sql.PreparedStatement ps= con.prepareStatement(qr);
            java.sql.ResultSet rs, rs1, rs2 ;
            ps.setString(1,id );
            rs=ps.executeQuery();
            boolean found=rs.next();
            String s1;
            if(found==true){
                s1=rs.getString(1); 
            }
            else s1=null;
            String qr1="Select C.cid,C.cname from company C, criteria T where C.cid=T.cid and T.cgpa<=?";
            ps= con.prepareStatement(qr1);
            ps.setString(1,s1 );
            rs1=ps.executeQuery();
            
            String s2,s3;
            while(rs1.next())
            {     
              s2=rs1.getString(2);
              s3=rs1.getString(3);
                 

      out.write("\n");
      out.write("\n");
      out.write("<div class=\"dropdown\">\n");
      out.write("    <h3>Upcoming Companies<h3>\n");
      out.write("            \n");
      out.write("            <ul type=\"square\">\n");
      out.write("                <li>");
      out.print(s3);
      out.write("</li>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("  <div class=\"dropdown-content\">\n");
      out.write("       ");
   
    
   String qr2="Select T.cgpa, T.branch, C.hrname from criteria T, company C where C.cid=? and T.cid=C.cid";
    ps= con.prepareStatement(qr2);
            ps.setString(1,s2);
            rs2=ps.executeQuery();
            String s4=null,s5=null,s6=null;
            found=rs2.next();
            if(found)
            {
               s4=rs.getString(1); 
               s5=rs.getString(2); 
               s6=rs.getString(3); 
            }
            
           
    
      out.write("\n");
      out.write("    <table border=\"0\" width=\"3\" cellspacing=\"4\" cellpadding=\"4\">\n");
      out.write("       \n");
      out.write("        <tbody>\n");
      out.write("            <tr>\n");
      out.write("                <td>Company HR name:</td>\n");
      out.write("                <td>");
      out.print(s6);
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>CGPA</td>\n");
      out.write("                <td>");
      out.print(s4);
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Branch:</td>\n");
      out.write("                <td>");
      out.print(s5);
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("        </tbody>\n");
      out.write("    </table>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    ");
 } 
      out.write("\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("   \n");
      out.write("    </body>\n");
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
