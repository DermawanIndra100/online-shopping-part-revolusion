<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
<!-- buat nyari contextRoot atau file awal yaitu /onlineshopping ditambah asal dr PageController + dispatcher-servlet -->

<!-- lari ke dispatcher-servlet mvc:annotation-driven  -->
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />


<!-- 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Online Shopping</title>
</head>
<body>
	${contextRoot} says - ${greeting} ini dapet dari c:set var=contextRoot
	
</body>
</html>
 -->


<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>HMI YAI - ${title}</title>
<!-- diambil dari PageController method index() -->

<script>
	window.menu = '${title}';
	//diambil dari PageController method index() buat menu jadi nyala
</script>



<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${css}/myapp.css" rel="stylesheet">

<!-- Bootstrap core CSS -->
<link href="${css}/warna.css" rel="stylesheet">

</head>

<body>

	<!-- <div class="wrapper">  --> <!-- kalo ini aktiv maps hamsyong -->

		<!-- Navigation -->
		<%@include file="./shared/navbar.jsp"%>


		<!-- Page Content -->
		<!-- <div class="content"> --> <!-- kalo ini aktiv maps hamsyong -->
			<c:if test="${userClickHome == true }">
				<!-- diambil dari PageController method index() -->
				<%@include file="home.jsp"%>
			</c:if>

			<!-- Load only when user click about -->
			<c:if test="${userClickAbout == true}">
				<%@include file="about.jsp"%>
			</c:if>

			<!-- Load only when user click contact -->
			<c:if test="${userClickContact == true}">
				<%@include file="contact.jsp"%>
			</c:if>
			
			<c:if
				test="${userClickAllProducts == true or userClickCategoryProducts == true}">
				<%@include file="listProducts.jsp"%>
			</c:if>
			
		<!-- </div> --> <!-- kalo ini aktiv maps hamsyong -->
		
	<!-- </div> --> <!-- kalo ini aktiv maps hamsyong -->

	<!-- Footer -->
	<%@include file="./shared/footer.jsp"%>

	<!-- Bootstrap core JavaScript -->
	<script src="${js}/jquery.js"></script>
	<script src="${js}/bootstrap.bundle.min.js"></script>

	<!-- diambil dari PageController method index() buat menu jadi nyala -->
	<script src="${js}/myapp.js"></script>

</body>

</html>
