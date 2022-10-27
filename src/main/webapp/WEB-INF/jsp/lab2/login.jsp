<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<s:form action="login_login">
	<h2><s:text name="label.loginTitle"></s:text></h2>
	<s:text name="label.username" /> : <s:textfield name="user.username" /><br>
	<s:text name="label.password" /> : <s:textfield name="user.password" /><br>
	<s:submit />
</s:form>


</body>
</html>