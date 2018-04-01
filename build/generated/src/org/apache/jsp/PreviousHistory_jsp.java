package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PreviousHistory_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Previous History</title>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        \n");
      out.write("        .dropbtn {\n");
      out.write("    background-color: #4CAF50;\n");
      out.write("    color: white;\n");
      out.write("    padding: 16px;\n");
      out.write("    font-size: 16px;\n");
      out.write("    border: none;\n");
      out.write("    cursor: pointer;\n");
      out.write("    width:160px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".search_categories{\n");
      out.write("  font-size: 20px;\n");
      out.write("  padding: 10px 8px 10px 14px;\n");
      out.write("  background: #fff;\n");
      out.write("  border: 0px solid #ccc;\n");
      out.write("  border-radius: 6px;\n");
      out.write("  overflow: hidden;\n");
      out.write("  position: relative;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".search_categories .select{\n");
      out.write("  width: 50%;\n");
      out.write("  \n");
      out.write("  background-position:80% center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".search_categories .select select{\n");
      out.write("  background: transparent;\n");
      out.write("  line-height: 1;\n");
      out.write("  border: 1px;\n");
      out.write("  padding: 0;\n");
      out.write("  border-radius: 0;\n");
      out.write("  border-bottom-style: groove;\n");
      out.write("  width: 50%;\n");
      out.write("  position: relative;\n");
      out.write("  z-index: 10;\n");
      out.write("  font-size: 15;\n");
      out.write("}\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("            <h2 align=\"center\"><b>Past Recruiters</b></h2>\n");
      out.write("        \n");
      out.write("        <form action=\"PreviousHistory.jsp\">\n");
      out.write("         <button class=\"dropbtn\" name=\"b1\">Branch-wise</button>\n");
      out.write("         <button class=\"dropbtn\" name=\"b2\" onclick=\"window.location='Records.jsp'\"  style=\"margin-right: 30px\">Year-wise</button>\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        </body>\n");
      out.write("        </html>\n");
      out.write("         ");

    Class.forName("com.mysql.jdbc.Driver");
    java.sql.Connection con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","abc123");
    java.sql.PreparedStatement ps;
    java.sql.ResultSet rs;
        //String b1=request.getParameter("b1"); 
        //String b2=request.getParameter("b2"); 
       if(request.getParameter("b1")!=null)
        {
             
      out.write("\n");
      out.write("             <div class=\"search_categories\">\n");
      out.write("      <div class=\"select\">\n");
      out.write("                 <form action='Records.jsp'>\n");
      out.write("           <p>Select Branch:</p>\n");
      out.write("           <select name=\"br\">\n");
      out.write("               <option>Computer Science</option>\n");
      out.write("               <option>Information Technology</option>\n");
      out.write("               <option>Elec and communication</option>\n");
      out.write("               <option>Elec and Instrumentation</option>\n");
      out.write("               <option>Electrical</option>\n");
      out.write("               <option>Mechanical</option>\n");
      out.write("               <option>Civil</option>\n");
      out.write("               <option>Bio Medical</option>\n");
      out.write("               <option>Industrial Production</option>                                 \n");
      out.write("           </select>\n");
      out.write("           <input type=\"submit\" name=\"submit\" value=\"Submit\"/>\n");
      out.write("       </form> \n");
      out.write("      </div>\n");
      out.write("             </div>\n");
      out.write("          \n");
      out.write("        \n");
      out.write("        ");
}
        else if(request.getParameter("b2")!=null)
        {
            
       
      out.write("\n");
      out.write("       <form action='Records.jsp'>\n");
      out.write("           <div class=\"search_categories\">\n");
      out.write("           <div class=\"select\">\n");
      out.write("          <p>Select Year:</p>\n");
      out.write("           <select name=\"year\">\n");
      out.write("           ");
 for(int i=2016; i>2000; i--)
           {  
      out.write("\n");
      out.write("           <option>");
      out.print(i);
      out.write("</option>\n");
      out.write("         ");
 } 
      out.write("                               \n");
      out.write("           </select>\n");
      out.write("           <input type=\"submit\" name=\"submit1\" value=\"Submit\"\"/>\n");
      out.write("       </form>\n");
      out.write("         </div>\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("            ");
  
            }
    

    
con.close();
         
 
      out.write("\n");
      out.write("</div>\n");
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
