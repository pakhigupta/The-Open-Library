<%@page import="java.util.HashSet"%>
<%@page import="java.sql.ResultSet"%>
<%@include file="header_secured.jsp" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>checkout</title>
    </head>
    <body align="center">
        
        <br><br>
        <%
            int total=(Integer)session.getAttribute("total");
            String cart=(String)session.getAttribute("cart");
            if(!cart.equals(" ") || total!=0)
            {
                out.print("<h2 style='float: left; margin-left: 20px;'>Your Cart Details: </h2><br><hr>");
                String []items=cart.split("\\s");
                HashSet<String> hs=new HashSet<String>();
                for(String x:items)
                {
                    hs.add(x);
                }
                //out.print("<br>");
                //out.print("Your Cart: ");
                for(String x: hs)
                {
                    if(x.compareTo("100")>0)
                    {
                        String q="select * from book_collection where id="+x;
                        //out.print(x+"  ");
                        //out.print("*"+q+"*");
                        ResultSet rs=jdbc.DAOLayer.selectData(q);
                        rs.next();
                        //out.print(rs.getString(1));
                    %>
                    <h4>Book Title: <%=rs.getString(9)%></h4><br>
                    <h4>Book Price: <%=rs.getString(7)%></h4><br>
                    <% total=total+Integer.parseInt(rs.getString(7)); %>
                    <hr>
                <%}}%>
                <% session.setAttribute("total",total);%>
                <h3 >Total Amount: &#8377 <%=total%></h3><br>
                <button><a href="orderBuy.jsp">Confirm Order</a></button>
                <hr><br><h6>NOTE: If you are issuing books, the price of the book is actually the security fee, which is refundable when the book is returned.</h6>
            <%}
            else{
                out.print("<h3>Cart is Empty.</h3>");
            }
            %>
        
    </body>
</html>
<%@include file="footer.jsp" %>