<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
<style>
input[type=text]{
width: 100%;
padding: 12px 20px;
margin: 8px 0;
display: inline-block;
border: 1px solid #ccc;
border-radius: 4px;
box-sizing: border-box;
}
input[type=submit]{
width: 100%;
background-color: #4CAF50;
color: white;
padding: 14px 20px;
margin: 8px 0;
border: none;
border-radius: 4px;
cursor: pointer;
}
input[type=submit]:hover{
background-color: #45a049;
}
div{
width: 15%;
border-radius: 5px;
background-color: #f2f2f2;
padding: 20px;
margin: auto;
margin-top: 10%;
}
</style>
</head>
<body style="background-color: #ffe6e6">
<div>
<form action="collect" method="post">
<input type="text" name="empid" placeholder="Employee ID" required>
<input type="text" name="name" placeholder="Name" required>
<input type="text" name="mobno"  placeholder="Mobile-No" required>
<input type="submit" value="Register">
</form>
</div>
</body>
</html>