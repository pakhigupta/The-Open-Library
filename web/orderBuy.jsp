<%@include file="header_secured.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Confirm Order</title>
    </head>
    <body align="center">
        <%
            int total=(Integer)session.getAttribute("total");
            total+=50;
            //out.print(total);
        %>
        <form>
            <fieldset>
                <legend>Shipment Details:</legend>
                Name: <input type="text" name="name" required><br><br>
                Contact: <input type="number" name="number" required min="1111111111" max="9999999999" /><br><br>
                Address: <input type="text" name="address" required/><br><br>
                Pin Code:<input type="number" name="pincode" required min="111111" max="999999"/><br><br>
                Amount Payable(+&#8377;50Delivery Charge):<input type="text" disabled="true" value="<%=total%>"/><br><br>
                <input type="submit" name="submit" value="Place order"/>
            </fieldset>
        </form>
        <pre>        
        <%
            
            if(request.getParameter("submit")!=null)
            {
                session.setAttribute("total", 0);
                session.setAttribute("cart", " ");
                out.println("Order Placed Successfully!");
                out.println("Tracking Link will be mailed to you once we ship the order.");
                out.println("Thankyou for shopping with us.");
                
                
            }
        
        %>
        </pre>
                
    </body>
</html>
<%@include file="footer.jsp" %>