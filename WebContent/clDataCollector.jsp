<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@page import="com.core.QADao"%>
	<%@page import="java.sql.Connection"%>
	<jsp:useBean id="obj" class="com.core.BeanAnswers" />
	<jsp:setProperty property="*" name="obj" />
	<jsp:setProperty property="employeeId" name="obj" value="empId" />
	<%
		String empId = (String) session.getAttribute("empid");
		obj.setEmployeeId(empId);
		QADao.dataSaver(obj, (Connection) this.getServletConfig().getServletContext().getAttribute("dbconnection"));
	%>

	<jsp:forward page="index.jsp"></jsp:forward>
</body>
</html>