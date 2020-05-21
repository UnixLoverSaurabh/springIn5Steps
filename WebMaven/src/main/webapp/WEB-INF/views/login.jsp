<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html ; charset=UTF-8">
	<title> got the jsp view</title>
</head>
<body>
       <h1>Hello JSP! ${16/4} expression is also working ${name} </h1>
        <%
            System.out.println("You can write java code here in jsp");
            System.out.println(request.getParameter("name"));

            Date date = new Date();
        %>

        <div>
            Current date is <%= date %>
        </div>


        <form action="/login.do" method="post">
            <span>Enter your name</span>
            <input type="text" name="name"> </input>
            <input type="password" name="password"> </input>
            <input type="submit" value="submit"> </input>
        </form>
</body>
</html>