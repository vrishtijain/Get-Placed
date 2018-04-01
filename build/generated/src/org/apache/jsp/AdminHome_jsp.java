package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminHome_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("    <meta HTTP-EQUIV=\"Pragma\" content=\"no-cache\">\n");
      out.write("    <meta HTTP-EQUIV=\"Expires\" content=\"-1\"> \n");
      out.write("    </head>\n");
      out.write("    \n");
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
      out.write("       \n");
      out.write("\n");
      out.write("    <marquee>TRAINING AND PLACEMENT CELL</marquee>\n");
      out.write("     <div id=\"mySidenav\" class=\"sidenav\">\n");
      out.write("  <a href=\"javascript:void(0)\" class=\"closebtn\" onclick=\"closeNav()\">&times;</a>\n");
      out.write("  <a href=\"#\">About us</a>\n");
      out.write("  <a href=\"#\">Contact</a>\n");
      out.write("  <a href=\"KillSession\">Logout</a>\n");
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
      out.write("   \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Admin Home</title>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background-image: url('home.jpg');\n");
      out.write("                \n");
      out.write("            }    \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            .imag1\n");
      out.write("            {\n");
      out.write("                margin-left: 7cm;\n");
      out.write("            }\n");
      out.write(".usecase{\n");
      out.write("margin:10px;\n");
      out.write("padding:10px;\n");
      out.write("width:950px;\n");
      out.write("height:370px;\n");
      out.write("position:absolute;\n");
      out.write("left:320px;\n");
      out.write("top:125px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".welcome{\n");
      out.write("  \n");
      out.write(" margin:10px;\n");
      out.write(" padding:10px;\n");
      out.write(" position:absolute;\n");
      out.write(" left:400px;\n");
      out.write(" top:45px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("a{color:white;}\n");
      out.write("  .Button {\n");
      out.write("    background-color: #4CAF50;\n");
      out.write("    color: white;\n");
      out.write("    padding: 16px;\n");
      out.write("    font-size: 16px;\n");
      out.write("    font-color: white;\n");
      out.write("    border: none;\n");
      out.write("    border-radius: 15px 15px 15px 15px;\n");
      out.write("    cursor: pointer;\n");
      out.write("    width:160px;\n");
      out.write("    background-image: linear-gradient(#04433F,#297F7B);\n");
      out.write("}\n");
      out.write(".Button:hover{\n");
      out.write("\tbackground: linear-gradient(#073,#0fa);\n");
      out.write("}           \n");
      out.write(".table{\n");
      out.write("   align:center;\n");
      out.write("padding:20px;  \n");
      out.write("}           \n");
      out.write("            \n");
      out.write(".Usecase{\n");
      out.write("left-margin:30px;\n");
      out.write("padding:10px;\n");
      out.write("width:950px;\n");
      out.write("height:370px;\n");
      out.write("\n");
      out.write("left:320px;\n");
      out.write("top:125px;\n");
      out.write("}\n");
      out.write("  #container {\n");
      out.write("  position: relative;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#container > * {\n");
      out.write("  position: absolute;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".sidenav {\n");
      out.write("  left: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".welcome{\n");
      out.write("  margin-left:2cm;\n");
      out.write("} \n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");

String name = (String) session.getAttribute("username");



      out.write("\n");
      out.write("<div class=\"welcome\">\n");
      out.write("       <h1  align=\"center\" style=\"font-size: 1cm;\">Welcome ");
      out.print( name);
      out.write("</h1>\n");
      out.write("     \n");
      out.write("</div>    \n");
      out.write("        <br><br><br><br>\n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("        <div class=\"UseCase\">\n");
      out.write("            <table align=\"center\" border=\"0\" cell-padding=\"40\" cell-spacing=\"40\">\n");
      out.write("                <tr ><td width=\"500\"><img src=\"user.png\" width=\"150\" height=\"150\"> </td>\n");
      out.write("                    <td> <img  src=\"user_edit.png\" width=\"150\" height=\"150\" class=\"img1\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr >\n");
      out.write("                    <td align=\"left\" width=\"500px\"><button class=\"Button\"><span><a href=\" ViewProfile.jsp\">View My Profile</a></span></button></td>\n");
      out.write("                     \n");
      out.write("                <td align=\"right\"><button class=\"Button\"><span><a href=\"UpdateProfile.jsp\">Update Profile</a></span></button></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                <td ><img src=\"records.jpg\" width=\"150\" height=\"150\"></td>\n");
      out.write("       <td><img src=\"testu.png\" width=\"150\" height=\"150\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                                <td><button class=\"Button\"><span><a href=\"UpdateRecords.jsp\">Update Previous History</a></span></button></td>\n");
      out.write("\n");
      out.write("       <td><button class=\"Button\"><span><a href=\"UpdateTest.jsp\">Update Test-Links</a></span></button></td>\n");
      out.write("                </tr>\n");
      out.write("       </div>\n");
      out.write("    \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
