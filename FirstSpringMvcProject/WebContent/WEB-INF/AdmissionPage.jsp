<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Welcome</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body>
	<form action="/FirstSpringMvcProject/form/addmissionsubmit" method="post">
		<p> Name: <input type="text" name="name"/>  </p>
	    <p> Address: <input type="text" name="address"/>  </p>	
	    
	    <input type="submit" value="submit"/>
	</form>
</body>
</html>