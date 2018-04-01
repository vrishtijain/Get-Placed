<%-- 
    Document   : UpdateTest
    Created on : Oct 11, 2017, 7:21:35 PM
    Author     : vrishti-jain
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
      <body align="center" >
        <h1 align ="center">Update Records</h1>
       
 
 <form action="LinkSaved.jsp">
     <table align="center"  border="0">
        
         <tbody>
             <tr>
                 <td>Category</td>
                 <td><input type="text" name="cat" value="" /></td>
             </tr>
             <tr>
                 <td>URL</td>
                 <td><input type="text" name="url" value="" /></td>
             </tr>
            
         </tbody>
     </table>

     <input type="submit" value="Submit " />
     
     
     
 </form>
        
    </body>
</html>
