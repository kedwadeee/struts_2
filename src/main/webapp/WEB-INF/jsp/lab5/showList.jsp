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
<s:form action="testTaglibAction_submit">
<s:select name="selectedUserId" list="users" listKey="userId"
listValue="username" headerKey="0" headerValue="--Please Select--
"></s:select>
<s:submit />
<br /><br />
<table>
<s:iterator value="users" status="rowStatus">
<tr <s:if test='role == "Dev"'> bgcolor="yellow" </s:if><s:elseif
test='role == "SA"'> bgcolor="red" </s:elseif> >
<td><s:property value="#rowStatus.count" /></td>
<td>username : <s:property value="username" /></td>
<td>role : <s:property value="role" /></td>
</tr>
</s:iterator>
</table>
</s:form>


</body>
</html>