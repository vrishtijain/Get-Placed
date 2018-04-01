
<%@ include file="header.html" %>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Home</title>
        <style>
            body{
                background-image: url('home.jpg');
                
            }    
            
            
            .imag1
            {
                margin-left: 7cm;
            }
.usecase{
margin:10px;
padding:10px;
width:950px;
height:370px;
position:absolute;
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
  #container {
  position: relative;
}

#container > * {
  position: absolute;
}

.sidenav {
  left: 0;
}

.welcome{
  margin-left:2cm;
} 
</style>
    </head>
    <body>
       
<%
String name = (String) session.getAttribute("username");


%>
<div class="welcome">
       <h1  align="center" style="font-size: 1cm;">Welcome <%= name%></h1>
     
</div>    
        <br><br><br><br>
        <br>
        
        <div class="UseCase">
            <table align="center" border="0" cell-padding="40" cell-spacing="40">
                <tr ><td width="500"><img src="user.png" width="150" height="150"> </td>
                    <td> <img  src="user_edit.png" width="150" height="150" class="img1"></td>
                </tr>
                <tr >
                    <td align="left" width="500px"><button class="Button"><span><a href=" ViewProfile.jsp">View My Profile</a></span></button></td>
                     
                <td align="right"><button class="Button"><span><a href="UpdateProfile.jsp">Update Profile</a></span></button></td>
                </tr>
                <tr>
                <td ><img src="records.jpg" width="150" height="150"></td>
       <td><img src="testu.png" width="150" height="150"></td>
                </tr>
                <tr>
                                <td><button class="Button"><span><a href="UpdateRecords.jsp">Update Previous History</a></span></button></td>

       <td><button class="Button"><span><a href="UpdateTest.jsp">Update Test-Links</a></span></button></td>
                </tr>
       </div>
    
    </body>
</html>


