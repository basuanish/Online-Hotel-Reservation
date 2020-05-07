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
  
  <script language="JavaScript" type="text/javascript" id="jscal1x">
  var cal1x = new CalendarPopup("testdiv1");
  cal1x.showNavigationDropdowns( );
  cal1x.setYearSelectStartOffset(60);
  </script> 
<title>Search Hotels Page</title>
 <script language="JavaScript" src="scripts/CalendarPopup.js"></script> 
 <!-- This prints out the default stylehseets used by the    
 DIV style calendar. Only needed if you are using the DIV style popup --> 
 <script language="JavaScript">document.write(getCalendarStyles( )); </script> 
</head>
<body>
	<!--  %@ include file="header.jsp"%!-->
	<h1 align="center">
		<font color="blue">Search Hotels</font>
	</h1>

	<div id="content">
		<div id="content-box">
			<html:form action="searchHotels" method="post">
				<table height="230" align="center" cellspacing="10" cellpadding="8">

					<tr>
						<td>Hotel Name :</td>
						<td><html:text name="SearchHotelsForm" property="hotelName" /></td>
					
						<td>Location :</td>
						<td><html:text name="SearchHotelsForm" property="location" /></td>
					</tr>
					
					<tr>
						<td>Check In Date : </td>
						<td> <html:text size="8" property="checkInDate"/>
						   <a href="" onClick="cal1x.select(document.forms[0].checkInDate,
							'anchor1x','MM/dd/yyyy'); return false;" 
							TITLE="cal1x.select(document.forms[0].checkInDate,'anchor1x','MM/dd/yyyy');
							 return false;" 
							  NAME="anchor1x" ID="anchor1x">select</a>
							  <br />
							   <c:if test="${not empty checkInDate}">
							    Check In Date: <b><fmt:formatDate dateStyle="full"   
							     value="${checkInDate}"/></b>. </c:if>
							  </td>
						<td>Check Out Date : </td>
						<td> <html:text size="8" property="checkOutDate"/>
						   <a href="" onClick="cal1x.select(document.forms[0].checkOutDate,
							'anchor1x','MM/dd/yyyy'); return false;" 
							TITLE="cal1x.select(document.forms[0].checkOutDate,'anchor1x','MM/dd/yyyy');
							 return false;" 
							  NAME="anchor1x" ID="anchor1x">select</a></td>
					</tr>
					<tr>
					<td colspan="2"><html:submit value="Search" /></td>
					</tr>
					</table>
					</html:form>
					 <DIV ID="testdiv1" STYLE="position:absolute;visibility:hidden; 
					  background-color:white;layer-background-color:white;"></DIV> 
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