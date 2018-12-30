<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Welcome</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body>
	<table>
		<tr>
			<td>Address:</td>
			<td>${student.address}</td>
		</tr>
		<tr>
			<td>Mobile:</td>
			<td>${student.studentMobile}</td>
		</tr>
		<tr>
			<td>DOB:</td>
			<td>${student.studentDOB}</td>
		</tr>
		<tr>
			<td>Skills:</td>
			<td>${student.studentSkills}</td>
		</tr>
		<tr>
			<td>Country:</td>
			<td>${student.studentAddress.country}</td>
		</tr>
		<tr>
			<td>City:</td>
			<td>${student.studentAddress.city}</td>
		</tr>
		<tr>
			<td>Street</td>
			<td>${student.studentAddress.street}</td>
		</tr>
		<tr>
			<td>Pincode:</td>
			<td>${student.studentAddress.pincode}</td>
		</tr>
	</table>
</body>
</html>