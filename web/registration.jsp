
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ include file="header.html" %>
<html>
<head>
<style type="text/css">
body{
background-color:   #4CAF50;
}
h1{
background-color: cadetblue;
height:40px;
}
table {
	background: #f5f5f5;
	border-collapse: separate;
	box-shadow: inset 0 1px 0 #fff;
	font-size: 20px;
	line-height: 24px;
	margin: 30px auto;
	text-align: left;
	width: 800px;
}	

th {
	background: url(https://jackrugile.com/images/misc/noise-diagonal.png), linear-gradient(#777, #444);
	border-left: 1px solid #555;
	border-right: 1px solid #777;
	border-top: 1px solid #555;
	border-bottom: 1px solid #333;
	box-shadow: inset 0 1px 0 #999;
	color: #fff;
  font-weight: bold;
	padding: 10px 15px;
	position: relative;
	text-shadow: 0 1px 0 #000;	
}

th:after {
	background: linear-gradient(rgba(255,255,255,0), rgba(255,255,255,.08));
	content: '';
	display: block;
	height: 25%;
	left: 0;
	margin: 1px 0 0 0;
	position: absolute;
	top: 25%;
	width: 100%;
}

th:first-child {
	border-left: 1px solid #777;	
	box-shadow: inset 1px 1px 0 #999;
}

th:last-child {
	box-shadow: inset -1px 1px 0 #999;
}

td {
	border-right: 1px solid #fff;
	border-left: 1px solid #e8e8e8;
	border-top: 1px solid #fff;
	border-bottom: 1px solid #e8e8e8;
	padding: 10px 15px;
	position: relative;
	transition: all 300ms;
}

td:first-child {
	box-shadow: inset 1px 0 0 #fff;
}	

td:last-child {
	border-right: 1px solid #e8e8e8;
	box-shadow: inset -1px 0 0 #fff;
}	

tr {
	background: url(https://jackrugile.com/images/misc/noise-diagonal.png);	
}

tr:nth-child(odd) td {
	background: #f1f1f1 url(https://jackrugile.com/images/misc/noise-diagonal.png);	
}

tr:last-of-type td {
	box-shadow: inset 0 -1px 0 #fff; 
}

tr:last-of-type td:first-child {
	box-shadow: inset 1px -1px 0 #fff;
}	

tr:last-of-type td:last-child {
	box-shadow: inset -1px -1px 0 #fff;
}	

tbody:hover td {
	color: transparent;
	text-shadow: 0 0 3px #aaa;
}

tbody:hover tr:hover td {
	color: #444;
	text-shadow: 0 1px 0 #fff;
}


</style>    
</head>
<body>

<h1 align="center">Registration Form</h1>
<form action="SaveUser"  method="GET">
<table align="center" cellpadding="5px" cellspacing="15px">
 
 <tr>
 <td align="right">User-id</td> 
 <td><input name="uid" type="text"></td>
 </tr>
 <tr>
 <td align="right"><b>Password</b></td>
 <td><input name="pw" type="password" title="Password must contain character and a digit"></td>
 </tr>
 <tr>
 <td align="right">Name</td> 
 <td><input type="text" name="nm"></td>
 </tr>
 
 <tr>
 <td align="right">DOB</td> 
 <td><input type="date" name="dob">
 </tr>
  <tr>
 <td align="right">CGPA</td> 
 <td><input type="text" name="cgpa"></td>
 </tr>

 <tr>
     
 <td align="right">Branch</td>
 <td><select name="br" width=250 STYLE="width: 250px" size=1>
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
     </td>
 </tr>
  <tr>
 <td align="right">Email</td> 
 <td><input type="email" name="em"></td>
 </tr>
 <tr>
 <td></td> 
 <td><input type="submit" value="Submit"></td>
 </tr>
</form>


</body>
</html>
