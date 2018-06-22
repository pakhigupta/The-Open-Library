<%@include file="header_secured.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sell Books</title>
    </head>
    <body>
        <div style="height: 600px;width: 100%;padding: 2%;font-family: open-sans;font-size: 18px;">
            <h2>Donate your old books and help our reading community grow!</h2>
            <div style="float: left;height: 80%;width: 40%;padding: 4px;">
                <p>Being Readers ourselves we understand the selfless hearts of our readers.</p>
                <p>If you have books to spare, then get in touch with us.</p>
                <p>We'll add these books to our library, which is accessible to our community.</p>
                <p>How it works: </p>
                <ul>
                    <li>First, you give us your details and the book title along with its author.</li>
                    <li>Then, we will get the book picked from your doorstep.</li>
                    <li>As a perk, we offer you a months free borrow subscription, for every three books you donate.</li>
                </ul>
                
                <p>Happy reading!</p>
            </div>
            
            <div style="float: right;height: 80%;width: 40%;padding: 4px;align-content: left;">       
                <form action="donateServ" method="post" align='right' style="padding: 20px; ">
                    <fieldset>
                        <legend>Your Details:</legend>
                        Full Name      :<input type="text" name="name" ><br><br>
                        Address        :<input type="text "name="address" ><br><br>
                        Contact Number :<input type="number" name="contact" ><br><br>
                    </fieldset>
                    <br><br>
                    <fieldset>
                        <legend>Book Details: </legend>
                        Title: <input type="text" name="title"><br><br>
                        Author: <input type="text" name="author"><br><br>
                    </fieldset>    <br><br>
                    <input type="submit" value="Submit Details">
                    <input type="reset" value="Reset">
                </form>
            </div> 
        </div>
        <br><br><br><br><br><br>
    </body>
</html>
<%@include file="footer.jsp" %>