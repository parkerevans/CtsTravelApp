<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html>
<head>
<title>Test</title>
</head>

<body>
<form method="post" action="addContact.do">
 
    <table>
    <tr>
        <td><label path="firstname"><spring:message code="label.firstname" /></label></td>
        <td><input path="firstname" /></td>
    </tr>
    <tr>
        <td><label path="lastname"><spring:message code="label.lastname" /></label></td>
        <td><input path="lastname" /></td>
    </tr>
    <tr>
        <td><label path="lastname"><spring:message code="label.email" /></label></td>
        <td><input path="email" /></td>
    </tr>
    <tr>
        <td><label path="lastname"><spring:message code="label.telephone" /></label></td>
        <td><input path="telephone" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="<spring:message code="label.addcontact" />"/>
        </td>
    </tr>
</table>  
 
</form>

</body>

</html>