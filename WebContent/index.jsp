<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
      <title>Registration</title>
      <link rel="stylesheet" href="css/index.css">
   </head>
   <body style="background-color: #ffe6e6">
      <div>
         <form action="collect" method="post">
            <input type="text" name="empid" placeholder="Employee ID" required>
            <input type="text" name="name" placeholder="Name" required onchange="nameSetter()">
            <input type="text" name="mobno"  placeholder="Mobile-No" required>
            <input type="submit" value="Register">
         </form>
      </div>
      <%
         session.setAttribute("empid", request.getParameter("empid"));
      %>
      <!-- <script type="text/javascript" src="js/nameSetter.js"></script> -->
      <script type="text/javascript">
         function nameSetter(){
         	var fname = document.getElementsByName('name')[0].value;
         	console.log(fname);
         	localStorage.setItem('name', document.getElementsByName('name')[0].value);
         	//alert(localStorage.getItem('name'));
         }
      </script>
   </body>
</html>