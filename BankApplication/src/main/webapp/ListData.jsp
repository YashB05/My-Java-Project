<%@page import="bank.model.Register"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display All</title>
<link rel="icon" type="image/png" href="images/icons/favicon.ico" />
<link rel="stylesheet" type="text/css"
	href="login assests/vendor/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css"
	href="login assests/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css"
	href="login assests/fonts/Linearicons-Free-v1.0.0/icon-font.min.css">
<link rel="stylesheet" type="text/css"
	href="login assests/vendor/animsition/css/animsition.css">
<link rel="stylesheet" type="text/css"
	href="login assests/vendor/css-hamburgers/hamburgers.min.css">
<link rel="stylesheet" type="text/css"
	href="login assests/vendor/animsition/css/animsition.min.css">
<link rel="stylesheet" type="text/css"
	href="login assests/vendor/select2/select2.min.css">
<link rel="stylesheet" type="text/css"
	href="login assests/vendor/daterangepicker/daterangepicker.css">
<link rel="stylesheet" type="text/css" href="login assests/css/util.css">
<link rel="stylesheet" type="text/css" href="login assests/css/main.css">
</head>
<body>
	<form action="displayServlet"></form>
	<div class="limiter">
		<div class="container-login100"
			style="background-image: url('login assests/images/bg-00.jpg');">
			<div class="wrap-login100 p-t-30 p-b-50">
				<%
				List<Register> lst = null;
				%>
				<%
				lst = (List<Register>) request.getAttribute("emplist");
				if (lst == null) {
					out.println("<h1>no data</h1>");
				}
				if (lst != null) {
				%>
				<table class="table">
					<tr class="table-dark">
						<th scope="col">Regno</th>
						<th scope="col">fname</th>
						<th scope="col">lname</th>
						<th scope="col">bal</th>
					</tr>
					<%
					for (Register r : lst) {
					%>
					<tbody>
						<tr>
							<td class="table-dark"><%=r.getRno()%></td>
							<td class="table-dark"><%=r.getFanme()%></td>
							<td class="table-dark"><%=r.getLname()%></td>
							<td class="table-dark"><%=r.getAccbal()%></td>
						</tr>
						<%
						}
						%>
					</tbody>
				</table>
				<%
	}
	%>
			</div>
		</div>
	</div>

</body>
</html>