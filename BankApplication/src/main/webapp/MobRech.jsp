<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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

<script src="https://kit.fontawesome.com/041e2dc6b2.js"
	crossorigin="anonymous"></script>
</head>
<body>
	<section class="vh-100" style="background-color: #eee;">
		<div class="container h-100">
			<div
				class="row d-flex justify-content-center align-items-center h-100">
				<div class="col-lg-12 col-xl-11">
					<div class="card text-black" style="border-radius: 25px;">
						<div class="card-body p-md-5">
							<div class="row justify-content-center">
								<div class="col-md-10 col-lg-6 col-xl-5 order-2 order-lg-1">

									<p class="text-center h1 fw-bold mb-5 mx-1 mx-md-4 mt-4">Mobile
										Recharge</p>

									<form class="mx-1 mx-md-4" action="RechargeController">

										<div class="d-flex flex-row align-items-center mb-4">
											<i class="fa-solid fa-mobile"></i>
											<div class="form-outline flex-fill mb-0">
												<input type="text" id="form3Example1c" class="form-control" title=""
													placeholder="Mobile No." placeholder="00000 00000"
													pattern="[60000-90000]{5} [00000-90000]{5}" required />
											</div>
										</div>

										<div class="d-flex flex-row align-items-center mb-4">
											<i class="fa-solid fa-wallet"></i>
											<div class="form-outline flex-fill mb-0">
												<input type="email" id="form3Example3c" class="form-control"
													placeholder="Recharge Amount" />
											</div>
										</div>

										<div class="d-flex flex-row align-items-center mb-4">
											<i class="fa-solid fa-signal"></i>
											<div class="form-outline flex-fill mb-0">
												<select name="servcPro" id="form3Example4c"
													class="form-control" placeholder="Recharge Amount">
													<option id="form3Example3c" class="form-control"
														value="ssp">Service Provider</option>
													<option id="form3Example3c" class="form-control"
														value="Airtel">Airtel</option>
													<option id="form3Example3c" class="form-control"
														value="BSNL">BSNL</option>
													<option id="form3Example3c" class="form-control"
														value="Jio">Jio</option>
													<option id="form3Example3c" class="form-control" value="VI">VI</option>
												</select>
											</div>
										</div>

										<div class="d-flex flex-row align-items-center mb-4">
											<i class="fa-solid fa-map-pin"></i>
											<div class="form-outline flex-fill mb-0">
												<select name="circle" id="form3Example4c"
													class="form-control">
													<option id="form3Example3c" class="form-control"
														value="ssp">Select your Circle</option>
													<option id="form3Example3c" class="form-control"
														value="Airtel">Maharashtra</option>
													<option id="form3Example3c" class="form-control"
														value="BSNL">Andhra Pradesh</option>
													<option id="form3Example3c" class="form-control"
														value="Jio">Delhi</option>
													<option id="form3Example3c" class="form-control" value="VI">panjab</option>
													<option id="form3Example3c" class="form-control" value="VI">Rajastan</option>
													<option id="form3Example3c" class="form-control" value="VI">Gujrat</option>
													<option id="form3Example3c" class="form-control" value="VI">Jammu
														& kashmir</option>
													<option id="form3Example3c" class="form-control" value="VI">Telangana</option>
													<option id="form3Example3c" class="form-control" value="VI">Tamilnadu</option>
													<option id="form3Example3c" class="form-control" value="VI">Kerala</option>
													<option id="form3Example3c" class="form-control" value="VI">Madhya
														Pradesh</option>
												</select>

											</div>
										</div>
										<div class="d-flex justify-content-center mx-4 mb-3 mb-lg-4">
											<a class="btn btn-primary btn-lg" href="RechargeDone.jsp">Rechareg</a>
										</div>
									</form>

								</div>
								<div
									class="col-md-10 col-lg-6 col-xl-7 d-flex align-items-center order-1 order-lg-2">

									<img src="login assests/images/pic.png" class="img-fluid"
										alt="Sample image">

								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
</body>
</html>