<!DOCTYPE html PUBLIC 
	"-//W3C//DTD XHTML 1.1 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
	
<%@taglib prefix="s" uri="/struts-tags" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
	<title>Index</title>
	<s:head />
</head>
<body>
	<s:form action="helloWorld">
		<s:textfield label="What is your name?" name="name" />
		<s:textfield label="What is the date?" name="dateNow" />
		<s:submit />
	</s:form>
<a href="<s:url value="/WEB-INF/jsp/lab6/testScopeAction_start" />">Test Scope</a><br>
<a href="<s:url value="/WEB-INF/jsp/lab7/testToken_init" />">Test Token</a><br>
</body>

</html>
	