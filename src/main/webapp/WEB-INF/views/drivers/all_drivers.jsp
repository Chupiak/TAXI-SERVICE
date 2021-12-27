<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
  <style>
    table {
      text-align: center;
    }

  </style>
  <title>All drivers</title>
</head>

<body>

<table cellspacing="0" cellpadding="5" border="4" align="center">
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
  <h4><a href="${pageContext.request.contextPath}/index">Back to main menu</a></h4>
</table>

</body>
</html>
