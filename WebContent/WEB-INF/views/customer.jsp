<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>Customer Manager</title>
</head>

<body>
<h2>Customer Manager</h2>
<form:form method="post" action="addCustomer.do" commandName="customer">
 
    <table>
    <tr>
        <td><form:label path="firstname"><spring:message code="label.firstname" /></form:label></td>
        <td><form:input path="firstname" /></td>
    </tr>
    <tr>
        <td><form:label path="lastname"><spring:message code="label.lastname" /></form:label></td>
        <td><form:input path="lastname" /></td>
    </tr>
    <tr>
        <td><form:label path="address1"><spring:message code="label.address1" /></form:label></td>
        <td><form:input path="address1" /></td>
    </tr>
    <tr>
        <td><form:label path="address2"><spring:message code="label.address2" /></form:label></td>
        <td><form:input path="address2" /></td>
    </tr>
    <tr>
        <td><form:label path="city"><spring:message code="label.city" /></form:label></td>
        <td><form:input path="city" /></td>
    </tr>
    <tr>
        <td><form:label path="state"><spring:message code="label.state" /></form:label></td>
        <td><form:input path="state" /></td>
    </tr>
    <tr>
        <td><form:label path="zip"><spring:message code="label.zip" /></form:label></td>
        <td><form:input path="zip" /></td>
    </tr>                    
    <tr>
        <td><form:label path="email"><spring:message code="label.email" /></form:label></td>
        <td><form:input path="email" /></td>
    </tr>
    <tr>
        <td><form:label path="telephone"><spring:message code="label.telephone" /></form:label></td>
        <td><form:input path="telephone" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="<spring:message code="label.addcustomer" />"/>
        </td>
    </tr>
</table>  
 
</form:form>

<h3>Customers</h3>
<c:if test="${!empty customerList}">
<table class="data">
	<tr>
		<th>Name</th>
		<th>Email</th>
		<th>Telephone</th>
		<th>&nbsp;</th>
	</tr>
	<c:forEach items="${customertList}" var="customer">
		<tr>
			<td>${customer.lastname}, ${customer.firstname} </td>
			<td>${customer.email }</td>
			<td>${customer.telephone }</td>
			<td><a href="delete/${customer.id}">delete</a></td>
		</tr>	
	</c:forEach>
	
</table>
</c:if>

</body>

</html>