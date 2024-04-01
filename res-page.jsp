<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration SuccessFul</title>
</head>
<body>
<h1>REGISTRATION SUCCESSFUL!!</h1>
<hr>
<h2>The details are:</h2>
Your name is : ${RegPage.name}<br/>
Your password is: ${RegPage.password}<br/>
Your Country is: ${RegPage.countryname}<br/>
Your email is: ${RegPage.comdto.email}<br/>
Your phone number is :${RegPage.comdto.phone}<br/>
Your age is: ${RegPage.age}
</body>
</html>