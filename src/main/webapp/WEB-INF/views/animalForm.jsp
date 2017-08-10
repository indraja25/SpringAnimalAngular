<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New/Edit Animal</title>
</head>
<body>
	<div align="center">
		<h1>New/Edit Animal</h1>
		<form:form action="saveAnimal" method="post" modelAttribute="animal">
		<table>
			<form:hidden path="id"/>
			<tr>
				<td>Type 1 for Eagle or 2 for Lion</td></br>
				<td>Type:</td>
				<td><!-- <form:input path="type" /> -->
				<form:select path="type">
    <option value="1">Eagle</option>
   <option value="2">Lion</option>
</form:select>
				
				</td>
			</tr>
			<tr>
				<td>Health:</td>
				<td><form:input path="health" /></td>
			</tr>
			<<tr>
				<td colspan="2" align="center"><input type="submit" value="Save"></td>
			</tr>
		</table>
		</form:form>
	</div>
</body>
</html>