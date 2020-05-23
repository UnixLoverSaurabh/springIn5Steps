<html>
<head>
<title>Yahoo!!</title>
</head>
<body>
    <p>
        <font color="red">
             Welcome <%= request.getParameter("message") %>
             <br>
             Welcome ${param.message}
             <br>
             Welcome ${message}
            <br>
        </font>
    </p>

    <form action="/login" method="POST">
        Name : <input name="name" type="text" />
        Password : <input name="password" type="password" />
        <input type="submit" />
    </form>
</body>
</html>