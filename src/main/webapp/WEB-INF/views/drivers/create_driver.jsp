<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
  <style>
    form {
      text-align: center;
      margin-top: 50px
    }
  </style>
  <title>Register a new driver</title>
</head>
<body>
<h3><a href="${pageContext.request.contextPath}/index">Back to main menu</a></h3>
<form name="createDriverForm" method="post" action="${pageContext.request.contextPath}/drivers/create">
  Driver's name : <input type="text" name="name"/> <br/>
  License number: <input type="text" name="license"/> <br/>
  <input type="submit" value="Create Driver"/>
</form>
</body>
</html>
