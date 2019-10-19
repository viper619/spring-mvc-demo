<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="student/processform" modelAttribute="student">
		First name : <form:input path="firstname" />
		</br></br>
		Last name : <form:input path="lastname" />
		</br></br>
		Country : <form:select path="country">
								<form:option value="India"  label="india"/>
								<form:option value="USA"  label="USA"/>
								<form:option value="Russia"  label="Russia"/>
								<form:option value="Australia"  label="Australia"/>
								<form:option value="UK"  label="UK"/>
						   </form:select>
		</br></br>
		Favorite Language: 
		Java<form:radiobutton path="favLang" value="Java" /> &nbsp&nbsp
		C#<form:radiobutton path="favLang" value="C#" /> &nbsp&nbsp
		PHP<form:radiobutton path="favLang" value="PHP" /> &nbsp&nbsp
		Python<form:radiobutton path="favLang" value="Python" /> &nbsp&nbsp
		Ruby<form:radiobutton path="favLang" value="Ruby" /> &nbsp&nbsp
		
		</br></br>
		Operating Systems : 
		Windows<form:checkbox path="opSys" value="Windows" />
		Linux<form:checkbox path="opSys" value="Linux" />
		Mac<form:checkbox path="opSys" value="Mac" />
		
		<input type="submit" value="Submit">
	</form:form>
</body>
</html>