
<%@include file="header_secured.jsp" %>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="res/w3.css">
        
        <style>
            span{
                font: bolder;
                font-size: 16px;
                
            }
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Book Details</title>
    </head>
    <body align="center">
        <br><br><br>
        <span style="float:right;">
            <input type="button" value="Browse More" onclick="history.back(-1)" />
        </span>
        <%
            HttpSession s=request.getSession();
            String bid=(String)request.getParameter("id");
            s.setAttribute("id",bid);
            String q="select * from book_collection where id="+bid;
            ResultSet rs=jdbc.DAOLayer.selectData(q);
            rs.next();
        %>
        
        <h2>Book: <%=rs.getString(9)%></h2>
        <div style="border: 1px solid black; padding: 3%">
           
            <img src="<%=rs.getString(6)%>" style="border: 1px solid gray;padding:2px;height:175px; width:120px"><br><br>
            
            <span class="w3-card-4">Author: </span><%=rs.getString(2)%><br>
            <span class="w3-card-4">Price: </span><%="&#8377;"+rs.getString(7)%><br>
            <span class="w3-card-4">Genre: </span><%=rs.getString(5)%><br>
            <span class="w3-card-4">Category: </span><%=rs.getString(3)%><br>
            <span class="w3-card-4">Release Year: </span><%=rs.getString(8)%><br>
        </div>
        <button class="w3-border-grey"><a href="addCartServ">Add to Cart</a></button>
    </body> 
</html>
<%@include file="footer.jsp" %>