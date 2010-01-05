<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="html" uri="/WEB-INF/tld/struts-html.tld" %>
<%@ taglib prefix="bean" uri="/WEB-INF/tld/struts-bean.tld" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<script language="javascript" src="/commons/navigation.jsp" type="text/javascript"></script>
</head>
<body>
<bean:define id="localForm" name="lForm"></bean:define>
<html:form action="/login">
	<table>
		<tr>
			<td>Username</td>
			<td><html:text name="localForm" property="username" ></html:text></td>
		</tr>
		<tr>
			<td>Password</td>
			<td><html:text name="localForm" property="password" ></html:text></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><html:button property="enter" onclick="/tan-doc-choi/login.do?method=excuteLogin" >Login</html:button></td>
		</tr>
	</table>
</html:form>
</br>
</body>
</html>