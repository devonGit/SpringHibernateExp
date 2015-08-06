<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/WEB-INF/jsps/taglibDeclare.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Corum User Data System</h1>
<form:form action="/corumUser" method="post" commandName="corumuser">

<table>
<tr>
<td><form:label path="id">ID</form:label></td><td><form:input path="id"/> </td></tr>
<tr><td><form:label path="corunuserName">user Name</form:label></td><td><form:input path="corunuserName"/> </td></tr>
<tr><td><form:label path="usercity">User City</form:label></td><td><form:input path="usercity"/> </td></tr>
<tr><td><form:label path="cntryCode">Country Code</form:label></td><td><form:input path="cntryCode"/> </td></tr>
<tr>
<td colspan="2">
<input type="submit" name="action" value="Add" />
<input type="submit" name="action" value="Edit" />
<input type="submit" name="action" value="Delete" />
<input type="submit" name="action" value="Search" />
</td></tr>
</table>


</form:form>

<table border="2">
<tr><th>Id</th><th>User Name</th><th>User City</th><th>User country</th></tr>

<c:forEach var="lst" items="${corumuserList}">
<tr>
<td>${lst.id }</td>
<td>${lst.corunuserName}</td>
<td>${lst.usercity}</td>
<td>${lst.cntryCode}</td>
</tr>

</c:forEach>
</table>





</body>
</html>