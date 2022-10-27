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
<s:form action="testScopeAction_end">
        <table>
                <s:iterator value="users" status="rowStatus">
                    <tr bgcolor="yellow" >
                    <td><s:property value="#rowStatus.count" /></td>
                <td>username : <s:property value="username" /></td>
                <td>role : <s:property value="role" /></td>
                </tr>
                </s:iterator>
                </table>
                    <br>
                <s:submit />
           </s:form>
</body>
</html>