<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html ; charset=UTF-8">
	<title>Welcome</title>
</head>
<body>
    Welcome  <%= request.getAttribute("name") %>.
    <br>
    your password is <%= request.getAttribute("password") %>
</body>
</html>