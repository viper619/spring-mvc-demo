<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<html>
<head>
	<title>Customer Confirmation Page</title>
	<style>
		.error {color:red}
	</style>
</head>
<body>
	The customer is confirmed with <br>
	First name : ${customer.firstName } <br>
	Last name : ${customer.lastName } <br>
	No. passes : ${customer.freePasses } <br>
	Postal code : ${customer.postalCode } <br>
	Course code : ${customer.courseCode } <br>
</body>
</html>