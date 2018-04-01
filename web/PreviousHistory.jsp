<%@ include file="header.html" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Previous History</title>
    </head>
    <style>
        
       a{color:white;}
  .Button {
      margin-left: 8.5cm;
    background-color: #4CAF50;
    color: white;
    padding: 16px;
    font-size: 16px;
    font-color: white;
    border: none;
    border-radius: 15px 15px 15px 15px;
    cursor: pointer;
    width:160px;
    background-image: linear-gradient(#04433F,#297F7B);
}
.Button:hover{
	background: linear-gradient(#073,#0fa);
}           


.search_categories{
  font-size: 20px;
  padding: 10px 8px 10px 14px;
  background: #fff;
  border: 0px solid #ccc;
  border-radius: 6px;
  overflow: hidden;
  position: relative;
}

.search_categories .select{
  width: 50%;
  
  background-position:80% center;
}

.search_categories .select select{
  background: transparent;
  line-height: 1;
  border: 1px;
  padding: 0;
  border-radius: 0;
  border-bottom-style: groove;
  width: 50%;
  position: relative;
  z-index: 10;
  font-size: 15;
}

    </style>
    <body>
        <div>
            <h1 align="center"><b>Past Recruiters</b></h1>
            <br><br>
        <form action="PreviousHistory.jsp">
         <button class="Button" name="b1">Branch-wise</button>
         <button class="Button" name="b2" onclick="window.location='Records.jsp'"  style="margin-right: 30px">Year-wise</button>
        </form>
            <br><br>
        </body>
        </html>
         <%
    Class.forName("com.mysql.jdbc.Driver");
    java.sql.Connection con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","abc123");
    java.sql.PreparedStatement ps;
    java.sql.ResultSet rs;
        //String b1=request.getParameter("b1"); 
        //String b2=request.getParameter("b2"); 
       if(request.getParameter("b1")!=null)
        {
             %>
             <div class="search_categories">
      <div class="select">
                 <form action='Records.jsp'>
           <p>Select Branch:</p>
           <select name="br">
               <option>Computer Science</option>
               <option>Information Technology</option>
               <option>Elec and communication</option>
               <option>Elec and Instrumentation</option>
               <option>Electrical</option>
               <option>Mechanical</option>
               <option>Civil</option>
               <option>Bio Medical</option>
               <option>Industrial Production</option>                                 
           </select>
           <input type="submit" name="submit" value="Submit"/>
       </form> 
      </div>
             </div>
          
        
        <%}
        else if(request.getParameter("b2")!=null)
        {
            
       %>
       <form action='Records.jsp'>
           <div class="search_categories">
           <div class="select">
          <p>Select Year:</p>
           <select name="year">
           <% for(int i=2016; i>2000; i--)
           {  %>
           <option><%=i%></option>
         <% } %>                               
           </select>
           <input type="submit" name="submit1" value="Submit""/>
       </form>
         </div>
            </div>
           
            <%  
            }
    

    
con.close();
         
 %>
</div>
    </body>
</html>


