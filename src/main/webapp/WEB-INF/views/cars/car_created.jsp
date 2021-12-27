<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
    <style>
        h1 {
            text-align: center;
            margin-top: 200px
        }
        h2 {
            text-align: center;
        }
    </style>
    <title>Car was created</title>
</head>
<body>
<h1>Car ${car} was created!</h1>
<h2><a href="${pageContext.request.contextPath}/cars">Back to car menu</a></h2>
</body>
</html>
