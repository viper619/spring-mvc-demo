<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
		First name : ${student.firstname }
		</br></br>
		Last name : ${student.lastname }
		</br></br>
		Country : ${student.country }
		</br></br>
		Favorite Language : ${student.favLang}
		</br></br>
		Operating System: 
		<ul>
			<c:forEach var="temp" items="${student.opSys}">	
				<li>${temp}</li>
			</c:forEach>
		</ul>
</body>
</html>