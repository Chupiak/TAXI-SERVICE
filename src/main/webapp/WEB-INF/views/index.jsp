<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
    <style>
        h1 {
            text-align: center;
            margin-top: 100px
        }
        h2 {
            text-align: center;
        }
    </style>
    <title>Main Page</title>
</head>
<body>
<h1>TAXI</h1>
<h2><a href="${pageContext.request.contextPath}/drivers/create">Register new driver</a></h2>
<h2><a href="${pageContext.request.contextPath}/drivers">Show all drivers</a></h2>
<h2><a href="${pageContext.request.contextPath}/manufacturers/create">Register new manufacturer</a></h2>
<h2><a href="${pageContext.request.contextPath}/cars/create">Register new Car</a></h2>
<h2><a href="${pageContext.request.contextPath}/cars/drivers/add">Adding driver to car</a></h2>
</body>
</html>

