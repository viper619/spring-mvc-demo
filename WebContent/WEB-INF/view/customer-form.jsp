<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE HTML>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<html>
<head>
	<title>Customer registration form</title>
	<style>
		.error {color:red}
	</style>
</head>
<body>
	Fill out the form. Fields marked with * are required. <br><br>

	<form:form action="processForm" modelAttribute="customer">
	
		First name : <form:input path="firstName" /> <br><br>
		
		Last name(*): <form:input path="lastName" />
		<form:errors path="lastName" cssClass="error" /> <br><br>
		
		No. of passes: <form:input path="freePasses" />
		<form:errors path="freePasses" cssClass="error" /> <br><br>
		
		Postal Code: <form:input path="postalCode" />
		<form:errors path="postalCode" cssClass="error" /> <br><br>
		
		Course Code: <form:input path="courseCode" />
		<form:errors path="courseCode" cssClass="error" /> <br><br>
		
		<button type="submit" class="btn btn-primary">Submit</button>
		
	</form:form>
</body>
</html>