<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="forms"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<spring:url value="/users/save" var="formUrl" ></spring:url>
<forms:form method="POST" action="${formUrl}" modelAttribute="user">
	<label>First Name</label>
	<forms:input path="fname" id="fname"/> <br/>
	<label>Last Name</label>
	<forms:input path="lname" id="fname"/> <br/>
	<input type="submit" value="Add User">
</forms:form>

	<table>
		<thead>
			<tr>
				<th>User Id</th>
				<th>First Name</th>
				<th>Last Name</th>
			</tr>
		</thead>
		<tbody>
			<jstl:forEach items="${users}" var="user">
				<tr>
					<td>${user.id}</td>
					<td>${user.fname}</td>
					<td>${user.lname}</td>
				</tr>
			</jstl:forEach>
		</tbody>
	</table>
</body>
</html>