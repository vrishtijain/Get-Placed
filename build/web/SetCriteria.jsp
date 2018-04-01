<%-- 
    Document   : SetCriteria
    Created on : Oct 8, 2017, 12:14:12 PM
    Author     : vrishti-jain
--%>
<%@ include file="header.html" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Set Criteria </title>
    </head>
    <style>
        
        
        .Button { margin-left: 16cm;
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
table {
  font-size: 1cm;          
  border-collapse: separate;
  border-spacing: 30px;
}        
    </style>
    <body>
        <h1 align="center" style=" font-size:1.2cm; ">Set Criteria</h1>
        
         <form action="Setting.jsp">
             <table  align="center" border="0">
                 
                 <tbody>
                     <tr>
                         <td >CGPA</td>
                         <td><input type="text" name="cgpa" value="" /></td>
                     </tr>
                     <tr>
                         <td>Branch</td>
                         <td><select name="branch">
                                 <option>Computer Science</option>
                                 <option>Information Technology</option>
                                 <option>Elec and communication</option>
                                 <option>Elec and Instrumentation</option>
                                 <option>Electrical</option>
                                 <option>Mechanical</option>
                                 <option>Civil</option>
                                 <option>Bio Medical</option>
                                 <option>Industrial Production</option>
                             </select></td>
                     </tr>
                 </tbody>
                
                 
             </table>
             <br> <br>
              <input class="Button" type="submit" value="Submit" />
             
            </form>
    </body>
</html>
