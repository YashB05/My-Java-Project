<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${requestScope.emplist !=null and 
	not empty requestScope.emplist}">

		<table border="1" cellpadding="3">
			<tr>
				<td>reg ID</td>
				<td>First Name</td>
				<td>Last Name</td>
				<td>Acc Bal</td>
				<td>&nbsp;</td>
			</tr>
		
			<c:foreach items="${requestScope.emplist}" var="e">
				<tr>
					<td>${e.rno}</td>
					<td>${e.fname}</td>
					<td>${e.lname}</td>
					<td>${e.accbal}</td>
				</tr>
		</table>
</body>
</html>