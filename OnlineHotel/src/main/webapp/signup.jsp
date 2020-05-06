
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login page</title>
</head>
<body bgcolor="silver">
<br></br>
<body>
<html:html>
    <div style="color:red">
    <html:errors />
    </div>
    <html:form action="/register" method="get">
 
        Enter your First Name:
        <html:text property="firstName" size="50" /><br><br>
        Enter your Last Name:
        <html:text property="lastName" size="50" /><br><br>
        Enter your username:
        <html:text property="userName" size="50" /><br><br>
        Enter your password:
        <html:text property="password" size="30" /><br><br>
        Enter your Email:
        <html:text property="email" size="30" /><br><br>
        Enter your Phone No:
        <html:text property="phone" size="15" /><br><br>
        <html:submit>Submit</html:submit>
        <br><br>
    </html:form>
</html:html>
</body>
</html>