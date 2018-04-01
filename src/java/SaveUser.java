import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SaveUser extends HttpServlet {

    Connection con; PreparedStatement ps;

    
    @Override
    public void init(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","abc123");
            String qr="insert into student values(?,?,?,?,?,?,?)";
            ps=con.prepareStatement(qr);            
        }catch(Exception e){}
    }
    @Override
    public void destroy(){
        try{
        con.close();
        }catch(Exception e){}
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String s1=request.getParameter("uid");
        String s2=request.getParameter("pw");
        String s3=request.getParameter("nm");
        String s4=request.getParameter("dob");
        String s5=request.getParameter("cgpa");
        String s6=request.getParameter("br");
        String s7=request.getParameter("em");

        try{
            ps.setString(1, s1); ps.setString(2,s2);
            ps.setString(3, s3); ps.setString(4,s4);
            ps.setString(5, s5); ps.setString(6,s6); ps.setString(7,s7);
            ps.executeUpdate();
            out.println("<h3>Registration Completed</h3>");
            out.println("<h4><a href=index.jsp>Login-Now</a></h4>");
        }catch(Exception e){
            out.println(e);
        }
    }
  // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
