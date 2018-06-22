

<%@page import="org.hibernate.Session"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="res/w3.css">
        <style>
            .menu {
                list-style-type: none;
                margin: 0;
                padding: 0;
                overflow: hidden;
                background-color: lightgray;
                
                font-weight: bold;
                font-size: 18px;
            }

                

            li a {
                font-family: cursive;
                display: block;
                color: #4d4d4d;
                text-align: center;
                padding: 20px;
                text-decoration: none;
            }

            li a:hover {
                background-color: #111111;
            }

            
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>The Open Library</title>
    </head>
    <body>
        
        <div>
            <ul class="menu">
                <% if(session.getAttribute("mid")!=null) {%>
                <li style="float: right;"><a href="Logout">Logout</a></li>
                <li style="float: right;"><a href="checkout.jsp">Checkout</a></li><%} else{ %>
                <li style="float: right;"><a href="https://www.goodreads.com/">Goodreads</a></li><%}%>
                <li style="float: right;"><a href="browse.jsp">Browse</a></li>
                <li style="float: right;"><a href="home.jsp">Home</a></li>
               
                <li style="float: left;"><a href="buy.jsp">Buy</a></li>
                <li style="float: left;"><a href="sell.jsp">Sell</a></li>
                <li style="float: left;"><a href="borrow.jsp">Borrow</a></li>
                <li style="float: left;"><a href="donate.jsp">Donate</a></li>
                
            </ul>
        </div>
    </body>
</html>
