<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Welcome</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body>
	<form:errors path="student.*" />
	<p>${headermesage}</p>
	<form action="/FirstSpringMvcProject/student/studentsubmit"
		method="post">
		<table>
			<tr>
				<td>Name:</td>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td>Address:</td>
				<td><input type="text" name="address" /></td>
			</tr>
			<tr>
				<td>Mobile:</td>
				<td><input type="text" name="studentMobile" /></td>
			</tr>
			<tr>
				<td>Dob:</td>
				<td><input type="text" name="studentDOB" /></td>
			</tr>
			<tr>
				<td>Skills :</td>
				<td><select name="studentSkills" multiple="multiple">
						<option value="java">java</option>
						<option value="javascript">javascript</option>
						<option value="react">react</option>
				</select></td>
			</tr>
			<tr>
				<td>Address</td>
				<td>Country: <input type="text" name="studentAddress.country" /></td>
				<td>City: <input type="text" name="studentAddress.city" /></td>
				<td>Street: <input type="text" name="studentAddress.street" /></td>
				<td>Pincode: <input type="text" name="studentAddress.pincode" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="submit" /></td>
			</tr>
		</table>
	</form>
</body>
</html>