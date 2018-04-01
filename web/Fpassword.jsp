<%-- 
    Document   : Fpassword
    Created on : Oct 11, 2017, 9:39:35 PM
    Author     : vrishti-jain
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
    </head>
    <body>
        <form  action="CheckPassword.jsp">
            <table align= "center" border="0">
                
            
                <tbody>
                    <tr>
                        <td>Enter User id </td>
                        <td><input type="text" name="userid" value="" /></td>
                    </tr>
                    <tr>
                        <td>Enter type</td>
                        <td><select name="type">
                                <option>student</option>
                                <option>company</option>
                            </select></td>
                    </tr>
                    <tr>
                        <td>Enter email for stdeunt or phone for company</td>
                        <td><input type="text" name="data" value="" /></td>
                    </tr>
                </tbody>
            </table>
            <input type="submit" value="Submit" />
        </form>
        
        
    </body>
</html>
