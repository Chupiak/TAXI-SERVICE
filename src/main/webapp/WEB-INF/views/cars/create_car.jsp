<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
  <style>
    form {
      text-align: center;
      margin-top: 50px;
    }
  </style>

  <title>Create a new car</title>

</head>
<body>
<h3><a href="${pageContext.request.contextPath}/index">Back to main menu</a></h3>

<form name="createCarForm" method="post" action="${pageContext.request.contextPath}/cars/create">
  Model: <input type="text" name="model"/> <br/>
  Manufacturer ID: <input type="number" name="manufacturer_id"/> <br/>
  <input type="submit" value="Create Car"/>
</form>

<table cellspacing="0" cellpadding="5" border="4" align="center">
  <caption>All manufacturers</caption>
  <tr>
    <th>ID</th>
    <th>NAME</th>
    <th>COUNTRY</th>

  </tr>
  <c:forEach items="${manufacturers}" var="allManufacturers">
    <tr>
      <th><c:out value="${allManufacturers.id}"/></th>
      <th><c:out value="${allManufacturers.name}"/></th>
      <th><c:out value="${allManufacturers.country}"/></th>
    </tr>
  </c:forEach>

</table>

</body>
</html>
