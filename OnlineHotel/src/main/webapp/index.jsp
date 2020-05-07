<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html:html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="styles.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  
 
<title>Search Hotels Page</title> 
 <script>
  $( function() {
    $( "#datepicker1" ).datepicker();
  } );
  $( function() {
	    $( "#datepicker2" ).datepicker();
	  } );
  </script>
</head>
<body>
	<!--  %@ include file="header.jsp"%!-->
	<h1 align="center">
		<font color="blue">Search Hotels</font>
	</h1>

	<div id="content">
		<div id="content-box">
			<html:form action="/searchHotels">
				<table height="230" align="center" cellspacing="10" cellpadding="8">

					<tr>
						<td>Hotel Name :</td>
						<td><html:text property="hotelName" /></td>
					
						<td>Location :</td>
						<td><html:text property="location" /></td>
					</tr>
					
					<tr>
						
						<td>Check In Date : </td>
						<td> <html:text size="8" property="checkInDate" styleId="datepicker1"/>
						   </td>
						<td>Check Out Date : </td>
						<td> <html:text size="8" property="checkOutDate" styleId="datepicker2"/>
						  </td>
					</tr>
					<tr>
					<td colspan="2"><html:submit value="Search" /></td>
					</tr>
					</table>
					</html:form>
					 
		</div>
	</div>
	
	<div style="color: red" align="center">
		<html:errors />
	</div>
	<%
		if (request.getAttribute("errorMsg") != null) {
				out.print("<div align=\"center\">");
				out.print("<font color='red'><font size='4'>" + request.getAttribute("errorMsg"));
				out.print("</div>");
			}
	%>
</body>
</html:html>