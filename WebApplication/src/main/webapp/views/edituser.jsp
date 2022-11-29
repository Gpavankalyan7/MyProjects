<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<body>
	<h1>Edit User Data</h1>
	<form:form method="POST" action="/editu">
	<table>
	<tr>
		<td></td>
		<td><form:hidden path="id"/></td>
		
	</tr>
	<tr>
		<td>Email:</td>
		<td><form:input path="email"/></td>
	</tr>
	
	<tr>
		<td>Name:</td>
		<td><form:input path="name"/></td>
	</tr>
	
	<tr>
		<td>password:</td>
		<td><form:input path="passward"/></td>
	</tr>
	
	<tr>
		<td></td>
		<td><input type="submit" value="Edit save" /></td>
	</tr>
	
	</table>
	</form:form>
	<a href="/viewuser">view All user details</a><p></p>
	<a href="/">add new user here</a>
</body>