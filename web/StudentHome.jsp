


<%@ include file="header.html" %>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Home</title>
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


  #container {
  position: relative;
}

#container > * {
  position: absolute;
}

.sidenav {
  left: 0;
}


</style>
    </head>
    <body>
<%
String name = (String) session.getAttribute("username");


%>

    <h1 align="center" style="font-size: 1.5cm;">Welcome <%= name%></h1>
    
   
      
        <br>
        
        <div class="UseCase">
            <table align="center" border="0" cell-padding="40">
                <tr >
                    <td width="500px"><img src="user.png" width="150" height="150"> </td>
                    <td> <img  src="user_edit.png" width="150" height="150" class="img1"></td>
                </tr>
                <tr  class="dropbtn">
                    <td align="left" width="500px"><button class="Button"><span><a href="ViewProfile.jsp">View My Profile</a></span></button></td>
                    <td align="right"><button class="Button" ><span><a href="UpdateProfile.jsp">Update Profile</a></span></button></td>
                </tr>
                <tr>
                    <td ><img src="apply.png" width="150" height="150"></td>
                    <td><img src="testa.png" width="150" height="150"></td>
                </tr>
                <tr>
                    <td><button class="Button"><span><a href="Apply.jsp">Apply</a></span></button></td>
                    <td><button class="Button"><span><a href="TestLinks.jsp">View Test Link</a></span></button></td>
                </tr>
                <tr>
                    <td ><img src="recu.png" width="150" height="150"></td>
                    <td><img src="event.gif" width="150" height="150"></td>
                </tr>
                <tr>
                    <td><button class="Button"><span><a href="PreviousHistory.jsp">View Previous Records</a></span></button></td>
                    <td><button class="Button"><span><a href="Events.jsp">Upcoming events</a></span></button></td>
                </tr>
            </table>
       </div>
    
    </body>
</html>


