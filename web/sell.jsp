<%@include file="header_secured.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sell Books</title>
    </head>
    <body>
        <div style="height: 600px;width: 100%;padding: 2%;font-family: open-sans;font-size: 18px">
            <h2>Sell your old books and make money for new ones!</h2>
            <div style="float: left;height: 80%;width: 40%;padding: 4px;text-align: left;">
                <p>We understand how our Bookshelves keep getting heavier and our pockets lighter.</p>
                <p>Here's an idea. Why don't you sell some books from your collection, in exchange of cash.</p>
                <p>These books will be added to our library for all our members to borrow.</p>
                <p>How it works: </p>
                <ul>
                    <li>First, you give us your details and the book title along with its author.</li>
                    <li>Then, we will get the book picked from your doorstep.</li>
                    <li>Now, according to how old the book is we will pay you the money.</li>
                    <li>Be Assured. You will definetly get paid atleast 55% of the printed price on the book.</li>
                    <li>Now use this money to buy/borrow more books from us.</li>
                </ul>
                
                <p>Happy reading!</p>
            </div>
            
            <div style="float: right;height: 80%;width: 40%;padding: 4px;align-content: left;">       
                <form action="sellServ" method="post" align='right' style="padding: 20px; ">
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