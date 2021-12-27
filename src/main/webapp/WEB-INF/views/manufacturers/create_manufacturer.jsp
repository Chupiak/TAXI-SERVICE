<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
  <style>

    form {
      text-align: center;
      margin-top: 100px
    }

  </style>
  <title>Register a new driver</title>
</head>
<body>
<h3><a href="${pageContext.request.contextPath}/index">Back to main menu</a></h3>
<form name="createManufacturerForm" method="post" action="${pageContext.request.contextPath}/manufacturers/create">
  Manufacturer's name: <input type="text" name="name"/> <br/>
  Country of manufacturer: <input type="text" name="country"/> <br/>
  <input type="submit" value="Create Manufacturer"/>

</form>
</body>
</html>