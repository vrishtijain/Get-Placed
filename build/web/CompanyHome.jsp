<%@ include file="header.html" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TPCell</title>
    </head>
    <style>
        body{
                background-image: url('home.jpg');
            }
            
             a{color:white;}
  .Button {
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
.table{
   align:center;
padding:20px;  
}           
            
.Usecase{
left-margin:30px;
padding:10px;
width:950px;
height:370px;

left:320px;
top:125px;
}

.welcome{
  
 margin:10px;
 padding:10px;
 position:absolute;
 left:400px;
 top:45px;
}


    </style>
    <body>
<%
String name = (String) session.getAttribute("username");


%>
<div class="welcome">
       <h1>Welcome <%= name%></h1>
    
</div>
 <br>
        
        <div class="UseCase">
            <table align="center" border="0" cell-padding="40">
                <tr >
                    <td width="500px"><img src="user.png" width="150" height="150"> </td>
                    <td> <img  src="user_edit.png" width="150" height="150" class="img1"></td>
                </tr>
                <tr>
                    <td align="left" width="500px"><button class="Button"><span><a href="ViewProfile.jsp">View My Profile</a></span></button></td>
                    <td align="right"><button class="Button"><span><a href="UpdateProfile.jsp">Update Profile</a></span></button></td>
                </tr>
                <tr>
                <td ><img src="postrec.png" width="150" height="150"></td>
                <td><img src="records.jpg" width="150" height="150"></td>
                </tr>
                <tr>
                <td><button class="Button"><span><a href="SetCriteria.jsp">Give Criteria</a></span></button></td>
                <td><button class="Button"><span><a href="PreviousHistory.jsp">View Previous History</a></span></button></td>
                </tr>
            </table>
        </div>
    </body>
</html>
