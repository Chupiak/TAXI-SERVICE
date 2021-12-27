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
  <title>All drivers</title>
</head>

<body>
<h3><a href="${pageContext.request.contextPath}/index">Back to main menu</a></h3>
<form name="addDriverForm" method="post" action="${pageContext.request.contextPath}/cars/drivers/add">
  Driver_ID: <input type="text" name="driver_id"/> <br/>
  Car_ID: <input type="text" name="car_id"/> <br/>
  <input type="submit" value="Add Driver"/>

</form>

<table cellspacing="0" cellpadding="5" border="4" align="left">
  <caption>All drivers</caption>
  <tr>
    <th>ID</th>
    <th>NAME</th>
    <th>LICENSE NUMBER</th>
  </tr>
  <c:forEach items="${drivers}" var="driver">
    <tr>
      <th><c:out value="${driver.id}"/></th>
      <th><c:out value="${driver.name}"/></th>
      <th><c:out value="${driver.licenseNumber}"/></th>
    </tr>
  </c:forEach>
</table>


<table cellspacing="0" cellpadding="5" border="4" align="right">
  <caption>All cars</caption>
  <tr>
    <th>ID</th>
    <th>MODEL</th>
  </tr>
  <c:forEach items="${cars}" var="car">
    <tr>
      <th><c:out value="${car.id}"/></th>
      <th><c:out value="${car.model}"/></th>
    </tr>
  </c:forEach>
</table>
</body>
</html>
