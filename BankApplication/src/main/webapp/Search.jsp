<%@page import="bank.model.Register"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search....</title>
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
<style type="text/css">
.arrow {
  width: 0;
  height: 40px;
  border: 1px solid #f0e9e9;
  position: relative;
  animation: scroll 1s infinite;
  -webkit-animation: scroll 1s infinite;
}
.arrow::after {
  content: "";
  display: block;
  position: absolute;
  top: 100%;
  left: -5px;
  width: 1px;
  height: 10px;
  border-top: 10px solid #f0e9e9;
  border-left: 5px solid transparent;
  border-right: 5px solid transparent;
}

@keyframes scroll {
  0% {
    height: 40px;
  }
  30% {
    height: 70px;
  }
  60% {
    height: 40px;
  }
}
@-webkit-keyframes scroll {
  0% {
    height: 40px;
  }
  30% {
    height: 70px;
  }
  60% {height: 40px;}
}
</style>
</head>
<body>
	<div class="limiter">
		<div class="container-login100"
			style="background-image: url('login assests/images/bg-00.jpg');">
			<div class="wrap-login100 p-t-30 p-b-50">
				<span class="login100-form-title p-b-41"> Bank Account Login
				</span>
				<form class="login100-form validate-form p-b-33 p-t-5"
					action="searchController">

					<div class="wrap-input100 validate-input" data-validate="search">
						<input class="input100" type="text" name="rno"
							placeholder="Registration No."> <span
							class="focus-input100" data-placeholder="&#xe82a;"></span>
					</div>
					<div class="container-login100-form-btn m-t-32">
						<button type="submit" value="search" class="login100-form-btn">Search</button>
					</div>
				</form>
				<div class="container" style="padding-top: 20%; padding-left: 50%;">
					<div class="field">
						<div class="arrow"></div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="limiter">
		<div class="container-login100"
			style="background-image: url('login assests/images/bg-00.jpg');">
			<div class="wrap-login100 p-t-30 p-b-50">
				<%!Register r = null;%>
				<%
				if (!session.isNew()) {
					r = (Register) session.getAttribute("sdata");
					session.invalidate();
				%>
				<table class="table">
					<thead>
						<tr class="table-dark">
							<th scope="col">Register No</th>
							<th scope="col">First Name</th>
							<th scope="col">Last Name</th>
							<th scope="col">Account Balance</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td class="table-dark"><%=r.getRno()%></td>
							<td class="table-dark"><%=r.getFanme()%></td>
							<td class="table-dark"><%=r.getLname()%></td>
							<td class="table-dark"><%=r.getAccbal()%></td>
						</tr>
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

