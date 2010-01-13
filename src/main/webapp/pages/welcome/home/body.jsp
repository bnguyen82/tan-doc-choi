<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="html" uri="/WEB-INF/tld/struts-html.tld" %>
<%
	String root = request.getContextPath();	
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script language="javascript" src="<%=root %>/common/navigation.jsp" type="text/javascript"></script>
</head>
<body>
<html:form action="/public/welcome/home">
Chao mung den trang web
</br>
Neu la member login  
<html:submit value="login" onclick="setMethodSubmit('login')">tai day</html:submit>
</html:form>
</body>
</html>