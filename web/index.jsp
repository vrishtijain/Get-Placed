

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="header.html" %>
<!DOCTYPE html>
<html>
    <style>
        form {
            border: 3px solid #f1f1f1;
        }
        select{
             width: 100%;
            padding: 12px 20px;
            margin: 8px 0;
            display: inline-block;
            border: 1px solid #ccc;
            box-sizing: border-box;
            background-color:  #f0fff0	;
        }
        input[type=text], input[type=password] {
            width: 100%;
            padding: 12px 20px;
            margin: 8px 0;
            display: inline-block;
            border: 1px solid #ccc;
            box-sizing: border-box;
            background-color:  #f0fff0	;
        }

        input [type=reset] {
            background-color:  currentColor;
            border: none; /* Remove borders */
            color: white; /* Add a text color */
            padding: 14px 28px; /* Add some padding */
            cursor: pointer; /* Add a pointer cursor on mouse-over */
        }

        table { 

            margin-left: 10cm;
            display: table;
            border-collapse: separate;
            border-spacing: 10px;
            border-color:#4CAF50 ;
        }

        form
        {margin-right: 0cm;
         margin-left: 0cm;

         background-image: url("bluu.jpg");
         position: relative;
         background-size:  cover;
        }

        head{
            color: #f0ffff;
            margin: 2em;
        }
        .btn {
            border: none; /* Remove borders */
            color: white; /* Add a text color */
            padding: 14px 28px; /* Add some padding */
            cursor: pointer; /* Add a pointer cursor on mouse-over */
        }

        .success {background-color: #4CAF50;} /* Green */
        .success:hover {background-color: #46a049;}
        .buttonReset
        {
            background-color:  teal;
            border: none; /* Remove borders */
            color: white; /* Add a text color */
            padding: 14px 28px; /* Add some padding */
            cursor: pointer; /* Add a pointer cursor on mouse-over */
        }


    </style>



    <body>




        <form  name="VerifyUser" action="VerifyUser.jsp">
            <h2 style ="   font-size:40px;    color:  cadetblue; align-content: space-between; margin-left: 13cm ;">Login </h2>
            <table    border="0"    >

                <tbody>
                    <tr>   
                        <td>Username</td>
                        <td><input type="text" name="uid" placeholder="Enter Username" value="" /></td>
                    </tr>
                    <tr>   
                        <td>Password</td>
                        <td><input type="password" name="psw" placeholder="Enter Password" value="" /></td>
                    </tr>
                    <tr>   
                        <td>User Type</td>
                        <td><select  name="type">
                                <option>student</option>
                                <option>company</option>
                                <option>admin</option>
                            </select></td>
                    </tr>
                    <tr>

                        <td><button class="btn success">Login</button></td>
                        <td> <input  type="reset" class ="buttonReset"   value="Reset" name="reset" /></td>
                    </tr>
          
                </tbody>
            </table>

   <a href="registration.jsp">
       <img src="register1.png" alt="New Registration" style=" margin-left: 15cm;width:200px;height:200px;border:0;"> </a>
   
<a href="Fpassword.jsp"> Forgot psssword <img src="for.png" alt="Forget password" style=" margin-left: 15cm;width:200px;height:200px;border:0;"> </a>


        </form>
        
     
            </body>
            </html>
