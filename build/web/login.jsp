<%@page import="java.lang.String"%>
<%@page import="java.sql.ResultSet"%>
<%@include file="header.jsp" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="res/w3.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body> 
        <h3 align:left>Login Page-</h3><br>
        <form action="Auth" method="post" align="center">
            <fieldset>
                <legend>Details: </legend>
                <br><br>
                User Id: <input type="text" name="id"><br><br>
                Password:<input type="password" name="pass"><br><br>
                <input type="checkbox" checked> Remember me<br><br>
                <input type="submit" value="Log in" class="w3-border-gray">
                <button class="w3-border-grey"><a href="sign.jsp">Sign in</a></button>
            </fieldset>
        </form>
    </body>
</html>
<%@include file="footer.jsp" %>