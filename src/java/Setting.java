
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Setting extends HttpServlet {
 
   Connection con; PreparedStatement ps; ResultSet rs;
   @Override
    public void init(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","abc123");
              String qr="insert into criteria values(?,?,?)";   
             
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
            throws ServletException, IOException, SQLException {
        try{    
         String cgpa=request.getParameter("cgpa");
        String br=request.getParameter("branch");
          HttpSession session=request.getSession();
          String userid =      (String)session.getAttribute("userid");
          
          
try{        ps.setString(1,userid);
            ps.setString(2,cgpa);
             ps.setString(3,br);
             
             ps.executeUpdate();
            response.sendRedirect("CompanyHome.jsp");        
          
}catch(Exception e)
        {
           out.println("Something went wrong "); 
        }
        
        }
        catch(Exception e)
        {
           out.println("Something went wrong "); 
        }
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       try {
           processRequest(request, response);
       } catch (SQLException ex) {
        //   Logger.getLogger(Setting.class.getName()).log(Level.SEVERE, null, ex);
           out.println("Something went wrong poopop "); 
       }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       try {
           processRequest(request, response);
       } catch (SQLException ex) {
        //   Logger.getLogger(Setting.class.getName()).log(Level.SEVERE, null, ex);
              out.println("Something went wrong poopop "); 
       }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
