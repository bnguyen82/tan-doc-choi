<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="html" uri="/WEB-INF/tld/struts-html.tld" %>
<%@ taglib prefix="bean" uri="/WEB-INF/tld/struts-bean.tld" %>
<%
	String root = request.getContextPath();	
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="org.springframework.web.context.WebApplicationContext"%>
<%@page import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<script language="javascript" src="<%=root %>/common/navigation.jsp" type="text/javascript"></script>
<script language="javascript" type="text/javascript">
	function setMethodSubmit1(method){
	var action = document.getElementsByTagName('form')[0].getAttribute("action");
	document.forms[0].action = action + "?method=" + method;
	document.forms[0].submit();	
}
</script>
</head>
<body>
<bean:define id="localForm" name="lForm"></bean:define>
<html:form action="login">
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
			<td colspan="2" align="center">
				<html:submit value="enter" onclick="setMethodSubmit('excuteLogin')" >Login</html:submit>
			</td>
		</tr>
	</table>
</html:form>
</body>
</html>