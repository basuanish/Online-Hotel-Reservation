<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration Successful</title>
</head>
<body>
	<h1 align="center">Registration Successful. Your Details:</h1>
	<table align="center" cellspacing="20">
	

		
		<tr>
		<td><h3>First Name:</h3></td>
			<td><%=session.getAttribute("firstName")%></td>
		</tr>
		<tr>
		<td><h3>Last Name:</h3></td>
			<td><%=session.getAttribute("lastName")%></td>
		</tr>
	</table>
</body>
</html>
