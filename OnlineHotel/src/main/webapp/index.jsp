<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html:html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="styles.css" rel="stylesheet" type="text/css" />
<title>Search Hotels Page</title>
</head>
<body>
	<!--  %@ include file="header.jsp"%!-->
	<h1 align="center">
		<font color="blue">Search Hotels</font>
	</h1>

	<div id="content">
		<div id="content-box">
			<html:form action="/SearchHotels">
				<table height="230" align="center" cellspacing="10" cellpadding="8">

					<tr>
						<td>Hotel Name :</td>
						<td><html:text name="SearchHotelsForm" property="hotelName" /></td>
					
						<td>Location :</td>
						<td><html:text name="SearchHotelsForm" property="location" /></td>
					</tr>
					
					<tr>
						<td>Check In Date : </td>
						<td></td>
					</tr>
					</table>
					</html:form>
		</div>
	</div>
</body>
</html:html>