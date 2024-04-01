<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
<hr>
<style type="text/css">
.error{
	color: red;
	position: fixed;
	text-align: left;
	margin-left: 30px;
}
</style>
</head>
<body>
	<div align="center">
		<h1>Registration Page</h1>
		<form:form action="processing" modelAttribute="RegPage" method="post">
			<label for="nam">Name:</label>
			<form:input path="name" id="nam" />
			<form:errors path="name" cssClass="error"/>
			<br/>
			<label for="pas">Password:</label>
			<form:password path="password" id="pas"/>
			<br/>
			<label>Country:</label>
			<form:select path="countryname">
				<form:option value="ind" label="india"></form:option>
				<form:option value="chin" label="china"></form:option>
				<form:option value="pak" label="Pakistan"></form:option>
			</form:select>
			<br/>
			
			<label>Age:</label>
			<form:input path="age"/>
			<form:errors path="age.*" cssClass="error"/>
			<br/>
			<h2>Communication:</h2>
			<label for="em">Email:</label>
			<form:input path="comdto.email" id="em"/>
			<label>PhoneNumber: </label>
			<form:input path="comdto.phone"/><br/>
			<input type="submit" value="Register!">
		</form:form>
	</div>
</body>
</html>