<%-- 
    Document   : UpdateRecords
    Created on : Oct 11, 2017, 6:56:20 PM
    Author     : vrishti-jain
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       
    </head>
    <body align="center" >
        <h1 align ="center">Update Records</h1>
       
 
 <form action="RecordSaved.jsp">
     <table align="center"  border="0">
        
         <tbody>
             <tr>
                 <td>Company Name </td>
                 <td><input type="text" name="nm" value="" /></td>
             </tr>
             <tr>
                 <td>Year</td>
                 <td><input type="text" name="yr" value="" /></td>
             </tr>
             <tr>
                 <td>Branch</td>
                 <td><select name="br" width=200 STYLE="width: 250px" size=1>
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
             <tr>
                 <td>Total Number</td>
                 <td><input type="text" name="num" value="" /></td>
             </tr>
         </tbody>
     </table>

     <input type="submit" value="Submit " />
     
     
     
 </form>
        
    </body>
</html>
