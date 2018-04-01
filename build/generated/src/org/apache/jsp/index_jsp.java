package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <a href=\"About.jsp\">About us</a>\n");
      out.write("  <a href=\"Contact.jsp\">Contact</a>\n");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <style>\n");
      out.write("        form {\n");
      out.write("            border: 3px solid #f1f1f1;\n");
      out.write("        }\n");
      out.write("        select{\n");
      out.write("             width: 100%;\n");
      out.write("            padding: 12px 20px;\n");
      out.write("            margin: 8px 0;\n");
      out.write("            display: inline-block;\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("            box-sizing: border-box;\n");
      out.write("            background-color:  #f0fff0\t;\n");
      out.write("        }\n");
      out.write("        input[type=text], input[type=password] {\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 12px 20px;\n");
      out.write("            margin: 8px 0;\n");
      out.write("            display: inline-block;\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("            box-sizing: border-box;\n");
      out.write("            background-color:  #f0fff0\t;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input [type=reset] {\n");
      out.write("            background-color:  currentColor;\n");
      out.write("            border: none; /* Remove borders */\n");
      out.write("            color: white; /* Add a text color */\n");
      out.write("            padding: 14px 28px; /* Add some padding */\n");
      out.write("            cursor: pointer; /* Add a pointer cursor on mouse-over */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        table { \n");
      out.write("\n");
      out.write("            margin-left: 10cm;\n");
      out.write("            display: table;\n");
      out.write("            border-collapse: separate;\n");
      out.write("            border-spacing: 10px;\n");
      out.write("            border-color:#4CAF50 ;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        form\n");
      out.write("        {margin-right: 0cm;\n");
      out.write("         margin-left: 0cm;\n");
      out.write("\n");
      out.write("         background-image: url(\"bluu.jpg\");\n");
      out.write("         position: relative;\n");
      out.write("         background-size:  cover;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        head{\n");
      out.write("            color: #f0ffff;\n");
      out.write("            margin: 2em;\n");
      out.write("        }\n");
      out.write("        .btn {\n");
      out.write("            border: none; /* Remove borders */\n");
      out.write("            color: white; /* Add a text color */\n");
      out.write("            padding: 14px 28px; /* Add some padding */\n");
      out.write("            cursor: pointer; /* Add a pointer cursor on mouse-over */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .success {background-color: #4CAF50;} /* Green */\n");
      out.write("        .success:hover {background-color: #46a049;}\n");
      out.write("        .buttonReset\n");
      out.write("        {\n");
      out.write("            background-color:  teal;\n");
      out.write("            border: none; /* Remove borders */\n");
      out.write("            color: white; /* Add a text color */\n");
      out.write("            padding: 14px 28px; /* Add some padding */\n");
      out.write("            cursor: pointer; /* Add a pointer cursor on mouse-over */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <form  name=\"VerifyUser\" action=\"VerifyUser.jsp\">\n");
      out.write("            <h2 style =\"   font-size:40px;    color:  cadetblue; align-content: space-between; margin-left: 13cm ;\">Login </h2>\n");
      out.write("            <table    border=\"0\"    >\n");
      out.write("\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>   \n");
      out.write("                        <td>Username</td>\n");
      out.write("                        <td><input type=\"text\" name=\"uid\" placeholder=\"Enter Username\" value=\"\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>   \n");
      out.write("                        <td>Password</td>\n");
      out.write("                        <td><input type=\"password\" name=\"psw\" placeholder=\"Enter Password\" value=\"\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>   \n");
      out.write("                        <td>User Type</td>\n");
      out.write("                        <td><select  name=\"type\">\n");
      out.write("                                <option>student</option>\n");
      out.write("                                <option>company</option>\n");
      out.write("                                <option>admin</option>\n");
      out.write("                            </select></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("\n");
      out.write("                        <td><button class=\"btn success\">Login</button></td>\n");
      out.write("                        <td> <input  type=\"reset\" class =\"buttonReset\"   value=\"Reset\" name=\"reset\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("          \n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("   <a href=\"registration.jsp\">\n");
      out.write("       <img src=\"register1.png\" alt=\"New Registration\" style=\" margin-left: 15cm;width:200px;height:200px;border:0;\"> </a>\n");
      out.write("   \n");
      out.write("<a href=\"Fpassword.jsp\"> Forgot psssword <img src=\"for.png\" alt=\"Forget password\" style=\" margin-left: 15cm;width:200px;height:200px;border:0;\"> </a>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("     \n");
      out.write("            </body>\n");
      out.write("            </html>\n");
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
