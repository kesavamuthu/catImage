<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Survey</title>
</head>
<body>
<%
String employeeId = request.getParameter("empid");
String name = request.getParameter("name");
session.setAttribute("user",name);
String mobileNo = request.getParameter("mobno");
//response.sendRedirect("/surveyQuestions.jsp");
//RequestDispatcher rd = request.getRequestDispatcher("surveyQuestions.jsp");
//getServletContext().getRequestDispatcher("/surveyQuestions.jsp").forward(request, response);
%>
<jsp:include page="surveyQuestions.jsp"></jsp:include>
</body>
</html>		