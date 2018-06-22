<%@include file="header.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="res/w3.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign in</title>
    </head>
    <body>
        
        <h2 style="text-align: left;">Come be a part of our community: </h2>
        <form action="signServ" style="margin-left: 30%;" method="post">
            <fieldset style="text-align: center;height: 100%; width: 300px;padding: 30px">
                <legend>Enter your details: </legend>
                Name: <input type="text" name="name"><br>
                Email: <input type="email" name="email"><br>
                Password: <input type="password" name="pass"><br>
                <input type="submit" value="Sign In">
            </fieldset>
        </form>
    </body>
</html>
<%@include file="footer.jsp" %>